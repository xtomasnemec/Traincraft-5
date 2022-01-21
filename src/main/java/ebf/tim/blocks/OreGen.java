package ebf.tim.blocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkGeneratorFlat;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Arrays;
import java.util.Random;

/**
 * <h1>Ore generation</h1>
 * spawns liquids and ores in the world.
 * @author Eternal Blue Flame
 */
public class OreGen implements IWorldGenerator{
    private Block ore, notOre = Blocks.STONE;
    private int minY, maxY,veinSize, minOres, maxVeinsPerChunk;
    private Integer[] dimensions = new Integer[]{0};
    private String[] biomes;
    private int heightOffset=0;

    public OreGen(Block oreBlock, int yMin, int yMax, int maxVeinSize, int minOreBlocks, int maxVeins){
        ore=oreBlock;
        minY=yMin;
        maxY=yMax;
        veinSize=maxVeinSize;
        minOres=minOreBlocks;
        maxVeinsPerChunk=maxVeins;
    }

    public OreGen setFiller(Block filler){
        notOre=filler;
        return this;
    }

    public OreGen setBiomes(String[] allowedBiomes){
        biomes=allowedBiomes;
        return this;
    }

    public OreGen setDimensions(Integer[] allowedDimensions){
        dimensions=allowedDimensions;
        return this;
    }

    public OreGen setHeightOffset(int offset){
        heightOffset=offset;
        return this;
    }

    public void register(){

    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if(chunkGenerator instanceof ChunkGeneratorFlat){
            return;
        }
        //be sure it's the correct dimension
        if ((dimensions==null || Arrays.asList(dimensions).contains(world.provider.getDimension()))
                //be sure it's the correct biome
                && (biomes==null || Arrays.asList(biomes).contains(
                        world.getBiomeProvider().getBiome(new BlockPos(chunkX*16,minY+maxY/2,chunkZ*16)).getRegistryName().getPath()))) {
            //define the vein data
            WorldGenMinable vein = new WorldGenMinable(ore.getDefaultState(), Math.max(minOres,random.nextInt(veinSize)), pre -> pre.getBlock() != ore);
            //TODO see if default state is correct/good, else convert this class into using blockstates

            //calculate the max ore veins per chunk
            int maxVeins=random.nextInt(maxVeinsPerChunk);
            int spawnHeightOffset=0;
            if(heightOffset==1){
                spawnHeightOffset=63;//defined in ChunkProvider around the use of BlockWater, seems hardcoded to 63
            } else if (heightOffset==2){
                spawnHeightOffset= world.getChunk(chunkX,chunkZ).getLowestHeight()-1;
            }
            for(int i=0; i<maxVeins;i++) {
                //actually generate the vein
                vein.generate(world, random, new BlockPos(
                        (chunkX * 16) + random.nextInt(16),
                        minY+spawnHeightOffset+random.nextInt(maxY-minY),
                        chunkZ * 16 + random.nextInt(16))
                );
            }
        }
    }
}
