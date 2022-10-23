package ebf.tim.blocks;

import ebf.tim.utility.CommonUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import train.blocks.switchstand.TileSwitchStand;

import javax.annotation.Nullable;
import java.util.List;

public class BlockSwitch extends BlockDynamic {


    public BlockSwitch(Material material, boolean isStorage) {
        super(material, isStorage);
    }

    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }


    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileSwitch(this);
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

    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (world.isRemote) {
            return true;
        } else {

            TileSwitch t = (TileSwitch)world.getTileEntity(pos);
            if(t!=null){
                t.toggleEnabled();
                world.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.BLOCKS, 0.3F, t.getEnabled() ? 0.6F : 0.5F);
                world.notifyNeighborsOfStateChange(pos, this, false);
            }

            return true;
        }
    }

    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        world.notifyNeighborsOfStateChange(pos, this, false);
        super.breakBlock(world, pos, state);
    }



    public int getWeakPower(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
        return getStrongPower(state,world,pos,side);
    }

    public int getStrongPower(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
        TileSwitch t = (TileSwitch)world.getTileEntity(pos);
        if(t!=null && t.getEnabled()){
            return 15;
        }
        return 0;
    }

    public boolean canProvidePower(IBlockState state) {
        return true;
    }


    @Override
    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
        super.onBlockAdded(world, pos,state);
        TileSwitch te = (TileSwitch) world.getTileEntity(pos);
        if (te !=null) {
            te.setEnabled(false);
        }
    }

    @Override
    public void neighborChanged(IBlockState state, World world, BlockPos pos, Block block, BlockPos other) {
        super.neighborChanged(state, world, pos, block, other);
    }
}
