package ebf.tim.utility;

import ebf.tim.TrainsInMotion;
import ebf.tim.blocks.TileEntityStorage;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.registry.TiMBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import train.blocks.TCBlocks;

import javax.annotation.Nullable;
import java.util.List;

/**
 * @author Eternal Blue Flame
 */
public class ItemStackSlot extends Slot {

    private ItemStack stack = ItemStack.EMPTY, overlay = null;
    private int slotID;
    private boolean isCraftingOutput = false, isCraftingInput = false, playerInventory=false;
    private Block table; //The tier of assemblytable this slot is in, if applicable. Ignore if not applicable.

    public ItemStackSlot(IInventory host, int slot, Block tier){
        super(host, slot, 0,0);
        this.slotNumber = slot;
        this.slotID = slot;
        this.table = tier;
    }


    public ItemStackSlot setCraftingOutput(boolean craft){
        isCraftingOutput =craft;
        if(craft) {
            playerInventory = false;
        }
        return this;
    }

    public ItemStackSlot setPlayerSlot(){
        playerInventory=true;
        return this;
    }
    public boolean isPlayerSlot(){
        return playerInventory;
    }

    public boolean isCraftingOutput() {
        return isCraftingOutput;
    }


    public ItemStackSlot setCraftingInput(boolean craft){
        isCraftingInput =craft;
        return this;
    }

    public boolean isCraftingInput() {
        return isCraftingInput;
    }

    public ItemStackSlot(IInventory host, int slot, int x, int y){
        super(host, slot, 0,0);
        slotID=slot;
        slotNumber=slot;
        xPos=x;
        yPos=y;
    }

    public ItemStackSlot setCoords(int x, int y){
        xPos=x;
        yPos=y;
        return this;
    }
    public ItemStackSlot setSlotID(int slot){
        slotID=slot;
        return this;
    }
    public ItemStackSlot setSlot(int slot){
        this.slotNumber=slot;
        return this;
    }

    public ItemStack getOverlay(){
        return overlay;
    }

    public ItemStackSlot setOverlay(ItemStack s){
        overlay=s;
        return this;
    }

    public ItemStackSlot setOverlay(Item s){
        overlay=new ItemStack(s);
        return this;
    }

    public ItemStackSlot setOverlay(Block s){
        overlay=new ItemStack(s);
        return this;
    }

    public Item getItem(){
        return getStack()!=null?getStack().getItem():ItemStack.EMPTY.getItem();
    }


    public NBTTagCompound writeToNBT(){
        return getStack().writeToNBT(new NBTTagCompound());
    }

    public int getStackSize(){
        return getStack()!=ItemStack.EMPTY?getStack().getCount():0;
    }


    public ItemStack mergeStack(ItemStack itemStack, List<ItemStackSlot> hostInventory,int inventoryType){
        if (isItemValid(itemStack)) {

            if (!getHasStack()) {
                onCrafting(inventoryType,hostInventory,getStackSize());
                if(!setSlotContents(itemStack.copy(),hostInventory)){
                    return itemStack;
                }
                return ItemStack.EMPTY;
            } else if (contentEquals(itemStack) && getStackSize() < getStack().getMaxStackSize()) {
                if (itemStack.copy().getCount() + getStackSize() <= getStack().getMaxStackSize()) {
                    onCrafting(inventoryType,hostInventory,getStackSize());
                    setSlotStackSize(getStackSize() + itemStack.copy().getCount());
                    return ItemStack.EMPTY;
                } else {
                    itemStack.setCount(itemStack.getCount() - getStack().getMaxStackSize() - getStackSize());
                    setSlotStackSize(getStack().getMaxStackSize());
                    onCrafting(inventoryType,hostInventory,itemStack.getMaxStackSize()-itemStack.getCount());
                    if(itemStack.getCount()==0){
                        itemStack=ItemStack.EMPTY;
                    }
                    return itemStack;
                }
            }
        }
        return itemStack;
    }

    /**
     * Attempts to merge the ItemStack in given slot with itemstack (if any) in current slot. Returns what is left in the
     * slot it tried to take items out of (not this slot).
     *
     * @param itemStack ItemStackSlot containing item that should be moved into this slot.
     * @param hostInventory List of ItemStackSlots that is used to pass through to onCrafting function
     * @param storageType integer corresponding to the type of inventory it is moving in, passed through to onCrafting func
     * @return ItemStack of what is remaining in itemStack parameter.
     */
    public ItemStack mergeStack(ItemStackSlot itemStack, List<ItemStackSlot> hostInventory, int storageType){
        if (isItemValid(itemStack.getStack())) {

            if (!getHasStack()) {
                onCrafting(storageType,hostInventory,getStackSize());
                if(!setSlotContents(itemStack.getStack().copy(),hostInventory)){
                    return itemStack.getStack();
                }
                return ItemStack.EMPTY;
            } else if (contentEquals(itemStack.getStack()) && getStackSize() < getStack().getMaxStackSize()) {
                if (itemStack.getStack().copy().getCount() + getStackSize() <= getStack().getMaxStackSize()) {
                    onCrafting(storageType,hostInventory,getStackSize());
                    setSlotStackSize(getStackSize() +itemStack.getStack().copy().getCount());
                    return ItemStack.EMPTY;
                } else {
                    itemStack.getStack().setCount(itemStack.getStack().getCount()-(getStack().getMaxStackSize() - getStackSize()));
                    setSlotStackSize(getStack().getMaxStackSize());
                    onCrafting(storageType,hostInventory,itemStack.getStack().getMaxStackSize()-itemStack.getStack().getCount());
                    if(itemStack.getStack().getCount()==0){
                        return ItemStack.EMPTY;
                    }
                    return itemStack.getStack();
                }
            }
        }
        return itemStack.getStack();
    }


    public boolean contentEquals(ItemStack other){
        if(getStack()==ItemStack.EMPTY || other==null || other==ItemStack.EMPTY){
            return getStack()==ItemStack.EMPTY&& (other==null||other==ItemStack.EMPTY);
        }
        return other.getItem()== getStack().getItem() && other.getTagCompound()== getStack().getTagCompound();
    }

    public int getMaxCraft(IInventory hostInventory, List<ItemStackSlot> hostSlots) {
        if (isCraftingOutput && hostInventory instanceof TileEntityStorage) {
            //must be an output slot, must be in an inventory that does crafting
            switch (((TileEntityStorage) hostInventory).storageType) {
                case 0:
                    //rail crafting table

                    //same as the original function's implementation
                    //  ie. out of non-zero stacks, return the size of the smallest stack

                    int smallestStack = ((TileEntityStorage) hostInventory).getSlotIndexByID(400).getStackSize();
                    if (smallestStack > 1) { //greater than 1 because if 1 the rest can't be smaller
                        for (int i = 0; i < 5; i++) {
                            int sizeOfStack = ((TileEntityStorage) hostInventory).getSlotIndexByID(400 + i).getStackSize();
                            if (sizeOfStack > 0 && sizeOfStack < smallestStack) {
                                smallestStack = sizeOfStack;
                            }
                        }
                    }
                    return smallestStack;
                case 1:
                    //train crafting system
                    Recipe recipe = RecipeManager.getRecipe(stack, null); //get the recipe that crafts item in this slot.

                    int largestAmountCanMake = 0;

                    if (recipe != null && recipe.getRecipeItems() != null) {
                        //make sure there is a recipe that crafts this.
                        largestAmountCanMake = 64;
                        for (int i = 0; i < recipe.getRecipeItems().size(); i++) {
                            //iterate over all ingredients in recipe

                            //both null means the counting doesn't matter for this ingredient.
                            if (recipe.getRecipeItems().get(i) == null && ((TileEntityStorage) hostInventory).getSlotIndexByID(400 + i).getStack() == null)
                                continue;
                            if (recipe.getRecipeItems().get(i).get(0) == null && ((TileEntityStorage) hostInventory).getSlotIndexByID(400 + i).getStack() == null) {
                                continue;
                            }

                            if (recipe.getRecipeItems().get(i).get(0) == null || recipe.getRecipeItems().get(i) == null) {
                                //that's a problem, log it
                                DebugUtil.println("There's a stack missing after the recipe has already been compared!");
                                return 0; //can't craft any if this is the case
                            }

                            //for each ingredient, we want to see the most that can be crafted with the ingredient,
                            //  then take the lowest number, for the stack that can craft the least of that ingredient.
                            //  each ItemStack in the ingredient will have the same size, so we can use the first one because it's always there.
                            int amountCanMake = ((TileEntityStorage) hostInventory).getSlotIndexByID(400 + i).getStackSize() / recipe.getRecipeItems().get(i).get(0).getCount();
                            if (amountCanMake < largestAmountCanMake) {
                                largestAmountCanMake = amountCanMake;
                            }
                        }
                    }
                    return largestAmountCanMake;
            }
        }
        return 0;
    }

    //seems to set the correct
    @Deprecated //move to onCraftMatrixChanged
    public void updatePage(TileEntityStorage hostInventory, List<ItemStackSlot> hostSlots) {
        DebugUtil.println("Depreciated");
        DebugUtil.printStackTrace();
        List<ItemStack> slots = RecipeManager.getResult(RecipeManager.getTransportRecipe(hostInventory), table);
        if (table==TCBlocks.trainTableTier1 || table==TCBlocks.trainTableTier2 || table==TCBlocks.trainTableTier3) {
            putResultsInOutputSlots(hostInventory, hostSlots, slots, hostInventory.outputPage, 9);
        } else {
            putResultsInOutputSlots(hostInventory, hostSlots, slots, hostInventory.outputPage, 8);
        }
    }

    /**
     * Helper function to fill the output slots with the given stacks. This is a method to account for the 9 output slots
     * in TiM and the 8 in the Traincraft assemblytable.
     */
    private void putResultsInOutputSlots(IInventory hostInventory, List<ItemStackSlot> hostSlots, List<ItemStack> slots, int page, int numberSlots) {
        int startSlot = 409;

        if (numberSlots==0){
            startSlot = 410; //start one slot later for TC assemblytable
        }
        if(slots==null){
            for (int i = 0; i < numberSlots; i++) {
                putStackInSlot(hostSlots,startSlot + i, ItemStack.EMPTY);
            }
            ((TileEntityStorage) hostInventory).pages = 1;
            ((TileEntityStorage) hostInventory).outputPage = 1;
        } else {
            if(slots.size() <= numberSlots) {
                for (int i = 0; i < numberSlots; i++) {
                    putStackInSlot(hostSlots,startSlot + i, i >= slots.size() ?ItemStack.EMPTY: slots.get(i));
                }
                ((TileEntityStorage)hostInventory).pages = 1;
                ((TileEntityStorage)hostInventory).outputPage = 1;
            } else {//skip 2 since buttons will be in their place.
                if (table == TCBlocks.trainTableTier1 || table == TCBlocks.trainTableTier2 || table == TCBlocks.trainTableTier3) { //TC
                    for (int i = 0; i < 6; i++) {
                        if (i + (6 * (page - 1)) < slots.size()) { //if slot is in bounds
                            putStackInSlot(hostSlots, startSlot + i, slots.get(i + ((numberSlots - 2) * (page - 1))));
                        } else {
                            break;
                        }
                    }
                } else { //TiM
                    //TiM crafter, but buttons in awkward place coding-wise
                    int slotIncrementor = 409;
                    for (int i = 0; i < 7; i++) {
                        if (slotIncrementor == 412 || slotIncrementor == 414) { //skip these slots, fill with null
                            putStackInSlot(hostSlots, slotIncrementor, ItemStack.EMPTY);
                            slotIncrementor++;
                        }
                        if ((i + 7 * (page - 1)) < slots.size()) {
                            putStackInSlot(hostSlots,slotIncrementor, slots.get(i + 7 * (page - 1)));
                        } else {
                            break;
                        }

                        slotIncrementor++;
                    }
                }
                ((TileEntityStorage)hostInventory).pages = (slots.size()/(numberSlots-2)) + 1;
            }
        }
        onSlotChanged();
    }

    public void onCraftMatrixChanged(IInventory hostInventory, List<ItemStackSlot> hostSlots) {
        if((isCraftingInput || isCraftingOutput) && hostInventory instanceof TileEntityStorage && hostSlots.size() != 18) {
            int page = ((TileEntityStorage)hostInventory).outputPage;
            if(((TileEntityStorage)hostInventory).host==TiMBlocks.trainTable) {
                List<ItemStack> slots = RecipeManager.getResult(RecipeManager.getTransportRecipe(hostInventory), this.table);
                putResultsInOutputSlots(hostInventory, hostSlots, slots, page, 8);

                ((TileEntityStorage) hostInventory).outputPage = 1;
            } else if (((TileEntityStorage)hostInventory).host==TiMBlocks.railTable){
                putStackInSlot(hostSlots,406, RecipeManager.railRecipe(hostInventory));
            } else if (table == TCBlocks.trainTableTier1 || table == TCBlocks.trainTableTier2 || table == TCBlocks.trainTableTier3){
                List<ItemStack> slots = RecipeManager.getResult(RecipeManager.getTransportRecipe(hostInventory), this.table);
                putResultsInOutputSlots(hostInventory, hostSlots, slots, page, 9);
                ((TileEntityStorage) hostInventory).outputPage = 1;

            }
            onSlotChanged();
            //todo: vanilla crafting table support for workcarts.

        }
    }

    public void onCrafting(int storageType, List<ItemStackSlot> hostSlots, int stackSize){
        if(!isCraftingOutput){return;}

        switch (storageType) {
            case 1: { //train crafting table
                Recipe r = RecipeManager.getRecipe(getStack(), null);
                if(r==null || r.input==null){return;}
                //normal Recipe, continue as normal
                for (int i = 0; i < 9; i++) {
                    if (r.input.get(i) != null) {
                        for (ItemStack s : r.input.get(i)) {
                            if (slotMatchesItem(hostSlots, 400 + i, s)) {
                                shrinkStackInSlot(hostSlots, 400 + i, s == null ? 0 : stackSize * s.getCount());
                                break;
                            }
                        }
                    }
                }

                break;
            }
            case 0:{
                for(int i=0;i<6;i++){
                    shrinkStackInSlot(hostSlots,400+i,stackSize);
                }
                break;
            }
        }
    }


    public static boolean slotMatchesItem(List<ItemStackSlot> hostSlots, int slot, ItemStack stack){
        ItemStackSlot stackSlot=null;
        for(ItemStackSlot stak: hostSlots){
            if (stak.getSlotIndex() ==slot){
                stackSlot=stak;
            }
        }
        if (stackSlot!=null) {
            if(stackSlot.getStack()==ItemStack.EMPTY || stack==ItemStack.EMPTY || stack==null) {
                return stackSlot.getStack() == ItemStack.EMPTY && (stack == ItemStack.EMPTY || stack==null);
            } else {
                return stack.getItem()==stackSlot.getStack().getItem();
            }
        } else {
            return stack==ItemStack.EMPTY;
        }
    }

    public static void shrinkStackInSlot(List<ItemStackSlot> hostSlots, int slot, int size) {
        if(size<1){return;}
        for(ItemStackSlot stak: hostSlots){
            if (stak.getSlotIndex() ==slot){
                if(stak.getStackSize()-size<1){
                    stak.setStack(ItemStack.EMPTY);
                } else {
                    stak.setSlotStackSize(stak.getStackSize() - size);
                }
            }
        }
    }

    public void putStackInSlot(List<ItemStackSlot> hostSlots, int slot, ItemStack stack) {
        ItemStackSlot stackSlot=null;
        for(ItemStackSlot stak: hostSlots){
            if (stak.getSlotIndex() ==slot){
                stackSlot=stak;
            }
        }
        if (stackSlot!=null) {
            if (!(stackSlot.inventory instanceof GenericRailTransport) && !(stackSlot.inventory instanceof TileEntityStorage)) {
                stackSlot.inventory.setInventorySlotContents(slot, stack);
            } else {
                stackSlot.setStack(stack);
            }
        }
    }

    public boolean setSlotContents(@Nonnull ItemStack stack, List<ItemStackSlot> hostInventory){
        if (isItemValid(stack) || stack == ItemStack.EMPTY) {
            if(inventory!=null) {
                inventory.setInventorySlotContents(slotNumber, stack.copy());
            }
            this.stack = stack.copy();
            this.onSlotChanged();
            if(hostInventory!=null) {
                onCraftMatrixChanged(inventory, hostInventory);
            }
            return true;
        }
        return false;
    }


    public boolean setSlotStackSize(int size){
        if(getStack()!=null) {
            ItemStack s = getStack().copy();
            s.setCount(size);
            setStack(s);
            inventory.setInventorySlotContents(slotNumber, s);
        }
        this.onSlotChanged();
        return true;
    }

    /**
     * if par2 has more items than par1, onCrafting(item,countIncrease) is called
     */
    public void onSlotChange(ItemStack p_75220_1_, ItemStack p_75220_2_) {
        if (p_75220_1_ != null && p_75220_2_ != null && p_75220_1_.getItem() == p_75220_2_.getItem()) {
            int i = p_75220_2_.getCount() - p_75220_1_.getCount();

            if (i > 0) {
                this.onCrafting(p_75220_1_, i);
            }
        }
        this.inventory.markDirty();
    }

    /*
     * the itemStack passed in is the output - ie, iron ingots, and pickaxes, not ore and wood. Typically increases an
     * internal count then calls onCrafting(item).
     protected void onCrafting(ItemStack p_75210_1_, int p_75210_2_) {}
     */

    /*
     * the itemStack passed in is the output - ie, iron ingots, and pickaxes, not ore and wood.
     protected void onCrafting(ItemStack p_75208_1_) {}
     */

    /**
     * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
     */
    @Override
    public boolean isItemValid(ItemStack p_75214_1_) {
        if(p_75214_1_==null || p_75214_1_.getItem()==null || p_75214_1_==ItemStack.EMPTY){return true;}
        return inventory.isItemValidForSlot(getSlotID(), p_75214_1_);
    }

    /**
     * Helper fnct to get the stack in the slot.
     */
    @Override
    public ItemStack getStack() {
        if(stack==null || stack==ItemStack.EMPTY){
            if(inventory!=null&& inventory.getStackInSlot(slotNumber)!=null){
                return inventory.getStackInSlot(slotNumber);
            }
            return ItemStack.EMPTY;
        }
        return stack;
    }

    @Override
    public boolean getHasStack() {
        return !(getStack().isEmpty() || getStack()==ItemStack.EMPTY || getStackSize()==0);
    }

    /**
     * Helper method to put a stack in the slot.
     * @deprecated use {@link #setSlotContents(ItemStack, List)} instead because it can return whether ot not it actually did it.
     */
    @Override
    @Deprecated
    public void putStack(ItemStack p_75215_1_) {
        setSlotContents(p_75215_1_,null);
    }

    public void setStack(ItemStack p_75215_1_) {
        stack=p_75215_1_;
    }

    /**
     * Called when the stack in a Slot changes, only for tile entities.
     */
    @Override
    public void onSlotChanged() {
        inventory.markDirty();
    }

    /**
     * Returns the maximum stack size for a given slot (usually the same as getInventoryStackLimit(), but 1 in the case
     * of armor slots)
     */
    @Override
    public int getSlotStackLimit() {
        return getHasStack()?getStack().getMaxStackSize():64;
    }

    /**
     * Decrease the size of the stack in slot (first int arg) by the amount of the second int arg. Returns the new
     * stack.
     */
    @Override
    public ItemStack decrStackSize(int p_75209_1_) {
        if(!getHasStack() ||p_75209_1_ >=getStack().getCount()){
            setSlotContents(ItemStack.EMPTY,null);
        } else {
            getStack().shrink(p_75209_1_);
        }
        return getStack();
    }

    /**
     * returns if the target Iinventory is from the same class as this
     */
    @Override
    @Deprecated
    public boolean isSameInventory(Slot other) {
        return inventory.getClass() == other.inventory.getClass();
    }

    /**
     * Return whether this slot's stack can be taken from this slot.
     */
    @Override
    public boolean canTakeStack(EntityPlayer p_82869_1_) {
        return !(inventory instanceof GenericRailTransport) || ((GenericRailTransport) inventory).getPermissions(p_82869_1_, false, false);
    }

    /**
     * Retrieves the index in the inventory for this slot, this value should typically not
     * be used, but can be useful for some occasions.
     *
     * @return Index in associated inventory for this slot.
     */
    @Override
    public int getSlotIndex() { return slotNumber; }


    public int getSlotID(){return slotID;}

    /** Here, we use it to control whether or not to do the highlighting of slot when mousing over it.
     * I am 99% sure it is used for that based on usages of the function found via IntelliJ.
     * Function it overrides always returns true.
     *
     * @return boolean for if it should draw highlight
     */
    @Override
    public boolean isEnabled() {
        //if the java ap exam taught me anything, it's short-circuit evaluation.
        if (inventory instanceof TileEntityStorage && ((TileEntityStorage) inventory).pages > 1) {
            if ((table == TCBlocks.trainTableTier1 || table == TCBlocks.trainTableTier2 || table == TCBlocks.trainTableTier3)
                    && (slotID == 415 || slotID == 416)) {
                //traincraft assemblyTables
                return false;
            } else if (table==TCBlocks.partTable && (slotID == 412 || slotID == 414)) {
                //TiM traintable
                return false;
            }
        }
        return true;
    }
}
