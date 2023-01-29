package train.blocks.windmill;


import net.minecraftforge.energy.EnergyStorage;
import ebf.tim.blocks.TileEntityStorage;
import ebf.tim.utility.CommonUtil;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.energy.IEnergyStorage;
import train.blocks.TCBlocks;
import train.core.handlers.ConfigHandler;
import train.core.handlers.WorldEvents;

import java.util.Random;

public class TileWindMill extends TileEntityStorage implements IEnergyStorage, ITickable {
	private int updateTicks = 0;
	private static Random rand = new Random();
	public int windClient = 0;
    public int standsOpen = 0;
	public EnergyStorage energy=new EnergyStorage(240,80);

	public TileWindMill() {
		super(TCBlocks.windmill);
		this.energy = new EnergyStorage(240, 80);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		this.windClient = nbt.getInteger("Wind");
        this.standsOpen = nbt.getInteger("standsOpen");
		this.energy.receiveEnergy(nbt.getInteger("energy"),false);
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setInteger("Wind", this.windClient);
        nbt.setInteger("standsOpen", this.standsOpen);
		nbt.setInteger("energy",this.energy.getEnergyStored());
        return nbt;
	}


	@Override
	public void update() {
		updateTicks++;
		/**
		 * Remove any block on top of the wind mill
		 */
		if (!world.isRemote) {
			if (updateTicks % 20 == 0) {
				if (!this.world.isAirBlock(pos.add(0,1,0))) {
					Block block = CommonUtil.getBlockAt(world, this.pos.getX(), this.pos.getY() + 1, this.pos.getZ());
					if (block != null) {
						EntityItem entityitem = new EntityItem(world, this.pos.getX(), this.pos.getY() + 1, this.pos.getZ(), new ItemStack(Item.getItemFromBlock(TCBlocks.windmill),1));
						float f3 = 0.05F;
						entityitem.motionX = (float) rand.nextGaussian() * f3;
						entityitem.motionY = (float) rand.nextGaussian() * f3 + 0.2F;
						entityitem.motionZ = (float) rand.nextGaussian() * f3;
						world.spawnEntity(entityitem);
					}
					this.world.setBlockToAir(pos.add(0,1,0));
				}
			}

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
                       if(!this.world.canBlockSeeSky(pos)) {
                           this.standsOpen++;
                           break louter;
                       }
                }
            } 

			/**
			 * Calculate production using wind strength
			 */
			if (this.standsOpen == 0 && updateTicks % 4 == 0) {
				this.energy.receiveEnergy((WorldEvents.windStrength + (Math.round(this.getPos().getY() *0.25f)) * 10), false);
				if (this.world.isThundering()) {
					this.energy.receiveEnergy(Math.round(this.energy.getEnergyStored() * 3.5f), false);
				} else if (this.world.isRaining()) {
					this.energy.receiveEnergy(Math.round(this.energy.getEnergyStored() * 2.2f), false);
				}
			}
			if (this.energy.getEnergyStored() > 0) {
				pushEnergy(world, getPos().getX(),getPos().getY(),getPos().getZ(), this.energy);
			}

			this.markDirty();
			this.syncTileEntity();
		}
	}

	public int[] getTankCapacity(){
		return new int[]{30000};
	}

	@Override
	public World getWorld(){
		return this.world;
	}

	public void pushEnergy(World world, int x, int y, int z, EnergyStorage storage){
		for (EnumFacing side : EnumFacing.HORIZONTALS) {
			TileEntity tile = world.getTileEntity(new BlockPos(x + side.getXOffset(), y + side.getYOffset(), z + side.getZOffset()));
			if (tile instanceof IEnergyStorage && storage.getEnergyStored() > 0) {
				if (((IEnergyStorage) tile).canReceive()) {
					int receive = ((IEnergyStorage) tile).receiveEnergy(Math.min(storage.getMaxEnergyStored(), storage.getEnergyStored()), false);
					storage.extractEnergy(receive, false);
				}
			}
		}
	}


	//RF Overrides


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

	@Override
	public int receiveEnergy(int maxReceive, boolean simulate) {
		return 0;
	}

	@Override
	public boolean canExtract() {
		return energy.getEnergyStored()>0;
	}

	@Override
	public boolean canReceive() {
		return false;
	}

}
