package train.common.items;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.common.Traincraft;
import train.common.library.Info;

import java.util.List;

public class ItemATOCard extends Item {

    public ItemATOCard()  {
        setCreativeTab(Traincraft.tcTab);

    }

    /*@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(TextureMap iconRegister) {
        this.itemIcon = iconRegister.registerSprite(new ResourceLocation(Info.modID.toLowerCase(), "ato_card"));
    }*/
    @Override
    @SideOnly(Side.CLIENT)
    public ModelResourceLocation getModel(ItemStack stack, EntityPlayer player, int useRemaining){
        return new ModelResourceLocation(new ResourceLocation(Info.modID.toLowerCase(), "ato_card"),"inventory");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add("\u00a77" + "Allows you to use ATO on W-MTC equipped trains");
        par3List.add("\u00a77" + "Put this in the second inventory slot of a locomotive");
    }
}
