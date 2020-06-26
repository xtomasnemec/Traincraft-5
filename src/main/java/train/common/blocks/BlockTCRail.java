package train.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.library.BlockIDs;
import train.common.tile.TileTCRail;

import java.util.Random;

public class BlockTCRail extends Block {

	public BlockTCRail() {
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
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos, EntityPlayer player)  {
		TileTCRail tileEntity = (TileTCRail) world.getTileEntity(pos);
		if (tileEntity != null && tileEntity.idDrop != null) {
			return new ItemStack(tileEntity.idDrop);
		}
		return null;
	}

	@Override
	public int quantityDropped(Random random) {
		return 0;
	}

	@Override
	public boolean hasTileEntity(IBlockState metadata) {
		return true;
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState par5) {
		TileTCRail tileEntity = (TileTCRail) world.getTileEntity(pos);
		if (tileEntity != null && tileEntity.isLinkedToRail) {
			// NOTE: func_147480_a = destroyBlock
			world.destroyBlock(tileEntity.getPos(), false);
			world.removeTileEntity(tileEntity.getPos());
		}
		if (tileEntity != null && (tileEntity.idDrop != null) && !world.isRemote) {
			EntityPlayer player = Traincraft.proxy.getPlayer();
			if (!(player != null && player.capabilities.isCreativeMode)) {
				EntityItem e = new EntityItem(world);
				e.setEntityItemStack(new ItemStack(tileEntity.idDrop, 1));
				e.setPosition(pos.getX(),pos.getY()+1, pos.getZ());
				world.spawnEntityInWorld(e);
				//this.dropBlockAsItem(world, pos, new ItemStack(tileEntity.idDrop, 1), 0);
			}
		}
		world.removeTileEntity(pos);
	}

	@Override
	public void onNeighborBlockChange(World world, BlockPos pos, IBlockState par5, Block other) {
		TileEntity tile = world.getTileEntity(pos);
		if (tile == null || !(tile instanceof TileTCRail))
			return;

		TileTCRail tileEntity = (TileTCRail) world.getTileEntity(pos);
		if (tileEntity != null && tileEntity.isLinkedToRail) {
			if (world.isAirBlock(new BlockPos(tileEntity.linkedX, tileEntity.linkedY, tileEntity.linkedZ))) {
				// NOTE: func_147480_a = destroyBlock
				world.removeTileEntity(pos);
				world.destroyBlock(pos, false);
			}
		}
		if (!World.doesBlockHaveSolidTopSurface(world, new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ())) && world.getBlockState(new BlockPos(pos.getX(), pos.getY()-1, pos.getZ())).getBlock() != BlockIDs.bridgePillar.block) {
			// NOTE: func_147480_a = destroyBlock
			world.destroyBlock(pos, false);
			world.removeTileEntity(pos);
		}
		if (tileEntity != null && !world.isRemote) {
			boolean flag = world.isBlockPowered(pos);
			if (tileEntity.previousRedstoneState != flag) {
				tileEntity.changeSwitchState(world, tileEntity, pos.getX(),pos.getY(),pos.getZ());
				tileEntity.previousRedstoneState = flag;
			}
		}
	}

	@Override
	public boolean isFullBlock() {
		return false;
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public TileEntity createTileEntity(World world, IBlockState metadata) {
		return new TileTCRail();
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing par6, float par7, float par8, float par9) {
		//todo: allows players to rotate small tracks with wrench, but shoudl't work, uses different data from normal tile
		/*TileEntity te = world.getTileEntity(pos);
		int l = world.getBlockMetadata(i, j, k);
		if (!world.isRemote && te != null && (te instanceof TileTCRail)) {
			if (player != null && player.inventory != null && player.inventory.getCurrentItem() != null && (player.inventory.getCurrentItem().getItem() instanceof ItemWrench) && ((TileTCRail) te).getType() != null && ((TileTCRail) te).getType().equals(ItemTCRail.TrackTypes.SMALL_STRAIGHT.getLabel())) {
				l++;
				if (l > 3)
					l = 0;
				world.setBlockMetadataWithNotify(i, j, k, l, 2);
				((TileTCRail) te).hasRotated = true;
				return true;
			}
			//((TileTCRail)te).printInfo();
		}*/
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

	@Override
	public AxisAlignedBB getCollisionBoundingBox(World world, BlockPos pos, IBlockState state) {
		return world==null||world.isRemote?
				AxisAlignedBB.fromBounds(pos.getX() -18f, pos.getY(), pos.getZ() -18f, pos.getX() +18f, pos.getY(), pos.getZ() +18f)
		:
				AxisAlignedBB.fromBounds(pos.getX() + this.minX, pos.getY() + this.minY, pos.getZ() + this.minZ, pos.getX() + this.maxX, pos.getY(), pos.getZ() + this.maxZ);
	}
}
