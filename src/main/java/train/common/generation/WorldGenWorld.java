/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.generation;

import com.google.common.base.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import train.common.core.handlers.ConfigHandler;
import train.common.core.handlers.RetrogenHandler;
import train.common.core.util.TraincraftUtil;
import train.common.library.BlockIDs;

import javax.annotation.Nullable;
import java.util.Random;

public class WorldGenWorld implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		RetrogenHandler.gennedChunks.add(new RetrogenHandler.ChunkData(chunkX, chunkZ, world.provider.getDimensionId()));
		if(world.getWorldType() != WorldType.FLAT){

			if (ConfigHandler.ORE_GEN) {
				addOreSpawn(BlockIDs.oreTC.block.getDefaultState(), 1, Blocks.sand, world, random, chunkX * 16, chunkZ * 16, 10, 2, 25, 75);
				addOreSpawn(BlockIDs.oreTC.block.getDefaultState(), 2, Blocks.stone, world, random, chunkX * 16, chunkZ * 16, 14, 3, 10, 50);
			}
			if (ConfigHandler.COPPER_ORE_GEN) {
				addOreSpawn(BlockIDs.oreTC.block.getDefaultState(), 0, Blocks.stone, world, random, chunkX * 16, chunkZ * 16, 6, 4, 5, 50);
			}
		}
	}

	private void addOreSpawn(IBlockState block, int meta, final Block blockIn, World world, Random random, int blockXPos, int blockZPos, int maxVeinSize, int chancesToSpawn, int minY, int maxY){
		if(maxY > minY){
			int yDiff = maxY - minY;
			for(int i = 0; i < chancesToSpawn; i++){
				int posX = blockXPos + random.nextInt(16);
				int posY = minY + random.nextInt(yDiff);
				int posZ = blockZPos + random.nextInt(16);
				block = block.withProperty(PropertyInteger.create("meta",0,16),meta);

				new WorldGenMinable(block, maxVeinSize, new Predicate<IBlockState>() {
					@Override
					public boolean apply(@Nullable IBlockState input) {
						return input !=null && input.getBlock()==blockIn;
					}
				}).generate(world, random, TraincraftUtil.getPos(posX, posY, posZ));
			}
		}
	}
}
