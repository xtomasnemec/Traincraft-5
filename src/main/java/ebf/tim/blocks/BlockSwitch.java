package ebf.tim.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSwitch extends BlockDynamic {


    public BlockSwitch(Material material, boolean isStorage) {
        super(material, isStorage);
    }

    @Override
    public boolean hasTileEntity(IBlockState metadata) {
        return true;
    }


    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileSwitch(this);
    }


    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (world.isRemote) {
            return true;
        } else {

            TileSwitch t = (TileSwitch)world.getTileEntity(pos);
            if(t!=null){
                t.toggleEnabled(0);
                world.playSound(null, pos, SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.BLOCKS, 0.3F, 1f);
                world.notifyNeighborsOfStateChange(pos, this, false);
            }

            return true;
        }
    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        world.notifyNeighborsOfStateChange(pos, this, false);
        super.breakBlock(world, pos, state);
    }


    @Override
    public int getWeakPower(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
        return getStrongPower(state,world,pos,side);
    }

    public int isProvidingStrongPower(IBlockAccess world, int x, int y, int z, int meta) {
        TileSwitch t = (TileSwitch)world.getTileEntity(new BlockPos(x,y,z));
        if(t!=null && t.getStrength(0)>0){
            return 15;
        }
        return 0;
    }
    @Override
    public boolean canProvidePower(IBlockState state) {
        return true;
    }


    @Override
    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
        super.onBlockAdded(world, pos,state);
        TileSwitch te = (TileSwitch) world.getTileEntity(pos);
        if (te !=null) {
            te.setStrength(0,0);
        }
    }

    @Override
    public void neighborChanged(IBlockState state, World world, BlockPos pos, Block block, BlockPos other) {
        super.neighborChanged(state, world, pos, block, other);
    }
}
