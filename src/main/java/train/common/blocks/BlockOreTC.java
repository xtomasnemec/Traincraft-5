package train.common.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.common.Traincraft;

public class BlockOreTC extends BlockFalling {
	public static final PropertyEnum<BlockOreTC.enumeOre> type = PropertyEnum.<BlockOreTC.enumeOre>create("type", BlockOreTC.enumeOre.class);

	public static enum enumeOre implements IStringSerializable {
		PETROL(2),OIL_SAND(3),COPPER(1), BALLAST(4);

		@Override
		public String getName() {
			switch (id){
				case 1:return "copper";
				case 2:return "petrol";
				case 3:return "oilsand";
				case 4:return "ballast";
			}
			return null;
		}
		int id;

		enumeOre(int id){
			this.id=id;
		}
	}

	private static IProperty currentVariantProperty;

	/*private static IIcon texture1;
	private static IIcon texture2;
	private static IIcon texture3;
	private static IIcon texture4;*/

	public BlockOreTC() {
		super(Material.rock);
		setCreativeTab(Traincraft.tcTab);
	}

	/*@Override
	public IIcon getIcon(int side, int metadata) {
		if (metadata == 0) return texture1;
		else if (metadata == 1) return texture2;
		else if (metadata == 2) return texture3;
		else return texture4;
	}

	@Override
	public int damageDropped(IBlockState metadata) {
		return metadata;
	}*/

	@Override
	public int quantityDropped(Random random) {
		return 1;
	}

	@Override
    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
		if(world.getBlockState(pos).getProperties().get(type).equals(enumeOre.OIL_SAND)){
			world.scheduleBlockUpdate(pos, this, this.tickRate(world),3);
		}
    }

	@Override
    public void onNeighborBlockChange(World world, BlockPos pos, IBlockState state, Block block) {
		if(world.getBlockState(pos).getProperties().get(type).equals(enumeOre.OIL_SAND)){
			world.scheduleBlockUpdate(pos, this, this.tickRate(world),3);
		}
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item par1, CreativeTabs tab, List<ItemStack> subItems) {
		for (int i = 0; i < 4; i++) {
			subItems.add(new ItemStack(this, 1, i));
		}
	}



	@Override
	protected BlockState createBlockState() {return new BlockState(this,type);}

	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState();
	}
	public int getMetaFromState(IBlockState state) {
		return 0;
	}

	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
		return state.withProperty(type, enumeOre.COPPER).withProperty(type, enumeOre.BALLAST).withProperty(type, enumeOre.OIL_SAND).withProperty(type, enumeOre.PETROL);
	}


	/*
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		texture1 = iconRegister.registerIcon(Info.modID.toLowerCase() + ":ores/ore_copper");
		texture2 = iconRegister.registerIcon(Info.modID.toLowerCase() + ":ores/ore_oilsands");
		texture3 = iconRegister.registerIcon(Info.modID.toLowerCase() + ":ores/ore_petroleum");
		texture4 = iconRegister.registerIcon(Info.modID.toLowerCase() + ":ballast_test");
	}

	public static IIcon getTexture1() {
		return texture1;
	}*/
}
