package train.generation;

import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.CommonUtil;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieces;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.BiomeEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import train.blocks.TCBlocks;
import train.core.util.TraincraftUtil;
import train.entity.rollingStock.*;

import java.util.List;
import java.util.Random;

public class ComponentVillageTrainstation extends StructureVillagePieces.Village {

	private int averageGroundLevel = -1;

	public ComponentVillageTrainstation() {}
	
	public ComponentVillageTrainstation(StructureVillagePieces.Start par1ComponentVillageStartPiece, int par2, Random par3Random, StructureBoundingBox par4StructureBoundingBox, int par5) {
		super(par1ComponentVillageStartPiece, par2);
		this.coordBaseMode = par5;
		this.boundingBox = par4StructureBoundingBox;
	}

	public static ComponentVillageTrainstation buildComponent(StructureVillagePieces.Start par0ComponentVillageStartPiece, List par1List, Random par2Random, int par3, int par4, int par5, int par6, int par7) {
		StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(par3, par4, par5, 0, 0, 0, 9, 9, 10, par6);
		return canVillageGoDeeper(structureboundingbox) && StructureComponent.findIntersecting(par1List, structureboundingbox) == null ? new ComponentVillageTrainstation(par0ComponentVillageStartPiece, par7, par2Random, structureboundingbox, par6) : null;
	}

	@Override
	public boolean addComponentParts(World world, Random random, StructureBoundingBox structureboundingbox) {
		if (this.averageGroundLevel < 0) {
			this.averageGroundLevel = this.getAverageGroundLevel(world, structureboundingbox);

			if (this.averageGroundLevel < 0) {
				return true;
			}

			this.boundingBox.offset(0, this.averageGroundLevel - this.boundingBox.maxY + 9 - 1, 0);
		}
		this.fillWithBlocks(world, structureboundingbox, 1, 1, 1, 7, 5, 4, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 0, 0, 8, 0, 5, Blocks.BRICK_BLOCK.getDefaultState(), Blocks.BRICK_BLOCK.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 5, 0, 8, 5, 5, Blocks.BRICK_BLOCK.getDefaultState(), Blocks.BRICK_BLOCK.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 6, 1, 8, 6, 4, Blocks.BRICK_BLOCK.getDefaultState(), Blocks.BRICK_BLOCK.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 7, 2, 8, 7, 3, Blocks.BRICK_BLOCK.getDefaultState(), Blocks.BRICK_BLOCK.getDefaultState(), false);
		int i = this.getMetadataWithOffset(Blocks.OAK_STAIRS, 3);
		int j = this.getMetadataWithOffset(Blocks.OAK_STAIRS, 2);
		int k;
		int l;

		for (k = -1; k <= 2; ++k) {
			for (l = 0; l <= 8; ++l) {
				this.placeBlockAtCurrentPosition(world, Blocks.OAK_STAIRS, i, l, 6 + k, k, structureboundingbox);
				this.placeBlockAtCurrentPosition(world, Blocks.OAK_STAIRS, j, l, 6 + k, 5 - k, structureboundingbox);
			}
		}

		this.fillWithBlocks(world, structureboundingbox, 0, 1, 0, 0, 1, 5, Blocks.BRICK_BLOCK.getDefaultState(), Blocks.BRICK_BLOCK.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 1, 1, 5, 8, 1, 5, Blocks.BRICK_BLOCK.getDefaultState(), Blocks.BRICK_BLOCK.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 8, 1, 0, 8, 1, 4, Blocks.BRICK_BLOCK.getDefaultState(), Blocks.BRICK_BLOCK.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 2, 1, 0, 7, 1, 0, Blocks.BRICK_BLOCK.getDefaultState(), Blocks.BRICK_BLOCK.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 2, 0, 0, 4, 0, Blocks.BRICK_BLOCK.getDefaultState(), Blocks.BRICK_BLOCK.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 2, 5, 0, 4, 5, Blocks.BRICK_BLOCK.getDefaultState(), Blocks.BRICK_BLOCK.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 8, 2, 5, 8, 4, 5, Blocks.BRICK_BLOCK.getDefaultState(), Blocks.BRICK_BLOCK.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 8, 2, 0, 8, 4, 0, Blocks.BRICK_BLOCK.getDefaultState(), Blocks.BRICK_BLOCK.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 2, 1, 0, 4, 4, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 1, 2, 5, 7, 4, 5, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 8, 2, 1, 8, 4, 4, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 1, 2, 0, 7, 4, 0, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 4, 2, 0, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 5, 2, 0, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 6, 2, 0, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 4, 3, 0, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 5, 3, 0, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 6, 3, 0, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 0, 2, 2, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 0, 2, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 0, 3, 2, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 0, 3, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 8, 2, 2, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 8, 2, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 8, 3, 2, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 8, 3, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 2, 3, 5, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 2, 2, 5, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 3, 2, 5, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 3, 3, 5, structureboundingbox);

		for (int z = 0; z < 9; z++) {
			this.placeBlockAtCurrentPosition(world, Blocks.BRICK_BLOCK, 0, z, 0, 6, structureboundingbox);
			this.placeBlockAtCurrentPosition(world, Blocks.STONE_SLAB, 4, z, 0, 7, structureboundingbox);
			this.placeBlockAtCurrentPosition(world, Blocks.RAIL, 0, z, 0, 8, structureboundingbox);
			this.placeBlockAtCurrentPosition(world, Blocks.STONEBRICK, 0, z, -1, 8, structureboundingbox);
		}
		this.placeBlockAtCurrentPosition(world, Blocks.BRICK_BLOCK, 0, 2, 0, 7, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.OAK_FENCE, 0, 2, 1, 7, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.OAK_FENCE, 0, 2, 2, 7, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.OAK_FENCE, 0, 2, 3, 7, structureboundingbox);

		this.placeBlockAtCurrentPosition(world, Blocks.BRICK_BLOCK, 0, 6, 0, 7, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.OAK_FENCE, 0, 6, 1, 7, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.OAK_FENCE, 0, 6, 2, 7, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.OAK_FENCE, 0, 6, 3, 7, structureboundingbox);
		this.fillWithBlocks(world, structureboundingbox, 1, 4, 7, 7, 4, 7, Blocks.WOODEN_SLAB.getDefaultState(), Blocks.WOODEN_SLAB.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 1, 4, 6, 7, 4, 6, Blocks.WOODEN_SLAB.getDefaultState(), Blocks.WOODEN_SLAB.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 1, 4, 8, 7, 4, 8, Blocks.WOODEN_SLAB.getDefaultState(), Blocks.WOODEN_SLAB.getDefaultState(), false);
		this.placeBlockAtCurrentPosition(world, Blocks.OAK_FENCE, 0, 0, 1, 6, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, TCBlocks.lantern, 0, 0, 2, 6, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.OAK_FENCE, 0, 8, 1, 6, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, TCBlocks.lantern, 0, 8, 2, 6, structureboundingbox);

		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 5, 2, 5, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.GLASS_PANE, 0, 6, 2, 5, structureboundingbox);
		this.fillWithBlocks(world, structureboundingbox, 1, 4, 1, 7, 4, 1, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 1, 4, 4, 7, 4, 4, Blocks.PLANKS.getDefaultState(), Blocks.PLANKS.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 4, 3, 4, 7, 3, 4, Blocks.BOOKSHELF.getDefaultState(), Blocks.BOOKSHELF.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 5, 3, 5, 6, 3, 5, Blocks.GLASS_PANE.getDefaultState(), Blocks.GLASS_PANE.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 4, 3, 3, 7, 3, 3, Blocks.IRON_BARS.getDefaultState(), Blocks.IRON_BARS.getDefaultState(), false);
		this.placeBlockAtCurrentPosition(world, TCBlocks.lantern, 0, 7, 4, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, TCBlocks.lantern, 0, 4, 4, 3, structureboundingbox);

		this.placeBlockAtCurrentPosition(world, Blocks.IRON_BARS, 0, 4, 2, 3, structureboundingbox);
		this.fillWithBlocks(world, structureboundingbox, 4, 1, 3, 7, 1, 3, Blocks.IRON_BARS.getDefaultState(), Blocks.IRON_BARS.getDefaultState(), false);
		this.placeBlockAtCurrentPosition(world, Blocks.PLANKS, 0, 7, 1, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.PLANKS, 0, 7, 1, 4, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.PLANKS, 0, 4, 1, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.PLANKS, 0, 4, 1, 4, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.IRON_BARS, 0, 4, 2, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.IRON_BARS, 0, 4, 2, 4, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.IRON_BARS, 0, 7, 2, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.IRON_BARS, 0, 7, 2, 4, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.PLANKS, 0, 1, 1, 4, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.OAK_STAIRS, this.getMetadataWithOffset(Blocks.OAK_STAIRS, 1), 1, 1, 3, structureboundingbox);
		k = this.getMetadataWithOffset(Blocks.OAK_STAIRS, 3);
		this.placeBlockAtCurrentPosition(world, Blocks.OAK_STAIRS, k, 3, 1, 4, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.OAK_STAIRS, k, 2, 1, 4, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.OAK_FENCE, 0, 2, 1, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.WOODEN_PRESSURE_PLATE, 0, 2, 2, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, TCBlocks.partTable, 0, 7, 1, 1, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.AIR, 0, 1, 1, 0, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Blocks.AIR, 0, 1, 2, 0, structureboundingbox);
		this.placeDoorAtCurrentPosition(world, structureboundingbox, random, 1, 1, 0, this.getMetadataWithOffset(Blocks.OAK_DOOR, 1));

		if (this.getBlockAtCurrentPosition(world, 1, 0, -1, structureboundingbox) == Blocks.AIR && this.getBlockAtCurrentPosition(world, 1, -1, -1, structureboundingbox) != Blocks.AIR) {
			this.placeBlockAtCurrentPosition(world, Blocks.STONE_SLAB, 4, 1, 0, -1, structureboundingbox);
		}

		for (l = 0; l < 6; ++l) {
			for (int i1 = 0; i1 < 9; ++i1) {
				this.clearCurrentPositionBlocksUpwards(world, i1, 9, l, structureboundingbox);
				this.func_151554_b(world, Blocks.BRICK_BLOCK, 0, i1, -1, l, structureboundingbox);
			}
		}

		this.spawnVillagers(world, structureboundingbox, 6, 1, 4, 1);

		int j1 = this.getXWithOffset(6, 8);
		int k1 = this.getYWithOffset(1);
		int l1 = this.getZWithOffset(6, 8);

		if (structureboundingbox.isVecInside(j1, k1, l1)) {
			int rD = random.nextInt(8);
			GenericRailTransport cart;
			if (rD == 0) {
				cart = new EntityCaboose(world);
			}
			else if (rD == 1){
				cart = new EntityCaboose3(world);
			}
			else if (rD == 2){
				cart = new EntityFreightCart(world);
			}
			else if (rD == 3){
				cart = new EntityPassenger2(world);
			}
			else if (rD == 4){
				cart = new EntityStockCar(world);
			}
			else if (rD == 5){
				cart = new EntityBoxCartUS(world);
			}
			else if (rD == 6) {
				cart = new EntityFreightCartSmall(world);
			}
			else {
				cart = new EntityCabooseLogging(world);
			}

			cart.setLocationAndAngles(j1 + 0.5D, k1, l1 + 0.5D, 90.0F, 0.0F);
			if (rD == 4) {
				cart.setSkin("Blue");
			}
			if (rD == 7) {
				cart.setSkin("Red");
			}
			if (rD == 5) {
				cart.setSkin("Brown");
			}
			world.spawnEntity(cart);
			cart.entityData.putString("ownername","VillagerJoe");

		}
		int j2 = this.getXWithOffset(3, 8);
		int k2 = this.getYWithOffset(1);
		int l2 = this.getZWithOffset(3, 8);

		if (structureboundingbox.isVecInside(j2, k2, l2)) {
			int rD = random.nextInt(8);
			GenericRailTransport cart;
			if (rD == 0) {
				cart = new EntityCaboose(world);
			}
			else if (rD == 1) {
				cart = new EntityCaboose3(world);
			}
			else if (rD == 2) {
				cart = new EntityFreightCart(world);
			}
			else if (rD == 3) {
				cart = new EntityPassenger2(world);
			}
			else if (rD == 4) {
				cart = new EntityStockCar(world);
			}
			else if (rD == 5) {
				cart = new EntityBoxCartUS(world);
			}
			else if (rD == 6) {
				cart = new EntityFreightCartSmall(world);
			}
			else {
				cart = new EntityFreightWood2(world);
			}
			cart.setLocationAndAngles(j2 + 0.5D, k2, l2 + 0.5D, 90.0F, 0.0F);
			if (rD == 4) {
				cart.setSkin("Blue");
			}
			if (rD == 5) {
				cart.setSkin("Brown");
			}
			world.spawnEntity(cart);
			cart.entityData.putString("ownername","VillagerJoe");
		}

		return true;
	}

	/**
	 * Returns the villager type to spawn in this component, based on the number of villagers already spawned.
	 */
	@Override
	protected int getVillagerType(int par1) {
		return 86;
	}


	public void placeBlockAtCurrentPosition(World world, Block b, int meta, int x, int y, int z, StructureBoundingBox box) {

		IBlockState block1 = this.getBiomeSpecificBlockState(b.getStateFromMeta(meta));
		super.setBlockState(world, block1,x,y,z,box);
	}

}