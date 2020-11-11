package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import train.common.Traincraft;
import train.common.api.Locomotive;
import train.common.library.Info;

import java.util.List;

public class ItemRemoteController extends Item {
    public Locomotive attachedLocomotive;

    public ItemRemoteController()  {
        setCreativeTab(Traincraft.tcTab);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":remote_controller");
    }
    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add("\u00a77" + "You can remotely control trains with this!");
        par3List.add("\u00a77" + "Right click on a locomotive you own to pair.");
        par3List.add("\u00a77" + "Then click on it again to unpair.");
        par3List.add("\u00a77" + EnumChatFormatting.GREEN + "Easy!");
        par3List.add("\u00a77" + EnumChatFormatting.YELLOW + "These have a range of only 200 blocks.");
    }
}
