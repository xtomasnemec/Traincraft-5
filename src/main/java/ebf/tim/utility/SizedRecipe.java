package ebf.tim.utility;

import net.minecraft.item.ItemStack;

import java.util.Arrays;
import java.util.List;

public class SizedRecipe extends Recipe {

    private int craftWidth;
    private int craftHeight;

    public SizedRecipe(ItemStack result, List<List<ItemStack>> recipeIngredients, int craftWidth, int craftHeight) {
        super(Arrays.asList(result), recipeIngredients);
        this.craftWidth = craftWidth;
        this.craftHeight = craftHeight;
        this.setTier(0);
    }

    public int getCraftHeight() {
        return craftHeight;
    }
    public int getCraftWidth() {
        return craftWidth;
    }

    /**
     * Matches this recipe with the given 9-slot inventory. Recurses to make dimensions match.
     * Slots 0 - 9 must be the 3x3 grid.
     * WARNING: only takes 3x3 matrices.
     * WARNING: will overflow if no items in recipe.
     *
     * @param stacks the inventory to compare
     * @return whether the recipe matches the inventory or not
     */
    @Override
    public boolean inputMatches(List<ItemStack> stacks) {
        boolean notEmpty = false;
        for (int i = 0; i < 9; i++) {
            if (stacks.get(i) != null) {
                notEmpty = true;
                break;
            }
        }
        if (!notEmpty) return false;

        //eliminate empty rows and columns for non 3x3 crafting
        if(stacks.get(0) == null && stacks.get(1) == null && stacks.get(2) == null){
            //first row is empty, shift everything up one, and rerun the function with new inventory.
            List<ItemStack> newInv = Arrays.asList(null, null, null, null, null, null, null, null, null);
            for(int i = 3; i < 9; ++i){ //set the bottom two row to top
                newInv.set(i - 3, stacks.get(i));
            }
            for(int i = 7; i < 9; ++i){ //make bottom row empty as there is nothing there
                newInv.set(i, null);
            }
            return inputMatches(newInv);
        }

        //eliminate empty columns by removing the first column (if empty) and recursing
        if(stacks.get(0) == null && stacks.get(3) == null && stacks.get(6) == null){
            List<ItemStack> newInv = Arrays.asList(null, null, null, null, null, null, null, null, null);

            //do this manually, sadly it might be the best way :(
            newInv.set(0, stacks.get(1));
            newInv.set(1, stacks.get(2));
            newInv.set(2, null);

            newInv.set(3, stacks.get(4));
            newInv.set(4, stacks.get(5));
            newInv.set(5, null);

            newInv.set(6, stacks.get(7));
            newInv.set(7, stacks.get(8));
            newInv.set(8, null);

            return inputMatches(newInv);
        }

        //with the recipe minimized, do the comparison.
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                boolean foundMatch = false;
                int invIndex = row*craftWidth + col;

                ItemStack invItem = stacks.get((row*3) + col);
                List<ItemStack> recipeIngredients = input.get(invIndex);

                //if (row, col) out of bound of recipe, make sure it is null
                if (row > craftHeight-1 || col > craftWidth-1) {
                    if (invItem != null) {
                        return false;
                    } else {
                        continue;
                    }
                }

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

    /**
     * Don't use this one. It does not compare for size of recipe. Moved it to ({@link #recipeInputMatches(List, int, int)}
     */
    @Override
    public boolean recipeInputMatches(List<List<ItemStack>> stacks) {
        return false;
    }

    public boolean recipeInputMatches(List<List<ItemStack>> stacks, int width, int height) {

        if (width != this.craftWidth || height != this.craftHeight) {
            return false;
        }

        //can assume already minimized bc comparing recipe to recipe
        //with the recipe minimized, do the comparison.
        for (int row = 0; row < craftHeight; row++) {
            for (int col = 0; col < craftWidth; col++) {
                boolean foundMatch = false;
                int invIndex = row*craftWidth + col;

                List<ItemStack> invItems = stacks.get(invIndex);
                List<ItemStack> recipeIngredients = input.get(invIndex);

                if ((recipeIngredients == null) == (invItems == null)) {
                    //both null or both not null
                    if (invItems == null) continue; //only start new iteration if both null
                } else {
                    //one null when other not
                    return false;
                }

                //iterate through the possible recipeIngredients to find if there is match, and enough count in slots to craft.
                for (ItemStack ingredient : recipeIngredients) {
                    for (ItemStack invItem : invItems) {
                        int ingSize = ingredient.stackSize;
                        int invItemSize = invItem.stackSize;
                        if (ingredient.isItemEqual(invItem) && invItemSize == ingSize) {
                            foundMatch = true;
                            break;
                        }
                    }
                }
                if (!foundMatch) {
                    return false;
                }
            }
        }
        return true;
    }
}
