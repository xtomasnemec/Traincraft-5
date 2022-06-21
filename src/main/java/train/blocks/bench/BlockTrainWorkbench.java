package train.blocks.bench;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.blocks.BlockDynamic;
import ebf.tim.utility.CommonUtil;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import train.Traincraft;
import train.library.GuiIDs;

public class BlockTrainWorkbench extends BlockDynamic {

	public BlockTrainWorkbench() {
		super(Material.WOOD, true);
		setCreativeTab(Traincraft.tcTab);
	}
	@SideOnly(Side.CLIENT)
	@Override
	public Object getGUI(EntityPlayer player, TileEntity te){
		return new train.blocks.bench.GuiTrainCraftingBlock(player.inventory, (TileTrainWbench) te);
	}

	@Override
	public Object getInventoryManager(EntityPlayer player, TileEntity te){
		return new ContainerTrainWorkbench(player.inventory, (TileTrainWbench) te);
	}



	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
		super.onBlockAdded(world, pos, state);
		world.scheduleBlockUpdate(pos, state.getBlock(),0,1);
	}

	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase entityliving, ItemStack stack) {
		TileTrainWbench te = (TileTrainWbench) world.getTileEntity(pos);
		if (te != null) {
			int dir = CommonUtil.floorDouble((double) ((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
			te.setFacing(EnumFacing.byHorizontalIndex(dir == 0 ? 2 : dir == 1 ? 5 : dir == 2 ? 3 : 4));
			CommonUtil.markBlockForUpdate(world, pos.getX(),pos.getY(),pos.getZ());
		}
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileTrainWbench(this);
	}

}