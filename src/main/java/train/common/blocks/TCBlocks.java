/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import train.common.Traincraft;
import train.common.library.BlockIDs;
import train.common.library.Info;
import train.common.mtc.BlockATOTransmitterStopPoint;
import train.common.mtc.BlockInfoGrabberDestination;
import train.common.mtc.BlockInfoGrabberMTC;
import train.common.mtc.BlockInfoTransmitterMTC;
import train.common.mtc.BlockInfoTransmitterSpeed;
import train.common.mtc.BlockPDMInstructionRadio;

public class TCBlocks {

	public static void init(Side s) {
		loadBlocks();
		registerBlocks(s);
		setHarvestLevels();
	}

	public static void loadBlocks() {
		BlockIDs.distilIdle.block = new BlockDistil(2, false).setHardness(3.5F).setStepSound(Block.soundTypeStone);
		BlockIDs.distilActive.block = new BlockDistil(2, true).setHardness(3.5F).setStepSound(Block.soundTypeStone).setLightLevel(0.8F);
		//BlockIDs.signal.block = new BlockSignal(BlockIDs.signal.blockID, 16).setHardness(1.7F).setStepSound(Block.soundTypeMetal);

		BlockIDs.assemblyTableI.block = new BlockAssemblyTableI(Material.wood).setHardness(3.5F).setStepSound(Block.soundTypeWood);
		BlockIDs.assemblyTableII.block = new BlockAssemblyTableII(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeWood);
		BlockIDs.assemblyTableIII.block = new BlockAssemblyTableIII(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeWood);

		BlockIDs.trainWorkbench.block = new BlockTrainWorkbench(16).setHardness(1.7F).setStepSound(Block.soundTypeWood);
		BlockIDs.stopper.block = new BlockStopper().setHardness(1.7F).setStepSound(Block.soundTypeWood);

		BlockIDs.openFurnaceIdle.block = new BlockOpenHearthFurnace(false).setHardness(3.5F).setStepSound(Block.soundTypeStone);
		BlockIDs.openFurnaceActive.block = new BlockOpenHearthFurnace(true).setHardness(3.5F).setStepSound(Block.soundTypeStone);
		BlockIDs.oreTC.block = new BlockOreTC().setHardness(3.0F).setResistance(5F).setStepSound(Block.soundTypeStone);

		BlockIDs.lantern.block = new BlockLantern().setHardness(1.7F).setStepSound(Block.soundTypeMetal).setLightLevel(0.98F);
		BlockIDs.switchStand.block = new BlockSwitchStand().setHardness(1.7F).setStepSound(Block.soundTypeMetal);
		BlockIDs.waterWheel.block = new BlockWaterWheel().setHardness(1.7F).setStepSound(Block.soundTypeWood);
		BlockIDs.windMill.block = new BlockWindMill().setHardness(1.7F).setStepSound(Block.soundTypeWood);
		BlockIDs.generatorDiesel.block = new BlockGeneratorDiesel().setHardness(1.7F).setStepSound(Block.soundTypeMetal);
		
		BlockIDs.tcRail.block = new BlockTCRail().setHardness(1.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(null);
		BlockIDs.tcRailGag.block = new BlockTCRailGag().setHardness(1.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(null);
		
		BlockIDs.bridgePillar.block = new BlockBridgePillar().setHardness(3.5F).setStepSound(Block.soundTypeWood);

		if (Loader.isModLoaded("ComputerCraft") || Loader.isModLoaded("OpenComputers")) {
			BlockIDs.mtcTransmitterSpeed.block = new BlockInfoTransmitterSpeed(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setUnlocalizedName("mtcspeedtransmitter").setCreativeTab(Traincraft.tcTab);
			BlockIDs.mtcTransmitterMTC.block = new BlockInfoTransmitterMTC(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setUnlocalizedName("mtcstatustransmitter").setCreativeTab(Traincraft.tcTab);
			BlockIDs.mtcATOStopTransmitter.block = new BlockATOTransmitterStopPoint(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setUnlocalizedName("mtcatostoppointtransmitter").setCreativeTab(Traincraft.tcTab);
			BlockIDs.mtcReceiverMTC.block = new BlockInfoGrabberMTC(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setUnlocalizedName("mtcstatusreceiver").setCreativeTab(Traincraft.tcTab);
			BlockIDs.mtcReceiverDestination.block = new BlockInfoGrabberDestination(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setUnlocalizedName("mtcdestinationreceiver").setCreativeTab(Traincraft.tcTab);
			BlockIDs.pdmInstructionBlock.block = new BlockPDMInstructionRadio(Material.rock).setHardness(3.5F).setStepSound(Block.soundTypeMetal).setUnlocalizedName("pdmradio").setCreativeTab(Traincraft.tcTab);
		}

		//BlockIDs.book.block = new BlockBook(BlockIDs.book.blockID);
	}

	public static void registerBlocks(Side side) {
		for (BlockIDs blocks : BlockIDs.values()) {
			if(blocks.block != null) {
				String lowercased = blocks.name().toLowerCase();
				blocks.block.setRegistryName(Info.modID, lowercased);
				blocks.block.setUnlocalizedName(Info.modID + ":" + lowercased);
				if (blocks.hasItemBlock) {
					GameRegistry.registerBlock(blocks.block, blocks.itemBlockClass, lowercased);
					if(side.isClient()) {
						regModel(Item.getItemFromBlock(blocks.block), lowercased);
					}
				} else {
					GameRegistry.registerBlock(blocks.block, lowercased);
					if(side.isClient()) {
						regModel(Item.getItemFromBlock(blocks.block), lowercased);
					}
				}
			}
		}
	}


	private static void regModel(Item item, String modelid){
		//TODO unfinished, I ran out of time
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new net.minecraft.client.resources.model.ModelResourceLocation("tc:"+modelid, "inventory"));
	}

	public static void setHarvestLevels() {
		BlockIDs.trainWorkbench.block.setHarvestLevel("axe", 0);
		BlockIDs.assemblyTableI.block.setHarvestLevel("axe", 0);
		BlockIDs.assemblyTableII.block.setHarvestLevel("axe", 0);
		BlockIDs.assemblyTableIII.block.setHarvestLevel("axe", 0);
		BlockIDs.waterWheel.block.setHarvestLevel("axe", 0);
		BlockIDs.windMill.block.setHarvestLevel("axe", 0);
		BlockIDs.bridgePillar.block.setHarvestLevel("axe", 0);
		BlockIDs.oreTC.block.setHarvestLevel("pickaxe", 1);

		Blocks.rail.setHarvestLevel("ItemStacked", 0);
		Blocks.detector_rail.setHarvestLevel("ItemStacked", 0);
		Blocks.golden_rail.setHarvestLevel("ItemStacked", 0);
	}
}