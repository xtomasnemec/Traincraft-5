package train.blocks.distil;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ebf.tim.blocks.BlockDynamic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.Traincraft;
import train.blocks.TCBlocks;
import train.library.GuiIDs;

import java.util.Random;

public class BlockDistil extends BlockDynamic {


	public BlockDistil() {
		super(Material.ROCK,true);
		//setRequiresSelfNotify();
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(TCBlocks.blockDistil);
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand par6, EnumFacing facing, float par7, float par8, float par9) {
		TileEntity te = world.getTileEntity(pos);
		if (player.isSneaking()) {
			return false;
		}
		if (!world.isRemote) {
			if (te instanceof TileEntityDistil) {
				player.openGui(Traincraft.instance, GuiIDs.DISTIL, world, pos.getX(), pos.getY(),pos.getZ());
			}
		}
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random random) {
		TileEntity te = Minecraft.getMinecraft().world.getTileEntity(pos);
		if (te instanceof TileEntityDistil && ((TileEntityDistil) te).isBurning()) {
			setLightLevel(0.8F);
			EnumFacing side = ((TileEntityDistil) te).getFacing();
			float var7 = pos.getX() + 0.5F;
			float var8 = pos.getY() + 0.0F + random.nextFloat() * 6.0F / 16.0F;
			float var9 = pos.getZ() + 0.5F;
			float var11 = random.nextFloat() * 0.6F - 0.3F;
			for (int t = 0; t < 10; t++) {
				world.spawnParticle(EnumParticleTypes.SPELL_MOB_AMBIENT, var7, (double) pos.getY() + 1F, var9, 0, 0, 0);
			}

			if (side == EnumFacing.WEST) {
				world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, (double) (var7 - 0.52F), (double) var8, (double) (var9 + var11), 0.0D, 0.0D, 0.0D);
				world.spawnParticle(EnumParticleTypes.FLAME, (double) (var7 - 0.52F), (double) var8, (double) (var9 + var11), 0.0D, 0.0D, 0.0D);
			} else if (side == EnumFacing.EAST) {
				world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, (double) (var7 + 0.52F), (double) var8, (double) (var9 + var11), 0.0D, 0.0D, 0.0D);
				world.spawnParticle(EnumParticleTypes.FLAME, (double) (var7 + 0.52F), (double) var8, (double) (var9 + var11), 0.0D, 0.0D, 0.0D);
			} else if (side == EnumFacing.NORTH) {
				world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, (double) (var7 + var11), (double) var8, (double) (var9 - 0.52F), 0.0D, 0.0D, 0.0D);
				world.spawnParticle(EnumParticleTypes.FLAME, (double) (var7 + var11), (double) var8, (double) (var9 - 0.52F), 0.0D, 0.0D, 0.0D);
			} else if (side == EnumFacing.SOUTH) {
				world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, (double) (var7 + var11), (double) var8, (double) (var9 + 0.52F), 0.0D, 0.0D, 0.0D);
				world.spawnParticle(EnumParticleTypes.FLAME, (double) (var7 + var11), (double) var8, (double) (var9 + 0.52F), 0.0D, 0.0D, 0.0D);
			}
		} else {
			setLightLevel(0.0F);
		}
	}

	public ResourceLocation getTexture(int x, int y, int z){
		if(Minecraft.getMinecraft().world!=null &&
				Minecraft.getMinecraft().world.getTileEntity(new BlockPos(x,y,z)) instanceof TileEntityDistil){
			if(((TileEntityDistil) Minecraft.getMinecraft().world.getTileEntity(new BlockPos(x,y,z))).isBurning()){
				return new ResourceLocation("traincraft", "textures/blocks/distil_on.png");
			}
		}
		return new ResourceLocation("traincraft", "textures/blocks/distil_off.png");
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		//todo: keep inventory code for item
		TileEntity te = world.getTileEntity(pos);
		if(te instanceof TileEntityDistil && world.getGameRules().getBoolean("doTileDrops")){
			((TileEntityDistil) te).dropInventory();
		}
		super.breakBlock(world, pos, state);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityDistil(this);
	}

}
