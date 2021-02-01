package train.blocks.bench;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.*;

/**
 * This class will handle parsing and adding train workbench recipes to the train workbench.
 * Recipes should be written in json and added to the resources section as if it was a 1.12 or newer mod. Json recipes
 * should use the same format as 1.12 and newer recipes. See the forge documentation for more information:
 * @see {https://mcforge.readthedocs.io/en/1.12.x/utilities/recipes/}
 *
 * TODO: MAKE SURE ORE DICT WORKS, TEST OTHER POSSIBLE ITEMS TOO, TEST DYES AND ITEMS WITH DATA TAG AND COUNT TAG
 *
 * @note For forge 1.12 and greater, make a simple wrapper for this class. There were too many minor differences and I
 *       didn't want to leave landmines of commented out code.
 *
 * @note Recipes may have to change in future due to changes in naming, ie. dyes changed
 *
 * @author ComputerButter
 */
public class TrainWorkbenchRecipeFactoryHelper {

    //to make 1.12 compatibility easier. 1.12 likes ItemStack.EMPTY, so this will replace that.
    // WARN: It is not a drop-in replacement, and other things will have to be changed for 1.12 compat, but makes a little easier.
    private static ItemStack NULL_ITEM = null;

    //I used this logger because it makes debugging easier and will show up nicer in logs both for users and us.
    private static Logger LOGGER = LogManager.getLogger("traincraft");

    /**
     * The main function that handles the taking the recipe, parsing it, and then adding it to the array of recipes in the trainworkbench
     *
     * @param json the json of the recipe we need to parse
     */
    public static void parseAndAddRecipe(JsonObject json) {
        if (json == null && json.isJsonNull()) {
            //make sure not empty, just in case
            return;
        }

        //get result first
        ItemStack craftingResult;
        try {
            JsonObject resultJson = json.getAsJsonObject("result");
            craftingResult = deserializeItem(resultJson, true);
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, "Result not found while parsing recipe: " + e.getLocalizedMessage());
            return;
        }

        //parse the crafting grid
        // first parse the keys ("X": { ... }, ...)
        Map<String, ItemStack[]> keyMap;
        try {
            JsonObject keyJson = json.getAsJsonObject("key");
            keyMap = deserializeKey(keyJson);
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, "Problem found while parsing keys: " + e.getLocalizedMessage());
            return;
        }

        //get the pattern of the crafting recipe
        String[] patternStrings;
        try {
            JsonArray keyJson = json.getAsJsonArray("pattern");
            patternStrings = patternFromJson(keyJson);
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, "Problem found while parsing keys: " + e.getLocalizedMessage());
            return;
        }
        int craftingWidth = patternStrings[0].length();
        int craftingHeight = patternStrings.length;

        //use keymap with grid to generate resulting recipe input.
        List<List<ItemStack>> ingredients = new ArrayList<>();
        ingredients = deserializeIngredients(patternStrings, keyMap);

        //create and add recipe to workbench.
        TrainWorkbenchRecipe recipe = new TrainWorkbenchRecipe(ingredients, craftingResult, craftingWidth, craftingHeight);
        TrainCraftingManager.instance.recipes.add(recipe);
    }

    /**
     * Takes an jsonObject that usually looks like:
     *     {
     *       "item": "minecraft:rail"
     *     }
     * and turns it into an ItemStack.
     *
     * @param json jsonObject to parse
     * @param useCount whether or not to include number of items included with
     * @return An ItemStack representing the given jsonObject, null if not found.
     */
    @Nullable
    private static ItemStack deserializeItem(JsonObject json, boolean useCount)
    {
        String itemString = getString(json, "item");

        //NOTE: IN 1.12, change this to:
        //Item item = Item.REGISTRY.getObject(new ResourceLocation(itemString));
        Item item = (Item) Item.itemRegistry.getObject(new ResourceLocation(itemString).getResourcePath());

        if (item == null) {
            throw new JsonSyntaxException("Unknown item '" + itemString + "'");
        } else if (item.getHasSubtypes() && !json.has("data")) {
            throw new JsonParseException("Missing data for item '" + itemString + "'");
        } else {
            int i = getInt(json, "data", 0);
            int j = useCount ? getInt(json, "count", 1) : 1;
            return new ItemStack(item, j, i);
        }
    }

    /**
      * Turns the "key" json object into a map of recipe ingredient keys (ie. #, X, etc.) and the corresponding ingredient.
      *
      * @param json The object containing the array of keys
      * @return A map of the keys to a group of ItemStacks that it represents (can be multiple because of ore dict)
      */
    private static Map<String, ItemStack[]> deserializeKey(JsonObject json){
        Map<String, ItemStack[]> map = Maps.newHashMap();

        //iterate through keys
        for(Map.Entry<String, JsonElement> entry : json.entrySet()){
            if(((String) entry.getKey()).length() != 1){
                throw new JsonSyntaxException("Invalid key entry: '" + (String) entry.getKey() + "' is an invalid symbol (must be 1 character only).");
            }

            if(" ".equals(entry.getKey())){
                throw new JsonSyntaxException("Invalid key entry: ' ' is a reserved symbol.");
            }

            map.put(entry.getKey(), deserializeIngredient(entry.getValue()));
        }

        //space will be handled as null elsewhere
        //map.put(" ", Ingredient.EMPTY);
        return map;
    }

    /**
     * Takes a jsonElement describing a Ingredient and turns it into the corresponding Ingredient. This is very similar
     * to deserializeItem, except for more support for things other than simply the "item:" tag
     * NOTE: this is overridden to provide support for forge ore dictionary.
     *
     * @param jsonElement object/array of objects describing single ingredient.
     * @return the ingredient
     */
    private static ItemStack[] deserializeIngredient(@Nullable JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {

            //first check if using ore dict, otherwise do normal stuff
            if (jsonElement.getAsJsonObject().has("type")) {
                if (jsonElement.getAsJsonObject().get("type").getAsString().equals("forge:ore_dict")) {
                    if (jsonElement.getAsJsonObject().has("ore")) {
                        //find all ItemStacks for ore
                        ArrayList<ItemStack> oresFromOreDict = OreDictionary.getOres(jsonElement.getAsJsonObject().get("ore").getAsString());
                        ItemStack[] itemStacks = new ItemStack[oresFromOreDict.size()];
                        for (int i = 0; i < oresFromOreDict.size(); ++i) {
                            itemStacks[i] = oresFromOreDict.get(i);
                        }
                        return itemStacks;

                    } else {
                        throw new JsonSyntaxException("Does not contain ore item.");
                    }
                } else {
                    throw new JsonSyntaxException("Does not support non forge:ore_dict types yet. You may have made typo.");
                }

            } else if (jsonElement.isJsonObject()) {
                return new ItemStack[]{deserializeItem(jsonElement.getAsJsonObject(), false)};
            } else if (!jsonElement.isJsonArray()) {
                throw new JsonSyntaxException("Expected item to be object or array of objects");
            } else {
                JsonArray jsonarray = jsonElement.getAsJsonArray();

                if (jsonarray.size() == 0) {
                    throw new JsonSyntaxException("Item array cannot be empty, at least one item must be defined");
                } else {
                    ItemStack[] aitemstack = new ItemStack[jsonarray.size()];

                    for (int i = 0; i < jsonarray.size(); ++i) {
                        aitemstack[i] = deserializeItem(getJsonObject(jsonarray.get(i), "item"), false);
                    }

                    return aitemstack;
                }
            }
        } else {
            throw new JsonSyntaxException("Item cannot be null");
        }
    }

    /**
     * This function takes the array of strings that make up the pattern and turn it into an array of Strings, which is
     * considerably easier to work with than raw json stuff.
     *
     * @param jsonArr the array of strings, looks like: ["XXX", "E E", "OO "] or similar. Can be not 3x3, must be square-shaped
     * @return An array of 1-3 strings.
     */
    private static String[] patternFromJson(JsonArray jsonArr){
        String[] astring = new String[jsonArr.size()];

        if(astring.length > 3){
            throw new JsonSyntaxException("Invalid pattern: too many rows, 3 is maximum");
        } else if(astring.length == 0){
            throw new JsonSyntaxException("Invalid pattern: empty pattern not allowed");
        } else{
            for(int i = 0; i < astring.length; ++i){
                String s = getString(jsonArr.get(i), "pattern[" + i + "]");

                if(s.length() > 3){
                    throw new JsonSyntaxException("Invalid pattern: too many columns, 3 is maximum");
                }

                if(i > 0 && astring[0].length() != s.length()){
                    throw new JsonSyntaxException("Invalid pattern: each row must be the same width");
                }

                astring[i] = s;
            }

            //pad rows with empty spaces so becomes 3x3
//            for (int i = 0; i < astring.length; i++) {
//                while (astring[i].length() < 3) {
//                    astring[i] = astring[i] + " ";
//                }
//            }
//
//            if (astring.length < 3) {
//                //pad with empty rows so it becomes 3x3
//                String[] retString = new String[3];
//                for (int i = 0; i < 3; i++) {
//                    if (astring.length < i) {
//                        retString[i] = astring[i];
//                    } else {
//                        retString[i] = "   ";
//                    }
//                }
//                return retString;
//            }

            return astring;
        }
    }

    /**
     *  UNFINISHED AS OF 1/27/21, make sure function works, then finish with rest of parse.
     * @param pattern An array of strings that represent how pattern looks in crafting table (must be 3x3)
     * @param keys A map relating characters in pattern with the Items they represent.
     * @return
     */
    private static List<List<ItemStack>> deserializeIngredients(String[] pattern, Map<String, ItemStack[]> keys /*, int craftingWidth, int craftingHeight*/) {
        List<List<ItemStack>> finalList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            finalList.add(null);
        }
        Set<String> set = Sets.newHashSet(keys.keySet());
        //set.remove(" "); //not present anyways

        for(int i = 0; i < pattern.length; ++i){
            for(int j = 0; j < pattern[i].length(); ++j){
                String s = pattern[i].substring(j, j + 1);
                ItemStack[] ingredient = keys.get(s);

                if(ingredient == null){
                    throw new JsonSyntaxException("Pattern references symbol '" + s + "' but it's not defined in the key");
                }

                set.remove(s);
                finalList.set(j + (pattern[0].length())*i, Arrays.asList(ingredient));
            }
        }

        if(!set.isEmpty()){
            LOGGER.log(Level.WARN, "Key defines symbols that aren't used in pattern: " + set);
        }

        return finalList;
    }

    /**
          * Removes empty rows and columns from the crafting recipe, good for being able to use (ie) one row recipe in any row.
          *
          * @param toShrink array of strings to shrink.
          * @return shrunken recipe
          */
    private static String[] shrink(String... toShrink){
        int i = Integer.MAX_VALUE;
        int j = 0;
        int k = 0;
        int l = 0;

        for(int i1 = 0; i1 < toShrink.length; ++i1){
            String s = toShrink[i1];
            i = Math.min(i, firstNonSpace(s));
            int j1 = lastNonSpace(s);
            j = Math.max(j, j1);

            if(j1 < 0){
                if(k == i1){
                    ++k;
                }

                ++l;
            } else{
                l = 0;
            }
        }

        if(toShrink.length == l){
            return new String[0];
        } else{
            String[] astring = new String[toShrink.length - l - k];

            for(int k1 = 0; k1 < astring.length; ++k1){
                astring[k1] = toShrink[k1 + k].substring(i, j + 1);
            }

            return astring;
        }
    }

    //ngl, never seen a for loop used in the way it is in the next two functions. v cool tho
    private static int firstNonSpace(String str){
        int i;

        for(i = 0; i < str.length() && str.charAt(i) == ' '; ++i){
            ;
        }

        return i;
    }

    private static int lastNonSpace(String str){
        int i;

        for(i = str.length() - 1; i >= 0 && str.charAt(i) == ' '; --i){
            ;
        }

        return i;
    }

    ///MARK: more small helper functions related to json. In future versions of minecraft, at least 1.12 and up, these are
    /// built into the JsonUtils class, a very helpful class I wish was here. I basically copied and merged functions
    /// so they work slightly faster for our use case at the expense of perfect error logging.

    private static int getInt(JsonElement json, String memberName) {
        if (json.isJsonPrimitive() && json.getAsJsonPrimitive().isNumber()) {
            return json.getAsInt();
        } else {
            throw new JsonSyntaxException("Expected " + memberName + " to be a Int.");
        }
    }
//    private static int getInt(JsonObject json, String memberName) {
//        if (json.has(memberName)) {
//            return getInt(json.get(memberName), memberName);
//        } else {
//            throw new JsonSyntaxException("Missing " + memberName + ", expected to find a Int");
//        }
//    }
    private static int getInt(JsonObject json, String memberName, int fallback) {
        return json.has(memberName) ? getInt(json.get(memberName), memberName) : fallback;
    }

    private static String getString(JsonElement json, String memberName) {
        if (json.isJsonPrimitive()) {
            return json.getAsString();
        } else {
            throw new JsonSyntaxException("Expected " + memberName + " to be a string.");
        }
    }
    private static String getString(JsonObject json, String memberName) {
        if (json.has(memberName)) {
            return getString(json.get(memberName), memberName);
        } else {
            throw new JsonSyntaxException("Missing " + memberName + ", expected to find a string");
        }
    }
//    private static String getString(JsonObject json, String memberName, String fallback) {
//        return json.has(memberName) ? getString(json.get(memberName), memberName) : fallback;
//    }

    private static JsonObject getJsonObject(JsonElement json, String memberName) {
        if (json.isJsonObject()) {
            return json.getAsJsonObject();
        } else {
            throw new JsonSyntaxException("Expected " + memberName + " to be a JsonObject.");
        }
    }
//    private static JsonObject getJsonObject(JsonObject json, String memberName) {
//        if (json.has(memberName)) {
//            return getJsonObject(json.get(memberName), memberName);
//        } else {
//            throw new JsonSyntaxException("Missing " + memberName + ", expected to find a JsonObject");
//        }
//    }
//    private static JsonObject getJsonObject(JsonObject json, String memberName, JsonObject fallback) {
//        return json.has(memberName) ? getJsonObject(json.get(memberName), memberName) : fallback;
//    }
}


///**
// * This class allows for json implementation of recipes for the Train Workbench, used to craft train parts.
// * <p>
// * WARNING: Please make sure patterns are 3x3 to avoid any problems. This should be fixed once things work.
// *
// * @author PseudonymPatel
// * @since 2020-7-30
// */
//public class TrainWorkbenchRecipeFactoryHelper implements IRecipeFactory {
//
//    public IRecipe parse(JsonContext context, JsonObject json){
//
//        //this basically a copy of how minecraft does it.
//        //String group = JsonUtils.getString(json, "group", ""); //we can use group in the future if there is a need for it.
//        Map<String, Ingredient> map = deserializeKey(JsonUtils.getJsonObject(json, "key"));
//        String[] patternString = shrink(patternFromJson(JsonUtils.getJsonArray(json, "pattern")));
//
//        //these aid in non-3x3 crafting.
//        int i = patternString[0].length();
//        int j = patternString.length;
//        NonNullList<Ingredient> nonnulllist = deserializeIngredients(patternString, map, i, j);
//        ItemStack itemstack = deserializeItem(JsonUtils.getJsonObject(json, "result"), true);
//
//        //turn the nonnulllist into a InventoryBasic. Or nevermind, just make everything use the nonnulllist.
//        return new TrainWorkbenchRecipe(nonnulllist, itemstack, i, j);
//    }
//
//    //This function is also copied directly from vanilla ShapedRecipes class (because private)
//    private static NonNullList<Ingredient> deserializeIngredients(String[] pattern, Map<String, Ingredient> keys, int patternWidth, int patternHeight){
//        NonNullList<Ingredient> nonnulllist = NonNullList.<Ingredient>withSize(patternWidth * patternHeight, Ingredient.EMPTY);
//        Set<String> set = Sets.newHashSet(keys.keySet());
//        set.remove(" ");
//
//        for(int i = 0; i < pattern.length; ++i){
//            for(int j = 0; j < pattern[i].length(); ++j){
//                String s = pattern[i].substring(j, j + 1);
//                Ingredient ingredient = keys.get(s);
//
//                if(ingredient == null){
//                    throw new JsonSyntaxException("Pattern references symbol '" + s + "' but it's not defined in the key");
//                }
//
//                set.remove(s);
//                nonnulllist.set(j + patternWidth * i, ingredient);
//            }
//        }
//
//        if(!set.isEmpty()){
//            throw new JsonSyntaxException("Key defines symbols that aren't used in pattern: " + set);
//        } else{
//            return nonnulllist;
//        }
//    }
//
//    //also from ShapedRecipes, this one takes the pattern element and turns it into a array of strings.
//    private static String[] patternFromJson(JsonArray jsonArr){
//        String[] astring = new String[jsonArr.size()];
//
//        if(astring.length > 3){
//            throw new JsonSyntaxException("Invalid pattern: too many rows, 3 is maximum");
//        } else if(astring.length == 0){
//            throw new JsonSyntaxException("Invalid pattern: empty pattern not allowed");
//        } else{
//            for(int i = 0; i < astring.length; ++i){
//                String s = JsonUtils.getString(jsonArr.get(i), "pattern[" + i + "]");
//
//                if(s.length() > 3){
//                    throw new JsonSyntaxException("Invalid pattern: too many columns, 3 is maximum");
//                }
//
//                if(i > 0 && astring[0].length() != s.length()){
//                    throw new JsonSyntaxException("Invalid pattern: each row must be the same width");
//                }
//
//                astring[i] = s;
//            }
//
//            return astring;
//        }
//    }
//
//    /**
//     * Turns the json object into a map of recipe ingredient keys (ie. #, X, etc.) and the corresponding ingredient.
//     *
//     * @param json The object containing the array of keys
//     * @return A map of the keys to the corresponding Ingredient
//     */
//    private static Map<String, Ingredient> deserializeKey(JsonObject json){
//        Map<String, Ingredient> map = Maps.<String, Ingredient>newHashMap();
//
//        for(Map.Entry<String, JsonElement> entry : json.entrySet()){
//            if(((String) entry.getKey()).length() != 1){
//                throw new JsonSyntaxException("Invalid key entry: '" + (String) entry.getKey() + "' is an invalid symbol (must be 1 character only).");
//            }
//
//            if(" ".equals(entry.getKey())){
//                throw new JsonSyntaxException("Invalid key entry: ' ' is a reserved symbol.");
//            }
//
//            map.put(entry.getKey(), deserializeIngredient(entry.getValue()));
//        }
//
//        map.put(" ", Ingredient.EMPTY);
//        return map;
//    }
//
//    /**
//     * Removes empty rows and columns from the crafting recipe, good for being able to use (ie) one row recipe in any row.
//     *
//     * @param toShrink array of strings to shrink.
//     * @return shrunken recipe
//     */
//    private static String[] shrink(String... toShrink){
//        int i = Integer.MAX_VALUE;
//        int j = 0;
//        int k = 0;
//        int l = 0;
//
//        for(int i1 = 0; i1 < toShrink.length; ++i1){
//            String s = toShrink[i1];
//            i = Math.min(i, firstNonSpace(s));
//            int j1 = lastNonSpace(s);
//            j = Math.max(j, j1);
//
//            if(j1 < 0){
//                if(k == i1){
//                    ++k;
//                }
//
//                ++l;
//            } else{
//                l = 0;
//            }
//        }
//
//        if(toShrink.length == l){
//            return new String[0];
//        } else{
//            String[] astring = new String[toShrink.length - l - k];
//
//            for(int k1 = 0; k1 < astring.length; ++k1){
//                astring[k1] = toShrink[k1 + k].substring(i, j + 1);
//            }
//
//            return astring;
//        }
//    }
//
//    //ngl, never seen a for loop used in the way it is in the next two functions. v cool tho
//    private static int firstNonSpace(String str){
//        int i;
//
//        for(i = 0; i < str.length() && str.charAt(i) == ' '; ++i){
//            ;
//        }
//
//        return i;
//    }
//
//    private static int lastNonSpace(String str){
//        int i;
//
//        for(i = str.length() - 1; i >= 0 && str.charAt(i) == ' '; --i){
//            ;
//        }
//
//        return i;
//    }
//
//    /**
//     * Takes a jsonElement describing a Ingredient and turns it into the corresponding Ingredient.
//     * NOTE: this is overridden to provide support for forge ore dictionary.
//     *
//     * @param jsonElement object/array of objects describing single ingredient.
//     * @return the ingredient
//     */
//    private static Ingredient deserializeIngredient(@Nullable JsonElement jsonElement){
//        if(jsonElement != null && !jsonElement.isJsonNull()){
//            //first check if using ore dict, otherwise do normal stuff
//            if(jsonElement.getAsJsonObject().has("type")){
//                if(jsonElement.getAsJsonObject().get("type").getAsString().equals("forge:ore_dict")){
//                    if(jsonElement.getAsJsonObject().has("ore")){
//                        //find all ItemStacks for ore
//                        NonNullList<ItemStack> itemStacksNNlist = OreDictionary.getOres(jsonElement.getAsJsonObject().get("ore").getAsString());
//                        ItemStack[] itemStacks = new ItemStack[itemStacksNNlist.size()];
//                        for(int i = 0; i < itemStacksNNlist.size(); ++i){
//                            itemStacks[i] = itemStacksNNlist.get(i);
//                        }
//                        return Ingredient.fromStacks(itemStacks);
//                    } else{
//                        throw new JsonSyntaxException("Does not contain ore item.");
//                    }
//                } else{
//                    throw new JsonSyntaxException("Does not support non forge:ore_dict types.");
//                }
//            } else if(jsonElement.isJsonObject()){
//                return Ingredient.fromStacks(deserializeItem(jsonElement.getAsJsonObject(), false));
//            } else if(!jsonElement.isJsonArray()){
//                throw new JsonSyntaxException("Expected item to be object or array of objects");
//            } else{
//                JsonArray jsonarray = jsonElement.getAsJsonArray();
//
//                if(jsonarray.size() == 0){
//                    throw new JsonSyntaxException("Item array cannot be empty, at least one item must be defined");
//                } else{
//                    ItemStack[] aitemstack = new ItemStack[jsonarray.size()];
//
//                    for(int i = 0; i < jsonarray.size(); ++i){
//                        aitemstack[i] = deserializeItem(JsonUtils.getJsonObject(jsonarray.get(i), "item"), false);
//                    }
//
//                    return Ingredient.fromStacks(aitemstack);
//                }
//            }
//        } else{
//            throw new JsonSyntaxException("Item cannot be null");
//        }
//    }
//}