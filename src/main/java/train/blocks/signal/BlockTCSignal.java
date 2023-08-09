package train.blocks.signal;

import ebf.tim.blocks.BlockSignal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import train.Traincraft;

import java.util.Random;

public class BlockTCSignal extends BlockSignal {

	public BlockTCSignal() {
		super(Material.CIRCUITS,true);
		this.setLightLevel(1.0F);
	}

	@Override
	public float[] hitboxShape(){return new float[]{0,0,0,1,3,1};}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileTCSignal(this);
	}

	@Override
	public TileEntity createTileEntity(World world, IBlockState meta) {
		return new TileTCSignal(this);
	}
}