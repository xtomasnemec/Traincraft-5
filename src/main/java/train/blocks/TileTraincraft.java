/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.blocks;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.util.Constants;

//TODO Does this class even have ANY purpose? If it's supposed to identify TileEntities of this certain mod, use an interface. PLEASE. NO!
public class TileTraincraft extends TileEntity implements ISidedInventory{

    public ItemStack[] slots;
    public String invName;

    public TileTraincraft(){}

    public TileTraincraft(int slotAmount, String inventoryname){
        this.slots = new ItemStack[slotAmount];
        this.invName = inventoryname;
    }

    @Override
    public int[] getSlotsForFace(EnumFacing side){
        if(this.slots.length > 0){
            int[] theInt = new int[slots.length];
            for(int i = 0; i < theInt.length; i++){
                theInt[i] = i;
            }
            return theInt;
        } else {
            return new int[0];
        }
    }

    @Override
    public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction){
        return false;
    }

    @Override
    public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction){
        return false;
    }

    @Override
    public int getSizeInventory(){
        return this.slots==null?0:this.slots.length;
    }

    @Override
    public ItemStack getStackInSlot(int slot){
        return this.slots.length >= slot ? this.slots[slot] : null;
    }

    @Override
    public ItemStack decrStackSize(int i, int j){
        if (this.slots.length >= i && this.slots[i] != null) {
            if (this.slots[i].getCount() <= j) {
                ItemStack itemstack = this.slots[i];
                this.slots[i] = null;
                return itemstack;
            }
            ItemStack itemstack1 = this.slots[i].splitStack(j);
            if (this.slots[i].getCount() == 0) {
                this.slots[i] = null;
            }
            return itemstack1;
        }
        else {
            return null;
        }
    }

    public ItemStack getStackInSlotOnClosing(int slot){
        if (this.slots[slot] != null) {
            ItemStack var2 = this.slots[slot];
            this.slots[slot] = null;
            return var2;
        }
        return null;
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack stack){
        this.slots[slot] = stack;
        if (stack != null && stack.getCount() > getInventoryStackLimit()) {
            stack.setCount(getInventoryStackLimit());
        }
    }

    @Override
    public String getName(){
        return this.invName;
    }

    @Override
    public boolean hasCustomName(){
        return false;
    }

    @Override
    public int getInventoryStackLimit(){
        return 64;
    }

    @Override
    public boolean isUsableByPlayer(EntityPlayer player){
        return player.getDistanceSq((double) this.pos.getX() + 0.5D, (double) this.pos.getY() + 0.5D, (double) this.pos.getZ() + 0.5D) <= 64.0D;
    }

    @Override
    public void openInventory(EntityPlayer p){

    }

    @Override
    public void closeInventory(EntityPlayer p){
        ItemStack itm;
        for(int i=0; i<slots.length;i++){
            itm=getStackInSlotOnClosing(i);

            if(itm!=null){
                EntityItem ent = new EntityItem(p.world);
                ent.setItem(itm);
                p.world.spawnEntity(ent);
            }
        }
    }
    @Override
    public boolean isEmpty() {
        for (ItemStack slot : slots){
            if(slot!=null && slot != ItemStack.EMPTY){
                return false;
            }
        }
        return true;
    }

    @Override
    public int getField(int id) {return 0;}

    @Override
    public void setField(int id, int value) {}

    @Override
    public int getFieldCount() {return 0;}

    @Override
    public void clear() {}

    @Override
    public ItemStack removeStackFromSlot(int index) {
        ItemStack stack = getStackInSlot(index).copy();
        setInventorySlotContents(index,ItemStack.EMPTY);
        return stack;
    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack){
        return true;
    }

    @Override
    public final NBTTagCompound writeToNBT(NBTTagCompound nbt){
        super.writeToNBT(nbt);
        this.writeToNBT(nbt, false);
        return nbt;
    }

    @Override
    public final void readFromNBT(NBTTagCompound nbt){
        super.readFromNBT(nbt);
        this.readFromNBT(nbt, false);
    }

    public NBTTagCompound writeToNBT(NBTTagCompound nbt, boolean forSyncing){
        if(!forSyncing){
            if(slots==null){
                return nbt;
            }
            NBTTagList nbttaglist = new NBTTagList();
            for (int i = 0; i < this.slots.length; i++) {
                if (this.slots[i] != null) {
                    NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                    nbttagcompound1.setByte("Slot", (byte) i);
                    this.slots[i].writeToNBT(nbttagcompound1);
                    nbttaglist.appendTag(nbttagcompound1);
                }
            }
            nbt.setTag("Items", nbttaglist);
        }
        return nbt;
    }

    public void readFromNBT(NBTTagCompound nbt, boolean forSyncing){
        if(!forSyncing){
            NBTTagList nbttaglist = nbt.getTagList("Items", Constants.NBT.TAG_COMPOUND);
            this.slots = new ItemStack[getSizeInventory()];
            for (int i = 0; i < nbttaglist.tagCount(); i++) {
                NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
                byte byte0 = nbttagcompound1.getByte("Slot");
                if (byte0 >= 0 && byte0 < this.slots.length) {
                    this.slots[byte0] = new ItemStack(nbttagcompound1);
                }
            }
        }
    }


    @Override
    public SPacketUpdateTileEntity getUpdatePacket() {
        NBTTagCompound nbt = new NBTTagCompound();
        this.writeToNBT(nbt, true);
        return new SPacketUpdateTileEntity(getPos(), 1, nbt);
    }

    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt){
        if(pkt != null){
            this.readFromNBT(pkt.getNbtCompound(), true);
        }
    }
}