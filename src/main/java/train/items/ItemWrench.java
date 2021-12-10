package train.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ebf.tim.utility.CommonUtil;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.ItemIDs;

import javax.annotation.Nullable;
import java.util.List;
@Optional.Interface(iface = "buildcraft.api.tools.IToolWrench", modid = "BuildCraft|Core")
public class ItemWrench extends ItemPart implements buildcraft.api.tools.IToolWrench{

	public ItemWrench() {
		super(ItemIDs.composite_wrench.iconName);
		maxStackSize = 1;
		setCreativeTab(Traincraft.tcTab);
	}

	@Override
	public EnumActionResult onItemUseFirst(EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ, EnumHand hand) {
		Block blockId = CommonUtil.getBlockAt(world, pos.getX(),pos.getY(),pos.getZ());
		if (blockId.rotateBlock(world, pos, side)) {
			player.swingArm(EnumHand.MAIN_HAND);
			return !world.isRemote?EnumActionResult.SUCCESS:EnumActionResult.PASS;
		}
		return EnumActionResult.PASS;
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, World world, List<String> par3List, ITooltipFlag flag) {
		par3List.add("\u00a77" + "Works same as a BuildCraft wrench.");
		par3List.add("\u00a77" + "Use it to change lantern color.");
		par3List.add("\u00a77" + "Use it to lock/unlock certain carts (passenger)");
		par3List.add("\u00a77" + "Use it to remove locked trains (OP only)");
	}

	@Optional.Method(modid = "BuildCraft|Core")
	@Override
	public boolean canWrench(EntityPlayer entityPlayer, EnumHand enumHand, ItemStack itemStack, RayTraceResult rayTraceResult) {
		return !entityPlayer.isSneaking();
	}

	@Optional.Method(modid = "BuildCraft|Core")
	@Override
	public void wrenchUsed(EntityPlayer entityPlayer, EnumHand enumHand, ItemStack itemStack, RayTraceResult rayTraceResult) { }
}