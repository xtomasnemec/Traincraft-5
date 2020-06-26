package train.common.items;

import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.common.Traincraft;
import train.common.library.Info;
import train.common.library.ItemIDs;

import java.util.List;
@Optional.Interface(iface = "buildcraft.api.tools.IToolWrench", modid = "BuildCraft|Core")
public class ItemWrench extends Item {

	public ItemWrench() {
		super();
		maxStackSize = 1;
		setCreativeTab(Traincraft.tcTab);
	}

	@Override
	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
		Block blockId = world.getBlockState(pos).getBlock();
		if (blockId.rotateBlock(world, pos, side)) {
			player.swingItem();
			return !world.isRemote;
		}
		return false;
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("\u00a77" + "Works same as a BuildCraft wrench.");
		par3List.add("\u00a77" + "Use it to change lantern color.");
		par3List.add("\u00a77" + "Use it to lock/unlock certain carts (passenger)");
		par3List.add("\u00a77" + "Use it to remove locked trains (OP only)");
	}

	@Optional.Method(modid = "BuildCraft|Core")
	//@Override
	public boolean canWrench(EntityPlayer player, BlockPos pos) {
		return true;
	}

	@Optional.Method(modid = "BuildCraft|Core")
	//@Override
	public boolean canWrench(EntityPlayer player, Entity target) {
		return true;
	}

	@Optional.Method(modid = "BuildCraft|Core")
	//@Override
	public void wrenchUsed(EntityPlayer player, BlockPos pos) {}


	@Optional.Method(modid = "BuildCraft|Core")
	//@Override
	public void wrenchUsed(EntityPlayer player, Entity target) {}

	@Override
	public boolean doesSneakBypassUse(World world, BlockPos pos, EntityPlayer player) {
		return true;
	}

			/*@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":" + "parts/" + ItemIDs.composite_wrench.iconName);
	}*/

	@Override
	@SideOnly(Side.CLIENT)
	public ModelResourceLocation getModel(ItemStack stack, EntityPlayer player, int useRemaining){
		return new ModelResourceLocation(new ResourceLocation(Info.modID.toLowerCase(), "parts/" + ItemIDs.composite_wrench.iconName),"inventory");
	}
}