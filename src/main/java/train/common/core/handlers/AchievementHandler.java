/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal & DV8FromTheWorld. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal & DV8FromTheWorld
 ******************************************************************************/

package train.common.core.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import train.common.library.AchievementIDs;
import train.common.library.BlockIDs;
import train.common.library.ItemIDs;

public class AchievementHandler {

	public static AchievementPage tmPage;

	private static Achievement achievement(String name, int column, int row, Block block, Achievement parent) {
		return achievement(name, column, row, new ItemStack(block), parent);
	}

	private static Achievement achievement(String name, int column, int row, Item item, Achievement parent) {
		return achievement(name, column, row, new ItemStack(item), parent);
	}

	private static Achievement achievement(String name, int column, int row, ItemStack stack, Achievement parent) {
		Achievement result = new Achievement("achievement.tc." + name, "tc:" + name, column, row, stack, parent);
		if(stack == null) {
			result.initIndependentStat();
		}
		return result.registerStat();
	}

	public static void load() {
		AchievementIDs.trainWB.achievement = achievement("trainWB", 0, 0, BlockIDs.trainWorkbench.block, null);
		AchievementIDs.woodenParts.achievement = achievement("woodenParts", -2, 2, ItemIDs.woodenBogie.item, AchievementIDs.trainWB.achievement);
		AchievementIDs.ironParts.achievement = achievement("ironParts", 0, 2, ItemIDs.ironBogie.item, AchievementIDs.trainWB.achievement);
		AchievementIDs.steelParts.achievement = achievement("steelParts", 2, 2, ItemIDs.bogie.item, AchievementIDs.trainWB.achievement);
		AchievementIDs.firebox.achievement = achievement("firebox", 0, 4, ItemIDs.firebox.item, AchievementIDs.ironParts.achievement);
		AchievementIDs.zeppelin.achievement = achievement("zeppelin", 2, 4, ItemIDs.airship.item, AchievementIDs.firebox.achievement);
		AchievementIDs.smallSteam.achievement = achievement("smallSteam", -2, 6, ItemIDs.minecartLoco3.item, AchievementIDs.firebox.achievement);
		AchievementIDs.normalSteam.achievement = achievement("normalSteam", 0, 6, ItemIDs.minecartPower.item, AchievementIDs.firebox.achievement);
		AchievementIDs.heavySteam.achievement = achievement("heavySteam", -2, 4, ItemIDs.minecartHeavySteam.item, AchievementIDs.firebox.achievement);

		AchievementIDs.openHearth.achievement = achievement("openHearth", -4, 0, BlockIDs.openFurnaceActive.block, null);
		AchievementIDs.steel.achievement = achievement("steel", -4, 2, ItemIDs.steel.item, AchievementIDs.openHearth.achievement);
		AchievementIDs.stake.achievement = achievement("stake", -6, 2, ItemIDs.stake.item, AchievementIDs.steel.achievement);
		AchievementIDs.dieselEngine.achievement = achievement("dieselEngine", -6, 4, ItemIDs.dieselengine.item, AchievementIDs.openHearth.achievement);
		AchievementIDs.diesel.achievement = achievement("dieselLoco", -5, 6, ItemIDs.minecartGP7Red.item, AchievementIDs.dieselEngine.achievement);
		AchievementIDs.cf7.achievement = achievement("cf7", -7, 6, ItemIDs.minecartCF7angle.item, AchievementIDs.dieselEngine.achievement).setSpecial();
		AchievementIDs.thanos.achievement = achievement("thanos", 10, 0, ItemIDs.minecartThanos.item, AchievementIDs.assemblyTable.achievement).setSpecial();
		AchievementIDs.sd9.achievement = achievement("sd9", -7, 8, ItemIDs.minecartSD9.item, AchievementIDs.dieselEngine.achievement);
		AchievementIDs.powerful.achievement = achievement("powerful", -5, 10, ItemIDs.minecartLocoDD35A.item, AchievementIDs.dieselEngine.achievement);
		AchievementIDs.gevo.achievement = achievement("gevo", -7, 10, ItemIDs.minecartES44.item, AchievementIDs.dieselEngine.achievement);
		AchievementIDs.switchin.achievement = achievement("switchin", -5, 8, ItemIDs.minecartSW1.item, AchievementIDs.dieselEngine.achievement);

		AchievementIDs.distilationTower.achievement = achievement("distilationTower", -10, 0, BlockIDs.distilActive.block,null);
		AchievementIDs.dieselFuel.achievement = achievement("dieselFuel", -8, 2, ItemIDs.diesel.item, AchievementIDs.distilationTower.achievement);
		AchievementIDs.refined.achievement = achievement("refined", -8, 4, ItemIDs.refinedFuel.item, AchievementIDs.diesel.achievement);
		AchievementIDs.plastic.achievement = achievement("plastic", -12, 2, ItemIDs.rawPlastic.item, AchievementIDs.distilationTower.achievement);
		AchievementIDs.fineCopperWire.achievement = achievement("fineCopperWire", -12, 4, ItemIDs.copperWireFine.item, AchievementIDs.plastic.achievement);
		AchievementIDs.electronicCircuit.achievement = achievement("electronicCircuit", -12, 6, ItemIDs.electronicCircuit.item, AchievementIDs.fineCopperWire.achievement);
		AchievementIDs.generator.achievement = achievement("generator", -14, 8, ItemIDs.generator.item, AchievementIDs.electronicCircuit.achievement);
		AchievementIDs.electMotor.achievement = achievement("electMotor", -10, 8, ItemIDs.electmotor.item, AchievementIDs.electronicCircuit.achievement);
		AchievementIDs.tram.achievement = achievement("tram", -11, 10, ItemIDs.minecartTramWood.item, AchievementIDs.electMotor.achievement);
		AchievementIDs.fast.achievement = achievement("fast", -9, 10, ItemIDs.minecartVL10.item, AchievementIDs.electMotor.achievement);

		AchievementIDs.engineer.achievement = achievement("engineer", -2, -2, ItemIDs.overalls.item, null);
		//AchievementIDs.mtg.achievement = achievement("mtg", -12,12 , ItemIDs.minecartLUengine.item, AchievementIDs.electMotor.achievement);
		//AchievementIDs.crossrail.achievement = achievement("crossrail",-12,14, ItemIDs.minecartClass345.item, AchievementIDs.mtg.achievement).setSpecial();

		AchievementIDs.assemblyTable.achievement = achievement("assemblyTable", 7, 0, BlockIDs.assemblyTableI.block, null);
		AchievementIDs.passenger.achievement = achievement("passenger", 6, 2, ItemIDs.minecartPassenger2.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.freight.achievement = achievement("freight", 8, 2, ItemIDs.minecartChest.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.liquid.achievement = achievement("liquid", 6, 4, ItemIDs.minecartWatertransp.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.tender.achievement = achievement("tender", 8, 4, ItemIDs.minecartTender.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.workCart.achievement = achievement("workCart", 6, 6, ItemIDs.minecartWork.item, AchievementIDs.assemblyTable.achievement).setSpecial();
		AchievementIDs.builder.achievement = achievement("builder", 8, 6, ItemIDs.minecartBuilder.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.jukebox.achievement = achievement("jukebox", 6, 8, ItemIDs.minecartJukeBoxCart.item,
				AchievementIDs.assemblyTable.achievement).setSpecial();
		AchievementIDs.minetrain.achievement = achievement("minetrain", 8, 8, ItemIDs.minecartMineTrain.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.cherepanov.achievement = achievement("cherepanov", 6, 10, ItemIDs.minecartLocoCherepanov.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.mail.achievement = achievement("mail", 8, 10, ItemIDs.minecartMailWagon_DB.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.stockCar.achievement = achievement("stockcar", 6, 12, ItemIDs.minecartStockCar.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.caboose.achievement = achievement("caboose", 8, 12, ItemIDs.minecartCabooseWork.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.flatCart.achievement = achievement("flatCart", 6, 14, ItemIDs.minecartFlatCartRail_DB.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.geared.achievement = achievement("geared", 2, 6, ItemIDs.minecartVBShay2.item, AchievementIDs.normalSteam.achievement);
		AchievementIDs.amfleet.achievement = achievement("amfleet", 4, 2, ItemIDs.minecartAmfleet.item, AchievementIDs.passenger.achievement);
		AchievementIDs.jenny.achievement = achievement("jenny", 10,  2, ItemIDs.minecartOreJenny.item, AchievementIDs.freight.achievement);
		AchievementIDs.powerful2.achievement = achievement("powerful2", -5,  12, ItemIDs.minecartGM6C.item, AchievementIDs.powerful.achievement);
		AchievementIDs.uboat.achievement = achievement("uboat", -7, 12, ItemIDs.minecartU18B.item, AchievementIDs.dieselEngine.achievement);
		AchievementIDs.polar.achievement = achievement("polar", -2, 8, ItemIDs.minecartPELocomotive.item, AchievementIDs.normalSteam.achievement).setSpecial();
		AchievementIDs.highcube.achievement = achievement("highcube", 8, 14, ItemIDs.minecart40highcube.item, AchievementIDs.assemblyTable.achievement);
		AchievementIDs.skook.achievement = achievement("skook", 2, 8, ItemIDs.minecartSkook.item, AchievementIDs.normalSteam.achievement);

		Achievement ach[] = new Achievement[] { AchievementIDs.steel.achievement, AchievementIDs.stake.achievement,
				AchievementIDs.dieselFuel.achievement, AchievementIDs.electMotor.achievement,
				AchievementIDs.dieselEngine.achievement, AchievementIDs.firebox.achievement,
				AchievementIDs.zeppelin.achievement, AchievementIDs.smallSteam.achievement,
				AchievementIDs.normalSteam.achievement, AchievementIDs.passenger.achievement,
				AchievementIDs.freight.achievement, AchievementIDs.liquid.achievement,
				AchievementIDs.tender.achievement, AchievementIDs.diesel.achievement, AchievementIDs.tram.achievement,
				AchievementIDs.fast.achievement, AchievementIDs.workCart.achievement,
				AchievementIDs.builder.achievement, AchievementIDs.openHearth.achievement,
				AchievementIDs.engineer.achievement, AchievementIDs.distilationTower.achievement,
				AchievementIDs.plastic.achievement, AchievementIDs.fineCopperWire.achievement,
				AchievementIDs.electronicCircuit.achievement, AchievementIDs.generator.achievement,
				AchievementIDs.woodenParts.achievement, AchievementIDs.ironParts.achievement,
				AchievementIDs.steelParts.achievement, AchievementIDs.trainWB.achievement,
				AchievementIDs.assemblyTable.achievement, AchievementIDs.mail.achievement,
				AchievementIDs.minetrain.achievement, AchievementIDs.cherepanov.achievement,
				AchievementIDs.flatCart.achievement, AchievementIDs.stockCar.achievement,
				AchievementIDs.caboose.achievement, /*AchievementIDs.mtg.achievement,
				AchievementIDs.crossrail.achievement,*/ AchievementIDs.heavySteam.achievement,
				AchievementIDs.jukebox.achievement, AchievementIDs.cf7.achievement, AchievementIDs.thanos.achievement,
				AchievementIDs.sd9.achievement, AchievementIDs.geared.achievement, AchievementIDs.powerful.achievement,
				AchievementIDs.gevo.achievement, AchievementIDs.switchin.achievement, AchievementIDs.jukebox.achievement,
				AchievementIDs.amfleet.achievement, AchievementIDs.jenny.achievement, AchievementIDs.powerful2.achievement,
				AchievementIDs.uboat.achievement, AchievementIDs.polar.achievement,
				AchievementIDs.highcube.achievement, AchievementIDs.refined.achievement, AchievementIDs.skook.achievement,
		};

		tmPage = new AchievementPage("TrainCraft", ach);

	}
}