package train.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.library.BlockIDs;
import train.common.tile.TileTCRailGag;

import java.util.Random;

public class BlockTCRailGag extends Block {
	//private IIcon texture;

	public BlockTCRailGag() {
		super(Material.iron);
		setCreativeTab(Traincraft.tcTab);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
	}

	/**
	 * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
	 */
	@Override
	public boolean canPlaceBlockAt(World par1World, BlockPos pos) {
		return false;
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		TileTCRailGag tileEntity = (TileTCRailGag) world.getTileEntity(pos);
		if (tileEntity != null) {
			// NOTE: destroyBlock() = destroyBlock
			world.destroyBlock(tileEntity.getPos(), false);
			world.removeTileEntity(tileEntity.getPos());
		}
		world.removeTileEntity(pos);
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random par1Random) {
		return 0;
	}

	@Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos, EntityPlayer player) {
		return null;
	}
	
	@Override
	public void onNeighborBlockChange(World world, BlockPos pos, IBlockState par5, Block neighbor) {
		TileEntity tileEntity = world.getTileEntity(pos);
		if (tileEntity instanceof TileTCRailGag) {
			if (world.isAirBlock(pos)) {
				world.destroyBlock(pos, false);
				world.removeTileEntity(pos);
			}
			if (!World.doesBlockHaveSolidTopSurface(world, new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ())) && world.getBlockState(new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ())).getBlock() != BlockIDs.bridgePillar.block) {
				world.destroyBlock(pos, false);
				world.removeTileEntity(pos);
			}
		}
	}

	/**
	 * Updates the blocks bounds based on its current state. Args: world, x, y, z
	 */
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, BlockPos pos) {
		TileEntity tileEntity = par1IBlockAccess.getTileEntity(pos);
		if (tileEntity instanceof TileTCRailGag) {
			//System.out.println(tileEntity.type+" "+tileEntity.bbHeight);
			this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, ((TileTCRailGag)tileEntity).bbHeight, 1.0F);
		}
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
		return new TileTCRailGag();
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public boolean shouldSideBeRendered(IBlockAccess iblockaccess, BlockPos pos, EnumFacing l) {
		return false;
	}

	/*@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		texture = iconRegister.registerIcon(Info.modID.toLowerCase() + ":tracks/rail_normal_turned");
	}

	@Override
	public IIcon getIcon(int i, int j) {
		return texture;
	}*/

	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been cleared to be reused)
	 */
	@Override
	public AxisAlignedBB getCollisionBoundingBox(World world, BlockPos pos, IBlockState state) {
		TileEntity tileEntity = world.getTileEntity(pos);
		if (tileEntity instanceof TileTCRailGag && !((TileTCRailGag)tileEntity).type.equals("null")) {
			return AxisAlignedBB.fromBounds(pos.getX(),pos.getY(),pos.getZ(), pos.getX() + 1, pos.getY() + ((TileTCRailGag)tileEntity).bbHeight, pos.getZ() + 1);
		}
		return null;
	}
}