/*******************************************************************************
 * Copyright (c) 2013 Spitfire4466. All rights reserved.
 *
 * @name TrainCraft
 * @author Spitfire4466
 ******************************************************************************/

package train.blocks.generator;


import net.minecraftforge.energy.EnergyStorage;
import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import ebf.tim.blocks.BlockDynamic;
import ebf.tim.blocks.TileEntityStorage;
import ebf.tim.utility.FuelHandler;
import ebf.tim.utility.ItemStackSlot;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.fluids.FluidStack;
import train.blocks.TCBlocks;

import java.util.ArrayList;

public class TileGeneratorDiesel extends TileEntityStorage implements IEnergyStorage, ITickable {

    public boolean powered;
    public EnergyStorage energy = new EnergyStorage(320,80); //core energy value the first value is max storage and the second is transfer max.

    public int currentBurnTime;

    private int lastTankAmount;
    private int lastBurnTime;

    public TileGeneratorDiesel(){
        super(TCBlocks.dieselGenerator);
        //this.theTank = LiquidManager.getInstance().new FilteredTank(30000, LiquidManager.dieselFilter(), 1);

    }
    public TileGeneratorDiesel(BlockDynamic b){
        super(b);
        //this.theTank = LiquidManager.getInstance().new FilteredTank(30000, LiquidManager.dieselFilter(), 1);

    }
    protected void initInventoryFromBlock( BlockDynamic block ) {
        if (host == null) {
            super.initInventoryFromBlock(block);
        }
        inventory=new ArrayList<>();
        inventory.add(new ItemStackSlot(this, 400, 56, 17));
        inventory.add(new ItemStackSlot(this, 401, 56, 53));
    }

    @Override
    public void update(){
        if(!world.isRemote){
            if(getSlotIndexByID(400).getStack() != null){
                FluidStack stak = FuelHandler.getFluidForFilledItem(getSlotIndexByID(400).getStack());
                if(stak!=null && stak.amount>0){
                    if(getTankInfo(0).fluid==null || getTankInfo(0).fluid.getFluid() ==null || getTankInfo(0).fluid.amount==0 ||
                            (getTankInfo(0).fluid.amount+stak.amount<getTankCapacity()[0]&&
                            getTankInfo(0).fluid.getFluid() == stak.getFluid())){

                        if(getSlotIndexByID(401).getStack()==null ||
                                (getSlotIndexByID(401).getItem()== Items.BUCKET &&getSlotIndexByID(401).getStackSize()< getSlotIndexByID(401).getStack().getMaxStackSize())) {

                            if(getSlotIndexByID(401).getStack()==null){
                                getSlotIndexByID(401).setStack(new ItemStack(Items.BUCKET));
                            } else {
                                getSlotIndexByID(401).decrStackSize(-1);
                            }
                            fill(stak, true);
                            getSlotIndexByID(400).decrStackSize(1);
                        }
                    }
                }
                this.markDirty();
                this.syncTileEntity();
            }
            int energyProduced = 70;
            if(this.currentBurnTime > 0){
                this.currentBurnTime--;
                this.energy.receiveEnergy(energyProduced, false);
            }

            if(this.powered && energyProduced <= this.energy.getMaxEnergyStored()-this.energy.getEnergyStored()){
                int fuelUsed = 50;
                if(this.currentBurnTime <= 0 && getTankInfo(0).fluid.amount >= fuelUsed){
                    this.currentBurnTime = 8;
                    drain(fuelUsed, true);
                    this.markDirty();
                }
            }

            if(this.energy.getEnergyStored() > 0){
                pushEnergy(world, pos.getX(),pos.getY(),pos.getZ(), this.energy);
            }
        }

        if(getTankInfo(0).fluid.amount != this.lastTankAmount || this.currentBurnTime != this.lastBurnTime){
            this.lastTankAmount = getTankInfo(0).fluid.amount;
            this.lastBurnTime = this.currentBurnTime;
            this.syncTileEntity();
        }

    }

    @Override
    public void readFromNBT(NBTTagCompound nbtTag){
        super.readFromNBT(nbtTag);
        this.powered = nbtTag.getBoolean("Powered");
        this.currentBurnTime = nbtTag.getInteger("BurnTime");
        //there's no good way to set the value directly without also being able to recieve energy.
        //BS fix is to add a negative energy value.
        this.energy.receiveEnergy(nbtTag.getInteger("energy"),false);
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound nbtTag){
        super.writeToNBT(nbtTag);
        nbtTag.setBoolean("Powered", this.powered);
        nbtTag.setInteger("BurnTime", this.currentBurnTime);
        nbtTag.setInteger("energy",this.energy.getEnergyStored());
        return nbtTag;
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
