package train.blocks.switchstand;

import ebf.tim.blocks.BlockDynamic;
import ebf.tim.utility.CommonUtil;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.Traincraft;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class BlockSwitchStand extends BlockDynamic {

	public BlockSwitchStand() {
		super(Material.ROCK,false);
		setCreativeTab(Traincraft.tcTab);
		this.setTickRandomly(true);
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1F, 2F, 1F);
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
	public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos) {
		return false;
	}

	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileSwitchStand(this);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileSwitchStand(this);
	}

	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}

	@SideOnly(Side.CLIENT)
	/**
	 * A randomly called display update to be able to add particles or other items for display
	 */

	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {

	}


	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (world.isRemote) {
			return true;
		}
		else {
			int i1 = CommonUtil.getBlockFacing(world,pos.getX(), pos.getY(), pos.getZ());
			int j1 = i1 & 7;
			int k1 = 8 - (i1 & 8);
			CommonUtil.setBlockMeta(world, pos.getX(), pos.getY(), pos.getZ(), j1 + k1);
			world.playSound(player, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.BLOCKS, 0.3f, k1>0?0.6f:0.5f);
			world.notifyNeighborsOfStateChange(new BlockPos(pos.getX(), pos.getY(), pos.getZ()), this, true);

			if (j1 == 1) {
				world.notifyNeighborsOfStateChange(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ()), this, true);
			}
			else if (j1 == 2) {
				world.notifyNeighborsOfStateChange(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ()), this, true);
			}
			else if (j1 == 3) {
				world.notifyNeighborsOfStateChange(new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1), this, true);
			}
			else if (j1 == 4) {
				world.notifyNeighborsOfStateChange(new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1), this, true);
			}
			else if (j1 != 5 && j1 != 6) {
				if (j1 == 0 || j1 == 7) {
					world.notifyNeighborsOfStateChange(new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ()), this, true);
				}
			}
			else {
				world.notifyNeighborsOfStateChange(new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()), this, true);
			}

			return true;
		}
	}
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
		if (CommonUtil.getBlockFacing(world, pos.getX(), pos.getY(), pos.getZ()) > 0) {
			world.notifyNeighborsOfStateChange(pos, this, true);
			int i1 = CommonUtil.getBlockFacing(world, pos.getX(), pos.getY(), pos.getZ()) & 7;

			if (i1 == 1) {
				world.notifyNeighborsOfStateChange(pos, this, true);
			}
			else if (i1 == 2) {
				world.notifyNeighborsOfStateChange(pos, this, true);
			}
			else if (i1 == 3) {
				world.notifyNeighborsOfStateChange(pos, this, true);
			}
			else if (i1 == 4) {
				world.notifyNeighborsOfStateChange(pos, this, true);
			}
			else if (i1 != 5 && i1 != 6) {
				if (i1 == 0 || i1 == 7)
				{
					world.notifyNeighborsOfStateChange(pos, this, true);
				}
			}
			else {
				world.notifyNeighborsOfStateChange(pos, this, true);
			}
		}

		super.breakBlock(world, pos, state);
	}



	public int isProvidingWeakPower(IBlockAccess p_149709_1_, int p_149709_2_, int p_149709_3_, int p_149709_4_, int p_149709_5_) {
		return CommonUtil.getBlockFacing(p_149709_1_, p_149709_2_, p_149709_3_, p_149709_4_) > 0 ? 15 : 0;
	}

	public int isProvidingStrongPower(IBlockAccess p_149748_1_, int p_149748_2_, int p_149748_3_, int p_149748_4_, int p_149748_5_) {
		int i1 = CommonUtil.getBlockFacing(p_149748_1_, p_149748_2_, p_149748_3_, p_149748_4_);

		if ((i1 & 8) == 0) {
			return 0;
		} else {
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
