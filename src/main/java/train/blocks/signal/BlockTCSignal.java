package train.blocks.signal;

import ebf.tim.blocks.BlockSignal;
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
import train.Traincraft;

import java.util.Random;

public class BlockTCSignal extends BlockSignal {

	public BlockTCSignal() {
		super(Material.CIRCUITS,true);
		this.setLightLevel(1.0F);
		//setBlockBounds(0.2F, 0.0F, 0.2F, 0.8F, 2.6F, 0.8F);
		setCreativeTab(Traincraft.tcTab);
	}


	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
		super.onBlockAdded(world, pos,state);
		updateTick(world, pos, null);
	}


	public void updateTick(World world, BlockPos pos, Random r) {
		TileTCSignal te = (TileTCSignal) world.getTileEntity(pos);
		if (te == null) {
			return;
		}
		if (te.getEnabled() && !world.isBlockPowered(pos)) {
			te.toggleEnabled();
		} else if (!te.getEnabled() && world.isBlockPowered(pos)) {
			te.toggleEnabled();
		}
	}
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		updateTick(world, pos, null);
		return true;
	}
	@Override
	public void onNeighborChange(IBlockAccess world, BlockPos pos, BlockPos neighbor){
		TileTCSignal te = (TileTCSignal) world.getTileEntity(pos);
		if (te == null) {
			return;
		}
		if (te.getEnabled() && !((World)world).isBlockPowered(pos)) {
			((World)world).scheduleBlockUpdate(pos, this, 0, 4);
		}
		else if (!te.getEnabled() && ((World)world).isBlockPowered(pos)) {
			te.toggleEnabled();
		}
		updateTick((World) world, pos, null);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileTCSignal(this);
	}

	@Override
	public TileEntity createTileEntity(World world, IBlockState meta) {
		return new TileTCSignal(this);
	}
}