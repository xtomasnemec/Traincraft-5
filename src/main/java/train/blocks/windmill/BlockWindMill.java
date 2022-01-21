package train.blocks.windmill;

import ebf.tim.blocks.BlockDynamic;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.SoundEvents;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.Traincraft;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class BlockWindMill extends BlockDynamic {

	public BlockWindMill() {
		super(Material.WOOD,false);
		setCreativeTab(Traincraft.tcTab);
		this.setTickRandomly(true);
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1F, 2F, 1F);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public AxisAlignedBB getSelectedBoundingBox(IBlockState state, World world, BlockPos pos) {
		return getBoundingBox(state,world,pos);
	}
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess world, BlockPos pos){
		return getBoundingBox(state,world,pos);
	}
	@Override
	public void addCollisionBoxToList(IBlockState state, World world, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
		addCollisionBoxToList(pos, entityBox, collidingBoxes, getCollisionBoundingBox(state,world, pos));
	}
	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileWindMill(this);
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(IBlockState stateIn, World world, BlockPos pos, Random rand) {
		TileEntity tile = world.getTileEntity(pos);
		if (tile instanceof TileWindMill && ((TileWindMill) tile).windClient > 0) {
			if (rand.nextInt(20) == 0) {
				world.playSound(world.getClosestPlayer(pos.getX(),pos.getY(),pos.getZ(),16,false)
						,pos, SoundEvents.ENTITY_MINECART_INSIDE, SoundCategory.BLOCKS,
						rand.nextFloat() * 0.25F + 0.75F, rand.nextFloat() * 1F + 0.1F);
			}
		}
	}

}
