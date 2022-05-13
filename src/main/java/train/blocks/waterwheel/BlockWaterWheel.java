package train.blocks.waterwheel;

import ebf.tim.blocks.BlockDynamic;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.SoundEvents;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.Traincraft;

import java.util.Random;

public class BlockWaterWheel extends BlockDynamic {

	public BlockWaterWheel() {
		super(Material.WOOD,false);
		setCreativeTab(Traincraft.tcTab);
		this.setTickRandomly(true);
	}

	@Override
	public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos) {
		return false;
	}


	@Override
	public TileEntity createTileEntity(World world, IBlockState metadata) {
		return new TileWaterWheel();
	}

    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return new TileWaterWheel();
    }

	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random rand) {
		TileEntity tile = world.getTileEntity(pos);
		if (tile instanceof TileWaterWheel && ((TileWaterWheel) tile).getWaterDir() > -1001) {
			double d0 = (double) ((float) pos.getX() + 0.5F);
			double d2 = (double) ((float) pos.getZ() + 0.5F);

			world.spawnParticle(EnumParticleTypes.WATER_SPLASH, d0, pos.getY() + 1, d2, 0.0D, 0.0D, 0.0D);
			world.spawnParticle(EnumParticleTypes.WATER_SPLASH, d0, pos.getY(), d2, 0.0D, 0.0D, 0.0D);
			if (rand.nextInt(20) == 0) {
				world.playSound(world.getClosestPlayer(pos.getX(),pos.getY(),pos.getZ(),16,false)
						,pos, SoundEvents.BLOCK_WATER_AMBIENT, SoundCategory.BLOCKS,
						rand.nextFloat() * 0.25F + 0.75F, rand.nextFloat() * 1F + 0.1F);
			}
		}
	}
}
