package train.common.core;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class TrainModBlockUtil {
	public static List<ItemStack> getItemStackFromBlock(World world, int i, int j, int k) {
		Block block = world.getBlockState(new BlockPos(i, j, k)).getBlock();

		if (block == null) {
			return null;
		}

		//int meta = world.getBlockMetadata(i, j, k);
		return block.getDrops(world, new BlockPos(i, j, k), world.getBlockState(new BlockPos(i,j,k)), 0);
	}
}