package train.blocks.bench;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import train.core.interfaces.ITCRecipe;

import java.util.ArrayList;
import java.util.List;

public class TrainWorkbenchRecipe implements ITCRecipe {

    private List<List<ItemStack>> recipe = new ArrayList<>();
    private ItemStack craftResult;
    private int craftWidth;
    private int craftHeight;

    public TrainWorkbenchRecipe(List<List<ItemStack>> recipe, ItemStack craftResult, int craftWidth, int craftHeight) {
        this.recipe = recipe;
        this.craftResult = craftResult;
        this.craftWidth = craftWidth;
        this.craftHeight = craftHeight;
    }

    /**
     * Matches this recipe with the given 9-slot inventory. Recurses to make dimensions match.
     * Slots 0 - 9 must be the 3x3 grid.
     * WARNING: only takes 3x3 matrices.
     * WARNING: will overflow if no items in recipe.
     *
     * @param inv the inventory to compare
     * @return whether the recipe matches the inventory or not
     */
    public boolean matches(IInventory inv){
        boolean notEmpty = false;
        for (int i = 0; i < 9; i++) {
            if (inv.getStackInSlot(i) != null) {
                notEmpty = true;
                break;
            }
        }
        if (!notEmpty) return false;

        //eliminate empty rows and columns for non 3x3 crafting
        if(inv.getStackInSlot(0) == null && inv.getStackInSlot(1) == null && inv.getStackInSlot(2) == null){
            //first row is empty, shift everything up one, and rerun the function with new inventory.
            InventoryBasic newInv = new InventoryBasic("newInv", false, 9);
            for(int i = 3; i < 9; ++i){ //set the bottom two row to top
                newInv.setInventorySlotContents(i - 3, inv.getStackInSlot(i));
            }
            for(int i = 7; i < 9; ++i){ //make bottom row empty as there is nothing there
                newInv.setInventorySlotContents(i, null);
            }
            return matches(newInv);
        }

        //eliminate empty columns by removing the first column (if empty) and recursing
        if(inv.getStackInSlot(0) == null && inv.getStackInSlot(3) == null && inv.getStackInSlot(6) == null){
            InventoryBasic newInv = new InventoryBasic("newInv", false, 9);

            //do this manually, sadly it might be the best way :(
            newInv.setInventorySlotContents(0, inv.getStackInSlot(1));
            newInv.setInventorySlotContents(1, inv.getStackInSlot(2));
            newInv.setInventorySlotContents(2, null);

            newInv.setInventorySlotContents(3, inv.getStackInSlot(4));
            newInv.setInventorySlotContents(4, inv.getStackInSlot(5));
            newInv.setInventorySlotContents(5, null);

            newInv.setInventorySlotContents(6, inv.getStackInSlot(7));
            newInv.setInventorySlotContents(7, inv.getStackInSlot(8));
            newInv.setInventorySlotContents(8, null);

            return matches(newInv);
        }

        //THIS PART IS ACTUAL RECIPE CHECKING ---- MAKE SURE WORKS
        for (int row = 0; row < craftHeight; row++) {
            for (int col = 0; col < craftWidth; col++) {
                boolean foundMatch = false;
                int invIndex = row*craftWidth + col;

                ItemStack invItem = inv.getStackInSlot(invIndex);
                List<ItemStack> recipeIngredients = recipe.get(invIndex);

                if (recipeIngredients == null) {
                    if (invItem == null) {
                        continue; //both inv and recipe are empty slots
                    } else {
                        return false; //item in inv when none in recipe
                    }
                } else if (invItem == null) {
                    return false; //at this point, recipe is not empty here but item is.
                }

                //iterate through the possible recipeIngredients to find if there is match, and enough count in slots to craft.
                for (ItemStack ingredient : recipeIngredients) {
                    int ingSize = ingredient.stackSize;
                    int invItemSize = invItem.stackSize;
                    if (ingredient.isItemEqual(invItem) && invItemSize >= ingSize) {
                        foundMatch = true;
                        break;
                    }
                }
                if (!foundMatch) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public ItemStack getCraftingResult(IInventory var1) {
        return craftResult.copy();
    }

    @Override
    public int getRecipeSize() {
        return craftHeight * craftWidth;
    }

    @Override
    public ItemStack getRecipeOutput() {
        return craftResult.copy();
    }
}
