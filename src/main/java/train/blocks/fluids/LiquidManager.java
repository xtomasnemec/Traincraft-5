package train.blocks.fluids;

import ebf.tim.utility.FuelHandler;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.IFluidHandler;

public class LiquidManager {

	private static LiquidManager instance;
	public static Fluid oil;
	public static Fluid steam;
	public static Fluid fuel;
	public static Fluid biomass;
	public static Fluid biofuel;
	public static Fluid bioDiesel;
	public static Fluid bioethanol;
	public static LiquidManager getInstance() {
		if (instance == null) {
			instance = new LiquidManager();
		}
		return instance;
	}

	public static void getLiquidsFromDictionnary() {
		oil = FluidRegistry.getFluid("oil");
		steam = FluidRegistry.getFluid("steam");
		fuel = FluidRegistry.getFluid("fuel");
		biomass = FluidRegistry.getFluid("biomass");
		bioethanol = FluidRegistry.getFluid("bioethanol");
		biofuel = FluidRegistry.getFluid("biofuel");
		bioDiesel = FluidRegistry.getFluid("biodiesel");
	}

	public boolean isEmptyContainer(ItemStack stack) {
		return FuelHandler.isEmptyContainer(stack);
	}

	public ItemStack fillFluidContainer(FluidStack liquid, ItemStack empty) {
		if ((liquid == null) || (empty == null))
			return null;
		return FuelHandler.fillFluidContainer(liquid, empty);
	}

	public FluidStack getFluidInContainer(ItemStack stack) {
		return FuelHandler.getFluidForFilledItem(stack);
	}

	public ItemStack processContainer(IInventory inventory, int inventoryIndex, IFluidHandler tank, ItemStack itemstack) {
		FluidStack bucketLiquid = getFluidInContainer(itemstack);
		ItemStack emptyItem = itemstack.getItem().getContainerItem(itemstack);
		if ((bucketLiquid != null)) {
			int used = tank.fill(bucketLiquid, false);
			if (used >= bucketLiquid.amount) {
				tank.fill(bucketLiquid, true);
				if (itemstack.getItem() == Items.POTIONITEM){
					return new ItemStack(Items.GLASS_BOTTLE, 1);
				}
				inventory.decrStackSize(inventoryIndex, 1);
				return emptyItem;
			}
		}
		else if ((getInstance().isEmptyContainer(itemstack))) {
			ItemStack filled = getInstance().fillFluidContainer(tank.drain(1000,false), itemstack);
			if ((filled != null)) {
				FluidStack liquid = getFluidInContainer(filled);
				FluidStack drain = tank.drain(liquid.amount, false);
				if ((drain != null) && (drain.amount > 0)) {
					tank.drain(liquid.amount, true);
					inventory.decrStackSize(inventoryIndex, 1);
					return filled;
				}
			}
		}
		return null;
	}


}
