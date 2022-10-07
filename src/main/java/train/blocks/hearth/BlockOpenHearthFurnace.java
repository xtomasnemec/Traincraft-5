/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.blocks.hearth;

import ebf.tim.blocks.BlockDynamic;
import ebf.tim.utility.CommonUtil;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.blocks.TCBlocks;

import java.util.Random;

public class BlockOpenHearthFurnace extends BlockDynamic {


	public BlockOpenHearthFurnace() {
		super(Material.ROCK,true);
		//setRequiresSelfNotify();
	}

	public ResourceLocation getTexture(int x, int y, int z){
		//todo this is inefficient, do from tile entity
		if(Minecraft.getMinecraft().world!=null &&
				Minecraft.getMinecraft().world.getTileEntity(new BlockPos(x,y,z)) instanceof TileEntityOpenHearthFurnace){
			if(((TileEntityOpenHearthFurnace) Minecraft.getMinecraft().world.getTileEntity(new BlockPos(x,y,z))).isBurning()){
				return new ResourceLocation("traincraft", "textures/blocks/furnace_on.png");
			}
		}
		return new ResourceLocation("traincraft", "textures/blocks/furnace_off.png");
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(TCBlocks.blockHearthFurnace);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random random) {
		TileEntity te = Minecraft.getMinecraft().world.getTileEntity(pos);
		if (te instanceof TileEntityOpenHearthFurnace && ((TileEntityOpenHearthFurnace) te).isBurning()) {
			float var7 = (float) pos.getX() + 0.5F;
			float var9 = (float) pos.getZ() + 0.5F;
			float f3 = 0.009F;
			double gaussian = random.nextGaussian() * f3;
			for (int t = 0; t < 50; t++) {
				world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, var7, (double) pos.getY() + 1.2F, var9, gaussian, gaussian * 0.002F, gaussian);
			}
			world.spawnParticle(EnumParticleTypes.FLAME, var7, (double) pos.getY() + 1.03F, var9, 0, 0, 0);
			world.spawnParticle(EnumParticleTypes.FLAME, var7 + 0.06, (double) pos.getY() + 1.03F, var9 + 0.06, 0, 0, 0);
			world.spawnParticle(EnumParticleTypes.FLAME, var7 - 0.06, (double) pos.getY() + 1.03F, var9 - 0.06, 0, 0, 0);
			world.spawnParticle(EnumParticleTypes.FLAME, var7 + 0.06, (double) pos.getY() + 1.03F, var9 - 0.06, 0, 0, 0);
			world.spawnParticle(EnumParticleTypes.FLAME, var7 - 0.06, (double) pos.getY() + 1.03F, var9 + 0.06, 0, 0, 0);
			CommonUtil.getBlockAt(world, pos.getX(), pos.getY(),pos.getZ()).setLightLevel(0.8F);
		} else {
			CommonUtil.getBlockAt(world, pos.getX(), pos.getY(),pos.getZ()).setLightLevel(0F);
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public Object getGUI(EntityPlayer player, TileEntity te){
		return new train.blocks.hearth.GuiOpenHearthFurnace(player.inventory, (TileEntityOpenHearthFurnace) te);
	}

	@Override
	public Object getInventoryManager(EntityPlayer player, TileEntity te){
		return new ContainerOpenHearthFurnace(player.inventory, (TileEntityOpenHearthFurnace) te);
	}


	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		//todo:keep inventory on break?

		TileEntity te = world.getTileEntity(pos);
		if(te instanceof TileEntityOpenHearthFurnace && world.getGameRules().getBoolean("doTileDrops")){
			((TileEntityOpenHearthFurnace) te).dropInventory();
		}
		super.breakBlock(world, pos, state);
	}


	@Override
	public TileEntity createNewTileEntity(World var1, int i) {
		return new TileEntityOpenHearthFurnace(this);
	}

}
