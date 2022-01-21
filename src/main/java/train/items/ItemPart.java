package train.items;

import net.minecraft.item.Item;
import train.Traincraft;

/**
 * @author canitzp
 */
public class ItemPart extends Item{

    protected String iconName = "";
    protected String folder = "parts";

    public ItemPart(String iconName){
        this.iconName = iconName;
        this.setMaxStackSize(64);
        this.setCreativeTab(Traincraft.tcTab);
    }

    /*@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":" + this.folder + "/" + this.iconName);
    }*/

}
