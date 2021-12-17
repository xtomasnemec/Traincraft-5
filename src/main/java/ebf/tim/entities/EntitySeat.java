package ebf.tim.entities;


import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

/**
 * <h1>Seat Entity</h1>
 * A placeholder entity to serve as the seats (beyond the first one) for trains and rollingstock.
 * in 1.9+ this class is no longer necessary.
 * @author Eternal Blue Flame
 */
public class EntitySeat extends Entity implements IEntityAdditionalSpawnData {

    /**
     * <h2>variables</h2>
     * parentId is used to keep a reference to the parent train/rollingstock.
     * the velocities are to replace the client only velocities in forge that have private access.
     */
    /**used to keep a reference to the parent train/rollingstock.*/
    public int parentId = 0;
    /**used to define which index the seat is supposed to be at*/
    private int seatNumber =0;

    public Vec3d rotation =null;
    GenericRailTransport parent;
    private EntityLivingBase passengerEntity=null;
    private boolean controller=false, locomotive=false;

    public EntitySeat(World world) {
        super(world);
    }

    public EntitySeat(World world, double xPos, double yPos, double zPos, double pitch, double yaw, double roll, GenericRailTransport parent, int seatNumber) {
        super(world);
        this.posX = xPos;
        this.posY = yPos;
        this.posZ = zPos;
        if (pitch!=0 || yaw !=0) {
            rotation = new Vec3d(pitch, yaw, roll);
        }
        parentId = parent.getEntityId();
        this.seatNumber = seatNumber;
        controller=seatNumber==0;
        locomotive=parent instanceof EntityTrainCore;
    }

    /** returns if this can be pushed*/
    @Override
    public boolean canBePushed() {
        return false;
    }
    /**returns if the rider can interact, it shouldn't be necessary, but we'll leave it true just in case*/
    @Override
    public boolean canRiderInteract() {
        return true;
    }
    /**actually useless for this entity*/
    @Override
    public void entityInit(){}
    /**actually useless for this entity*/
    @Override
    public void onUpdate() {
        if(ticksExisted%40==0 || parent==null) {
            if (world.getEntityByID(parentId) instanceof GenericRailTransport) {
                if (world.isRemote) {
                    if (parent == null) {
                        parent = (GenericRailTransport) world.getEntityByID(parentId);
                    }
                    parent.setseats(this, seatNumber);
                }
            } else {
                world.removeEntity(this);
            }
        } else if (parent!=null && passengerEntity!=null && passengerEntity.getRidingEntity()!=this){
            passengerEntity=null;
        }

    }
    @Override
    public boolean shouldRiderSit(){
        return parent.shouldRiderSit(seatNumber);
    }
    /**returns the bounding box, this doesn't handle collisions, soo.. null.*/
    @Override
    public AxisAlignedBB getCollisionBoundingBox(){
        return null;
    }
    /**returns the bounding box, this doesn't handle collisions, soo.. null.*/
    @Override
    public AxisAlignedBB getCollisionBox(Entity collidedWith){
        return null;
    }
    /**returns if this can be collided with, but this doesn't handle collisions.*/
    @Override
    public boolean canBeCollidedWith() {
        return false;
    }
    /**reads from NBT but this entity isn't persistent, so, don't,*/
    @Override
    protected void readEntityFromNBT(NBTTagCompound tag) {}
    /**writes to NBT but this entity isn't persistent, so, don't,*/
    @Override
    protected void writeEntityToNBT(NBTTagCompound tag) {}
    @Override
    public boolean writeToNBTOptional(NBTTagCompound tagCompound){return false;}

    /**plays a sound during entity movement*/
    @Override
    protected void playStepSound(BlockPos pos, Block blockIn) {}

    @Override
    public Vec3d getLookVec() {
        return rotation;
    }

    /**
     * <h2>Spawn Data</h2>
     * Small networking check to add the seat to the host train/rollingstock. Or to remove the seat from the world if the host doesn't exist.
     */
    @Override
    public void readSpawnData(ByteBuf additionalData) {
        parentId = additionalData.readInt();
        seatNumber = additionalData.readInt();
    }
    @Override
    public void writeSpawnData(ByteBuf buffer) {
        buffer.writeInt(parentId);
        buffer.writeInt(seatNumber);
    }

    @Override
    public void updateRidden() {
        if (this.getPassenger() != null) {
            this.getPassenger().setPosition(this.posX, this.posY+0.4, this.posZ);
        }
    }

    public EntityLivingBase getPassenger(){
        return this.passengerEntity;
    }

    @Override
    public void addPassenger(Entity passenger) {
        if(passengerEntity==null && passenger instanceof EntityLivingBase) {
            super.addPassenger(passenger);
            this.passengerEntity=(EntityLivingBase) passenger;
        }
    }

    @Override
    public void removePassenger(Entity passenger){
        super.removePassenger(passenger);
        passengerEntity=null;
    }

    public boolean isControlSeat(){return controller;}
    public boolean isLocoControlSeat(){return controller && locomotive;}
    public boolean isLocoSeat(){return locomotive;}

    public void setControlSeat(){controller=true;}


    /**
     * <h2>Client Movement code</h2>
     * this is mostly used to sync and smooth movement between client and server.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void setPositionAndRotationDirect(double p_70056_1_, double p_70056_3_, double p_70056_5_, float p_70056_7_, float p_70056_8_, int p_70056_9_, boolean teleport) {
        posX = p_70056_1_;
        posY = p_70056_3_;
        posZ = p_70056_5_;
    }
    @Override
    public void setVelocity(double x, double y, double z) {
        motionX = x;
        motionY = y;
        motionZ = z;
    }

}
