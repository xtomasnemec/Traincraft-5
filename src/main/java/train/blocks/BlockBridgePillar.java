/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.blocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import ebf.tim.blocks.BlockDynamic;
import ebf.tim.blocks.TileRenderFacing;
import ebf.tim.utility.CommonUtil;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import depreciated.minecraft.util.IIcon;
import net.minecraft.world.World;
import train.Traincraft;

public class BlockBridgePillar extends BlockDynamic {

	private IIcon texture;

	public BlockBridgePillar() {
		super(Material.WOOD, false);
		setCreativeTab(Traincraft.tcTab);
	}

	@Override
	public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos) {
		return false;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}

	@Override
	public IIcon getIcon(int i, int j) {
		return texture;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new tilePillar(this);
	}
	
	/**
	 * Called when the block is placed in the world.
	 */
	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase entity, ItemStack stack){
		int l = CommonUtil.floorDouble((double) (entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		int i1 = CommonUtil.getBlockFacing(world,pos.getX(),pos.getY(),pos.getZ()) >> 2;
		++l;
		l %= 4;

		if (l == 0) {
			CommonUtil.setBlockMeta(world,pos.getX(),pos.getY(),pos.getZ(), 2 | i1 << 2);
		}

		if (l == 1) {
			CommonUtil.setBlockMeta(world,pos.getX(),pos.getY(),pos.getZ(), 3 | i1 << 2);
		}

		if (l == 2) {
			CommonUtil.setBlockMeta(world,pos.getX(),pos.getY(),pos.getZ(), 0 | i1 << 2);
		}

		if (l == 3) {
			CommonUtil.setBlockMeta(world,pos.getX(),pos.getY(),pos.getZ(), 1 | i1 << 2);
		}
	}
	/*@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		texture = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_1_bottom");
	}*/


	public class tilePillar extends TileRenderFacing{

		public tilePillar(BlockDynamic block) {
			super(block);
		}
	}
}