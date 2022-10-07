package train.blocks.signal;

import ebf.tim.blocks.BlockSignal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.Traincraft;

import java.util.Random;

public class BlockTCSignal extends BlockSignal {

	public BlockTCSignal() {
		super(Material.circuits,true);
		this.setLightLevel(1.0F);
		setBlockBounds(0.2F, 0.0F, 0.2F, 0.8F, 2.6F, 0.8F);
		setCreativeTab(Traincraft.tcTab);
	}


	@Override
	public void onBlockAdded(World world, int i, int j, int k) {
		super.onBlockAdded(world, i, j, k);
		updateTick(world, i, j, k, null);
	}


	public void updateTick(World world, int i, int j, int k, Random r) {
		TileTCSignal te = (TileTCSignal) world.getTileEntity(i, j, k);
		if (te == null) {
			return;
		}
		if (te.getEnabled() && !world.isBlockIndirectlyGettingPowered(i, j, k)) {
			te.toggleEnabled();
		} else if (!te.getEnabled() && world.isBlockIndirectlyGettingPowered(i, j, k)) {
			te.toggleEnabled();
		}
	}
	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par6, float par7, float par8, float par9) {
		updateTick(world, i, j, k, null);
		return true;
	}
	@Override
	public void onNeighborBlockChange(World world, int i, int j, int k, Block l) {
		TileTCSignal te = (TileTCSignal) world.getTileEntity(i, j, k);
		if (te == null) {
			return;
		}
		if (te.getEnabled() && !world.isBlockIndirectlyGettingPowered(i, j, k)) {
			world.scheduleBlockUpdate(i, j, k, this, 4);
		}
		else if (!te.getEnabled() && world.isBlockIndirectlyGettingPowered(i, j, k)) {
			te.toggleEnabled();
		}
		updateTick(world, i, j, k, null);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileTCSignal(this);
	}

	@Override
	public TileEntity createTileEntity(World world, int meta) {
		return new TileTCSignal(this);
	}
}