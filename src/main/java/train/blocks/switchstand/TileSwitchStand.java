package train.blocks.switchstand;

import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ebf.tim.blocks.BlockDynamic;
import ebf.tim.blocks.TileRenderFacing;
import ebf.tim.utility.CommonUtil;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import train.blocks.TCBlocks;

import java.util.Random;

public class TileSwitchStand extends TileRenderFacing {

    private int updateTicks = 0;
    private static Random rand = new Random();

    public TileSwitchStand(BlockDynamic host){
        super(host);
    }

    public TileSwitchStand(){
        super();
    }

    @Override
    public boolean canUpdate(){return true;}

    @Override
    public void updateEntity() {
        super.updateEntity();
        updateTicks++;
        /**
         * Remove any block on top of the wind mill
         */
        if (!world.isRemote) {
            if (updateTicks % 20 == 0) {
                if (!this.world.isAirBlock(new BlockPos(pos.getX(),pos.getY() + 1, pos.getZ()))) {
                    Block block = CommonUtil.getBlockAt(world, pos.getX(), pos.getY() + 1, pos.getZ());
                    if (block != null) {
                        EntityItem entityitem = new EntityItem(world, pos.getX(), pos.getY() + 1, pos.getZ(), new ItemStack(Item.getItemFromBlock(TCBlocks.highStarSwitch), 1));
                        float f3 = 0.05F;
                        entityitem.motionX = (float) rand.nextGaussian() * f3;
                        entityitem.motionY = (float) rand.nextGaussian() * f3 + 0.2F;
                        entityitem.motionZ = (float) rand.nextGaussian() * f3;
                        world.spawnEntity(entityitem);
                    }
                    this.world.setBlockToAir(new BlockPos(pos.getX(),pos.getY(),pos.getZ()));
                }
            }
        }
    }


    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 2, yCoord + 2, zCoord + 2);
    }

}