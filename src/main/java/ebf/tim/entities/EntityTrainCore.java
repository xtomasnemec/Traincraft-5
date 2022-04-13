package ebf.tim.entities;

import ebf.tim.registry.NBTKeys;
import ebf.tim.utility.*;
import fexcraft.tmt.slim.Vec3d;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import train.library.EnumSounds;
import train.library.Info;

import java.util.List;
import java.util.UUID;

import static ebf.tim.TrainsInMotion.transportTypes.*;

/**
 * <h1>Train core</h1>
 * this is the management core for all trains.
 * @author Eternal Blue Flame
 */
public class EntityTrainCore extends GenericRailTransport {

    /**manages the items for burnHeat, and the burnHeat itself.*/
    public FuelHandler fuelHandler = new FuelHandler();
    /**defines the speed percentage the user is attempting to apply.*/
    public int accelerator =0;




    /*
     * <h2> Base train Constructor</h2>
     */

    /** default constructor for all trains, server only.
     * Usually this is the one you would reference unless you need to do something only on client.
     * @param owner the owner profile, used to define owner of the entity,
     * @param world the world to spawn the entity in, used in super's super.
     * @param xPos the x position to spawn entity at, used in super's super.
     * @param yPos the y position to spawn entity at, used in super's super.
     * @param zPos the z position to spawn entity at, used in super's super.
     */
    public EntityTrainCore(UUID owner, World world, double xPos, double yPos, double zPos){
        super(owner, world, xPos, yPos, zPos);
    }

    /**default constructor for all trains, client only.
     * use this if you need to do something only on client.
     * @param world the world to spawn the entity in, used in super's super.
     */
    public EntityTrainCore(World world){
        super(world);
    }

    /**loads the entity's save file*/
    @Override
    protected void readEntityFromNBT(NBTTagCompound tag) {
        super.readEntityFromNBT(tag);
        accelerator = tag.getInteger(NBTKeys.accelerator);
        entityData.putFloat("boilerHeat",tag.getFloat(NBTKeys.transportFuel));

    }

    /**saves the entity to server world*/
    @Override
    protected void writeEntityToNBT(NBTTagCompound tag) {
        super.writeEntityToNBT(tag);
        tag.setInteger(NBTKeys.accelerator, getAccelerator());
        tag.setFloat(NBTKeys.transportFuel, FuelHandler.getBoilerHeat(this));

    }

    @Override
    public void entityInit(){
        super.entityInit();

        if(world!=null) {
            this.dataManager.register(ACCELERATOR, accelerator);//accelerator
            this.updateWatchers = true;
        }
    }

    @Override
    public void initInventorySlots(){
        super.initInventorySlots();
        inventory.add(fuelSlot());
        if(getTankCapacity().length>1){
            inventory.add(waterSlot());
        }
    }


    @Override
    public boolean hasDrag(){return getAccelerator()==0;}

    //gets the throttle position as a percentage with 1 as max and -1 as max reverse
    public float getAcceleratorPercentage(){
        switch (Math.abs(getAccelerator())){
            case 1:{return Math.copySign(0.1f,getAccelerator());}
            case 2:{return Math.copySign(0.25f,getAccelerator());}
            case 3:{return Math.copySign(0.5f,getAccelerator());}
            case 4:{return Math.copySign(0.7f,getAccelerator());}
            case 5:{return Math.copySign(0.875f,getAccelerator());}
            case 6: case 7:{return Math.copySign(1f,getAccelerator());}
            default:{return 0;}
        }
    }

    /**
     * <h2>Calculate speed increase rate</h2>
     * this has a direct relation to GenericRailTransport#applyDrag
     */
    public void calculateAcceleration(){
        //core accel speed from TC4
        float accel=0.02f* getAcceleratorPercentage();
        //buff to match engine type
        if(getTypes().contains(STEAM)){
            accel*=0.35f;
        } else if(getTypes().contains(DIESEL)){
            accel*=0.5f;
        } else if(getTypes().contains(ELECTRIC)){
            accel*=0.7f;
        }
        //scale based on power and velocity
        cachedVectors[2].xCoord=accel* (10f * (float)Math.pow(2.8f,((2.35f * (getVelocity()/getPower()))-2.35f)));
        //add back in the speed from last tick.
        cachedVectors[2].xCoord+=cachedVectors[2].yCoord;

        //set the last tick speed to this speed.
        cachedVectors[2].yCoord=cachedVectors[2].xCoord-cachedVectors[2].yCoord;
        DebugUtil.println(cachedVectors[2].xCoord);

        //if speed is greater than top speed from km/h to m/s divided by 20 to get per tick
        if(CommonProxy.realSpeed){
            //for real speed add a buff to max speed of 1.25%
            if (cachedVectors[2].xCoord < -transportTopSpeed() * (0.277778f*01325f)*1.25f) {
                cachedVectors[2].xCoord = -transportTopSpeed() * (0.277778f*01325f)*1.25f;
            } else if (cachedVectors[2].xCoord > transportTopSpeedReverse() * (0.277778f*01325f)*1.25f) {
                cachedVectors[2].xCoord = transportTopSpeedReverse() * (0.277778f*01325f)*1.25f;
            }
        } else {
            if (cachedVectors[2].xCoord < -transportTopSpeed() * (0.277778f*01325f)) {
                cachedVectors[2].xCoord = -transportTopSpeed() * (0.277778f*01325f);
            } else if (cachedVectors[2].xCoord > transportTopSpeedReverse() * (0.277778f*01325f)) {
                cachedVectors[2].xCoord = transportTopSpeedReverse() * (0.277778f*01325f);
            }
        }

        //handle ice slipping
        if(accelerator!=8 && accelerator!=-8 && !getBoolean(boolValues.BRAKE)) {
            float slip = !getBoolean(boolValues.DERAILED)?-1.0f:
                    CommonUtil.getBlockAt(world,this.posX,this.posY-1,this.posZ).slipperiness;

            if(slip>0) {
                rotationYaw+=accelerator*slip;
                if(slip<6) {
                    cachedVectors[2].yCoord *= slip*0.75;
                }
                cachedVectors[2].xCoord *= slip > 0 ? slip : 0.996;
            }
        }

    }

    /**a method to interface getting the accelerator value
     * this is intended for external use like collisions that need to see if the train is in gear from a superclass cast*/
    @Override
    public int getAccelerator(){
        return !world.isRemote?accelerator:dataManager.get(ACCELERATOR);
    }

    /**
     * <h2> on entity update</h2>
     * first we have to manage our speed by updating our motion vector and applying it to the bogies.
     * after that we let the super handle things.
     * @see GenericRailTransport#onUpdate()
     * lastly we use a tick check to define if we should manage fuel, since we shouldn't be doing that every tick.
     */
    @Override
    public void onUpdate() {

        super.onUpdate();

        if (!world.isRemote) {
            //twice a second, re-calculate the speed.
            if (accelerator!=0 && getBoolean(boolValues.RUNNING)) {
                if(ticksExisted % 10 == 0) {
                    calculateAcceleration();
                }
            } else {
                accelerator = 0;
                this.dataManager.set(ACCELERATOR, accelerator);
            }

            if(accelerator==0 && getBoolean(boolValues.BRAKE) && getVelocity()==0){
                frontBogie.setVelocity(0,0,0);
                backBogie.setVelocity(0,0,0);
                cachedVectors[2].xCoord = 0;
            } else {
                //add drag to the accelerator
                if(accelerator==0){
                    cachedVectors[2].yCoord*=0.99f;
                }
                Vec3d velocity = CommonUtil.rotateDistance(cachedVectors[2].xCoord, 0, rotationYaw);
                frontBogie.addVelocity(velocity.xCoord, 0, velocity.zCoord);
                backBogie.addVelocity(velocity.xCoord, 0, velocity.zCoord);
            }

            updatePosition();
        }
        if(whistleDelay>0) {
            whistleDelay--;
        }
    }

    @Override
    public void manageFuel(){
        if(getTypes().contains(STEAM)) {
            fuelHandler.manageSteam(this);
        }
        if(getTypes().contains(DIESEL)){
            FuelHandler.manageDieselFuel(this);
        }
        if(getTypes().contains(ELECTRIC)){
            FuelHandler.manageElectricFuel(this);
        }
    }

    /**the fuel type to display for the transport.*/
    public String transportFuelType(){
            if(getTypes().contains(STEAM)){
                return "Steam";
            }
            if (getTypes().contains(DIESEL)){
                return "Diesel";
            }
            if(getTypes().contains(ELECTRIC)){
                return "Electric";
            }
            return "Magic";
    }


    private int whistleDelay=0;
    public void soundHorn() {
        for (EnumSounds sounds : EnumSounds.values()) {
            if (sounds.getEntityClass() != null && !sounds.getHornString().equals("")&& sounds.getEntityClass().equals(this.getClass()) && whistleDelay == 0) {
                world.playSound(null, this.posX, this.posY,this.posZ, new SoundEvent(new ResourceLocation(Info.resourceLocation, sounds.getHornString())), SoundCategory.NEUTRAL, sounds.getHornVolume(), 1.0F);
                whistleDelay = 65;
            }
        }

        if(!world.isRemote) {
            List entities = world.getEntitiesWithinAABB(EntityAnimal.class, new AxisAlignedBB(
                    this.posX - 20, this.posY - 5, this.posZ - 20,
                    this.posX + 20, this.posY + 5, this.posZ + 20));

            for (Object e : entities) {
                if (e instanceof EntityAnimal) {
                    ((EntityAnimal) e).setAttackTarget(seats.get(0).getPassenger());
                    ((EntityAnimal) e).getNavigator().setPath(null, 0);
                }
            }
        }
    }

    @Override
    public void markDirty() {
        if(forceBackupTimer==0) {
            forceBackupTimer = 30;
        }
        for (ItemStackSlot slot : inventory){
            entityData.putItemStack("inv."+slot.getSlotID(), slot.getStack());
        }

        if(syncTimer==-1){
            syncTimer=20;
        }

    }


    @Override
    public boolean interact(int player, boolean isFront, boolean isBack, int key) {
        if (!super.interact(player, isFront, isBack, key)){
            switch (key){
                case 8:{ //toggle ignition
                    setBoolean(boolValues.RUNNING, !getBoolean(boolValues.RUNNING));
                    updateConsist();
                    return true;
                }case 9:{ //plays a sound on all clients within hearing distance
                    //the second to last value is volume, and idk what the last one is.
                    //world.playSoundEffect(posX, posY, posZ, getHorn().getPath(), 1, 0.5f);
                    if(whistleDelay==0){
                        soundHorn();
                    }
                    return true;
                }case 2:{ //decrease speed
                    if (getBoolean(boolValues.RUNNING)) {
                        //if a linked transport is running, dont update
                        for(GenericRailTransport consist : getConsist()){
                            if(consist!=this && consist.getAccelerator()!=0){
                                return true;
                            }
                        }
                        if(accelerator<=-6){
                            accelerator=-6;
                        } else {
                            accelerator--;
                        }
                        this.dataManager.set(ACCELERATOR, accelerator);
                    }
                    return true;
                }case 3:{ //increase speed
                    if (getBoolean(boolValues.RUNNING)) {
                        //if a linked transport is running, dont update
                        for(GenericRailTransport consist : getConsist()){
                            if(consist!=this && consist.getAccelerator()!=0){
                                return true;
                            }
                        }
                        if(accelerator>=6){
                            accelerator=6;
                        } else {
                            accelerator++;
                        }
                        this.dataManager.set(ACCELERATOR, accelerator);
                    }
                    return true;
                }case 11:{//TC control forward
                    if(getBoolean(boolValues.RUNNING)) {
                        accelerator = 7;
                        this.dataManager.set(ACCELERATOR, accelerator);
                    }
                    return true;
                }case 12:{//TC control reverse
                    if(getBoolean(boolValues.RUNNING)) {
                        accelerator = -7;
                        this.dataManager.set(ACCELERATOR, accelerator);
                    }
                    return true;
                }case 4: {//TC control, keep speed
                    if(getBoolean(boolValues.RUNNING)) {
                        accelerator = (int)Math.copySign(8,accelerator);
                        this.dataManager.set(ACCELERATOR, accelerator);
                    }
                    return true;
                }case 14: {//TC control, keep speed
                    if(getBoolean(boolValues.RUNNING)) {
                        accelerator = 0;
                        this.dataManager.set(ACCELERATOR, accelerator);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /*@Override
    public int getMinecartType(){return 10004;}*/

    /*
     * <h2>Inherited variables</h2>
     * these functions are overridden by classes that extend this so that way the values can be changed indirectly.
     */
    /**gets the resource location for the horn sound*/
    public ResourceLocation getHorn(){return null;}
    /**gets the resource location for the running/chugging sound*/
    public ResourceLocation getRunningSound(){return null;}

    @Deprecated//use GenericRailTransport#getFuelEfficiency
    public float getEfficiency(){return 1;}

}
