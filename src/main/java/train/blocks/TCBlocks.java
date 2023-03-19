/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.blocks;

import ebf.tim.TrainsInMotion;
import ebf.tim.blocks.BlockDynamic;
import ebf.tim.blocks.SimpleBlock;
import ebf.tim.registry.TiMBlocks;
import ebf.tim.registry.TiMItems;
import ebf.tim.registry.TiMOres;
import ebf.tim.utility.RecipeManager;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import train.Traincraft;
import train.blocks.bench.BlockTrainWorkbench;
import train.blocks.bridgepillar.BlockBridgePillar;
import train.blocks.distil.BlockDistil;
import train.blocks.generator.BlockGeneratorDiesel;
import train.blocks.hearth.BlockOpenHearthFurnace;
import train.blocks.lantern.BlockLantern;
import train.blocks.signal.BlockTCSignal;
import train.blocks.switchstand.BlockSwitchStand;
import train.blocks.waterwheel.BlockWaterWheel;
import train.blocks.windmill.BlockWindMill;
import train.library.Info;
import train.library.ItemIDs;

import static ebf.tim.registry.TiMGenericRegistry.registerBlock;

public class TCBlocks {
	public static BlockDynamic trainTableTier1 = new BlockDynamic(new Material(MapColor.WOOD),true);
	public static BlockDynamic trainTableTier2 = new BlockDynamic(new Material(MapColor.WOOD),true);
	public static BlockDynamic trainTableTier3 = new BlockDynamic(new Material(MapColor.WOOD),true);

	public static SimpleBlock oilSand;
	public static SimpleBlock orePetroleum;

	public static SimpleBlock blockBallast;

	public static BlockDistil blockDistil = new BlockDistil();
	public static BlockOpenHearthFurnace blockHearthFurnace = new BlockOpenHearthFurnace();

	public static BlockGeneratorDiesel dieselGenerator = new BlockGeneratorDiesel();
	public static BlockBridgePillar bridgePillar = new BlockBridgePillar();

	public static BlockLantern lantern = new BlockLantern();
	// NOTE: i dont think this one was supposed to exist, the render is extra broken,
	//     like it wouldn't have worked in the old 1.7 builds levels of broken.
	//public static BlockSignal signal = new BlockSignal();
	public static BlockTrainWorkbench partTable = new BlockTrainWorkbench();


	public static BlockWindMill windmill = new BlockWindMill();
	public static BlockWaterWheel waterWheel = new BlockWaterWheel();
	public static BlockSwitchStand highStarSwitch = new BlockSwitchStand();
	public static BlockTCSignal signal = new BlockTCSignal();


	@Deprecated //need to use TiMGenericRegistry.registerBlock(), this will also cover tile entities and TESR.
	public static void init() {
		trainTableTier1.setTextureName(Info.modID+ ":textures/blocks/assembly_1.png");
		trainTableTier2.setTextureName(Info.modID+ ":textures/blocks/assembly_2.png");
		trainTableTier3.setTextureName(Info.modID+ ":textures/blocks/assembly_3.png");

		blockBallast = new SimpleBlock(3.0F, 6.0F, "block.ballast", Info.modID + ":ballast_test");
		oilSand = new SimpleBlock(2.0F, 2.0F, "block.oilsand", Info.modID + ":ores/ore_oilsands");
		orePetroleum = new SimpleBlock(3.0F, 3.0F, "block.petroleum", Info.modID + ":ores/ore_petroleum");

		blockBallast.setCreativeTab(Traincraft.tcTab);
		orePetroleum.setCreativeTab(Traincraft.tcTab);
		oilSand.setCreativeTab(Traincraft.tcTab);
		blockBallast.setHarvestLevel("shovel", 2);
		oilSand.setHarvestLevel("shovel", 1);
		orePetroleum.setHarvestLevel("pickaxe", 1);


		blockDistil.setTextureName(Info.modID+ ":textures/blocks/distil_off.png");

		blockHearthFurnace.setTextureName(Info.modID+ ":textures/blocks/furnace_off.png");


		partTable.setTextureName(TrainsInMotion.MODID +":textures/blocks/train_table.png");


		GameRegistry.addShapedRecipe(new ResourceLocation(Info.modID,"traintabletier1"), new ResourceLocation(Info.modID, "crafters"),
				new ItemStack(registerBlock(trainTableTier1, Traincraft.tcTab, Info.modID,"block.traintabletier1", null, null),1),
				"IPI", "S S", "SPS", 'S', Blocks.STONE, 'I', Items.IRON_INGOT, 'P', Blocks.PISTON); //tier 1
		GameRegistry.addShapedRecipe(new ResourceLocation(Info.modID,"traintabletier2"), new ResourceLocation(Info.modID, "crafters"),
				new ItemStack(registerBlock(trainTableTier2, Traincraft.tcTab, Info.modID,"block.traintabletier2", null, null),1),
				"GPG", "O O", "OPO", 'O', Blocks.OBSIDIAN, 'G', Items.GOLD_INGOT, 'P', Blocks.PISTON); //tier 2
		GameRegistry.addShapedRecipe(new ResourceLocation(Info.modID,"traintabletier3"), new ResourceLocation(Info.modID, "crafters"),
				new ItemStack(registerBlock(trainTableTier3, Traincraft.tcTab, Info.modID,"block.traintabletier3", null, null),1),
				"GPG", "DLD", "OPO", 'O', Blocks.OBSIDIAN, 'G', Items.GOLD_INGOT, 'P', Blocks.PISTON, 'D', Items.DIAMOND, 'L', Blocks.GLOWSTONE); //tier 3
		GameRegistry.addShapedRecipe(new ResourceLocation(Info.modID,"parttable"), new ResourceLocation(Info.modID, "crafters"),
	new ItemStack(partTable), "IPI", "S S", "SPS", 'S', Blocks.STONE, 'I', Blocks.PLANKS, 'P', Blocks.PISTON); //part builder

		registerBlock(blockDistil, Traincraft.tcTab, Info.modID,"block.distil", null, null);

		registerBlock(blockHearthFurnace, Traincraft.tcTab, Info.modID,"block.hearthfurnace", null, null);

		registerBlock(partTable, Traincraft.tcTab, Info.modID,"block.parttable", null, null);

		registerBlock(signal, Traincraft.tcTab, Info.modID, "block.signal", null, TrainsInMotion.proxy.getRailTESR());

		registerBlock(highStarSwitch, Traincraft.tcTab, Info.modID, "block.highstar", null, TrainsInMotion.proxy.getRailTESR());

		if(TrainsInMotion.proxy.isClient()){
			registerBlock(dieselGenerator, Traincraft.tcTab, Info.modID, "block.dieselGenerator", null, new train.render.RenderGeneratorDiesel());
			registerBlock(bridgePillar, Traincraft.tcTab, Info.modID, "block.bridgePillar", null, new train.render.RenderBridgePillar());

			registerBlock(windmill, Traincraft.tcTab, Info.modID, "block.windmill", null, new train.render.RenderWindMill());
			registerBlock(waterWheel, Traincraft.tcTab, Info.modID, "block.waterwheel", null, new train.render.RenderWaterWheel());

			//registerBlock(signal, Traincraft.tcTab, Info.modID, "block.signal", null, new train.render.RenderSignal());
			registerBlock(lantern, Traincraft.tcTab, Info.modID, "block.lantern", null, new train.render.RenderLantern());
		} else {
			registerBlock(dieselGenerator, Traincraft.tcTab, Info.modID, "block.dieselGenerator", null, null);
			registerBlock(bridgePillar, Traincraft.tcTab, Info.modID, "block.bridgePillar", null, null);

			registerBlock(windmill, Traincraft.tcTab, Info.modID, "block.windmill", null, null);
			registerBlock(waterWheel, Traincraft.tcTab, Info.modID, "block.waterwheel", null, null);

			//registerBlock(signal, Traincraft.tcTab, Info.modID, "block.signal", null, null);
			registerBlock(lantern, Traincraft.tcTab, Info.modID, "block.lantern", null, null);
		}

		OreDictionary.registerOre("oreOilsands", new ItemStack(oilSand));
		OreDictionary.registerOre("orePetroleum", new ItemStack(orePetroleum));


		//OreDictionary.registerOre("dustCoal", new ItemStack(ItemIDs.coaldust.item));
		setHarvestLevels();

	}

	public static void setHarvestLevels() {
		Blocks.RAIL.setHarvestLevel("ItemStacked", 0);
		Blocks.DETECTOR_RAIL.setHarvestLevel("ItemStacked", 0);
		Blocks.GOLDEN_RAIL.setHarvestLevel("ItemStacked", 0);
	}

	public static void registerRecipes(){

		RecipeManager.registerRecipe(
				new Object[]{Blocks.NETHER_BRICK,Items.LAVA_BUCKET,Blocks.NETHER_BRICK,Blocks.NETHER_BRICK,Items.BUCKET,Blocks.NETHER_BRICK,Blocks.NETHER_BRICK,Blocks.IRON_BLOCK,Blocks.NETHER_BRICK},
				new ItemStack(blockHearthFurnace), TiMBlocks.trainTable);

		RecipeManager.registerRecipe(
				new Object[]{Items.IRON_INGOT,Items.IRON_INGOT,Items.IRON_INGOT,Blocks.GLASS_PANE,Blocks.TORCH,Blocks.GLASS_PANE,Items.IRON_INGOT,Items.IRON_INGOT,Items.IRON_INGOT},
				new ItemStack(lantern), TiMBlocks.trainTable);

		RecipeManager.registerRecipe(
				new Object[]{TiMOres.ingotSteel,TiMOres.ingotSteel,TiMOres.ingotSteel,TiMOres.ingotSteel, TiMItems.fireboxSteel,TiMOres.ingotSteel,TiMOres.ingotSteel,TiMOres.ingotSteel,TiMOres.ingotSteel},
				new ItemStack(blockDistil), TiMBlocks.trainTable);

		RecipeManager.registerRecipe(
				new Object[]{TiMItems.chimneySteel,null,null,TiMItems.mediumDieselEngine,TiMItems.steelPinCircuit,null,null,null,null},
				new ItemStack(dieselGenerator), TiMBlocks.trainTable);

		RecipeManager.registerRecipe(
				new Object[]{null, ItemIDs.propeller.item, null, null, TiMItems.generator, null, Items.IRON_INGOT,null, Items.IRON_INGOT},
				new ItemStack(windmill), TiMBlocks.trainTable);

		RecipeManager.registerRecipe(
				new Object[]{null, Blocks.LOG,null,Blocks.LOG,TiMItems.generator,Blocks.LOG,null,Blocks.LOG,null},
				new ItemStack(waterWheel), TiMBlocks.trainTable);

		RecipeManager.registerRecipe(new Object[]{Blocks.GRAVEL,Items.CLAY_BALL,Blocks.GRAVEL,null,null,null,null,null,null},
                new ItemStack(blockBallast), TiMBlocks.trainTable);

	}
}