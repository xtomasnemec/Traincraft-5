package train.entity.inventory;

import ebf.tim.entities.GenericRailTransport;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import train.entity.rollingStock.EntityJukeBoxCart;

public class InventoryJukeBoxCart extends Container {

	private EntityJukeBoxCart jukebox;
	private InventoryPlayer player;

	public InventoryJukeBoxCart(InventoryPlayer iinventory, GenericRailTransport MinecartEntity) {
		player = iinventory;
		jukebox = (EntityJukeBoxCart) MinecartEntity;
	}

	@Override
	public boolean canInteractWith(EntityPlayer var1) {
		return !jukebox.isDead;
	}
}