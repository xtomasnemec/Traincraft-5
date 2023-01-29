package ebf.tim.blocks;

import ebf.tim.TrainsInMotion;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

//NOTE: TileSwitch is re-used for signals, because the only differences between them are in block logic
public class BlockSignal extends BlockSwitch {

    public BlockSignal(Material material, boolean isStorage) {
        super(material, isStorage);
    }

    @Override
    public int getWeakPower(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
        return 0;
    }

    @Override
    public int getStrongPower(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
        return 0;
    }

    @Override
    public boolean canProvidePower(IBlockState state) {
        return false;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        return false;
    }

    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        super.onBlockAdded(world, x,y,z);
        TileEntity tile = world.getTileEntity(x,y,z);
        if (tile instanceof TileSwitch) {
            ((TileSwitch)tile).setEnabled(world.isBlockIndirectlyGettingPowered(x,y,z),0);
        }
    }

    @Override
    public int onBlockPlaced(World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int meta) {
        TileEntity tile = world.getTileEntity(x,y,z);
        if (tile instanceof TileSwitch) {
            ((TileSwitch)tile).setEnabled(world.isBlockIndirectlyGettingPowered(x,y,z),0);
        }
        return super.onBlockPlaced(world, x, y, z, side, hitX, hitY, hitZ, meta);
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block other) {
        super.onNeighborBlockChange(world, x, y, z, other);
        TileEntity tile = world.getTileEntity(x, y, z);
        if (tile instanceof TileSwitch && !world.isRemote) {
            ((TileSwitch) tile).setEnabled(world.isBlockIndirectlyGettingPowered(x,y,z),0);
        }
        if (te.getEnabled() && !world.isBlockPowered(pos)) {
            te.toggleEnabled();
        } else if (!te.getEnabled() && world.isBlockPowered(pos)) {
            te.toggleEnabled();
        }
    }

}
