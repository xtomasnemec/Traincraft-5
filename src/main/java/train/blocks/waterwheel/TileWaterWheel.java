package train.blocks.waterwheel;

import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraftforge.energy.EnergyStorage;
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
		return this.worldObj;
	}

	@Override
	public boolean canDrain(ForgeDirection from, Fluid fluid){
		return false;
	}



	public void pushEnergy(World world, int x, int y, int z, EnergyStorage storage){
		for (ForgeDirection side : ForgeDirection.VALID_DIRECTIONS) {
			TileEntity tile = world.getTileEntity(x + side.offsetX, y + side.offsetY, z + side.offsetZ);
			if (tile instanceof IEnergyReceiver && storage.getEnergyStored() > 0) {
				if (((IEnergyReceiver) tile).canConnectEnergy(side.getOpposite())) {
					int receive = ((IEnergyReceiver) tile).receiveEnergy(side.getOpposite(), Math.min(storage.getMaxExtract(), storage.getEnergyStored()), false);
					storage.extractEnergy(receive, false);
				}
			}
		}
	}


	//RF Overrides
	@Override
	public boolean canConnectEnergy(ForgeDirection dir) {
		return true;
	}
	@Override
	public int extractEnergy(ForgeDirection dir, int amount, boolean simulate) {
		return energy.extractEnergy(amount, simulate);
	}
	@Override
	public int getEnergyStored(ForgeDirection dir) {
		return energy.getEnergyStored();
	}
	@Override
	public int getMaxEnergyStored(ForgeDirection dir) {
		return this.energy.getMaxEnergyStored();
	}


}
