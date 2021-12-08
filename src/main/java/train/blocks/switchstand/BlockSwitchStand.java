package train.blocks.switchstand;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ebf.tim.blocks.BlockDynamic;
import ebf.tim.utility.CommonUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import train.Traincraft;

import java.util.List;
import java.util.Random;

public class BlockSwitchStand extends BlockDynamic {

	public BlockSwitchStand() {
		super(Material.ROCK,false);
		setCreativeTab(Traincraft.tcTab);
		this.setTickRandomly(true);
		//this.setBlockBounds(0.5F , 0.0F, 0.5F , 0.5F ,  2.0F, 0.5F);
	}

	public void addCollisionBoxesToList(World p_149743_1_, int p_149743_2_, int p_149743_3_, int p_149743_4_, AxisAlignedBB p_149743_5_, List p_149743_6_, Entity p_149743_7_) {
	}

	public boolean hasTileEntity(int metadata) {
		return true;
	}

	@Override
	public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos) {
		return false;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public TileEntity createTileEntity(World world, int metadata) {
		return new TileSwitchStand(this);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileSwitchStand(this);
	}

	public EnumBlockRenderType getRenderType(IBlockState state) {
		return -1;
	}

	@SideOnly(Side.CLIENT)
	/**
	 * A randomly called display update to be able to add particles or other items for display
	 */

	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {

	}


	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entityliving, ItemStack stack) {
		super.onBlockPlacedBy(world, new BlockPos(i,j,k), entityliving, stack)
		TileSwitchStand te = (TileSwitchStand) world.getTileEntity(new BlockPos(i,j,k));
		if (te != null) {
			int dir = CommonUtil.floorDouble((double) ((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
			te.setFacing(EnumFacing.getDirectionFromEntityLiving(new BlockPos(i,j,k), entityliving).getOpposite());
			world.markBlockRangeForRenderUpdate(new BlockPos(i, j, k),new BlockPos(i, j, k));
		}
	}

	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if (p_149727_1_.isRemote)
		{
			return true;
		}
		else
		{
			int i1 = p_149727_1_.getBlockMetadata(p_149727_2_, p_149727_3_, p_149727_4_);
			int j1 = i1 & 7;
			int k1 = 8 - (i1 & 8);
			CommonUtil.setBlockMetadata(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_, j1 + k1, 3);
			p_149727_1_.playSound(p_149727_5_, p_149727_2_ + 0.5, p_149727_3_ + 0.5, p_149727_4_ + 0.5, SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.BLOCKS, 0.3f, k1>0?0.6f:0.5f);
			p_149727_1_.notifyNeighborsOfStateChange(new BlockPos(p_149727_2_, p_149727_3_, p_149727_4_), this, true);

			if (j1 == 1)
			{
				p_149727_1_.notifyNeighborsOfStateChange(new BlockPos(p_149727_2_ - 1, p_149727_3_, p_149727_4_), this, true);
			}
			else if (j1 == 2)
			{
				p_149727_1_.notifyNeighborsOfStateChange(new BlockPos(p_149727_2_ + 1, p_149727_3_, p_149727_4_), this, true);
			}
			else if (j1 == 3)
			{
				p_149727_1_.notifyNeighborsOfStateChange(new BlockPos(p_149727_2_, p_149727_3_, p_149727_4_ - 1), this, true);
			}
			else if (j1 == 4)
			{
				p_149727_1_.notifyNeighborsOfStateChange(new BlockPos(p_149727_2_, p_149727_3_, p_149727_4_ + 1), this, true);
			}
			else if (j1 != 5 && j1 != 6)
			{
				if (j1 == 0 || j1 == 7)
				{
					p_149727_1_.notifyNeighborsOfStateChange(new BlockPos(p_149727_2_, p_149727_3_ + 1, p_149727_4_), this, true);
				}
			}
			else
			{
				p_149727_1_.notifyNeighborsOfStateChange(new BlockPos(p_149727_2_, p_149727_3_ - 1, p_149727_4_), this, true);
			}

			return true;
		}
	}
    public void breakBlock(World world, BlockPos pos, IBlockState state)
	{
		if (CommonUtil.getBlockFacing(world, pos.getX(), pos.getY(), pos.getZ()) > 0)
		{
			world.notifyNeighborsOfStateChange(pos, this, true);
			int i1 = CommonUtil.getBlockFacing(world, pos.getX(), pos.getY(), pos.getZ()) & 7;

			if (i1 == 1)
			{
				world.notifyNeighborsOfStateChange(pos, this, true);
			}
			else if (i1 == 2)
			{
				world.notifyNeighborsOfStateChange(pos, this, true);
			}
			else if (i1 == 3)
			{
				world.notifyNeighborsOfStateChange(pos, this, true);
			}
			else if (i1 == 4)
			{
				world.notifyNeighborsOfStateChange(pos, this, true);
			}
			else if (i1 != 5 && i1 != 6)
			{
				if (i1 == 0 || i1 == 7)
				{
					world.notifyNeighborsOfStateChange(pos, this, true);
				}
			}
			else
			{
				world.notifyNeighborsOfStateChange(pos, this, true);
			}
		}

		super.breakBlock(world, pos, state);
	}



	public int isProvidingWeakPower(IBlockAccess p_149709_1_, int p_149709_2_, int p_149709_3_, int p_149709_4_, int p_149709_5_)
	{ //CommonUtil.getBlockFacing
		return CommonUtil.getBlockFacing(p_149709_1_, p_149709_2_, p_149709_3_, p_149709_4_) > 0 ? 15 : 0;
	}

	public int isProvidingStrongPower(IBlockAccess p_149748_1_, int p_149748_2_, int p_149748_3_, int p_149748_4_, int p_149748_5_)
	{
		int i1 = CommonUtil.getBlockFacing(p_149748_1_, p_149748_2_, p_149748_3_, p_149748_4_);

		if ((i1 & 8) == 0)
		{
			return 0;
		}
		else
		{
			int j1 = i1 & 7;
			return j1 == 0 && p_149748_5_ == 0 ? 15 : (j1 == 7 && p_149748_5_ == 0 ? 15 : (j1 == 6 && p_149748_5_ == 1 ? 15 : (j1 == 5 && p_149748_5_ == 1 ? 15 : (j1 == 4 && p_149748_5_ == 2 ? 15 : (j1 == 3 && p_149748_5_ == 3 ? 15 : (j1 == 2 && p_149748_5_ == 4 ? 15 : (j1 == 1 && p_149748_5_ == 5 ? 15 : 0)))))));
		}
	}

	/**
	 * Can this block provide power. Only wire currently seems to have this change based on its state.
	 */
	public boolean canProvidePower()
	{
		return true;
	}
}
