package train.common.generation;

import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieces;
import train.common.api.EntityRollingStock;
import train.common.core.util.TraincraftUtil;
import train.common.entity.rollingStock.*;
import train.common.library.BlockIDs;

import java.util.List;
import java.util.Random;

public class ComponentVillageTrainstation extends StructureVillagePieces.Village {

	private int averageGroundLevel = -1;

	public ComponentVillageTrainstation() {}
	
	public ComponentVillageTrainstation(StructureVillagePieces.Start par1ComponentVillageStartPiece, int par2, Random par3Random, StructureBoundingBox par4StructureBoundingBox, EnumFacing par5) {
		super(par1ComponentVillageStartPiece, par2);
		this.coordBaseMode = par5;
		this.boundingBox = par4StructureBoundingBox;
	}

	public static ComponentVillageTrainstation buildComponent(StructureVillagePieces.Start par0ComponentVillageStartPiece, List par1List, Random par2Random, int par3, int par4, int par5, EnumFacing par6, int par7) {
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
		this.fillWithBlocks(world, structureboundingbox, 1, 1, 1, 7, 5, 4, Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 0, 0, 8, 0, 5, Blocks.brick_block.getDefaultState(), Blocks.brick_block.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 5, 0, 8, 5, 5, Blocks.brick_block.getDefaultState(), Blocks.brick_block.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 6, 1, 8, 6, 4, Blocks.brick_block.getDefaultState(), Blocks.brick_block.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 7, 2, 8, 7, 3, Blocks.brick_block.getDefaultState(), Blocks.brick_block.getDefaultState(), false);
		int i = this.getMetadataWithOffset(Blocks.oak_stairs, 3);
		int j = this.getMetadataWithOffset(Blocks.oak_stairs, 2);
		int k;
		int l;

		for (k = -1; k <= 2; ++k) {
			for (l = 0; l <= 8; ++l) {
				this.setBlockState(world, Blocks.oak_stairs.getStateFromMeta(i), l, 6 + k, k, structureboundingbox);
				this.setBlockState(world, Blocks.oak_stairs.getStateFromMeta(j), l, 6 + k, 5 - k, structureboundingbox);
			}
		}

		this.fillWithBlocks(world, structureboundingbox, 0, 1, 0, 0, 1, 5, Blocks.brick_block.getDefaultState(), Blocks.brick_block.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 1, 1, 5, 8, 1, 5, Blocks.brick_block.getDefaultState(), Blocks.brick_block.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 8, 1, 0, 8, 1, 4, Blocks.brick_block.getDefaultState(), Blocks.brick_block.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 2, 1, 0, 7, 1, 0, Blocks.brick_block.getDefaultState(), Blocks.brick_block.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 2, 0, 0, 4, 0, Blocks.brick_block.getDefaultState(), Blocks.brick_block.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 2, 5, 0, 4, 5, Blocks.brick_block.getDefaultState(), Blocks.brick_block.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 8, 2, 5, 8, 4, 5, Blocks.brick_block.getDefaultState(), Blocks.brick_block.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 8, 2, 0, 8, 4, 0, Blocks.brick_block.getDefaultState(), Blocks.brick_block.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 2, 1, 0, 4, 4, Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 1, 2, 5, 7, 4, 5, Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 8, 2, 1, 8, 4, 4, Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 1, 2, 0, 7, 4, 0, Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), false);
		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 4, 2, 0, structureboundingbox);
		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 5, 2, 0, structureboundingbox);
		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 6, 2, 0, structureboundingbox);
		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 4, 3, 0, structureboundingbox);
		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 5, 3, 0, structureboundingbox);
		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 6, 3, 0, structureboundingbox);
		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 0, 2, 2, structureboundingbox);
		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 0, 2, 3, structureboundingbox);
		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 0, 3, 2, structureboundingbox);
		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 0, 3, 3, structureboundingbox);
		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 8, 2, 2, structureboundingbox);
		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 8, 2, 3, structureboundingbox);
		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 8, 3, 2, structureboundingbox);
		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 8, 3, 3, structureboundingbox);
		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 2, 3, 5, structureboundingbox);
		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 2, 2, 5, structureboundingbox);
		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 3, 2, 5, structureboundingbox);
		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 3, 3, 5, structureboundingbox);

		for (int z = 0; z < 9; z++) {
			this.setBlockState(world, Blocks.brick_block.getDefaultState(), z, 0, 6, structureboundingbox);
			this.setBlockState(world, Blocks.stone_slab.getStateFromMeta(4), z, 0, 7, structureboundingbox);
			this.setBlockState(world, Blocks.rail.getDefaultState(), z, 0, 8, structureboundingbox);
			this.setBlockState(world, Blocks.stonebrick.getDefaultState(), z, -1, 8, structureboundingbox);
		}
		this.setBlockState(world, Blocks.brick_block.getDefaultState(), 2, 0, 7, structureboundingbox);
		this.setBlockState(world, Blocks.oak_fence.getDefaultState(), 2, 1, 7, structureboundingbox);
		this.setBlockState(world, Blocks.oak_fence.getDefaultState(), 2, 2, 7, structureboundingbox);
		this.setBlockState(world, Blocks.oak_fence.getDefaultState(), 2, 3, 7, structureboundingbox);

		this.setBlockState(world, Blocks.brick_block.getDefaultState(),  6, 0, 7, structureboundingbox);
		this.setBlockState(world, Blocks.oak_fence.getDefaultState(), 6, 1, 7, structureboundingbox);
		this.setBlockState(world, Blocks.oak_fence.getDefaultState(), 6, 2, 7, structureboundingbox);
		this.setBlockState(world, Blocks.oak_fence.getDefaultState(), 6, 3, 7, structureboundingbox);
		this.fillWithBlocks(world, structureboundingbox, 1, 4, 7, 7, 4, 7, Blocks.wooden_slab.getDefaultState(), Blocks.wooden_slab.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 1, 4, 6, 7, 4, 6, Blocks.wooden_slab.getDefaultState(), Blocks.wooden_slab.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 1, 4, 8, 7, 4, 8, Blocks.wooden_slab.getDefaultState(), Blocks.wooden_slab.getDefaultState(), false);
		this.setBlockState(world, Blocks.oak_fence.getDefaultState(), 0, 1, 6, structureboundingbox);
		this.setBlockState(world, BlockIDs.lantern.block.getDefaultState(), 0, 2, 6, structureboundingbox);
		this.setBlockState(world, Blocks.oak_fence.getDefaultState(), 8, 1, 6, structureboundingbox);
		this.setBlockState(world, BlockIDs.lantern.block.getDefaultState(), 8, 2, 6, structureboundingbox);

		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 5, 2, 5, structureboundingbox);
		this.setBlockState(world, Blocks.glass_pane.getDefaultState(), 6, 2, 5, structureboundingbox);
		this.fillWithBlocks(world, structureboundingbox, 1, 4, 1, 7, 4, 1, Blocks.planks.getDefaultState(),Blocks.planks.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 1, 4, 4, 7, 4, 4, Blocks.planks.getDefaultState(),Blocks.planks.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 4, 3, 4, 7, 3, 4, Blocks.bookshelf.getDefaultState(), Blocks.bookshelf.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 5, 3, 5, 6, 3, 5, Blocks.glass_pane.getDefaultState(), Blocks.glass_pane.getDefaultState(), false);
		this.fillWithBlocks(world, structureboundingbox, 4, 3, 3, 7, 3, 3, Blocks.iron_bars.getDefaultState(), Blocks.iron_bars.getDefaultState(), false);
		this.setBlockState(world, BlockIDs.lantern.block.getDefaultState(), 7, 4, 3, structureboundingbox);
		this.setBlockState(world, BlockIDs.lantern.block.getDefaultState(), 4, 4, 3, structureboundingbox);

		this.setBlockState(world, Blocks.iron_bars.getDefaultState(), 4, 2, 3, structureboundingbox);
		this.fillWithBlocks(world, structureboundingbox, 4, 1, 3, 7, 1, 3, Blocks.iron_bars.getDefaultState(), Blocks.iron_bars.getDefaultState(), false);
		this.setBlockState(world, Blocks.planks.getDefaultState(), 7, 1, 3, structureboundingbox);
		this.setBlockState(world, Blocks.planks.getDefaultState(), 7, 1, 4, structureboundingbox);
		this.setBlockState(world, Blocks.planks.getDefaultState(), 4, 1, 3, structureboundingbox);
		this.setBlockState(world, Blocks.planks.getDefaultState(), 4, 1, 4, structureboundingbox);
		this.setBlockState(world, Blocks.iron_bars.getDefaultState(), 4, 2, 3, structureboundingbox);
		this.setBlockState(world, Blocks.iron_bars.getDefaultState(), 4, 2, 4, structureboundingbox);
		this.setBlockState(world, Blocks.iron_bars.getDefaultState(), 7, 2, 3, structureboundingbox);
		this.setBlockState(world, Blocks.iron_bars.getDefaultState(), 7, 2, 4, structureboundingbox);
		this.setBlockState(world, Blocks.planks.getDefaultState(), 1, 1, 4, structureboundingbox);
		this.setBlockState(world, Blocks.oak_stairs.getStateFromMeta(this.getMetadataWithOffset(Blocks.oak_stairs, 1)), 1, 1, 3, structureboundingbox);
		k = this.getMetadataWithOffset(Blocks.oak_stairs, 3);
		this.setBlockState(world, Blocks.oak_stairs.getStateFromMeta(k), 3, 1, 4, structureboundingbox);
		this.setBlockState(world, Blocks.oak_stairs.getStateFromMeta(k), 2, 1, 4, structureboundingbox);
		this.setBlockState(world, Blocks.oak_fence.getDefaultState(), 2, 1, 3, structureboundingbox);
		this.setBlockState(world, Blocks.wooden_pressure_plate.getDefaultState(), 2, 2, 3, structureboundingbox);
		this.setBlockState(world, BlockIDs.trainWorkbench.block.getDefaultState(), 7, 1, 1, structureboundingbox);
		this.setBlockState(world, Blocks.air.getDefaultState(),1, 1, 0, structureboundingbox);
		this.setBlockState(world, Blocks.air.getDefaultState(), 1, 2, 0, structureboundingbox);
		this.placeDoorCurrentPosition(world, structureboundingbox, random, 1, 1, 0, EnumFacing.getHorizontal(this.getMetadataWithOffset(Blocks.oak_door, 1)));

		if (this.getBlockStateFromPos(world, 1, 0, -1, structureboundingbox).getBlock() == Blocks.air && this.getBlockStateFromPos(world, 1, -1, -1, structureboundingbox).getBlock() != Blocks.air) {
			this.setBlockState(world, Blocks.stone_slab.getStateFromMeta(4), 1, 0, -1, structureboundingbox);
		}

		for (l = 0; l < 6; ++l) {
			for (int i1 = 0; i1 < 9; ++i1) {
				this.clearCurrentPositionBlocksUpwards(world, i1, 9, l, structureboundingbox);
				this.replaceAirAndLiquidDownwards(world, Blocks.brick_block.getDefaultState(), i1, -1, l, structureboundingbox);
			}
		}

		this.spawnVillagers(world, structureboundingbox, 6, 1, 4, 1);

		int j1 = this.getXWithOffset(6, 8);
		int k1 = this.getYWithOffset(1);
		int l1 = this.getZWithOffset(6, 8);

		if (structureboundingbox.isVecInside(new BlockPos(j1, k1, l1))) {
			int rD = random.nextInt(8);
			EntityRollingStock cart = new EntityCabooseLogging(world);
			if (rD == 0)
				cart = new EntityCaboose(world);
			if (rD == 1)
				cart = new EntityCaboose3(world);
			if (rD == 2)
				cart = new EntityFreightCart(world);
			if (rD == 3)
				cart = new EntityPassenger2(world);
			if (rD == 4)
				cart = new EntityStockCar(world);
			if (rD == 5)
				cart = new EntityBoxCartUS(world);
			if (rD == 6)
				cart = new EntityFreightCartSmall(world);

			cart.setLocationAndAngles(j1 + 0.5D, k1, l1 + 0.5D, 90.0F, 0.0F);
			cart.setTrainOwner("VillagerJoe");
			cart.shouldChunkLoad=false;
			if (rD == 4) {
				cart.setColor(TraincraftUtil.getByteFromColor("Blue"));
			}
			if (rD == 7) {
				cart.setColor(TraincraftUtil.getByteFromColor("Red"));
			}
			if (rD == 5) {
				cart.setColor(TraincraftUtil.getByteFromColor("Brown"));
			}
			world.spawnEntityInWorld(cart);
			cart.setInformation(cart.getTrainType(), "VillagerJoe", "VillagerJoe", cart.getCartItem().getItem().getItemStackDisplayName(cart.getCartItem()), -1);
		}
		int j2 = this.getXWithOffset(3, 8);
		int k2 = this.getYWithOffset(1);
		int l2 = this.getZWithOffset(3, 8);

		if (structureboundingbox.isVecInside(new BlockPos(j2, k2, l2))) {
			int rD = random.nextInt(8);
			EntityRollingStock cart = new EntityFreightWood2(world);
			if (rD == 0)
				cart = new EntityCaboose(world);
			if (rD == 1)
				cart = new EntityCaboose3(world);
			if (rD == 2)
				cart = new EntityFreightCart(world);
			if (rD == 3)
				cart = new EntityPassenger2(world);
			if (rD == 4)
				cart = new EntityStockCar(world);
			if (rD == 5)
				cart = new EntityBoxCartUS(world);
			if (rD == 6)
				cart = new EntityFreightCartSmall(world);
			cart.setLocationAndAngles(j2 + 0.5D, k2, l2 + 0.5D, 90.0F, 0.0F);
			cart.setTrainOwner("VillagerJoe");
			if (rD == 4) {
				cart.setColor(TraincraftUtil.getByteFromColor("Blue"));
			}
			if (rD == 5) {
				cart.setColor(TraincraftUtil.getByteFromColor("Brown"));
			}
			world.spawnEntityInWorld(cart);
		}

		return true;
	}

	/**
	 * Returns the villager type to spawn in this component, based on the number of villagers already spawned.
	 */
	//@Override
	//protected int getVillagerType(int par1) {
	//	return 86;
	//}
}