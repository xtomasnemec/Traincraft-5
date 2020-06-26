package train.common.tile;


import cofh.api.energy.IEnergyProvider;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import train.common.core.handlers.ConfigHandler;
import train.common.core.handlers.WorldEvents;
import train.common.core.util.Energy;

import java.util.Random;

public class TileWindMill extends Energy implements IEnergyProvider, ITickable {
	private int facingMeta;
	private int updateTicks = 0;
	private static Random rand = new Random();
	public int windClient = 0;
    public int standsOpen = 0;


	public TileWindMill() {
		super(0,"Wind Mill", 240, 80);
		super.setSides(new EnumFacing[]{EnumFacing.EAST, EnumFacing.WEST, EnumFacing.SOUTH, EnumFacing.NORTH, EnumFacing.DOWN});
	}

	public int getFacing() {
		return facingMeta;
	}

	public void setFacing(int facing) {
		this.facingMeta = facing;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt, boolean synced) {
		super.readFromNBT(nbt, synced);
		facingMeta = nbt.getByte("Orientation");
		this.windClient = nbt.getInteger("Wind");
        this.standsOpen = nbt.getInteger("standsOpen");
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt, boolean synced) {
		super.writeToNBT(nbt, synced);
		nbt.setByte("Orientation", (byte) facingMeta);
		nbt.setInteger("Wind", this.windClient);
        nbt.setInteger("standsOpen", this.standsOpen);
		return nbt;
	}

	@Override
	public Packet getDescriptionPacket() {

		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);

		return new S35PacketUpdateTileEntity(this.pos, 1, nbt);
	}

	@Override
	public void update() {
		updateTicks++;
		/**
		 * Remove any block on top of the wind mill
		 */
		if (!worldObj.isRemote) {

			/*if (updateTicks % 20 == 0) { //todo should be handled from item.
				if (!this.worldObj.isAirBlock(this.xCoord, this.yCoord + 1, this.zCoord)) {
					Block block = this.worldObj.getBlock(this.xCoord, this.yCoord + 1, this.zCoord);
					if (block != null) {
						EntityItem entityitem = new EntityItem(worldObj, this.xCoord, this.yCoord + 1, this.zCoord, new ItemStack(Item.getItemFromBlock(BlockIDs.windMill.block),1));
						float f3 = 0.05F;
						entityitem.motionX = (float) rand.nextGaussian() * f3;
						entityitem.motionY = (float) rand.nextGaussian() * f3 + 0.2F;
						entityitem.motionZ = (float) rand.nextGaussian() * f3;
						worldObj.spawnEntityInWorld(entityitem);
					}
					this.worldObj.setBlockToAir(this.xCoord, this.yCoord, this.zCoord);
				}
			}*/

			/**
			 * Check every 6 seconds if a selectable area around the windmill top-block can see the sky
			 */
            if(this.updateTicks % 120 == 0) {
                this.standsOpen = 0;
                int st = ConfigHandler.WINDMILL_CHECK_RADIUS;
                if(st >= 0) {
                   int en = st+1;
                   louter:
                   for(int x=-st;x<en;x++)
                     for(int z=-st;z<en;z++)
                       if(!this.worldObj.canBlockSeeSky(new BlockPos(this.pos.getX() + x, this.pos.getY() + 1, this.pos.getZ() + z)))
                       {
                           this.standsOpen++;
                           break louter;
                       }
                }
            } 

			/**
			 * Calculate production using wind strength
			 */
			if (this.standsOpen == 0 && updateTicks % 4 == 0) {
				this.energy.receiveEnergy((WorldEvents.windStrength + (Math.round(this.pos.getY() *0.25f)) * 10), false);
				if (this.worldObj.isThundering()) {
					this.energy.receiveEnergy(Math.round(this.energy.getEnergyStored() * 3.5f), false);
				} else if (this.worldObj.isRaining()) {
					this.energy.receiveEnergy(Math.round(this.energy.getEnergyStored() * 2.2f), false);
				}
			}
			if (this.energy.getEnergyStored() > 0) {
				pushEnergy(worldObj, pos.getX(),this.pos.getY(),this.pos.getZ(), this.energy);
			}

			this.markDirty();
			this.syncTileEntity();
		}
	}
}
