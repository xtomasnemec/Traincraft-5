package train.blocks.lantern;

import ebf.tim.blocks.BlockDynamic;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.Traincraft;
import train.items.ItemWrench;
import train.library.GuiIDs;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class BlockLantern extends BlockDynamic {

	public BlockLantern() {
		super(Material.ROCK,false);
		setCreativeTab(Traincraft.tcTab);
		this.setTickRandomly(true);
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return new AxisAlignedBB(0.2F, 0.0F, 0.2F, 0.8F, 0.9F, 0.8F);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public AxisAlignedBB getSelectedBoundingBox(IBlockState state, World world, BlockPos pos) {
		return getBoundingBox(state,world,pos);
	}
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess world, BlockPos pos){
		return getBoundingBox(state,world,pos);
	}
	@Override
	public void addCollisionBoxToList(IBlockState state, World world, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
		addCollisionBoxToList(pos, entityBox, collidingBoxes, getCollisionBoundingBox(state,world, pos));
	}

	@Override
	public boolean hasTileEntity(IBlockState metadata) {
		return true;
	}

	@Override
	public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos) {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileLantern(this);
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}

	@SideOnly(Side.CLIENT)
	/**
	 * A randomly called display update to be able to add particles or other items for display
	 */
	@Override
	public void randomDisplayTick(IBlockState stateIn, World world, BlockPos pos, Random rand) {
		double d0 = (double) ((float) pos.getX() + 0.5F);
		double d2 = (double) ((float) pos.getZ() + 0.5F);
		double d3 = 0.2199999988079071D;

		world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, pos.getY() + d3, d2, 0.0D, 0.0D, 0.0D);
		world.spawnParticle(EnumParticleTypes.FLAME, d0, pos.getY() + d3, d2, 0.0D, 0.0D, 0.0D);

	}
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		TileEntity te = world.getTileEntity(pos);
		if (player.isSneaking()) {
			return false;
		}
		if(player.getActiveItemStack()!=null && player.getActiveItemStack() != ItemStack.EMPTY && player.getActiveItemStack().getItem() instanceof ItemWrench)
		if (te instanceof TileLantern) {
			player.openGui(Traincraft.instance, GuiIDs.LANTERN, world, pos.getX(),pos.getY(),pos.getZ());
		}
		return true;
	}
}
