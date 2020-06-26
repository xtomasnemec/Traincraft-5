/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 *
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.items;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.common.Traincraft;
import train.common.library.Info;
import train.common.library.ItemIDs;

public class ItemContainer extends Item {
	String itemName;
	public ItemContainer(String itemName){
		super();
		this.itemName=itemName;
		this.setMaxStackSize(64);
		this.setCreativeTab(Traincraft.tcTab);
	}

	@Override
	public Item getContainerItem() {
		return ItemIDs.emptyCanister.item;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		return new ItemStack(ItemIDs.emptyCanister.item);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelResourceLocation getModel(ItemStack stack, EntityPlayer player, int useRemaining){
		return new ModelResourceLocation(new ResourceLocation(Info.modID.toLowerCase(), "parts/" + itemName),"inventory");
	}

		/*@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":" + "parts/" + itemName);
	}*/

}
