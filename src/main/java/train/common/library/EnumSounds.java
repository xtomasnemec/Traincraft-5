package train.common.library;

import train.common.entity.rollingStock.EntityLocoDiesel44TonSwitcher;
import train.common.entity.rollingStock.EntityLocoDieselBamboo;
import train.common.entity.rollingStock.EntityLocoDieselCD742;
import train.common.entity.rollingStock.EntityLocoDieselChME3;
import train.common.entity.rollingStock.EntityLocoDieselClass66;
import train.common.entity.rollingStock.EntityLocoDieselDD35A;
import train.common.entity.rollingStock.EntityLocoDieselDeltic;
import train.common.entity.rollingStock.EntityLocoDieselEMDF3;
import train.common.entity.rollingStock.EntityLocoDieselEMDF7;
import train.common.entity.rollingStock.EntityLocoDieselFOLM1;
import train.common.entity.rollingStock.EntityLocoDieselGP7Red;
import train.common.entity.rollingStock.EntityLocoDieselIC4_DSB_MG;
import train.common.entity.rollingStock.EntityLocoDieselKof_DB;
import train.common.entity.rollingStock.EntityLocoDieselMILW_H1044;
import train.common.entity.rollingStock.EntityLocoDieselSD40;
import train.common.entity.rollingStock.EntityLocoDieselSD70;
import train.common.entity.rollingStock.EntityLocoDieselShunter;
import train.common.entity.rollingStock.EntityLocoDieselV60_DB;
import train.common.entity.rollingStock.EntityLocoDieselWLs40;
import train.common.entity.rollingStock.EntityLocoElectricBP4;
import train.common.entity.rollingStock.EntityLocoElectricBR185;
import train.common.entity.rollingStock.EntityLocoElectricBR_E69;
import train.common.entity.rollingStock.EntityLocoElectricCD151;
import train.common.entity.rollingStock.EntityLocoElectricClass85;
import train.common.entity.rollingStock.EntityLocoElectricE103;
import train.common.entity.rollingStock.EntityLocoElectricE10_DB;
import train.common.entity.rollingStock.EntityLocoElectricHighSpeedZeroED;
import train.common.entity.rollingStock.EntityLocoElectricICE1;
import train.common.entity.rollingStock.EntityLocoElectricMinetrain;
import train.common.entity.rollingStock.EntityLocoElectricNewHighSpeed;
import train.common.entity.rollingStock.EntityLocoElectricTramNY;
import train.common.entity.rollingStock.EntityLocoElectricTramWood;
import train.common.entity.rollingStock.EntityLocoElectricVL10;
import train.common.entity.rollingStock.EntityLocoSteam040VB;
import train.common.entity.rollingStock.EntityLocoSteam262T;
import train.common.entity.rollingStock.EntityLocoSteam4_4_0;
import train.common.entity.rollingStock.EntityLocoSteamAdler;
import train.common.entity.rollingStock.EntityLocoSteamAlcoSC4;
import train.common.entity.rollingStock.EntityLocoSteamAlice0_4_0;
import train.common.entity.rollingStock.EntityLocoSteamBR01_DB;
import train.common.entity.rollingStock.EntityLocoSteamBR80_DB;
import train.common.entity.rollingStock.EntityLocoSteamBerk1225;
import train.common.entity.rollingStock.EntityLocoSteamBerk765;
import train.common.entity.rollingStock.EntityLocoSteamC41;
import train.common.entity.rollingStock.EntityLocoSteamC41T;
import train.common.entity.rollingStock.EntityLocoSteamC41_080;
import train.common.entity.rollingStock.EntityLocoSteamC62Class;
import train.common.entity.rollingStock.EntityLocoSteamCherepanov;
import train.common.entity.rollingStock.EntityLocoSteamClimax;
import train.common.entity.rollingStock.EntityLocoSteamCoranationClass;
import train.common.entity.rollingStock.EntityLocoSteamD51;
import train.common.entity.rollingStock.EntityLocoSteamD51Long;
import train.common.entity.rollingStock.EntityLocoSteamEr_Ussr;
import train.common.entity.rollingStock.EntityLocoSteamForneyRed;
import train.common.entity.rollingStock.EntityLocoSteamFowler;
import train.common.entity.rollingStock.EntityLocoSteamGLYN042T;
import train.common.entity.rollingStock.EntityLocoSteamGS4;
import train.common.entity.rollingStock.EntityLocoSteamHallClass;
import train.common.entity.rollingStock.EntityLocoSteamHeavy;
import train.common.entity.rollingStock.EntityLocoSteamKingClass;
import train.common.entity.rollingStock.EntityLocoSteamLSSP7;
import train.common.entity.rollingStock.EntityLocoSteamMILWClassA;
import train.common.entity.rollingStock.EntityLocoSteamMallardA4;
import train.common.entity.rollingStock.EntityLocoSteamMogulBlue;
import train.common.entity.rollingStock.EntityLocoSteamPannier;
import train.common.entity.rollingStock.EntityLocoSteamShay;
import train.common.entity.rollingStock.EntityLocoSteamSmall;
import train.common.entity.rollingStock.EntityLocoSteamSnowPlow;
import train.common.entity.rollingStock.EntityLocoSteamSouthern1102;
import train.common.entity.rollingStock.EntityLocoSteamUSATCUK;
import train.common.entity.rollingStock.EntityLocoSteamUSATCUS;
import train.common.entity.rollingStock.EntityLocoSteamVBShay;

public enum EnumSounds {

	locoCherepanov(EntityLocoSteamCherepanov.class, "steam_horn", 0.6F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoHeavySteam(EntityLocoSteamHeavy.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteam(EntityLocoSteam4_4_0.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoA4(EntityLocoSteamMallardA4.class, "steam_horn", 0.6F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamBig(EntityLocoSteamHeavy.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamBR01_DB(EntityLocoSteamBR01_DB.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamBR80_DB(EntityLocoSteamBR80_DB.class, "german_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamEr_USSR(EntityLocoSteamEr_Ussr.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamPannier(EntityLocoSteamPannier.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamC41(EntityLocoSteamC41.class, "american_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamC41080(EntityLocoSteamC41_080.class, "american_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamfowler(EntityLocoSteamFowler.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamberk765(EntityLocoSteamBerk765.class, "class62_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamberk1225(EntityLocoSteamBerk1225.class, "class62_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamAlcoSC4(EntityLocoSteamAlcoSC4.class, "american_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamS100UK(EntityLocoSteamUSATCUK.class, "german_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamS100US(EntityLocoSteamUSATCUS.class, "american_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamHallClass(EntityLocoSteamHallClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamKingClass(EntityLocoSteamKingClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamSouthern1102(EntityLocoSteamSouthern1102.class, "american_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamC41T(EntityLocoSteamC41T.class, "american_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamForney(EntityLocoSteamForneyRed.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamMogul(EntityLocoSteamMogulBlue.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamSmall(EntityLocoSteamSmall.class, "steam_horn", 0.5F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamShay(EntityLocoSteamShay.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamClass62(EntityLocoSteamC62Class.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamD51S(EntityLocoSteamD51.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamD51L(EntityLocoSteamD51Long.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamSnowPlow(EntityLocoSteamSnowPlow.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamAdler(EntityLocoSteamAdler.class, "adler_whistle", 0.8F, "adler_run", 0.2F, 20, "adler_run", 0.2F, 20,
			true),
	GS4(EntityLocoSteamGS4.class, "american_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	MILWClassA(EntityLocoSteamMILWClassA.class, "american_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoAlice(EntityLocoSteamAlice0_4_0.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20,
			true),
	locoGLYN(EntityLocoSteamGLYN042T.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20,
			true),
	locovb(EntityLocoSteam040VB.class, "adler_whistle", 0.8F, "adler_run", 0.2F, 20, "adler_run", 0.2F, 20, true),
	locosvbShay(EntityLocoSteamVBShay.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	loco262T(EntityLocoSteam262T.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoClimax(EntityLocoSteamClimax.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoCoranationClass(EntityLocoSteamCoranationClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run",
			0.4F, 20, true),

	locoVL10(EntityLocoElectricVL10.class, "vl10_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoBR_E69(EntityLocoElectricBR_E69.class, "eu07_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoMineTrain(EntityLocoElectricMinetrain.class, "tram_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoHighSpeed(EntityLocoElectricHighSpeedZeroED.class, "high_speed_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoSubwayNY(EntityLocoElectricTramNY.class, "subway_horn", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoTramWood(EntityLocoElectricTramWood.class, "tram_horn", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoIC4_DSB_MG(EntityLocoDieselIC4_DSB_MG.class, "mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	locoSpeedGrey(EntityLocoElectricNewHighSpeed.class, "high_speed_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	ICE1(EntityLocoElectricICE1.class, "mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	E10(EntityLocoElectricE10_DB.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	locoBR185(EntityLocoElectricBR185.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	locoClass85(EntityLocoElectricClass85.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),

	locoCD742(EntityLocoDieselCD742.class, "742_horn", 0.8F, "742_motor_slow", 0.65F, 40, "742_motor", 0.65F, 40,
			false),
	locoChME3(EntityLocoDieselChME3.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoGP7Red(EntityLocoDieselGP7Red.class, "gp_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoBP4(EntityLocoElectricBP4.class, "gp_horn", 0.8F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	locoFOLM1(EntityLocoDieselFOLM1.class, "gp_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoKof_DB(EntityLocoDieselKof_DB.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoSD40(EntityLocoDieselSD40.class, "gp_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoWLs40(EntityLocoDieselWLs40.class, "vl10_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoBamboo(EntityLocoDieselBamboo.class, "gp_horn", 0F, "chme3_idle", 0.2F, 40, "chme3_idle", 0.1F, 40, false),
	locoSD70(EntityLocoDieselSD70.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDD35A(EntityLocoDieselDD35A.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoShunter(EntityLocoDieselShunter.class, "british_two_tone", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoV60_DB(EntityLocoDieselV60_DB.class, "v60_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	loco44tonSwitcher(EntityLocoDiesel44TonSwitcher.class, "v60_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoF7(EntityLocoDieselEMDF7.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoF3(EntityLocoDieselEMDF3.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	MILW_H1044(EntityLocoDieselMILW_H1044.class, "eu07_horn", 0.8F, "vl10_idle", 0.65F, 40, "vl10_idle", 0.65F, 40, false),
	locoDeltic(EntityLocoDieselDeltic.class, "british_two_tone", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40,
			false),
	locoClass66(EntityLocoDieselClass66.class, "british_two_tone", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40,
			false),
	locoCD151(EntityLocoElectricCD151.class,"mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	locoLSSP7(EntityLocoSteamLSSP7.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	E103(EntityLocoElectricE103.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false);

	private Class entityClass;
	private String horn;
	private float hornVolume;
	private String run;
	private String idle;
	private float runVolume;
	private float idleVolume;
	private int runSoundLenght;
	private int idleSoundLenght;
	private boolean soundChangeWithSpeed;

	/**
	 * Defines the sounds for the locomotives Many locomotives have the same sound for run and idle
	 * 
	 * @param entityClass
	 * @param horn
	 * @param hornVolume
	 * @param run
	 * @param runVolume
	 * @param runSoundLenght
	 * @param idle
	 * @param idleVolume
	 * @param idleSoundLenght
	 * @param soundChangeWithSpeed
	 */
	private EnumSounds(Class entityClass, String horn, float hornVolume, String run, float runVolume, int runSoundLenght, String idle, float idleVolume, int idleSoundLenght, boolean soundChangeWithSpeed) {
		this.entityClass = entityClass;
		this.horn = horn;
		this.hornVolume = hornVolume;
		this.run = run;
		this.idle = idle;
		this.runVolume = runVolume;
		this.idleVolume = idleVolume;
		this.runSoundLenght = runSoundLenght;
		this.idleSoundLenght = idleSoundLenght;
		this.soundChangeWithSpeed = soundChangeWithSpeed;
	}

	public Class getEntityClass() {
		return entityClass;
	}

	public String getHornString() {
		return horn;
	}

	public String getRunString() {
		return run;
	}

	public String getIdleString() {
		return idle;
	}

	public Float getHornVolume() {
		return hornVolume;
	}

	public Float getRunVolume() {
		return runVolume;
	}

	public Float getIdleVolume() {
		return idleVolume;
	}

	public int getRunSoundLenght() {
		return runSoundLenght;
	}

	public int getIdleSoundLenght() {
		return idleSoundLenght;
	}

	public boolean getSoundChangeWithSpeed() {
		return soundChangeWithSpeed;
	}
}
