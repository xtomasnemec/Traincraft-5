package train.blocks.waterwheel;

import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.energy.EnergyStorage;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.fluids.Fluid;
import train.blocks.TCBlocks;
import train.blocks.generator.TileGeneratorDiesel;

public class TileWaterWheel extends TileGeneratorDiesel {
	public TileWaterWheel() {
		super(TCBlocks.waterWheel);
		this.energy=new EnergyStorage(80,80);
	}

	@Override
	public void update() {
		if(!world.isRemote) {

			IBlockState blockXN = world.getBlockState(pos.add(1,0,0));
			IBlockState blockXP = world.getBlockState(pos.add(-1,0,0));
			IBlockState blockZN = world.getBlockState(pos.add(0,0,1));
			IBlockState blockZP = world.getBlockState(pos.add(0,0,-1));
			IBlockState blockTop = world.getBlockState(pos.add(0,1,0));
			IBlockState blockBottom = world.getBlockState(pos.add(0,-1,0));


			if (blockXP.getBlock() instanceof BlockLiquid && blockXP.getMaterial().isLiquid()
					&& blockXP.getValue(BlockLiquid.LEVEL)<8
					&& blockXP.getMaterial() != Material.LAVA) {
				this.energy.receiveEnergy(5, false);
				setFacing(2);
			} else if (blockXN.getBlock() instanceof BlockLiquid && blockXN.getMaterial().isLiquid()
					&& blockZN.getValue(BlockLiquid.LEVEL)<8
					&& blockXN.getMaterial() != Material.LAVA) {
				this.energy.receiveEnergy(5, false);
				setFacing(0);
			} else if (blockZN.getBlock() instanceof BlockLiquid && blockZN.getMaterial().isLiquid()
					&& blockZN.getValue(BlockLiquid.LEVEL)<8
					&& blockZN.getMaterial() != Material.LAVA) {
				this.energy.receiveEnergy(5, false);
				setFacing(1);
			} else if (blockZP.getBlock() instanceof BlockLiquid && blockZP.getMaterial().isLiquid()
					&& blockZP.getValue(BlockLiquid.LEVEL)<8
					&& blockZP.getMaterial() != Material.LAVA) {
				this.energy.receiveEnergy(5, false);
				setFacing(3);
			}else if(blockTop.getBlock() instanceof BlockLiquid && blockTop.getMaterial().isLiquid()
					&& blockTop.getValue(BlockLiquid.LEVEL)<8
					&& blockTop.getMaterial() != Material.LAVA){
				this.energy.receiveEnergy(5, false);
			}else if(blockBottom.getBlock() instanceof BlockLiquid && blockBottom.getMaterial().isLiquid()
					&& blockBottom.getValue(BlockLiquid.LEVEL)<8
					&& blockBottom.getMaterial() != Material.LAVA){
				this.energy.receiveEnergy(5, false);
			} else {
				setFacing(-1);
			}

			if (this.energy.getEnergyStored() >0) {
				pushEnergy(world, this.pos.getX(), this.pos.getY(), this.pos.getZ(), this.energy);
			}

			this.markDirty();
			this.syncTileEntity();
		}

	}

	public int getWaterDir() {
		return facing;
	}


	public int[] getTankCapacity(){
		return new int[]{30000};
	}

	@Override
	public World getWorld(){
		return this.world;
	}



	public void pushEnergy(World world, int x, int y, int z, EnergyStorage storage){
		for (EnumFacing side : EnumFacing.values()) {
			TileEntity tile = world.getTileEntity(new BlockPos(x + side.getXOffset(), y + side.getYOffset(), z + side.getZOffset()));
			if (tile instanceof IEnergyStorage && storage.getEnergyStored() > 0) {
				if (((IEnergyStorage) tile).canExtract()) {
					int receive = ((IEnergyStorage) tile).receiveEnergy(Math.min(storage.getMaxEnergyStored(), storage.getEnergyStored()), false);
					storage.extractEnergy(receive, false);
				}
			}
		}
	}


	//RF Overrides
	@Override
	public int extractEnergy(int amount, boolean simulate) {
		return energy.extractEnergy(amount, simulate);
	}
	@Override
	public int getEnergyStored() {
		return energy.getEnergyStored();
	}
	@Override
	public int getMaxEnergyStored() {
		return this.energy.getMaxEnergyStored();
	}


}
