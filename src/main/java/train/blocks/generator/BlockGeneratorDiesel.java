/*******************************************************************************
 * Copyright (c) 2013 Spitfire4466. All rights reserved.
 *
 * @name TrainCraft
 * @author Spitfire4466
 ******************************************************************************/

package train.blocks.generator;

import ebf.tim.blocks.BlockDynamic;
import ebf.tim.utility.CommonUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.Traincraft;
import train.library.GuiIDs;

import java.util.Random;

public class BlockGeneratorDiesel extends BlockDynamic {

	public BlockGeneratorDiesel() {
		super(Material.IRON, true);
		setCreativeTab(Traincraft.tcTab);
		this.setTickRandomly(true);
	}

	@Override
	public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos) {
		return false;
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand par6, EnumFacing facing, float par7, float par8, float par9) {
		TileEntity te = world.getTileEntity(pos);
		if (player.isSneaking()) {
			return false;
		}
		if (!world.isRemote) {
			if (te instanceof TileGeneratorDiesel) {
				player.openGui(Traincraft.instance, GuiIDs.GENERATOR_DIESEL, world, pos.getX(),pos.getY(),pos.getZ());
			}
		}
		return true;
	}
	/**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
	@Override
    public void neighborChanged(IBlockState state, World par1World, BlockPos pos, Block block, BlockPos otherPos)
    {
        boolean flag = par1World.isBlockPowered(pos);
        TileGeneratorDiesel tile = (TileGeneratorDiesel)par1World.getTileEntity(pos);

        if (tile != null)
        {
            tile.powered = flag;
        }
    }

	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random rand) {
		int l = CommonUtil.getBlockFacing(world,pos.getX(),pos.getY(),pos.getZ());
		TileEntity tile = world.getTileEntity(pos);
		if(tile instanceof TileGeneratorDiesel && ((TileGeneratorDiesel)tile).currentBurnTime > 0){
			double d0 = (double) ((float) pos.getX() + 0.5F);
			double d2 = (double) ((float) pos.getZ() + 0.5F);
			double d3 = 1.67D;
			//System.out.println(l+" "+par1World.isRemote);
			switch(l){
			case 0:
				for(int i=0;i<40;i++){
					world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0+0.2, pos.getY() + d3, d2-0.42, 0.0D, 0.0D, 0.0D);
				}
				break;
			case 1:
				for(int i=0;i<40;i++){
					world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0+0.42, pos.getY() + d3, d2+0.2, 0.0D, 0.0D, 0.0D);
				}
				break;
			case 2:
				for(int i=0;i<40;i++){
					world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0-0.2, pos.getY() + d3, d2+0.42, 0.0D, 0.0D, 0.0D);
				}
				break;
			case 3:
				for(int i=0;i<40;i++){
					world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0-0.42, pos.getY() + d3, d2-0.2, 0.0D, 0.0D, 0.0D);
				}
				break;
			default:
				break;
			}
			//world.spawnParticle(EnumParticleTypes.FLAME, d0, par3 + d3, d2, 0.0D, 0.0D, 0.0D);
		}
	}
	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileGeneratorDiesel();
	}

}