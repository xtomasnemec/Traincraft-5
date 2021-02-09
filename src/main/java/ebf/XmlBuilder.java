package ebf;

import cpw.mods.fml.common.registry.GameData;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import java.util.HashMap;
import java.util.UUID;

//Cant cover Object. it's raw data isn't safe over networking due to runtime compiling differences on client and server.
public class XmlBuilder {
    public HashMap<String, XmlBuilder> xmlMap = new HashMap<>();
    public HashMap<String, Integer> intMap = new HashMap<>();
    public HashMap<String, UUID> uuidMap = new HashMap<>();
    public HashMap<String, int[]> intArrayMap = new HashMap<>();
    public HashMap<String, Double> doubleMap = new HashMap<>();
    public HashMap<String, Float> floatMap = new HashMap<>();
    public HashMap<String, float[]> floatArrayMap = new HashMap<>();
    public HashMap<String, String> stringMap = new HashMap<>();
    public HashMap<String, String[]> itemMap = new HashMap<>();
    public HashMap<String, String[]> fluidMap = new HashMap<>();

    String buildString=null;
    boolean isBuilt=false;

    /*
     *----------Constructor Section----------
     */
    public XmlBuilder(String str){
        super();
        buildString=str;
    }
    public XmlBuilder(){}
    /*
     *----------put Section----------
     */
    public XmlBuilder putString(String id, String value){
        buildXML();
        stringMap.put(id,value);
        rebuildXML();
        return this;
    }
    public XmlBuilder putItemStack(String id, ItemStack stack){
        buildXML();
        itemMap.put(id,
                stack==null?new String[]{"null"}:
                        new String[]{
                                stack.getItem().delegate.name(),
                        stack.stackSize+"",stack.getItemDamage()+""});
        rebuildXML();
        return this;
    }
    public XmlBuilder putFluidStack(String id, FluidStack stack){
        buildXML();
        fluidMap.put(id,
                stack==null?new String[]{"null"}:
                        new String[]{
                                FluidRegistry.getFluidName(stack),
                                stack.amount+""});
        rebuildXML();
        return this;
    }
    public XmlBuilder putInt(String id, int value){
        buildXML();
        intMap.put(id,value);
        rebuildXML();
        return this;
    }
    public XmlBuilder putIntArray(String id, int[] value){
        buildXML();
        intArrayMap.put(id,value);
        rebuildXML();
        return this;
    }
    public XmlBuilder putDouble(String id, double value){
        buildXML();
        doubleMap.put(id,value);
        rebuildXML();
        return this;
    }
    public XmlBuilder putFloat(String id, float value){
        buildXML();
        floatMap.put(id,value);
        rebuildXML();
        return this;
    }
    public XmlBuilder putFloatArray(String id, float[] value){
        buildXML();
        floatArrayMap.put(id,value);
        rebuildXML();
        return this;
    }

    public XmlBuilder putUUID(String id, UUID value){
        buildXML();
        uuidMap.put(id,value);
        rebuildXML();
        return this;
    }
    public XmlBuilder putXml(String id, XmlBuilder value){
        buildXML();
        xmlMap.put(id,value);
        rebuildXML();
        return this;
    }

    public XmlBuilder removeString(String s){
        buildXML();
        stringMap.remove(s);
        rebuildXML();
        return this;
    }

    public XmlBuilder removeInt(String s){
        buildXML();
        intMap.remove(s);
        rebuildXML();
        return this;
    }

    public XmlBuilder removeIntArray(String s){
        buildXML();
        intArrayMap.remove(s);
        rebuildXML();
        return this;
    }

    public XmlBuilder removeFloat(String s){
        buildXML();
        floatMap.remove(s);
        rebuildXML();
        return this;
    }

    public XmlBuilder removeFloatArray(String s){
        buildXML();
        floatArrayMap.remove(s);
        rebuildXML();
        return this;
    }

    public XmlBuilder removeDouble(String s){
        buildXML();
        doubleMap.remove(s);
        rebuildXML();
        return this;
    }


    public XmlBuilder removeUUID(String s){
        buildXML();
        uuidMap.remove(s);
        rebuildXML();
        return this;
    }

    public XmlBuilder removeXml(String s){
        buildXML();
        xmlMap.remove(s);
        rebuildXML();
        return this;
    }

    public XmlBuilder removeItemStack(String s){
        buildXML();
        itemMap.remove(s);
        rebuildXML();
        return this;
    }

    /*
     *----------get Section----------
     */

    public String getString(String id){buildXML(); return stringMap.get(id);}
    public Integer getInt(String id){buildXML(); return intMap.get(id);}
    public int[] getIntArray(String id){buildXML(); return intArrayMap.get(id);}
    public Float getFloat(String id){buildXML(); return floatMap.get(id);}
    public float[] getfloatArray(String id){buildXML(); return floatArrayMap.get(id);}
    public Double getDouble(String id){buildXML(); return doubleMap.get(id);}
    public UUID getUUID(String id){buildXML(); return uuidMap.get(id);}
    public XmlBuilder getXml(String id){buildXML(); return xmlMap.get(id);}

    public ItemStack getItemStack(String id){
        buildXML();
        if(itemMap.get(id) == null || itemMap.get(id)[0].equals("null")){return null;}
        Item i = GameData.getItemRegistry().get(itemMap.get(id)[0]);
        ItemStack s;
        if (i==null){
            Block b = GameData.getBlockRegistry().get(itemMap.get(id)[0]);
            if(b!=null) {
                s = new ItemStack(b, Integer.parseInt(itemMap.get(id)[1]));
            } else{
                return null;
            }
        } else {
            s = new ItemStack(i,Integer.parseInt(itemMap.get(id)[1]));
        }
        s.setItemDamage(Integer.parseInt(itemMap.get(id)[2]));
        return s;
    }

    public FluidStack getFluidStack(String id){
        buildXML();
        if(fluidMap.get(id) == null || fluidMap.get(id)[0].equals("null")){return null;}
        return FluidRegistry.getFluidStack(fluidMap.get(id)[0], Integer.parseInt(fluidMap.get(id)[1]));
    }

    public boolean containsString(String id){buildXML(); return stringMap.containsKey(id);}
    public boolean containsInt(String id){buildXML(); return intMap.containsKey(id);}
    public boolean containsIntArray(String id){buildXML(); return intArrayMap.containsKey(id);}
    public boolean containsFloat(String id){buildXML(); return floatMap.containsKey(id);}
    public boolean containsFloatArray(String id){buildXML(); return floatArrayMap.containsKey(id);}
    public boolean containsDouble(String id){buildXML(); return doubleMap.containsKey(id);}
    public boolean containsItemStack(String id){buildXML(); return itemMap.containsKey(id);}
    public boolean containsFluidStack(String id){buildXML(); return fluidMap.containsKey(id);}
    public boolean containsUUID(String id){buildXML(); return uuidMap.containsKey(id);}
    public boolean containsXml(String id){buildXML(); return xmlMap.containsKey(id);}

    //QoL stuff because i instinctivley type "has" instead of "contains"
    public boolean hasString(String id){return containsString(id);}
    public boolean hasInt(String id){return containsInt(id);}
    public boolean hasIntArray(String id){return containsIntArray(id);}
    public boolean hasFloat(String id){return containsFloat(id);}
    public boolean hasFloatArray(String id){return containsFloatArray(id);}
    public boolean hasDouble(String id){return containsDouble(id);}
    public boolean hasItemStack(String id){return containsItemStack(id);}
    public boolean hasFluidStack(String id){return containsFluidStack(id);}
    public boolean hasUUID(String id){return containsUUID(id);}
    public boolean hasXml(String id){return containsXml(id);}

    /*
     *----------Internal Method Section----------
     */

    /**
     * rebuilds the XML data, usually should function on it's own, but can be called manually if things refuse to build.
     */
    public void buildXML(){
        if(!isBuilt){
            parseXMLString(buildString);
            isBuilt=true;
        }
    }

    private void rebuildXML(){
        if(isBuilt){
            buildString=rebuildXMLString();
        }
    }

    //todo
	/*
	NBTTagCompound convertToNBT(){
	tag =new NBTTagCompound
	for (String s: stringMap.keys){tag.putString(s, stringMap.get(s));}
	for (String s: intMap.keys){tag.putInteger(s, stringMap.get(s));}
	for xml : tag.putNBT(s, xml.convertToNbt);
	...
	return tag;
	}
	 */

	/*
	@Depreciated //it is advised to do this manually, the guesswork required for this method is unreasonable overhead.
	xmlBuilder convertFromNBT(NBT tag){
	for(String key : tag.getKeys()){
	try{String s= tag.getString(key); if (s!null){StringMap.put(tag,s);}
	try{Integer s= tag.getInteger(key); if (s!null){intMap.put(tag,s);}
	}
	}

	 */

	public String toXMLString(){return buildString;}

    public String rebuildXMLString(){
        StringBuilder data = new StringBuilder();
        data.append("<eternalXMLV2/>\n");
        for(String key : intMap.keySet()){
            tag(key, data, "int");
            data.append(intMap.get(key));
            tag(key, data);
        }
        for(String key : intArrayMap.keySet()){
            tag(key, data, "intArray");
            if(intArrayMap.get(key)==null){
             data.append("null");
            } else {
                for (int i : intArrayMap.get(key)) {
                    data.append(i);
                    data.append(",");
                }
                data.setLength(data.length()-1);
            }
            tag(key, data);
        }
        for(String key : floatMap.keySet()){
            tag(key, data, "float");
            data.append(floatMap.get(key));
            tag(key, data);
        }

        for(String key : floatArrayMap.keySet()){
            tag(key, data, "floatArray");
            if(floatArrayMap.get(key)==null){
                data.append("null");
            } else {
                for (float i : floatArrayMap.get(key)) {
                    data.append(i);
                    data.append(",");
                }
                data.setLength(data.length() - 1);
            }
            tag(key, data);
        }
        for(String key : doubleMap.keySet()){
            tag(key, data, "double");
            data.append(doubleMap.get(key));
            tag(key, data);
        }
        for(String key : stringMap.keySet()){
            tag(key, data, "string");
            data.append(stringMap.get(key));
            tag(key, data);
        }
        for(String key : intMap.keySet()){
            tag(key, data, "uuid");
            data.append(uuidMap.get(key).toString());
            tag(key, data);
        }
        for(String key : xmlMap.keySet()){
            tag(key, data, "xml");
            data.append(xmlMap.get(key).toXMLString());
            tag(key, data);
        }
        for(String key : itemMap.keySet()){
            tag(key, data, "item");
            if(itemMap.get(key) == null || itemMap.get(key)[0].equals("null")){
                data.append("null");
            } else {
                data.append(itemMap.get(key)[0]);
                data.append(",");
                data.append(itemMap.get(key)[1]);
                data.append(",");
                data.append(itemMap.get(key)[2]);
            }
            tag(key, data);
        }

        for(String key : fluidMap.keySet()){
            tag(key, data, "fluid");
            if(fluidMap.get(key) == null || fluidMap.get(key)[0].equals("null")){
                data.append("null");
            } else {
                data.append(fluidMap.get(key)[0]);
                data.append(",");
                data.append(fluidMap.get(key)[1]);
            }
            tag(key, data);
        }

        return data.toString();
    }

    private void parseXMLString(String from){
        if(from==null || !from.contains("<")){return;}
        if(from.startsWith("<eternalXMLV2/>")){
            String[] lineReader = from.split("\n");
            int index =1;
            while(index<lineReader.length) {
                switch (checkType(lineReader[index])) {

                    case 1:{
                        this.stringMap.put(lineReader[index-1].substring(1, lineReader[index-1].length()-1),
                            tagSubstring(lineReader, index));index++;break;}
                    case 2:{this.intMap.put(lineReader[index-1].substring(1, lineReader[index-1].length()-1),
                            Integer.parseInt(lineReader[index+1]));index++;break;}
                            //todo 3: bool

                    case 4:{this.floatMap.put(lineReader[index-1].substring(1, lineReader[index-1].length()-1),
                            Float.parseFloat(lineReader[index+1]));index++;break;}
                    case 5:{this.doubleMap.put(lineReader[index-1].substring(1, lineReader[index-1].length()-1),
                            Double.parseDouble(lineReader[index+1]));index++;break;}

                    case 6:{this.uuidMap.put(lineReader[index-1].substring(1, lineReader[index-1].length()-1),
                            UUID.fromString(lineReader[index+1]));index++;break;}

                    case 11:{this.itemMap.put(lineReader[index-1].substring(1, lineReader[index-1].length()-1),
                            lineReader[index+1].split(","));index++;break;}

                    case 12: {
                        String[] s = lineReader[index + 1].split(",");
                        if (s[0].equals("null")) {
                            intArrayMap.put(lineReader[index - 1].substring(1, lineReader[index - 1].length() - 1), null);
                            index++;
                            break;
                        } else {
                            int[] i = new int[s.length];
                            for (int entry = 0; entry < s.length; entry++) {
                                i[entry] = Integer.parseInt(s[entry]);
                            }
                            this.intArrayMap.put(lineReader[index - 1].substring(1, lineReader[index - 1].length() - 1), i);
                            index++;
                            break;
                        }
                    }

                    case 13: {
                        String[] s = lineReader[index + 1].split(",");
                        if (s[0].equals("null")) {
                            floatArrayMap.put(lineReader[index - 1].substring(1, lineReader[index - 1].length() - 1), null);
                            index++;
                            break;
                        } else {
                            float[] i = new float[s.length];
                            for (int entry = 0; entry < s.length; entry++) {
                                i[entry] = Float.parseFloat(s[entry]);
                            }
                            this.floatArrayMap.put(lineReader[index - 1].substring(1, lineReader[index - 1].length() - 1), i);
                            index++;
                            break;
                        }
                    }

                    case 14:{
                        this.fluidMap.put(lineReader[index-1].substring(1, lineReader[index-1].length()-1),
                                lineReader[index+1].split(","));index++;break;
                    }

                    case 0:{this.xmlMap.put(lineReader[index-1].substring(1, lineReader[index-1].length()-1),
                            new XmlBuilder(tagSubstring(lineReader, index)));index++;break;}
                    case -1:{index++;}//if it wasn't a tag declaration, skip to the next line

                }
            }
        }
    }



    private static String tagSubstring(String[] parse, int index){
        StringBuilder b = new StringBuilder();
        String tag = parse[index-1].substring(1);
        int i = index+1;
        while (i<parse.length && !parse[i].contains(tag)){
            b.append(parse[i]);
            i++;
        }
        return b.toString();
    }


    private int checkType(String s){
        return stringContains(s, "<type=xml>") ? 0 :
                stringContains(s, "<type=string>") ? 1 :
                        stringContains(s, "<type=int>") ? 2 :
                                stringContains(s, "<type=bool>") ? 3 :
                                        stringContains(s, "<type=float>") ? 4 :
                                                stringContains(s, "<type=double>") ? 5 :
                                                        stringContains(s, "<type=uuid>") ? 6 :
                                                                stringContains(s, "<type=item>") ? 11 :
                                                                        stringContains(s, "<type=intArray>") ? 12 :
                                                                                stringContains(s, "<type=floatArray>") ? 13 :
                                                                                        stringContains(s, "<type=fluid>") ? 14 :
                                                                    -1;

    }

    public static boolean stringContains(String s1, String s2){
        return s1.equals(s2);
    }

    private static void tag(String id, StringBuilder builder, String type){
        builder.append("<");
        builder.append(id);
        builder.append(">\n<type=");
        builder.append(type);
        builder.append(">\n");
    }

    private static void tag(String id, StringBuilder builder){
        builder.append("\n</");
        builder.append(id);
        builder.append(">\n");
    }

}
