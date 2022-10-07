/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.blocks;

import depreciated.minecraft.util.IIcon;
import ebf.tim.blocks.BlockDynamic;
import ebf.tim.blocks.TileRenderFacing;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
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