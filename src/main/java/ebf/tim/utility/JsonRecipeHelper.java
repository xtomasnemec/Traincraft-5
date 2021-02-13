package ebf.tim.utility;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.*;
import cpw.mods.fml.common.registry.GameData;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import train.Traincraft;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * This class will handle parsing and adding recipes to the TiM table.
 * Recipes should be written in json and added to the resources section as if it was a 1.12 or newer mod. Json recipes
 * should use the same format as 1.12 and newer recipes. See the forge documentation for more information:
 * @see <a href="https://mcforge.readthedocs.io/en/1.12.x/utilities/recipes/">Recipes documentation</a>
 *
 * TODO: make json recipes
 * TODO: BUG: count tag is incorrect for ingotSteel. Where is this happening?
 *   more info: the parse func parses correctly and returns the correctly counted recipe.
 *
 * @note For forge 1.12 and greater, make a simple wrapper for this class. There were too many minor differences and I
 *       didn't want to leave landmines of commented out code.
 *
 * @note Recipe json may have to change in future due to changes in naming, ie. dyes changed
 *
 * @author ComputerButter
 */
public class JsonRecipeHelper {

    //I used this logger because it makes debugging easier and will show up nicer in logs both for users and us.
    private static Logger LOGGER = LogManager.getLogger("traincraft");

    /**
     * This function handles parsing and adding a 3x3 (or smaller) json recipe to the TiM table.
     *
     * @param json the json of the recipe we need to parse
     */
    public static void parseAndAddRecipe(JsonObject json) {
        if (json == null || json.isJsonNull()) {
            //make sure not empty, just in case
            return;
        }

        if (!getString(json, "type").equals("trainsinmotion:table")) {
            LOGGER.log(Level.WARN, "TiM table given recipe to parse that is not for it.");
            return; //don't parse non-TiM table recipes.
        }

        //get result first
        ItemStack craftingResult = deserializeItem(json.getAsJsonObject("result"), true);

        //parse the crafting grid
        // first parse the keys ("X": { ... }, ...)
        Map<String, ItemStack[]> keyMap = deserializeKey(json.getAsJsonObject("key"));

        //get the pattern of the crafting recipe
        String[] patternStrings = patternFromJson(json.getAsJsonArray("pattern"));

        int craftingWidth = patternStrings[0].length();
        int craftingHeight = patternStrings.length;

        //use keymap with grid to generate resulting recipe input.
        List<List<ItemStack>> ingredients = deserializeIngredients(patternStrings, keyMap);

        //create and add recipe to workbench.
        RecipeManager.registerRecipe(new SizedRecipe(craftingResult, ingredients, craftingWidth, craftingHeight));
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

        //NOTE: IN 1.12, this was in Traincraft/Traincraft, but also might only be for vanilla items:
        //Item item = Item.REGISTRY.getObject(new ResourceLocation(itemString));
        Item item = GameData.getItemRegistry().getObject(itemString);

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
                            itemStacks[i] = oresFromOreDict.get(i).copy();
                        }

                        int count = getInt(jsonElement.getAsJsonObject(), "count", 1);
                        for (ItemStack itemStack : itemStacks) {
                            itemStack.stackSize = count;
                        }
                        return itemStacks;

                    } else {
                        throw new JsonSyntaxException("Does not contain ore item.");
                    }
                } else {
                    throw new JsonSyntaxException("Does not support non forge:ore_dict types yet. You may have made typo.");
                }

            } else if (jsonElement.isJsonObject()) {
                return new ItemStack[]{deserializeItem(jsonElement.getAsJsonObject(), true)};
            } else if (!jsonElement.isJsonArray()) {
                throw new JsonSyntaxException("Expected item to be object or array of objects");
            } else {
                JsonArray jsonarray = jsonElement.getAsJsonArray();

                if (jsonarray.size() == 0) {
                    throw new JsonSyntaxException("Item array cannot be empty, at least one item must be defined");
                } else {
                    ItemStack[] aitemstack = new ItemStack[jsonarray.size()];

                    for (int i = 0; i < jsonarray.size(); ++i) {
                        aitemstack[i] = deserializeItem(getJsonObject(jsonarray.get(i), "item"), true);
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
     * Takes in a map of symbols to the ingredients and a array of strings corresponding to how each row looks in the table,
     * and converts it to a list of ingredients. length of list depends on craftingWidth and Height.
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
                if (s.equals(" ")) {
                    continue;
                }
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

    /**
     * Gets the recipes from the recipe folder and adds them to the trainworkbench.
     * looks recursively into the folders, so we can organize them and whatnot.
     * This will not be necessary in 1.12, as it will be handled automatically.
     */
    public static void loadRecipes() {
        URL recipesFolder = Traincraft.class.getResource("/assets/trainsinmotion/recipes/");
        if (recipesFolder == null) {
            //crash and burn
            LOGGER.log(Level.FATAL, "Could not find recipes folder.");
            return;
        }

        try {
            File folder = new File(recipesFolder.toURI());
            parseFilesInFolder(folder);
        } catch (Exception e) {
            LOGGER.log(Level.FATAL, "Problem with preparing to parse json recipes: " + e);
        }

    }

    private static void parseFilesInFolder(File folder) throws JsonSyntaxException, IOException {
        for (File recipeFile : folder.listFiles()) { //we know this is valid path, can ignore warning.
            if (recipeFile.isDirectory()) {
                parseFilesInFolder(recipeFile);
                continue;
            }
            if (recipeFile.getName().substring(0, 1).equals("_")) {
                //not a file to parse if starts with underscore.
                continue;
            }

            try {
                parseAndAddRecipe(new Gson().fromJson(readFile(recipeFile.getPath(), StandardCharsets.UTF_8), JsonObject.class));
            } catch (Exception e) {
                LOGGER.log(Level.ERROR, "Problem trying to get recipe " + recipeFile.getName() + ": " + e);
            }
        }

    }
    /** {@link "https://stackoverflow.com/a/326440/5526401"}
     */
    private static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}
