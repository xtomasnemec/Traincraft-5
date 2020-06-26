package train.common.tile;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.common.library.BlockIDs;

import java.util.Random;

public class TileSwitchStand extends TileTraincraft implements ITickable {

    private int updateTicks = 0;
    private static Random rand = new Random();
    private EnumFacing facing;

    @Override
    public void readFromNBT(NBTTagCompound nbtTag, boolean forSyncing) {
        //super.readFromNBT(nbtTag, false);
        facing = EnumFacing.getHorizontal(nbtTag.getByte("Orientation"));
    }

    @Override
    public void update() {
        updateTicks++;
        /**
         * Remove any block on top of the wind mill
         */
        if (!worldObj.isRemote) {
            if (updateTicks % 20 == 0) {
                if (!this.worldObj.isAirBlock(this.pos.add(0,1,0))) {
                    Block block = this.worldObj.getBlockState(this.pos.add(0,1,0)).getBlock();
                    if (block != null) {
                        EntityItem entityitem = new EntityItem(worldObj, this.pos.getX(), this.pos.getY() + 1, this.pos.getZ(), new ItemStack(Item.getItemFromBlock(BlockIDs.switchStand.block), 1));
                        float f3 = 0.05F;
                        entityitem.motionX = (float) rand.nextGaussian() * f3;
                        entityitem.motionY = (float) rand.nextGaussian() * f3 + 0.2F;
                        entityitem.motionZ = (float) rand.nextGaussian() * f3;
                        worldObj.spawnEntityInWorld(entityitem);
                    }
                    this.worldObj.setBlockToAir(this.pos);
                }
            }
        }
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound nbtTag, boolean forSyncing) {
        //super.writeToNBT(nbtTag, forSyncing);
        if (facing != null) {

            nbtTag.setByte("Orientation", (byte) facing.ordinal());
        }
        else {

            nbtTag.setByte("Orientation", (byte) EnumFacing.NORTH.ordinal());
        }
        return nbtTag;
    }

    public EnumFacing getFacing() {
        if(facing!=null){
            return this.facing;
        }
        return EnumFacing.NORTH;
    }


    public void setFacing(EnumFacing face) {

        if (facing != face)
            this.facing = face;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.fromBounds(pos.getX()-1, pos.getY()-1, pos.getZ()-1, pos.getX() + 2, pos.getY() + 2, pos.getZ() + 2);
    }

}