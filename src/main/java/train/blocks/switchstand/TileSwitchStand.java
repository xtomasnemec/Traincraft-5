package train.blocks.switchstand;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.blocks.BlockSwitch;
import ebf.tim.blocks.TileSwitch;
import ebf.tim.utility.CommonUtil;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.blocks.TCBlocks;

import java.util.Random;

public class TileSwitchStand extends TileSwitch implements ITickable {

    private int updateTicks = 0;
    private static Random rand = new Random();

    public TileSwitchStand(BlockSwitch host){
        super(host);
    }

    public TileSwitchStand(){
        super();
    }

    @Override
    public void update() {
        updateTicks++;
        /**
         * Remove any block on top
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
        return new AxisAlignedBB(pos.getX()-1, pos.getY()-1, pos.getZ()-1, pos.getX() + 2, pos.getY() + 2, pos.getZ() + 2);
    }

}