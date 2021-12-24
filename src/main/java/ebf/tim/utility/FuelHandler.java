package ebf.tim.utility;


import mods.railcraft.api.carts.IEnergyTransfer;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.energy.IEnergyStorage;
import ebf.tim.TrainsInMotion;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.registry.TiMFluids;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidUtil;

import static ebf.tim.entities.GenericRailTransport.*;
import static net.minecraftforge.fluids.FluidUtil.getFluidHandler;

/**
 * <h1>Fuel management for trains</h1>
 * used to process burnHeat addition and consumption.
 *
 * @author Eternal Blue Flame
 */
public class FuelHandler{

	/**the main burnHeat variable used by most trains*/
	public int burnHeat =0;
	public float burnTime =0;
	public float burnTimeMax =0;

	public enum DefaultTanks {
		STEAM(new String[][]{{FluidRegistry.WATER.getName()},{TiMFluids.fluidSteam.getName()}}),
		HEAVY_STEAM(new String[][]{{FluidRegistry.WATER.getName()},{TiMFluids.fluidHeavySteam.getName()}}),
		DIESEL(new String[][]{{TiMFluids.fluidDiesel.getName(), TiMFluids.fluidfueloil.getName()}}),
		ELECTRIC(new String[][]{{TiMFluids.fluidRedstone.getName()}}),
		DIESEL_ELECTRIC(new String[][]{{TiMFluids.fluidDiesel.getName(), TiMFluids.fluidfueloil.getName()}, {TiMFluids.fluidRedstone.getName()}});
		private String[][] t;
		DefaultTanks(String[][] type){this.t = type;}

		public String[][] value(){return t;}

	}


	public float maxHeat(GenericRailTransport transport){
		return transport.getMaxFuel() * 750;
	}

	/**
	 * <h2>check if an item is a usable water source item</h2>
	 * @return if the train can add the water to the boiler or not.
	 * TiM only water items and support for 3rd party/vanilla fuels are managed here
	 *
	 */
	@Deprecated
	public static FluidStack getUseableFluid(ItemStack itemStack, GenericRailTransport transport){
		if(itemStack==null || itemStack.getItem()==null){
			return null;
		}

		if(transport.getTypes().contains(TrainsInMotion.transportTypes.ELECTRIC)) {
			if (itemStack.getItem() == Items.REDSTONE) {
				return new FluidStack(TiMFluids.fluidRedstone, 250);
			} else if (itemStack.getItem() == Item.getItemFromBlock(Blocks.REDSTONE_BLOCK)) {
				return new FluidStack(TiMFluids.fluidRedstone, 2250);
			} else if (itemStack.getItem() instanceof IEnergyStorage) {
				return new FluidStack(TiMFluids.fluidRedstone, ((IEnergyStorage) itemStack.getItem()).extractEnergy(250, true));
			}
		}
		if(transport.getTypes().contains(TrainsInMotion.transportTypes.DIESEL)){
			if(getFluidForFilledItem(itemStack)!=null &&
					getFluidForFilledItem(itemStack).getUnlocalizedName().toLowerCase().contains("diesel")){
				return new FluidStack(TiMFluids.fluidDiesel,1000);
			} else if (getFluidForFilledItem(itemStack)!=null &&
					getFluidForFilledItem(itemStack).getUnlocalizedName().toLowerCase().contains("fueloil")) {
				return new FluidStack(TiMFluids.fluidfueloil, 1000);
			} else if (getFluidForFilledItem(itemStack)!=null &&
					getFluidForFilledItem(itemStack).getUnlocalizedName().toLowerCase().contains("oil")) {
				return new FluidStack(TiMFluids.fluidOil,1000);
			} else if (getFluidForFilledItem(itemStack)!=null &&
					getFluidForFilledItem(itemStack).getUnlocalizedName().toLowerCase().contains("fuel")) {
				return new FluidStack(TiMFluids.fluidBCFuel, 1000);
			} else if (getFluidForFilledItem(itemStack)!=null &&
					getFluidForFilledItem(itemStack).getUnlocalizedName().toLowerCase().contains("bioethanol")) {
				return new FluidStack(TiMFluids.fluidEthanol, 1000);
			} else if (getFluidForFilledItem(itemStack)!=null &&
					getFluidForFilledItem(itemStack).getUnlocalizedName().toLowerCase().contains("biofuel")) {
				return new FluidStack(TiMFluids.fluidBiofuel, 1000);
			} else if (getFluidForFilledItem(itemStack)!=null &&
					getFluidForFilledItem(itemStack).getUnlocalizedName().toLowerCase().contains("biodiesel")) {
				return new FluidStack(TiMFluids.fluidBioDiesel, 1000);
			} else if (getFluidForFilledItem(itemStack)!=null &&
					getFluidForFilledItem(itemStack).getUnlocalizedName().toLowerCase().contains("biomass")) {
				return new FluidStack(TiMFluids.fluidBiomass, 1000);
			}
		}
		if(transport.getTypes().contains(TrainsInMotion.transportTypes.STEAM)){
			if(getFluidForFilledItem(itemStack)!=null &&
					getFluidForFilledItem(itemStack).getFluid()==FluidRegistry.WATER){
				return new FluidStack(FluidRegistry.WATER,1000);
			}
		}

		if(transport.getTypes().contains(TrainsInMotion.transportTypes.TANKER)){
			return getFluidForFilledItem(itemStack);
		}

		return null;
	}

	public static FluidStack getUseableFluid(int slot, GenericRailTransport transport){
		return transport.getSlotIndexByID(slot)==null?null:getUseableFluid(transport.getSlotIndexByID(slot).getStack(),transport);
	}

	//public FluidStack getFluidForSlot(GenericRailTransport train, int slot){
	//	return getFluidForFilledItem(train.getSlotIndexByID(slot).getStack());
	//}


    //adds burn times for items that aren't normally registered to minecraft's burnable system.
    public static int itemBurnTime(ItemStackSlot slotId) {
		if(slotId !=null && slotId.getStack() !=null) {
			switch (slotId.getItem().delegate.name().getResourceDomain()) {

				//case "modid:Item":{ return 20;}
				default:{return TileEntityFurnace.getItemBurnTime(slotId.getStack());}
			}

		}
		return 0;
	}


	public static float getBoilerHeat(GenericRailTransport train){
		return (train.entityData.hasFloat("boilerHeat")?train.entityData.getFloat("boilerHeat"):0);
	}

	/**
	 * <h2>steam management</h2>
	 *
	 * Credit to zodiacmal for the heat calculation.
	 * @param train
	 */
	public void manageSteam(EntityTrainCore train){
		//manage solid burnHeat
		ItemStackSlot slotId=train.getSlotIndexByID(400);
		if (burnTime <1){
			burnTime=0;
			if (slotId != null && itemBurnTime(slotId)>0) {
				burnHeat = (int) (itemBurnTime(slotId) * train.getEfficiency());
				burnTime = MathHelper.ceil(burnHeat *0.1);
				burnTimeMax = burnTime;
				if (!train.getBoolean(GenericRailTransport.boolValues.CREATIVE)) {
					train.getSlotIndexByID(400).decrStackSize(1);
				}
				train.entityData.putFloat("burnTime", burnTime);
				train.entityData.putFloat("maxBurn", burnTimeMax);
				train.entityData.putInt("burnHeat", burnHeat);
			} else {
				burnHeat = 0;
				burnTimeMax = 0;
				train.entityData.putFloat("maxBurn", 0f);
				train.entityData.putInt("burnHeat", 0);
			}
		} else {
			burnTime--;
			train.entityData.putFloat("burnTime", burnTime);
		}

		//if there's a fluid item in the slot and the train can consume the entire thing
		if (getUseableFluid(train.waterSlot().getSlotID(),train) !=null &&
				train.fill(getUseableFluid(train.waterSlot().getSlotID(),train),false)==0) {
			train.fill(getUseableFluid(train.waterSlot().getSlotID(),train), true);
			if (!train.getBoolean(GenericRailTransport.boolValues.CREATIVE)) {
				train.getSlotIndexByID(train.waterSlot().getSlotID()).decrStackSize(1);
				train.addItem(new ItemStack(Items.BUCKET));
			}
		}
		//manage boiler heat
		if (burnHeat > 1) {
			//calculate the heat increase
			float heat = getBoilerHeat(train);
			if(heat==0){heat=1;}
			train.entityData.putFloat("boilerHeat", heat +
					(float) ((1f- Math.sqrt(heat/maxHeat(train)))
							* Math.sqrt((heat+burnHeat)/burnHeat))*(train.getEfficiency()*4)
			);

		} else {//if engine is not running
			float heat = getBoilerHeat(train);

			float biomeHeat =  (((train.world.getBiomeForCoordsBody(new BlockPos(train.chunkCoordX, train.posY, train.chunkCoordZ)).getDefaultTemperature() -0.15f)//biome temperature with offset to compensate for freezing point
					- (0.0014166695f * ((float)train.posY - 64f)))//temperature changes by 0.00166667 for every meter above or below sea level (64)
					*0.368f//convert to celsius*0.01
			);

			if(heat>biomeHeat){
				heat -=biomeHeat*0.1f;
			} else {
				heat =Math.max(heat,biomeHeat);
			}


			train.entityData.putFloat("boilerHeat", heat);
		}


		if(train.entityData.containsFluidStack("tanks.0")) {
			//if the boiler temp is above the boiling point, start generating steam.
			if (getBoilerHeat(train) > 100) {
				int steam = (int) Math.floor(
						((getBoilerHeat(train) - 100) * 0.005f) * //calculate heat from burnHeat
								(train.entityData.getFluidStack("tanks.0").amount * 0.005f) //calculate surface area of water
				);
				//drain fluid
				if (train.drain(steam != 0 ? steam / 5 : 0, true) != null) {
					train.fill(new FluidStack(TiMFluids.fluidSteam, (int) (-(Math.abs(train.accelerator) * (train.getTankCapacity()[1] * 0.01f)) + steam * 0.9f)), true);

					//if no fluid left and not creative mode, explode.
				} else if (!train.getBoolean(GenericRailTransport.boolValues.CREATIVE)) {
					train.world.createExplosion(train, train.posX, train.posY, train.posZ, 5f, false);
					train.dropItem(train.getItem(), 1);
					train.setDead();
				}
				if (!train.getBoolean(GenericRailTransport.boolValues.RUNNING)) {
					train.setBoolean(GenericRailTransport.boolValues.RUNNING, true);
					train.updateConsist();
				}
			} else {
				train.setBoolean(GenericRailTransport.boolValues.RUNNING, false);
				train.accelerator = 0;
				train.updateConsist();
			}
		}

		if (train.entityData.containsFluidStack("tanks.1")&& train.entityData.getFluidStack("tanks.1").amount >0) {
			//steam is expelled through the pistons to push them back and forth, but even when the accelerator is off, a degree of steam is still escaping.
			train.entityData.putFluidStack("tanks.1", new FluidStack(train.entityData.getFluidStack("tanks.1").getFluid(),
					train.entityData.getFluidStack("tanks.1").amount-(int)((5 * train.getEfficiency()) * ((train.accelerator) * train.getEfficiency()) * 0.55)));
		}

		//update the datawatchers so client can display the info on the GUI.
		train.getDataManager().set(FUEL_CONSUMPTION, burnTime>0?(int)((burnTime/ burnTimeMax)*18):0);
		train.getDataManager().set(BOILER_HEAT, (int)(getBoilerHeat(train) * 100f));
	}

	public void manageDiesel(EntityTrainCore train){
		manageDieselFuel(train);
	}

    public static void manageDieselFuel(EntityTrainCore train){
        //add fuel to the fuel tank
        if(getUseableFluid(400,train) !=null) {
			if (train.fill(getUseableFluid(400,train))) {
				if(!train.getBoolean(GenericRailTransport.boolValues.CREATIVE)) {
					train.getSlotIndexByID(train.fuelSlot().getSlotID()).decrStackSize(1);
					train.addItem(new ItemStack(Items.BUCKET));
				}
			}
            //todo: fluid pipe support, should be able to be toggled in server settings
        }

        //use stored fuel
        if (train.getBoolean(GenericRailTransport.boolValues.RUNNING)){
            //diesel trains use fuel similar to electric, except idle will use fuel.
			if(train.accelerator==0){//idle
				if(train.drain(0, (int)(1f*train.getEfficiency()),false)==0) {
					train.drain(0, (int) (1f * train.getEfficiency()), true);
				} else {
					train.setBoolean(GenericRailTransport.boolValues.RUNNING, false);
					train.updateConsist();
				}
			} else {//moving
				if (train.drain(0, CommonUtil.floorDouble((1 * train.getEfficiency()) + (Math.copySign(train.accelerator, 1) * (5 * train.getEfficiency()))), false)==0) {
					train.drain(0,  CommonUtil.floorDouble((1 * train.getEfficiency()) + (Math.copySign(train.accelerator, 1) * (5 * train.getEfficiency()))), true);
				} else {
					train.setBoolean(GenericRailTransport.boolValues.RUNNING, false);
					train.updateConsist();
				}
			}
        }
    }

    /* Unfinished
    //Calculate burn times for various items
    public float itemBurnTimes(EntityTrainCore train) {

		ItemStackSlot slotId=train.getSlotIndexByID(400);
		if(slotId !=null && slotId.getStack() !=null && train.getSlotIndexByID(400) !=null) {



		switch (slotId.getItem()) {

			case  :

			return TileEntityFurnace.getItemBurnTime(new ItemStack(Items.COAL)) * train.getEfficiency() * 0.2f;
				break;

				default:
					return 0;
		}

		}

		return 0;

	}
*/
	public void manageElectric(EntityTrainCore train){
		manageElectricFuel(train);
	}

	public static void manageElectricFuel(EntityTrainCore train){
		//add redstone to the fuel tank
		if(getUseableFluid(train.fuelSlot().getSlotID(),train)!=null){
			if(train.fill(getUseableFluid(train.fuelSlot().getSlotID(),train))){
				train.fill(getUseableFluid(train.fuelSlot().getSlotID(),train),true);

				if (!train.getBoolean(GenericRailTransport.boolValues.CREATIVE)) {
					if (train.getSlotIndexByID(train.fuelSlot().getSlotID()).getItem() instanceof IEnergyStorage) {
						((IEnergyStorage) train.getSlotIndexByID(train.fuelSlot().getSlotID()).getItem())
								.extractEnergy(250, false);
					} else {
						train.getSlotIndexByID(train.fuelSlot().getSlotID()).decrStackSize(1);
					}
				}
			}
		}

		//fill from overhead wires/3rd rail/under rail
		if (train.fill(new FluidStack(TiMFluids.fluidRedstone, 100), false) == 0) {
			int draw = 0;
			TileEntity te;
			Block b;
			for (int i=-2; i<5;i++) {
				if(i==1){continue;}
				te=train.world.getTileEntity(
						new BlockPos(CommonUtil.floorDouble(train.posX), CommonUtil.floorDouble(train.posY + i), CommonUtil.floorDouble(train.posZ)));
				if (te instanceof IEnergyStorage) {
					draw = ((IEnergyStorage) te).extractEnergy(100, true);

					if (draw ==100) {
						((IEnergyStorage) te).receiveEnergy(100, false);
						train.fill(new FluidStack(TiMFluids.fluidRedstone, 100), true);
						break;
					}
				}
				if (draw != 0) {
					break;
				}
			}
		}

		//use stored energy
		if (train.getBoolean(GenericRailTransport.boolValues.RUNNING)){
			//electric trains run at a generally set rate which is multiplied at the square of speed.
			if (train.drain(0, CommonUtil.floorDouble((1*train.getEfficiency()) + (Math.copySign(train.accelerator, 1)*(5*train.getEfficiency()))), false)<1){
				train.drain(0, CommonUtil.floorDouble((1*train.getEfficiency()) + (Math.copySign(train.accelerator, 1)*(5*train.getEfficiency()))), true);
			} else {
				train.setBoolean(GenericRailTransport.boolValues.RUNNING, false);
				train.updateConsist();
			}
		}
	}


	public static void manageTanker(GenericRailTransport transport){

		if (getUseableFluid(transport.tankerInputSlot().getSlotID(), transport) != null &&
				transport.fill(getUseableFluid(transport.tankerInputSlot().getSlotID(), transport))) {

			transport.fill(getUseableFluid(transport.tankerInputSlot().getSlotID(), transport), true);

			if (!transport.getBoolean(GenericRailTransport.boolValues.CREATIVE)) {
				transport.addItem(drainFluidContainer(transport.getSlotIndexByID(transport.tankerInputSlot().getSlotID()).getStack()));
				transport.getSlotIndexByID(transport.tankerInputSlot().getSlotID()).decrStackSize(1);

			}

		}
		//attempt to fill any buckets in the drain slot
		if (transport.getSlotIndexByID(transport.tankerOutputSlot().getSlotID())!=null && isEmptyContainer(transport.getSlotIndexByID(401).getStack())) {
			for (int i = 0; i < transport.getTankCapacity().length; i++) {
				if (fillFluidContainer(
						new FluidStack(transport.entityData.getFluidStack("tanks."+i).getFluid(),1000)
						, transport.getSlotIndexByID(transport.tankerOutputSlot().getSlotID()).getStack()) !=null) {

					transport.addItem(fillFluidContainer(
							new FluidStack(transport.entityData.getFluidStack("tanks."+i).getFluid(),1000)
							, transport.getSlotIndexByID(transport.tankerOutputSlot().getSlotID()).getStack()));
					transport.getSlotIndexByID(transport.tankerOutputSlot().getSlotID()).decrStackSize(1);
					return;
				}
			}
		}


			//drain from top slot
			/*if (transport.getStackInSlot(1) == null && isUseableFluid(transport.getStackInSlot(0), transport) == null &&
					transport.drain(null, 1000, false) != null && transport.drain(null, 1000, false).amount >= 1000){
				transport.setInventorySlotContents(1, fillFluidContainer(transport.drain(null, 1000, false), transport.getStackInSlot(0)));
				if (transport.getStackInSlot(0).getCount() == 1) {
					transport.setInventorySlotContents(0, null);
				} else {
					transport.getStackInSlot(0).getCount()--;
				}
				if (!transport.getBoolean(GenericRailTransport.boolValues.CREATIVE)) {
					transport.drain(null, 1000, true);
				}
			}
		}*/
	}

	public static ItemStack drainFluidContainer(ItemStack item){
		return getFluidHandler(item).getContainer();
	}

	public static ItemStack fillFluidContainer(FluidStack stack, ItemStack item){
		return FluidUtil.getFilledBucket(stack);
	}

	public static FluidStack getFluidForFilledItem(ItemStack item){
		return FluidUtil.getFluidHandler(item).getTankProperties()[0].getContents();
	}

	public static boolean isEmptyContainer(ItemStack item){
		return FluidUtil.getFluidHandler(item).getTankProperties()==null||
				FluidUtil.getFluidHandler(item).getTankProperties()[0]==null ||
				FluidUtil.getFluidHandler(item).getTankProperties()[0].getContents()==null ||
				getFluidHandler(item).getTankProperties()[0].getContents().amount==0;
	}

} 
