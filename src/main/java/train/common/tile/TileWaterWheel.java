package train.common.tile;

import cofh.api.energy.IEnergyProvider;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import train.common.core.util.Energy;

public class TileWaterWheel extends Energy implements IEnergyProvider, ITickable {
	
	public int facingMeta;

	public TileWaterWheel() {
		super(0, "WaterWheel", 80, 80);
		super.setSides(new EnumFacing[]{EnumFacing.EAST, EnumFacing.WEST, EnumFacing.NORTH, EnumFacing.SOUTH});
		//facingMeta = this.blockMetadata;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbtTag, boolean forSyncing){
		super.readFromNBT(nbtTag, forSyncing);
		facingMeta = nbtTag.getByte("Orientation");
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbtTag, boolean forSyncing){
		super.writeToNBT(nbtTag, forSyncing);
		nbtTag.setByte("Orientation", (byte) facingMeta);
		return  nbtTag;
	}

	@Override
	public Packet getDescriptionPacket() {
		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);

		return new S35PacketUpdateTileEntity(this.pos, 1, nbt);
	}
	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
		this.readFromNBT(pkt.getNbtCompound());
	}

	@Override
	public void update() {

		if(!worldObj.isRemote) {

			Block blockXP = worldObj.getBlockState(new BlockPos(pos.getX()+1, pos.getY(), pos.getZ())).getBlock();
			Block blockXN = worldObj.getBlockState(new BlockPos(pos.getX()-1, pos.getY(), pos.getZ())).getBlock();
			Block blockZP = worldObj.getBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ()+1)).getBlock();
			Block blockZN = worldObj.getBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ()-1)).getBlock();
			Block blockTop = worldObj.getBlockState(new BlockPos(pos.getX(), pos.getY()+1, pos.getZ())).getBlock();
			Block blockBottom = worldObj.getBlockState(new BlockPos(pos.getX(), pos.getY()-1, pos.getZ())).getBlock();


			//getMeta _should_ be unimportant
			if (blockXP instanceof BlockLiquid && blockXP.getMaterial().isLiquid()
					//&& worldObj.getBlockMetadata(pos.getX() + 1, pos.getY(), pos.getZ()) != 0
					&& blockXP.getMaterial() != Material.lava) {
				this.energy.receiveEnergy(5, false);
				facingMeta=2;
			} else if (blockXN instanceof BlockLiquid && blockXN.getMaterial().isLiquid()
					//&& worldObj.getBlockMetadata(pos.getX() - 1, pos.getY(), pos.getZ()) != 0
					&& blockXN.getMaterial() != Material.lava) {
				this.energy.receiveEnergy(5, false);
				facingMeta=0;
			} else if (blockZN instanceof BlockLiquid && blockZN.getMaterial().isLiquid()
					//&& worldObj.getBlockMetadata(pos.getX(), pos.getY(), pos.getZ() - 1) != 0
					&& blockZN.getMaterial() != Material.lava) {
				this.energy.receiveEnergy(5, false);
				facingMeta=1;
			} else if (blockZP instanceof BlockLiquid && blockZP.getMaterial().isLiquid()
					//&& worldObj.getBlockMetadata(pos.getX(), pos.getY(), pos.getZ() + 1) != 0
					&& blockZP.getMaterial() != Material.lava) {
				this.energy.receiveEnergy(5, false);
				facingMeta=3;
			}else if(blockTop instanceof BlockLiquid && blockTop.getMaterial().isLiquid()
					//&&worldObj.getBlockMetadata(pos.getX(), pos.getY()+1, pos.getZ())!= 0
					&& blockTop.getMaterial() != Material.lava){
				this.energy.receiveEnergy(5, false);
			}else if(blockBottom instanceof BlockLiquid && blockBottom.getMaterial().isLiquid()
					//&&worldObj.getBlockMetadata(pos.getX(), pos.getY()-1, pos.getZ())!= 0
					&& blockBottom.getMaterial() != Material.lava){
				this.energy.receiveEnergy(5, false);
			} else {
				setWaterDir(-1);
			}

			if (this.energy.getEnergyStored() >0) {
				pushEnergy(worldObj, this.pos.getX(), this.pos.getY(), this.pos.getZ(), this.energy);
			}

			this.markDirty();
			this.syncTileEntity();
		}

	}
	
	private void setWaterDir(int i) {
		facingMeta = i;
		
	}
	
	public int getWaterDir() {
		return facingMeta;
	}

	@Override
	public boolean canConnectEnergy(EnumFacing direction){
		if((this.getBlockMetadata()==1||this.getBlockMetadata()==3) && (direction == EnumFacing.WEST||direction == EnumFacing.EAST)) {
			return true;
		}else if((this.getBlockMetadata()==0||this.getBlockMetadata()==2) && (direction == EnumFacing.NORTH||direction == EnumFacing.SOUTH)){
			return true;
		} else {return false;}
	}


}
