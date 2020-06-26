package train.common.blocks;

import net.minecraft.block.BlockLever;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.common.Traincraft;
import train.common.core.util.TraincraftUtil;
import train.common.tile.TileSwitchStand;

import java.util.List;
import java.util.Random;

public class BlockSwitchStand extends BlockLever {
	//private IIcon texture;

	public BlockSwitchStand() {
		super();
		setCreativeTab(Traincraft.tcTab);
		this.setTickRandomly(true);
		//this.setBlockBounds(0.5F , 0.0F, 0.5F , 0.5F ,  2.0F, 0.5F);
	}

	@Override
	public void addCollisionBoxesToList(World p_149743_1_, BlockPos pos, IBlockState state, AxisAlignedBB p_149743_5_, List p_149743_6_, Entity p_149743_7_)
	{
	}

	@Override
	public boolean hasTileEntity(IBlockState metadata) {
		return true;
	}

	@Override
	public boolean isFullBlock() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public TileEntity createTileEntity(World world, IBlockState metadata) {
		return new TileSwitchStand();
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@SideOnly(Side.CLIENT)
	/**
	 * A randomly called display update to be able to add particles or other items for display
	 */
	@Override
	public void randomDisplayTick(World par1World, BlockPos pos, IBlockState state, Random par5Random) {

	}


	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase entityliving, ItemStack stack) {
		super.onBlockPlacedBy(world, pos, state, entityliving, stack);
		TileSwitchStand te = (TileSwitchStand) world.getTileEntity(pos);
		if (te != null) {
			int dir = MathHelper.floor_double((double) ((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
			te.setFacing(EnumFacing.getHorizontal(dir == 0 ? 2 : dir == 1 ? 5 : dir == 2 ? 3 : 4));
			world.markBlockForUpdate(pos);
		}
	}
	//should be able to be covered y host class.
	/*@Override
	public boolean onBlockActivated(World p_149727_1_, BlockPos pos, IBlockState state, EntityPlayer p_149727_5_, EnumFacing p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
	{
		if (p_149727_1_.isRemote)
		{
			return true;
		}
		else
		{
			int i1 = TraincraftUtil.getBlockMeta(p_149727_1_, pos);
			int j1 = i1 & 7;
			int k1 = 8 - (i1 & 8);
			p_149727_1_.setBlockMetadataWithNotify(pos.getX(), pos.getY(), pos.getZ(), j1 + k1, 3);
			//todo: dont feel like it today, this needs to be moved to the tile entity, or to re-use the level block BS.
			p_149727_1_.playSoundEffect((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, "random.click", 0.3F, k1 > 0 ? 0.6F : 0.5F);
			p_149727_1_.notifyNeighborsOfStateChange(new BlockPos(pos.getX(), pos.getY(), pos.getZ()), this);

			if (j1 == 1)
			{
				p_149727_1_.notifyNeighborsOfStateChange(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ()), this);
			}
			else if (j1 == 2)
			{
				p_149727_1_.notifyNeighborsOfStateChange(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ()), this);
			}
			else if (j1 == 3)
			{
				p_149727_1_.notifyNeighborsOfStateChange(new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1), this);
			}
			else if (j1 == 4)
			{
				p_149727_1_.notifyNeighborsOfStateChange(new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1), this);
			}
			else if (j1 != 5 && j1 != 6)
			{
				if (j1 == 0 || j1 == 7)
				{
					p_149727_1_.notifyNeighborsOfStateChange(new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ()), this);
				}
			}
			else
			{
				p_149727_1_.notifyNeighborsOfStateChange(new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()), this);
			}

			return true;
		}
	}*/

	@Override
	public void breakBlock(World p_149749_1_, BlockPos pos, IBlockState state)
	{
		int p_149749_6_=TraincraftUtil.getBlockMeta(p_149749_1_,pos);
		if ((p_149749_6_ & 8) > 0)
		{
			p_149749_1_.notifyNeighborsOfStateChange(new BlockPos(pos.getX(), pos.getY(), pos.getZ()), this);
			int i1 = p_149749_6_ & 7;

			if (i1 == 1)
			{
				p_149749_1_.notifyNeighborsOfStateChange(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ()), this);
			}
			else if (i1 == 2)
			{
				p_149749_1_.notifyNeighborsOfStateChange(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ()), this);
			}
			else if (i1 == 3)
			{
				p_149749_1_.notifyNeighborsOfStateChange(new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1), this);
			}
			else if (i1 == 4)
			{
				p_149749_1_.notifyNeighborsOfStateChange(new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1), this);
			}
			else if (i1 != 5 && i1 != 6)
			{
				if (i1 == 0 || i1 == 7)
				{
					p_149749_1_.notifyNeighborsOfStateChange(new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ()), this);
				}
			}
			else
			{
				p_149749_1_.notifyNeighborsOfStateChange(new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()), this);
			}
		}

		super.breakBlock(p_149749_1_, pos,state);
	}



	@Override
	public int getWeakPower(IBlockAccess worldIn, BlockPos pos, IBlockState state, EnumFacing side)
	{
		return (TraincraftUtil.getBlockMeta((World) worldIn, pos) & 8) > 0 ? 15 : 0;
	}

	@Override
	public int getStrongPower(IBlockAccess worldIn, BlockPos pos, IBlockState state, EnumFacing side)
	{
		int i1 = TraincraftUtil.getBlockMeta((World) worldIn, pos);

		if ((i1 & 8) == 0)
		{
			return 0;
		}
		else
		{
			int j1 = i1 & 7, p_149748_5_=side.getHorizontalIndex();
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

	/*@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		texture = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_1_bottom");
	}

	@Override
	public IIcon getIcon(int i, int j) {
		return texture;
	}*/
}
