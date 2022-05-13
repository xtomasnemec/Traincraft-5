package train.blocks.waterwheel;

import ebf.tim.blocks.BlockDynamic;
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

}
