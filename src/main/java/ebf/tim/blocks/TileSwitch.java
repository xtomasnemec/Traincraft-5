package ebf.tim.blocks;

import ebf.tim.utility.DebugUtil;
import fexcraft.tmt.slim.Vec3f;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;

import java.util.List;

public class TileSwitch extends TileRenderFacing {
    public boolean enabled=false, animationReversing=false;
    public int crossingTick=0, currentTick=0;
    public long lastTick=0, lastSoundMS=0;

    public TileSwitch(BlockSwitch block){
        host=block;
    }
    public TileSwitch(){}

    public boolean toggleEnabled(){
        enabled=!enabled;
        markDirty();
        return enabled;
    }

    public void setEnabled(boolean e){
        if(e!=enabled){
            enabled=e;
            markDirty();
        }
    }

    public boolean getEnabled(){return enabled;}

    @Override
    public void writeToNBT(NBTTagCompound tag){
        super.writeToNBT(tag);
        tag.setBoolean("e", enabled);
    }

    @Override
    public void readFromNBT(NBTTagCompound tag){
        enabled = tag.getBoolean("e");
        super.readFromNBT(tag);
    }

    //how often to repeat the sound in MS, this includes the length of the sound itself
    public int getSoundInterval(){
        return 2000;
    }

    //remember to list the sound file in your sounds.json and ID it there
    // TC5 does not yet feature direct audio streaming.
    public String soundFile(){return "";}
    //optional pitch shift for sound
    public float soundPitch(){return 1f;}
    //sound volume
    public float soundVolume(){return 1f;}

    //sets the min and max rotation angles.
    // if there is a difference of exactly 360 between the two, it will not reverse
    public float maxAngle(){return 360;}
    public float minAngle(){return 0;}
    //how many degrees to move each animation tick.
    public float animationSpeed(){return 1;}
    //this prevents the tick from reversing or looping until the redstone state changes
    public boolean angleStops(){return false;}

    @Override
    public boolean canUpdate(){return true;}

    @Override
    public void updateEntity() {
        if(!getWorldObj().isRemote){
            return;
        }
        long time = System.currentTimeMillis();
        //only tick every 1/20 of a second. Client tick tends to be fast and unreliable depending on FPS
        if(time>lastTick+50){
            lastTick=time;
            if(angleStops()){
                if (crossingTick<=maxAngle() && getEnabled()){
                    crossingTick+=animationSpeed();
                } else if (crossingTick>=minAngle() && !getEnabled()){
                    crossingTick-=animationSpeed();
                }
            } else {
                if(maxAngle()-minAngle()==360) {
                    if(getEnabled()) {
                        crossingTick += animationSpeed();
                        if (crossingTick >= 360) {
                            crossingTick = 0;
                        }
                    }
                } else if(getEnabled() || crossingTick!=0){
                    if(animationReversing){
                        crossingTick -= animationSpeed();
                    } else {
                        crossingTick += animationSpeed();
                    }
                    if(crossingTick<=minAngle() || crossingTick>=maxAngle()){
                        animationReversing=!animationReversing;
                    }
                }

            }
        }

        //if there's a defined sound, play that every interval.
        if(getEnabled() && soundFile()!=null){
            if(time>lastSoundMS+getSoundInterval()){
                getWorldObj().playSound(xCoord,yCoord,zCoord, soundFile(), soundVolume(),soundPitch(),false);
                lastSoundMS=time;
            }
        }
    }



    public void tickTile(){
        currentTick++;
        if(currentTick>200){
            currentTick=0;
        }
    }

    public int checkBlockPower(int[] ... offset){
        int signalStrength=0;
        for(int[] o : offset) {
            if (signalStrength == 0) {
                signalStrength = worldObj.getBlockPowerInput(xCoord + o[0], yCoord + o[1], zCoord + o[2]);
                if (signalStrength == 0 && worldObj.isBlockIndirectlyGettingPowered(xCoord + o[0], yCoord + o[1], zCoord + o[2])) {
                    signalStrength = 15;
                }
            }
            else {
                return signalStrength;
            }
        }
        return signalStrength;
    }

    private Vec3f end, start;
    //use this to detect entities within a range from the block and change state based on that.
    //will not take negative values.
    public void detectNearby(int width, int depth, boolean useRedstone, boolean left){
        switch (this.facing) {
            case 0: {
                if (left) {
                    end = new Vec3f(width, 4, 0);
                    start = new Vec3f(0, -1, -depth);
                } else {
                    end = new Vec3f(0, 4, 0);
                    start = new Vec3f(-width, -1, -depth);
                }
                break;
            }
            case 1: {
                if (left) {
                    end = new Vec3f(depth, 4, width);
                    start = new Vec3f(0, -1, 0);
                } else {
                    end = new Vec3f(depth, 4, 0);
                    start = new Vec3f(0, -1, -width);
                }
                break;
            }

            case 2: {
                if (left) {
                    end = new Vec3f(0, 4, depth);
                    start = new Vec3f(-width, -1, 0);
                } else {
                    end = new Vec3f(width, 4, depth);
                    start = new Vec3f(0, -1, 0);
                }
                break;
            }

            case 3: {
                if (left) {
                    end = new Vec3f(0, 4, 0);
                    start = new Vec3f(-depth, -1, -width);
                } else {
                    end = new Vec3f(0, 4, width);
                    start = new Vec3f(-depth, -1, 0);
                }
                break;
            }
        }

        List list = this.worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.getBoundingBox(
                xCoord+start.xCoord, yCoord+start.yCoord, zCoord+start.zCoord,
                xCoord+end.xCoord, yCoord+end.yCoord, zCoord+end.zCoord));

        if (list != null && list.size() > 0) {
            for (Object o : list) {
                if (o instanceof EntityMinecart) {
                    setEnabled(true);
                    return;
                }
            }
        }
        if(useRedstone) {
            setEnabled(worldObj.isBlockIndirectlyGettingPowered(xCoord, yCoord, zCoord));
        } else {
            setEnabled(false);
        }
    }
}
