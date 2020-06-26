package train.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.common.Traincraft;
import train.common.core.util.TraincraftUtil;
import train.common.tile.TileWindMill;

import java.util.Random;

public class BlockWindMill extends Block {
	//private IIcon texture;

	public BlockWindMill() {
		super(Material.wood);
		setCreativeTab(Traincraft.tcTab);
		this.setTickRandomly(true);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1F, 2F, 1F);
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
		return new TileWindMill();
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(World par1World, BlockPos pos,IBlockState state, Random par5Random) {
		TileEntity tile = par1World.getTileEntity(pos);
		if (tile != null && tile instanceof TileWindMill && ((TileWindMill) tile).windClient > 0) {
			if (par5Random.nextInt(20) == 0) {
				par1World.playSound(pos.getX(),pos.getY(),pos.getZ(), "minecart.inside", par5Random.nextFloat() * 0.25F + 0.1F, par5Random.nextFloat() * 1F - 0.6F, true);
			}
		}
	}

	/**
	 * Called when the block is placed in the world.
	 */
	@Override
	public void onBlockPlacedBy(World par1World, BlockPos pos, IBlockState state, EntityLivingBase par5EntityLiving, ItemStack par6ItemStack) {
		int l = MathHelper.floor_double((double) (par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		int i1 = TraincraftUtil.getBlockMeta(par1World,pos);//par1World.getBlockMetadata(par2, par3, par4) >> 2;
		++l;
		l %= 4;
		((TileWindMill)par1World.getTileEntity(pos)).setFacing(l);

		/*this should be handled by tile entity.
		if (l == 0) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 2 | i1 << 2, 2);
		}

		if (l == 1) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 3 | i1 << 2, 2);
		}

		if (l == 2) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 0 | i1 << 2, 2);
		}

		if (l == 3) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 1 | i1 << 2, 2);
		}*/
	}


	/*@Override
	@SideOnly(Side.CLIENT)
	public static void registerRender(Block iconRegister) {
		texture = iconRegister.registerIcon(Info.modID.toLowerCase() + ":wind_mill");
	}

	@Override
	public IIcon getIcon(int i, int j) {
		return texture;
	}*/

	/**
	 * ejects contained items into the world, and notifies neighbours of an update, as appropriate
	 */
	@Override
	public void breakBlock(World par1World, BlockPos pos, IBlockState par5) {
		TileEntity tile = par1World.getTileEntity(pos);
		if (tile instanceof TileWindMill) {
			tile.onChunkUnload();
		}
		super.breakBlock(par1World, pos,par5);
	}
}
