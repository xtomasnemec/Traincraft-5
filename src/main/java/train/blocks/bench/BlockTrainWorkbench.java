package train.blocks.bench;

import ebf.tim.blocks.BlockDynamic;
import ebf.tim.utility.CommonUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.Traincraft;
import train.library.GuiIDs;

public class BlockTrainWorkbench extends BlockDynamic {

	public BlockTrainWorkbench() {
		super(Material.wood, true);
		setCreativeTab(Traincraft.tcTab);
	}


	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer player, int par6, float par7, float par8, float par9) {
		TileEntity te = world.getTileEntity(i, j, k);
		if (player.isSneaking()) {
			return false;
		}
		if (!world.isRemote) {
			if (te instanceof TileTrainWbench) {
				player.openGui(Traincraft.instance, GuiIDs.TRAIN_WORKBENCH, world, i, j, k);
			}
		}
		return true;
	}

	@Override
	public void onBlockAdded(World world, int i, int j, int k) {
		super.onBlockAdded(world, i, j, k);
		CommonUtil.markBlockForUpdate(world, i, j, k);
	}

	@Override
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack stack) {
		TileTrainWbench te = (TileTrainWbench) world.getTileEntity(i, j, k);
		if (te != null) {
			int dir = CommonUtil.floorDouble((double) ((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
			te.setFacing(ForgeDirection.getOrientation(dir == 0 ? 2 : dir == 1 ? 5 : dir == 2 ? 3 : 4));
			CommonUtil.markBlockForUpdate(world, i, j, k);
		}
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileTrainWbench(this);
	}

}