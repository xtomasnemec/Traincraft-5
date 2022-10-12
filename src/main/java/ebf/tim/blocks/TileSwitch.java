package ebf.tim.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ITickable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;

public class TileSwitch extends TileRenderFacing implements ITickable {
    private boolean enabled=false;
    public int crossingTick=0, soundLength=0;
    private long lastTick=0, lastSoundMS=0;
    private String sound=null;
    private float pitch=1,volume=1;

    public TileSwitch(BlockSwitch block){
        host=block;
        sound=block.soundFile();
        soundLength=block.getSoundInterval();
        pitch=block.soundPitch();
        volume=block.soundVolume();
    }
    public TileSwitch(){}

    public boolean toggleEnabled(){
        enabled=!enabled;
        markDirty();
        syncTileEntity();
        return enabled;
    }

    public void setEnabled(boolean e){
        if(e!=enabled){
            enabled=e;
            markDirty();
            syncTileEntity();
        }
    }

    public boolean getEnabled(){return enabled;}

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound tag){
        super.writeToNBT(tag);
        tag.setBoolean("e", enabled);
        return tag;
    }

    @Override
    public void readFromNBT(NBTTagCompound tag){
        enabled = tag.getBoolean("e");
        super.readFromNBT(tag);
    }

    @Override
    public void update() {
        if(!getWorld().isRemote){
            return;
        }
        long time = System.currentTimeMillis();
        //only tick every 1/20 of a second. Client tick tends to be fast and unreliable depending on FPS
        if(time>lastTick+50){
            lastTick=time;
            crossingTick++;
            //this handles ticks for animations so models can access and modulate the value for
            // blinking, swinging, and other animations.
            if(crossingTick>=360){
                crossingTick=0;
            }
        }

        //if there's a defined sound, play that every interval.
        if(getEnabled() && sound!=null){
            if(time>lastSoundMS+soundLength){
                getWorld().playSound((EntityPlayer)null,getPos(),new SoundEvent(new ResourceLocation(sound)), SoundCategory.BLOCKS,volume,pitch);
                lastSoundMS=time;
            }
        }
    }
}
