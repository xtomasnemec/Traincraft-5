package train.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.common.Traincraft;
import train.common.items.ItemWrench;
import train.common.library.GuiIDs;
import train.common.tile.TileLantern;

import java.util.Random;

public class BlockLantern extends Block {
	//private IIcon texture;

	public BlockLantern() {
		super(Material.rock);
		setCreativeTab(Traincraft.tcTab);
		this.setTickRandomly(true);
		float f = 0.3F;
		this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);
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
		return new TileLantern();
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
		double d0 = (double) ((float) pos.getX() + 0.5F);
		double d2 = (double) ((float) pos.getZ() + 0.5F);
		double d3 = 0.2199999988079071D;

		par1World.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, pos.getY() + d3, d2, 0.0D, 0.0D, 0.0D);
		par1World.spawnParticle(EnumParticleTypes.FLAME, d0, pos.getY() + d3, d2, 0.0D, 0.0D, 0.0D);

	}
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing par6, float par7, float par8, float par9) {
		TileEntity te = world.getTileEntity(pos);
		if (player.isSneaking()) {
			return false;
		}
		if(player!=null && player.getCurrentEquippedItem()!=null && player.getCurrentEquippedItem().getItem() instanceof ItemWrench)
		if (te instanceof TileLantern) {
			player.openGui(Traincraft.instance, GuiIDs.LANTERN, world, pos.getX(),pos.getY(),pos.getZ());
		}
		return true;
	}
	/*@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		texture = iconRegister.registerIcon(Info.modID.toLowerCase() + ":lantern");
	}

	@Override
	public IIcon getIcon(int i, int j) {
		return texture;
	}*/
}
