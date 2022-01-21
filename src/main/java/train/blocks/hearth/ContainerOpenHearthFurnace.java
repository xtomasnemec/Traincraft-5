package train.blocks.hearth;

import ebf.tim.utility.TransportSlotManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IContainerListener;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerOpenHearthFurnace extends TransportSlotManager {

	private TileEntityOpenHearthFurnace furnace;
	private int cookTime;
	private int burnTime;
	private int itemBurnTime;


	public ContainerOpenHearthFurnace(InventoryPlayer inventoryplayer, TileEntityOpenHearthFurnace tileentityFurnace) {
		super(inventoryplayer,tileentityFurnace);
		furnace=tileentityFurnace;
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

		for (IContainerListener icontainerlistener : this.listeners) {
			if (this.cookTime != this.furnace.getField(2)) {
				icontainerlistener.sendWindowProperty(this, 2, this.furnace.getField(2));
			}

			if (this.burnTime != this.furnace.getField(0)) {
				icontainerlistener.sendWindowProperty(this, 0, this.furnace.getField(0));
			}

			if (this.itemBurnTime != this.furnace.getField(1)) {
				icontainerlistener.sendWindowProperty(this, 1, this.furnace.getField(1));
			}
		}

		this.cookTime = this.furnace.getField(2);
		this.burnTime = this.furnace.getField(0);
		this.itemBurnTime = this.furnace.getField(1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int i, int j) {
		if (i == 0) {
			furnace.furnaceCookTime = j;
		}
		if (i == 1) {
			furnace.furnaceBurnTime = j;
		}
		if (i == 2) {
			furnace.currentItemBurnTime = j;
		}
	}
}
