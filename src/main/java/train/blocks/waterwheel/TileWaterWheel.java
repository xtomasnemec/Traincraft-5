package train.blocks.waterwheel;

import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import ebf.tim.blocks.BlockDynamic;
import ebf.tim.blocks.TileRenderFacing;
import ebf.tim.utility.CommonUtil;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.blocks.generator.TileGeneratorDiesel;

public class TileWaterWheel extends TileGeneratorDiesel {

	public TileWaterWheel(BlockDynamic host) {
		super();
		this.energy=new EnergyStorage(80,80);
	}

	@Override
	public void updateEntity() {

		if(!worldObj.isRemote) {

			Block blockXP = CommonUtil.getBlockAt(worldObj, xCoord+1, yCoord, zCoord);
			Block blockXN = CommonUtil.getBlockAt(worldObj, xCoord-1, yCoord, zCoord);
			Block blockZP = CommonUtil.getBlockAt(worldObj, xCoord, yCoord, zCoord+1);
			Block blockZN = CommonUtil.getBlockAt(worldObj, xCoord, yCoord, zCoord-1);
			Block blockTop = CommonUtil.getBlockAt(worldObj, xCoord, yCoord+1, zCoord);
			Block blockBottom = CommonUtil.getBlockAt(worldObj, xCoord, yCoord-1, zCoord);


			if (blockXP instanceof BlockLiquid && blockXP.getMaterial().isLiquid()
					&& worldObj.getBlockMetadata(xCoord + 1, yCoord, zCoord) != 0
					&& blockXP.getMaterial() != Material.lava) {
				this.energy.receiveEnergy(5, false);
				worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 2, 2);
			} else if (blockXN instanceof BlockLiquid && blockXN.getMaterial().isLiquid()
					&& worldObj.getBlockMetadata(xCoord - 1, yCoord, zCoord) != 0
					&& blockXN.getMaterial() != Material.lava) {
				this.energy.receiveEnergy(5, false);
				worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 0, 2);
			} else if (blockZN instanceof BlockLiquid && blockZN.getMaterial().isLiquid()
					&& worldObj.getBlockMetadata(xCoord, yCoord, zCoord - 1) != 0
					&& blockZN.getMaterial() != Material.lava) {
				this.energy.receiveEnergy(5, false);
				worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 1, 2);
			} else if (blockZP instanceof BlockLiquid && blockZP.getMaterial().isLiquid()
					&& worldObj.getBlockMetadata(xCoord, yCoord, zCoord + 1) != 0
					&& blockZP.getMaterial() != Material.lava) {
				this.energy.receiveEnergy(5, false);
				worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 3, 2);
			}else if(blockTop instanceof BlockLiquid && blockTop.getMaterial().isLiquid()&&worldObj.getBlockMetadata(xCoord, yCoord+1, zCoord)!= 0 && blockTop.getMaterial() != Material.lava){
				this.energy.receiveEnergy(5, false);
			}else if(blockBottom instanceof BlockLiquid && blockBottom.getMaterial().isLiquid() &&worldObj.getBlockMetadata(xCoord, yCoord-1, zCoord)!= 0 && blockBottom.getMaterial() != Material.lava){
				this.energy.receiveEnergy(5, false);
			} else {
				setFacing(-1);
			}

			if (this.energy.getEnergyStored() >0) {
				pushEnergy(worldObj, this.xCoord, this.yCoord, this.zCoord, this.energy);
			}

			this.markDirty();
			this.syncTileEntity();
		}

	}

	public int getWaterDir() {
		return facing;
	}

}
