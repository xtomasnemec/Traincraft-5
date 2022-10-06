package train.blocks.signal;

import ebf.tim.blocks.BlockSignal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.Traincraft;

import java.util.Random;

/*
 I propose a simple x-bit identifier in the following format:
 xxxxx
 |||||
 ||||+ Color		0=green		1=red
 |||+  Mounted		0=no		1=yes
 ||+   Directions	0=both		1=one
 ++    Direction facing	00=north	01=east	10=south	11=west
 */

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
		updateTick(world, i, j, k);
	}

	/**
	 * Sets whether this block type will receive random update ticks
	 */
	@Override
	public Block setTickRandomly(boolean par1) {
		this.needsRandomTick = true;
		return this;
	}

	/**
	 * Returns whether or not this block is of a type that needs random ticking. Called for ref-counting purposes by ExtendedBlockStorage in order to broadly cull a chunk from the random chunk update list for efficiency's sake.
	 */
	@Override
	public boolean getTickRandomly() {
		return this.needsRandomTick;
	}

	/**
	 * A randomly called display update to be able to add particles or other items for display
	 */
	@Override
	public void randomDisplayTick(World world, int i, int j, int k, Random random) {
		updateTick(world, i, j, k, random);
	}

	public void updateTick(World world, int i, int j, int k) {
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
		updateTick(world, i, j, k);
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
		updateTick(world, i, j, k);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileTCSignal();
	}
}