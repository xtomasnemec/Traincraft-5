package train.blocks.hearth;

import ebf.tim.blocks.TileEntityStorage;
import ebf.tim.utility.DebugUtil;
import ebf.tim.utility.TransportSlotManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.IInventory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerOpenHearthFurnace extends TransportSlotManager {

	private int cookTime;
	private int burnTime;
	private int itemBurnTime;


	public ContainerOpenHearthFurnace(InventoryPlayer inventoryplayer, TileEntityStorage tileentityFurnace) {
		super(inventoryplayer,tileentityFurnace);
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return hostInventory.isUsableByPlayer(entityplayer);
	}


	/*@Override //1.7 variant
	public void addCraftingToCrafters(ICrafting par1ICrafting) {
		super.addCraftingToCrafters(par1ICrafting);
		par1ICrafting.sendProgressBarUpdate(this, 0, furnace.furnaceCookTime);
		par1ICrafting.sendProgressBarUpdate(this, 1, furnace.furnaceBurnTime);
		par1ICrafting.sendProgressBarUpdate(this, 2, furnace.currentItemBurnTime);
	}*/

	@Override
	public void addListener(IContainerListener listener) {//1.12 variant
		super.addListener(listener);
		listener.sendAllWindowProperties(this, this.hostInventory);
	}

	/*
	 * @Override public void updateCraftingResults() { super.updateCraftingResults(); for (int i = 0; i < crafters.size(); i++) { ICrafting icrafting = (ICrafting) crafters.get(i); if (cookTime != furnace.furnaceCookTime) { icrafting.sendProgressBarUpdate(this, 0, furnace.furnaceCookTime); } if (burnTime != furnace.furnaceBurnTime) { icrafting.sendProgressBarUpdate(this, 1, furnace.furnaceBurnTime); } if (itemBurnTime != furnace.currentItemBurnTime) { icrafting.sendProgressBarUpdate(this, 2, furnace.currentItemBurnTime); } } cookTime = furnace.furnaceCookTime; burnTime = furnace.furnaceBurnTime; itemBurnTime = furnace.currentItemBurnTime; } */

	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();

		TileEntityOpenHearthFurnace furnace = (TileEntityOpenHearthFurnace)hostInventory;
		for (IContainerListener icontainerlistener : this.listeners) {
			if (this.cookTime != furnace.furnaceCookTime) {
				icontainerlistener.sendWindowProperty(this, 2, furnace.furnaceCookTime);
			}

			if (this.burnTime != furnace.furnaceBurnTime) {
				icontainerlistener.sendWindowProperty(this, 0, furnace.furnaceBurnTime);
			}

			if (this.itemBurnTime != furnace.currentItemBurnTime) {
				icontainerlistener.sendWindowProperty(this, 1, furnace.currentItemBurnTime);
			}
		}

		this.cookTime = furnace.furnaceCookTime;
		this.burnTime = furnace.furnaceBurnTime;
		this.itemBurnTime = furnace.currentItemBurnTime;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int i, int j) {
		if (i == 0) {
			((TileEntityOpenHearthFurnace)hostInventory).furnaceCookTime = j;
		}
		else if (i == 1) {
			((TileEntityOpenHearthFurnace)hostInventory).furnaceBurnTime = j;
		}
		else if (i == 2) {
			((TileEntityOpenHearthFurnace)hostInventory).currentItemBurnTime = j;
		}
	}
}
