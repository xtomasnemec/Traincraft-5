package ebf.tim.blocks;

import ebf.tim.TrainsInMotion;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
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
    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
        super.onBlockAdded(world, pos, state);
        TileEntity tile = world.getTileEntity(pos);
        if (tile instanceof TileSwitch) {
            ((TileSwitch)tile).setStrength(world.getRedstonePowerFromNeighbors(pos),0);
        }
    }

    @Override
    public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase entity, ItemStack stack) {
        TileEntity tile = world.getTileEntity(pos);
        if (tile instanceof TileSwitch) {
            ((TileSwitch)tile).setStrength(world.getRedstonePowerFromNeighbors(pos),0);
        }
        super.onBlockPlacedBy(world, pos,state,entity,stack);
    }

    @Override
    public void neighborChanged(IBlockState state, World world, BlockPos pos, Block block, BlockPos other) {
        super.neighborChanged(state, world, pos, block, other);
        TileEntity tile = world.getTileEntity(pos);
        if (tile instanceof TileSwitch && !world.isRemote) {
            ((TileSwitch) tile).setStrength(world.getRedstonePowerFromNeighbors(pos),0);
        }
    }

}
