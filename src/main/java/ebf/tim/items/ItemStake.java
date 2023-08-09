package ebf.tim.items;

import ebf.tim.utility.CommonUtil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

//this class mostly serves for instanceof and flavor text
public class ItemStake extends Item {


    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List stringList, boolean p_77624_4_) {
        stringList.add(CommonUtil.translate("menu.item.stake.lore1") + " ");
        stringList.add(CommonUtil.translate("menu.item.stake.lore2") + " ");
    }
}
