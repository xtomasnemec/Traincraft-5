package train.blocks.distil;

import ebf.tim.blocks.BlockDynamic;
import ebf.tim.blocks.TileEntityStorage;
import ebf.tim.registry.TiMFluids;
import ebf.tim.registry.TiMOres;
import ebf.tim.utility.CommonUtil;
import ebf.tim.utility.FuelHandler;
import ebf.tim.utility.ItemStackSlot;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.blocks.TCBlocks;
import train.blocks.fluids.LiquidManager;

import java.util.ArrayList;
import java.util.Random;

public class TileEntityDistil extends TileEntityStorage implements ISidedInventory, ITickable {

	public int distilBurnTime;
	public int currentItemBurnTime;
	public int distilCookTime;
	private int cookDuration;
	private Random random;
	private int updateTicks;
	public boolean wasBurning=false;

	public TileEntityDistil(){}

	public TileEntityDistil(BlockDynamic host) {
		//slots 0=input 1=fuel 3=output 2=input canister ?=filled canister
		super(host);
		initInventoryFromBlock( host );
	}

	protected void initInventoryFromBlock( BlockDynamic block )
	{
		if ( host == null )
			super.initInventoryFromBlock( block );

		distilBurnTime = 0;
		currentItemBurnTime = 0;
		distilCookTime = 0;
		cookDuration = 400;//default is 200
		random = new Random();
		storageType=-1;
		//this.theTank = LiquidManager.getInstance().new FilteredTank(maxTank, new FluidStack[]{TiMFluids.fluidDiesel, }, 1);
		inventory=new ArrayList<>();

		inventory.add(new ItemStackSlot(this, 400, 56, 17).setCraftingInput(true).setOverlay(TCBlocks.orePetroleum));
		inventory.add(new ItemStackSlot(this, 401, 56, 53).setCraftingInput(true).setOverlay(Items.COAL));
		inventory.add(new ItemStackSlot(this, 402, 123, 8).setCraftingInput(true).setOverlay(Items.BUCKET));

		inventory.add(new ItemStackSlot(this, 403, 116, 60).setCraftingOutput(true));
		inventory.add(new ItemStackSlot(this, 404, 123, 33).setCraftingOutput(true));
	}

	/**
	 * Used by the GUI
	 */
	@SideOnly(Side.CLIENT)
	public int getLiquid() {
		return getTankInfo(0)!=null&&getTankInfo(0).fluid!=null?getTankInfo(0).fluid.amount:0;
	}



	@Override
	public void readFromNBT(NBTTagCompound nbtTag) {
		super.readFromNBT(nbtTag);
		distilBurnTime = nbtTag.getShort("BurnTime");
		distilCookTime = nbtTag.getShort("CookTime");
		currentItemBurnTime = nbtTag.getShort("CurrentItemBurn");
	}

	public int[] getTankCapacity() {
		return new int[]{30000};
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbtTag) {
		super.writeToNBT(nbtTag);
		nbtTag.setShort("BurnTime", (short) distilBurnTime);
		nbtTag.setShort("CookTime", (short) distilCookTime);
		nbtTag.setShort("CurrentItemBurn", (short) this.currentItemBurnTime);
		return nbtTag;
	}

	@SideOnly(Side.CLIENT)
	public int getCookProgressScaled(int i) {
		return (distilCookTime * i) / cookDuration;
	}

	@SideOnly(Side.CLIENT)
	public int getBurnTimeRemainingScaled(int i) {
		if (currentItemBurnTime == 0) {
			currentItemBurnTime = cookDuration;
		}
		return (distilBurnTime * i) / currentItemBurnTime;
	}


	@Override
	public String getName(){
		return "distil";
	}
	public boolean isBurning() {
		return distilBurnTime > 0;
	}

	//@Override
	//public boolean canUpdate(){return true;}

	@Override
	public void update() {
		if(!world.isRemote){
			updateTicks++;
			boolean flag = distilBurnTime > 0;
			boolean flag1 = false;
			if (distilBurnTime == 0 && canSmelt()) {
				currentItemBurnTime = distilBurnTime = TileEntityFurnace.getItemBurnTime(getSlotIndexByID(401).getStack());
				if (distilBurnTime > 0) {
					if (getSlotIndexByID(401).getStack() != null) {
						if (getSlotIndexByID(401).getStack().getItem().hasContainerItem(getSlotIndexByID(401).getStack())) {
							getSlotIndexByID(401).setStack(new ItemStack(getSlotIndexByID(401).getStack().getItem().getContainerItem()));
						}
						else {
							getSlotIndexByID(401).decrStackSize(1);
						}

						if (getSlotIndexByID(401).getStack().getCount() == 0) {
							getSlotIndexByID(401).setStack(null);
						}
					}
				}
			}

			if (isBurning() && canSmelt()) {
				distilCookTime++;
				if (distilCookTime == cookDuration) {
					distilCookTime = 0;
					smeltItem();
				}
			}
			else {
				distilCookTime = 0;
			}

			if (flag != (distilBurnTime > 0)) {
				flag1 = true;
			}
			else {
				CommonUtil.markBlockForUpdate(world, this.pos.getX(), this.pos.getY(), this.pos.getZ());
			}

			if (getSlotIndexByID(402).getStack() != null) {

				if (this.updateTicks % 8 == 0) {

					ItemStack result = LiquidManager.getInstance().processContainer(this, 2, this, getSlotIndexByID(402).getStack());

					if (result != null && placeInInvent(result, 404, false)) {

						placeInInvent(result, 404, true);

						flag1 = true;

						this.markDirty();
						CommonUtil.markBlockForUpdate(world, this.pos.getX(), this.pos.getY(), this.pos.getZ());
					}
				}
			}

			if (updateTicks % 8 == 0){
				this.markDirty();
				CommonUtil.markBlockForUpdate(world, this.pos.getX(), this.pos.getY(), this.pos.getZ());
			}
			if (distilBurnTime > 0) {
				distilBurnTime--;
			}
			if (flag1) {
				this.syncTileEntity();
				markDirty();
			}
		}
	}

	private boolean placeInInvent(ItemStack itemstack1, int i, boolean doAdd) {
		if (getSlotIndexByID(i) == null) {
			if (doAdd)
				getSlotIndexByID(i).setStack(itemstack1);
			return true;
		}
		else if (getSlotIndexByID(i).getStack() != null && Item.getIdFromItem(getSlotIndexByID(i).getItem()) == Item.getIdFromItem(itemstack1.getItem()) && itemstack1.isStackable() && (!itemstack1.getHasSubtypes() || getSlotIndexByID(i).getStack().getItemDamage() == itemstack1.getItemDamage()) && ItemStack.areItemStackTagsEqual(getSlotIndexByID(i).getStack(), itemstack1)) {
			int var9 = getSlotIndexByID(i).getStack().getCount() + itemstack1.getCount();
			if (var9 <= itemstack1.getMaxStackSize()) {
				if (doAdd)
					getSlotIndexByID(i).setSlotStackSize(var9);

			}
			else if (getSlotIndexByID(i).getStack().getCount() < itemstack1.getMaxStackSize()) {
				if (doAdd)
					getSlotIndexByID(i).setSlotStackSize(getSlotIndexByID(i).getStackSize()+1);
			}
			return true;
		}
		return false;

	}

	private boolean canSmelt() {
		if (getSlotIndexByID(400).getStack() == null || (getSlotIndexByID(403).getStack() != null && getSlotIndexByID(403).getStackSize()==64) || (getSlotIndexByID(404).getStack() != null && getSlotIndexByID(404).getStackSize()==64)) {
			return false;
		}
		ItemStack itemstack = getSmeltingResult(getSlotIndexByID(400).getStack());
		if (itemstack == null || itemstack.getItem()==null || itemstack==ItemStack.EMPTY) {
			return false;
		}
		FluidStack resultLiquid = FuelHandler.getFluidForFilledItem(itemstack);
		if (resultLiquid == null) {
			return false;
		}
		int used = fill(resultLiquid, false);
		return (used ==0);
	}

	public void smeltItem() {
		if (!canSmelt()) {
			return;
		}
		ItemStack itemstack = getSmeltingResult(getSlotIndexByID(400).getStack());
		ItemStack plasticStack = getPlasticResult(getSlotIndexByID(400).getStack());
		int plasticChance = getPlasticChance(getSlotIndexByID(400).getStack());
		FluidStack resultLiquid = FuelHandler.getFluidForFilledItem(itemstack);
		if (resultLiquid == null)
			return;

		int used = fill(resultLiquid, false);
		if (used ==0) {
			fill(resultLiquid, true);
			if (random.nextInt(plasticChance) == 0)
				outputPlastic(plasticStack, getSlotIndexByID(400).getStack().getItem() == TiMFluids.bucketDiesel);

			this.markDirty();
			CommonUtil.markBlockForUpdate(world, this.pos.getX(), this.pos.getY(), this.pos.getZ());
		}

		if (getSlotIndexByID(400).getStack().getItem().hasContainerItem(getSlotIndexByID(400).getStack())) {
			getSlotIndexByID(400).setStack(new ItemStack(getSlotIndexByID(400).getStack().getItem().getContainerItem()));
		}
		else {
			getSlotIndexByID(400).getStack().shrink(1);
		}
		if (getSlotIndexByID(400).getStack().getCount() <= 0) {
			getSlotIndexByID(400).setStack(null);
		}
		this.syncTileEntity();
	}

	private void outputPlastic(ItemStack plasticStack, boolean wasDeisel) {
		if (getSlotIndexByID(403).getStack() == null) {
			if(wasDeisel){
				getSlotIndexByID(403).setStack(new ItemStack(Items.BUCKET,1));
			} else {
				getSlotIndexByID(403).setStack(plasticStack.copy());
			}
		} else if(wasDeisel){
			if(getSlotIndexByID(403).getStack().getItem()==Items.BUCKET){
				getSlotIndexByID(403).decrStackSize(-plasticStack.getCount());
			} else {
				getSlotIndexByID(403).decrStackSize(-plasticStack.getCount());
			}
		} else if (Item.getIdFromItem(getSlotIndexByID(403).getStack().getItem()) == Item.getIdFromItem(plasticStack.getItem())) {
			getSlotIndexByID(403).decrStackSize(-plasticStack.getCount());
		}
		this.markDirty();
	}



	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}

	@Override
	public void markDirty() {
		if(wasBurning!=isBurning()) {
			super.markDirty();
			wasBurning=isBurning();
		} else {
			if (this.world != null) {
				CommonUtil.markBlockForUpdate(world, this.pos.getX(), this.pos.getY(), this.pos.getZ());
			}
		}
	}

	@Override
	public int[] getSlotsForFace(EnumFacing p_94128_1_) {
		if(this.inventory.size() > 0){
			int[] theInt = new int[inventory.size()];
			for(int i = 0; i < theInt.length; i++){
				theInt[i] = i;
			}
			return theInt;
		} else {
			return new int[0];
		}
	}

	@Override
	public boolean canInsertItem(int slot, ItemStack itemStackIn, EnumFacing direction){
		if(direction == EnumFacing.DOWN) return false;          // bottom is extract only
		else if(direction == EnumFacing.UP) return slot == 0; // insert input into top
		else return slot == 1;               // insert fuel into sides
	}

	@Override
	public boolean canExtractItem(int slot, ItemStack stack, EnumFacing direction){
		return direction != EnumFacing.UP && slot == 3;
	}


	public static float getExperience(ItemStack item) {//todo: spawn experience on crafting
		if(item.getItem() == Item.getItemFromBlock(TCBlocks.orePetroleum)){
			return 0.5f;
		}else if(isOil(item)){
			return 1;
		} else if(item.getItem() == Items.REEDS || item.getItem() == Items.WHEAT ||
				item.getItem() == Item.getItemFromBlock(Blocks.LEAVES)){
			return 0.2f;
		}
		return 0;
	}

	public static  int getPlasticChance(ItemStack item) {
		if(item.getItem()==Item.getItemFromBlock(TCBlocks.orePetroleum) || isOil(item)){
			return 1;
		} else if(item.getItem() == Items.REEDS || item.getItem()==Items.WHEAT){
			return 4;
		} else if (item.getItem()==Item.getItemFromBlock(Blocks.LEAVES)){
			return 6;
		}
		return 0;
	}

	public static  ItemStack getSmeltingResult(ItemStack item) {
		if(item.getItem() == Items.REEDS || item.getItem()==Items.WHEAT ||
				item.getItem()==Item.getItemFromBlock(Blocks.LEAVES)){
			return new ItemStack(TiMFluids.bucketDiesel, 1);
		} else if(item.getItem()==Item.getItemFromBlock(TCBlocks.orePetroleum)){
			return new ItemStack(TiMFluids.bucketDiesel, 2);
		} else if(isOil(item)){
			return new ItemStack(TiMFluids.bucketFuelOil, 2);
		}
		return null;
	}

	public static ItemStack getPlasticResult(ItemStack item) {
		if(item.getItem() == Items.REEDS || isOil(item)){
			return new ItemStack(TiMOres.dustPlastic,2);
		} else if(item.getItem()==Item.getItemFromBlock(TCBlocks.orePetroleum) ||
				item.getItem() ==Item.getItemFromBlock(Blocks.LEAVES) ||
				item.getItem() == Items.WHEAT){
			return new ItemStack(TiMOres.dustPlastic,1);
		}
		return null;
	}

	public static boolean isOil(ItemStack s){
		return FuelHandler.getFluidForFilledItem(s)!=null &&
				(FuelHandler.getFluidForFilledItem(s).getUnlocalizedName().toLowerCase().contains("diesel")
						|| FuelHandler.getFluidForFilledItem(s).getUnlocalizedName().toLowerCase().contains("oil"));
	}
}
