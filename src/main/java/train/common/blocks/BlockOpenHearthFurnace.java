/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.library.BlockIDs;
import train.common.library.GuiIDs;
import train.common.tile.TileEntityOpenHearthFurnace;

import java.util.Random;

public class BlockOpenHearthFurnace extends BlockContainer {

	private final boolean isActive;
	private static boolean keepFurnaceInventory = false;
	private Random furnaceRand;

	//private IIcon textureTop_off;
	//private IIcon textureTop_on;
	//private IIcon textureBottom;
	//private IIcon textureFront_off;
	//private IIcon textureFront_on;
	//private IIcon textureSide;

	protected BlockOpenHearthFurnace(boolean active) {
		super(Material.rock);
		furnaceRand = new Random();
		//setRequiresSelfNotify();
		isActive = active;
		if (isActive) {
			setLightLevel(0.8F);
		} else {
			setCreativeTab(Traincraft.tcTab);
		}
	}

	@Override
	public Item getItemDropped(IBlockState i, Random random, int j) {
		return Item.getItemFromBlock(BlockIDs.openFurnaceIdle.block);
	}

	/*@Override
	public IIcon getIcon(int i, int j) {
		if (!this.isActive) {
			if (i == 1) {
				return textureTop_off;
			}
			if (i == 0) {
				return textureBottom;
			}
			if (i == 3) {
				return textureFront_off;
			}
			else {
				return textureSide;
			}
		}
		else {
			if (i == 1) {
				return textureTop_on;
			}
			if (i == 0) {
				return textureBottom;
			}
			if (i == 3) {
				return textureFront_on;
			}
			else {
				return textureSide;
			}
		}
	}

	@Override
	public IIcon getIcon(IBlockAccess worldAccess, int i, int j, int k, int side) {
		if (((TileEntityOpenHearthFurnace) worldAccess.getTileEntity(pos)).getFacing() != null) {
			side = TileHelper.getOrientationFromSide(((TileEntityOpenHearthFurnace) worldAccess.getTileEntity(pos)).getFacing(), ForgeDirection.getOrientation(side)).ordinal();
		}
		if (!this.isActive) {
			return side == 1 ? textureTop_off : side == 0 ? textureBottom : side == 3 ? textureFront_off : textureSide;
		}
		else {
			return side == 1 ? textureTop_on : side == 0 ? textureBottom : side == 3 ? textureFront_on : textureSide;
		}
	}*/

	public static void updateHearthFurnaceBlockState(boolean flag, World world, BlockPos pos, Random random) {
		//int l = TraincraftUtil.getBlockMeta(world,pos);
		TileEntity tileentity = world.getTileEntity(pos);

		keepFurnaceInventory = true;

		if (flag) {
			world.setBlockState(pos, BlockIDs.openFurnaceActive.block.getDefaultState());
		}
		else {
			world.setBlockState(pos, BlockIDs.openFurnaceIdle.block.getDefaultState());
		}
		keepFurnaceInventory = false;
		//todo: i dont think this is actually necessary...?
		//world.setBlockMetadataWithNotify(pos, l, 0);
		if (tileentity != null) {
			tileentity.validate();
			world.setTileEntity(pos, tileentity);
		}
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing par6, float par7, float par8, float par9) {
		TileEntity te = world.getTileEntity(pos);
		if (player.isSneaking()) {
			return false;
		}
		if (!world.isRemote) {
			if (te instanceof TileEntityOpenHearthFurnace) {
				player.openGui(Traincraft.instance, GuiIDs.OPEN_HEARTH_FURNACE, world, pos.getX(),pos.getY(),pos.getZ());
			}
		}
		return true;
	}

	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
		super.onBlockAdded(world, pos, state);
		world.markBlockForUpdate(pos);
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState par5) {
		if (!keepFurnaceInventory) {
			TileEntityOpenHearthFurnace tileentityfurnace = (TileEntityOpenHearthFurnace) world.getTileEntity(pos);
			if (tileentityfurnace != null) {
				label0: for (int l = 0; l < tileentityfurnace.getSizeInventory(); l++) {
					ItemStack itemstack = tileentityfurnace.getStackInSlot(l);
					if (itemstack == null) {
						continue;
					}
					float f = furnaceRand.nextFloat() * 0.8F + 0.1F;
					float f1 = furnaceRand.nextFloat() * 0.8F + 0.1F;
					float f2 = furnaceRand.nextFloat() * 0.8F + 0.1F;
					do {
						if (itemstack.stackSize <= 0) {
							continue label0;
						}
						int i1 = furnaceRand.nextInt(21) + 10;
						if (i1 > itemstack.stackSize) {
							i1 = itemstack.stackSize;
						}
						itemstack.stackSize -= i1;
						EntityItem entityitem = new EntityItem(world, pos.getX() + f, pos.getY() + f1, pos.getZ() + f2, itemstack.splitStack(i1));
						float f3 = 0.05F;
						entityitem.motionX = (float) furnaceRand.nextGaussian() * f3;
						entityitem.motionY = (float) furnaceRand.nextGaussian() * f3 + 0.2F;
						entityitem.motionZ = (float) furnaceRand.nextGaussian() * f3;
						world.spawnEntityInWorld(entityitem);
					} while (true);
				}
			}
		}
		super.breakBlock(world, pos, par5);
	}

	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase entityliving, ItemStack stack) {
		TileEntityOpenHearthFurnace te = (TileEntityOpenHearthFurnace) world.getTileEntity(pos);
		if (te != null) {
			int dir = MathHelper.floor_double((entityliving.rotationYaw * 4F) / 360F + 0.5D) & 3;
			te.setFacing(EnumFacing.getHorizontal(dir == 0 ? 2 : dir == 1 ? 5 : dir == 2 ? 3 : 4));
			world.markBlockForUpdate(pos);
		}
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int i) {
		return new TileEntityOpenHearthFurnace();
	}

	/*@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		textureTop_off = iconRegister.registerIcon(Info.modID.toLowerCase() + ":furnace_off_top");
		textureTop_on = iconRegister.registerIcon(Info.modID.toLowerCase() + ":furnace_on_top");
		textureBottom = iconRegister.registerIcon(Info.modID.toLowerCase() + ":furnace_bottom");
		textureFront_off = iconRegister.registerIcon(Info.modID.toLowerCase() + ":furnace_off_front");
		textureFront_on = iconRegister.registerIcon(Info.modID.toLowerCase() + ":furnace_on_front");
		textureSide = iconRegister.registerIcon(Info.modID.toLowerCase() + ":furnace_side");
	}*/
}
