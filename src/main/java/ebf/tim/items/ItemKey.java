package ebf.tim.items;

import ebf.tim.utility.CommonUtil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * <h1>Key Item</h1>
 * the key used to allow people other than the owner to interact with a locked train or rollingstock.
 * @author Eternal Blue Flame
 */
public class ItemKey extends Item{

    public Integer selectedEntity=null;

    public ItemKey(){}



    public static void addHost(ItemStack stack, UUID host, String entityName){
        if(stack.getTagCompound() ==null && stack.getItem() instanceof ItemKey){
            stack.setTagCompound(new NBTTagCompound());
        }

        int length= stack.getTagCompound().hasKey("hostlength")?stack.getTagCompound().getInteger("hostlength"):0;
        stack.getTagCompound().setLong("key.most."+length, host.getMostSignificantBits());
        stack.getTagCompound().setLong("key.least."+length, host.getLeastSignificantBits());
        stack.getTagCompound().setString("key.parent."+length, entityName);
        length++;
        stack.getTagCompound().setInteger("hostlength", length);
    }

    public static List<UUID> getHostList(ItemStack stack){
        if(stack!=null && stack.getTagCompound()!=null) {
            List<UUID> entries = new ArrayList<>();
            int length = stack.getTagCompound().hasKey("hostlength") ? stack.getTagCompound().getInteger("hostlength") : 0;
            for (int i = 0; i < length; i++) {
                entries.add(new UUID(stack.getTagCompound().getLong("key.most." + i), stack.getTagCompound().getLong("key.least." + i)));
            }
            return entries;
        }
        return null;
    }
    public static List<String> getHostNames(ItemStack stack){
        if(stack!=null && stack.getTagCompound()!=null) {
            List<String> entries = new ArrayList<>();
            int length= stack.getTagCompound().hasKey("hostlength")?stack.getTagCompound().getInteger("hostlength"):0;
            for(int i=0;i<length;i++){
                entries.add(stack.getTagCompound().getString("key.parent."+i));
            }
            return entries;
        }
        return null;
    }

    /**
     * <h2>Description text</h2>
     * Allows items to add custom lines of information to the mouseover description, by adding new lines to stringList.
     * Each string added defines a new line.
     * We can cover the key and ticket description here, to simplify other classes.
     */
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List stringList, boolean p_77624_4_) {
        if(stack!=null && stack.getTagCompound()!=null) {
        if (this instanceof ItemTicket){
            stringList.add(CommonUtil.translate("menu.item.ticket.lore1"));
        } else {
            stringList.add(CommonUtil.translate("menu.item.key.lore1"));
        }
        List<UUID> hosts = getHostList(stack);
        List<String> names = getHostNames(stack);

            int length = stack.getTagCompound().hasKey("hostlength") ? stack.getTagCompound().getInteger("hostlength") : 0;
            for (int i = 0; i < length; i++) {
                stringList.add(names.get(i) + " : " + hosts.get(i).toString());
            }
        }
    }
}
