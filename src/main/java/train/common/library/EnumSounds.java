package train.common.library;

import com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash944CW;
import com.jcirmodelsquad.tcjcir.vehicles.locomotives.PCH120Commute;
import train.common.entity.rollingStock.*;

public enum EnumSounds {

	//TC Steam Stuff
	locoCherepanov(EntityLocoSteamCherepanov.class, "steam_horn", 0.6F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoHeavySteam(EntityLocoSteamHeavy.class, "hancock_3chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteam(EntityLocoSteam4_4_0.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoA4(EntityLocoSteamMallardA4.class, "a4_whistle", 0.6F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamBig(EntityLocoSteamHeavy.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamBR01_DB(EntityLocoSteamBR01_DB.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamBR80_DB(EntityLocoSteamBR80_DB.class, "german_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamEr_USSR(EntityLocoSteamEr_Ussr.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamPannier(EntityLocoSteamPannier.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamC41(EntityLocoSteamC41.class, "drgw_5chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamC41080(EntityLocoSteamC41_080.class, "drgw_5chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamfowler(EntityLocoSteamFowler.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamberk765(EntityLocoSteamBerk765.class, "765_whistle", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamberk1225(EntityLocoSteamBerk1225.class, "1225_whistle", 0.6F, "pe_run", 0.4F, 20, "pe_idle", 0.4F, 20, true),
	locoSteamAlcoSC4(EntityLocoSteamAlcoSC4.class, "ebt_5chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamS100UK(EntityLocoSteamUSATCUK.class, "german_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamS100US(EntityLocoSteamUSATCUS.class, "american_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamHallClass(EntityLocoSteamHallClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamKingClass(EntityLocoSteamKingClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamSouthern1102(EntityLocoSteamSouthern1102.class, "southern_3chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamC41T(EntityLocoSteamC41T.class, "drgw_3chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamForney(EntityLocoSteamForneyRed.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamMogul(EntityLocoSteamMogulBlue.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamSmall(EntityLocoSteamSmall.class, "steam_horn", 0.5F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamShay(EntityLocoSteamShay.class, "lukenhimer_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamClass62(EntityLocoSteamC62Class.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamD51S(EntityLocoSteamD51.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamD51L(EntityLocoSteamD51Long.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamSnowPlow(EntityLocoSteamSnowPlow.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamAdler(EntityLocoSteamAdler.class, "adler_whistle", 0.8F, "adler_run", 0.2F, 20, "adler_run", 0.2F, 20, true),
	locoSteamGS4(EntityLocoSteamGS4.class, "daylight_whistle", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamMILWClassA(EntityLocoSteamMILWClassA.class, "leslie_a125", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamAlice(EntityLocoSteamAlice0_4_0.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamGLYN(EntityLocoSteamGLYN042T.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamvb(EntityLocoSteam040VB.class, "adler_whistle", 0.8F, "adler_run", 0.2F, 20, "adler_run", 0.2F, 20, true),
	locoSteamvbShay(EntityLocoSteamVBShay.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteam262T(EntityLocoSteam262T.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamClimax(EntityLocoSteamClimax.class, "crosby_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	locoSteamCoranationClass(EntityLocoSteamCoranationClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamLSSP7(EntityLocoSteamLSSP7.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	//TC Electric Stuff
	locoElectricVL10(EntityLocoElectricVL10.class, "vl10_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoElectricBR_E69(EntityLocoElectricBR_E69.class, "eu07_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoElectricMineTrain(EntityLocoElectricMinetrain.class, "tram_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoElectricHighSpeed(EntityLocoElectricHighSpeedZeroED.class, "high_speed_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoElectricSubwayNY(EntityLocoElectricTramNY.class, "subway_horn", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoElectricTramWood(EntityLocoElectricTramWood.class, "tram_horn", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoElectricIC4_DSB_MG(EntityLocoDieselIC4_DSB_MG.class, "mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	locoElectricSpeedGrey(EntityLocoElectricNewHighSpeed.class, "high_speed_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	locoElectricICE1(EntityLocoElectricICE1.class, "mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	locoElectricE10(EntityLocoElectricE10_DB.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	locoElectricBR185(EntityLocoElectricBR185.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	locoElectricClass85(EntityLocoElectricClass85.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	locoElectricE103(EntityLocoElectricE103.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	LocoElectricBP4(EntityLocoElectricBP4.class, "nathan_k5la_3", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	//TC Diesel Stuff
	locoDieselFOLM1(EntityLocoDieselFOLM1.class, "nathan_p01235", 0.8F, "FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Idle", 0.65F, 40, false),
	locoDieselFOLM1B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFOLM1B.class, " ", 0.8F, "FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Idle", 0.65F, 40, false),
	locoDieselCD742(EntityLocoDieselCD742.class, "742_horn", 0.8F, "742_motor_slow", 0.65F, 40, "742_motor", 0.65F, 40, false),
	locoDieselChME3(EntityLocoDieselChME3.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselGP7Red(EntityLocoDieselGP7Red.class, "gp_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselKof_DB(EntityLocoDieselKof_DB.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselSD40(EntityLocoDieselSD40.class, "gp_horn", 0.8F, "EMD_16_645E3_Notch8", 0.65F, 40, "EMD_16_645E3_Idle", 0.65F, 40, false),
	locoDieselWLs40(EntityLocoDieselWLs40.class, "vl10_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselBamboo(EntityLocoDieselBamboo.class, "gp_horn", 0F, "chme3_idle", 0.2F, 40, "chme3_idle", 0.1F, 40, false),
	locoDieselSD70(EntityLocoDieselSD70.class, "sd70_horn", 0.8F, "EMD_16_710G3B_Notch8", 0.65F, 40, "EMD_16_710G3B_Idle", 0.65F, 40, false),
	locoDieselDD35A(EntityLocoDieselDD35A.class, "sd70_horn", 0.8F, "EMD_16_567D3A_Notch8", 0.65F, 40, "EMD_16_567D3A_Idle", 0.65F, 40, false),
	locoDieselShunter(EntityLocoDieselShunter.class, "br_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselV60_DB(EntityLocoDieselV60_DB.class, "v60_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDiesel44tonSwitcher(EntityLocoDiesel44TonSwitcher.class, "v60_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselF7(EntityLocoDieselEMDF7.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselF3(EntityLocoDieselEMDF3.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselDeltic(EntityLocoDieselDeltic.class, "br_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselClass66(EntityLocoDieselClass66.class, "br_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoDieselCD151(EntityLocoElectricCD151.class,"mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	//JCTC Content Starts Below
	//
	//JCTC Alco Diesels
	DieselC424(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC424.class, "leslie_s3", 2.5F, "ALCO_16_251C_Notch8", 0.5F, 20, "ALCO_16_251C_Idle", 0.5F, 20, false),
	DieselC425(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC425.class, "leslie_s3", 2.5F, "ALCO_16_251C_Notch8", 0.5F, 20, "ALCO_16_251C_Idle", 0.5F, 20, false),
	DieselC415H(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC415H.class, "nathan_p14r2", 0.65F, "ALCO_8_251F_Notch8", 0.65F, 10, "ALCO_8_251F_Idle", 0.8F, 3, true),
	DieselC415L(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC415L.class, "leslie_s3lr", 0.65F, "ALCO_8_251F_Notch8", 0.65F, 10, "ALCO_8_251F_Idle", 0.8F, 3, true),
	DieselC415S(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC415S.class, "leslie_s3lr", 0.65F, "ALCO_8_251F_Notch8", 0.65F, 10, "ALCO_8_251F_Idle", 0.8F, 3, true),
	DieselDH643(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDH643.class, "nathan_p3_3", 2.5F, "ALCO_12_251C_Notch8", 0.65F, 40, "ALCO_12_251C_Idle", 0.65F, 50, true),
	DieselHH600(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHH660.class,"leslie_a200", 2.5F, "ALCO_6_531_Notch8", 0.7F, 40, "ALCO_6_531_Notch8", 0.7F, 60, false ),
	DieselPA1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselPA1.class,"leslie_a200_2", 2.5F, "ALCO_16_244_Notch8", 1F, 8, "ALCO_16_244_Idle", 1F, 50, false ),
	DieselPB1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselPB1.class," ", 2.5F, "ALCO_16_244_Notch8", 1F, 8, "ALCO_16_244_Idle", 1F, 50, false ),
	DieselRSD15(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselRSD15.class,"leslie_rs5t", 2.5F, "ALCO_16_244_Notch8", 1F, 8, "ALCO_16_244_Idle", 1F, 50, false ),
	DieselS2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselS2.class, "leslie_a200", 1F, "ALCO_6_539T_Notch8", 0.50F, 40, "ALCO_6_539T_Idle", 0.65F, 40, true),
	//JCTC Baldwin Diesel
	DieselVO1000(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselVO1000.class,"wabco_e2", 2.5F, "Baldwin_8VO_Notch8", 1F, 8, "Baldwin_8VO_Idle", 1F, 50, false ),
	//JCTC EMD Diesels
	DieselBeep(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselBeep.class,"leslie_s3lr", 2.5F, "EMD_16_567BC_Idle", 0.7F, 40, "EMD_16_567BC_Notch8", 0.7F, 60, false ),
	DieselCF7angle(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7angle.class, "nathan_k3la", 0.65F, "EMD_16_567BC_Notch8", 0.65F, 10, "EMD_16_567BC_Idle", 0.8F, 3, true),
	DieselCF7round(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7round.class, "leslie_s3lr", 0.65F, "EMD_16_567BC_Notch8", 0.65F, 10, "EMD_16_567BC_Idle", 0.8F, 3, true),
	DieselCF7angle2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7angle2.class, "prime_920_2", 0.8F, "EMD_16_567BC_Notch8", 0.65F, 10, "EMD_16_567BC_Idle", 0.8F, 3, true),
	DieselF3A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF3A.class, "leslie_a200_3", 1F, "EMD_16_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true),
	DieselF7A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF7A.class, "leslie_a200_4", 1F, "EMD_16_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true),
	DieselF7B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF7B.class, "leslie_a200_2", 1F, "EMD_16_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true),
	DieselE8A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE8A.class, "leslie_a200_2", 1F, "EMD_12_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true),
	DieselE8B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE8B.class, " ", 1F, "EMD_12_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true),
	DieselE9A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE9A.class, "leslie_a200", 1F, "EMD_12_567C_Notch8", 0.45F, 15, "EMD_16_567C_Idle", 0.75F, 3, true),
	DieselE9B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE9B.class, " ", 1F, "EMD_12_567C_Notch8", 0.45F, 15, "EMD_16_567C_Idle", 0.75F, 3, true),
	DieselF40PH(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF40PH.class, "nathan_k5la_5", 1F, "EMD_16_645E3_Notch8", 0.9F, 8, "EMD_16_645E3_Notch3", 0.7F, 50, false),
	DieselF45(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF45.class,"leslie_s3", 2.5F, "EMD_20_645E3_Notch8", 1F, 8, "EMD_20_645E3_Idle", 1F, 50, false ),
	DieselFP45(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFP45.class,"leslie_rs5t", 2.5F, "EMD_20_645E3_Notch8", 1F, 8, "EMD_20_645E3_Idle", 1F, 50, false ),
	DieselGP7(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7.class, "nathan_m5_2", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false),
	DieselGP7old(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7old.class, "nathan_m5", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false),
	DieselGP7b(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7b.class, "leslie_a200", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false),
	DieselGP7u(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7u.class, "nathan_k3la_2", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false),
	DieselGP9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP9.class, "nathan_m3_3", 1F, "EMD_16_567C_Notch8", 0.9F, 8, "EMD_16_567C_Idle", 0.7F, 50, false),
	DieselGP9old(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP9old.class, "nathan_m3", 1F, "EMD_16_567C_Notch8", 0.9F, 8, "EMD_16_567C_Idle", 0.7F, 50, false),
	DieselGP13(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP13.class, "nathan_p6", 0.8F, "EMD_16_645E3_Notch8", 0.65F, 35, "EMD_16_645E3_Idle", 0.65F, 40, false),
	DieselGP15(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP15.class,"nathan_k3ha", 2.5F, "EMD_12_645E_Notch8", 1F, 8, "EMD_12_645E_Idle", 1F, 50, false ),
	DieselGP30(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP30.class, "nathan_p5", 0.8F, "EMD_16_567D3_Notch8", 0.65F, 35, "EMD_16_567D3_Idle", 0.65F, 40, false),
	DieselGP38(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP38.class, "nathan_k3la_3", 0.8F, "EMD_16_645E_Notch8", 0.55F, 35, "EMD_16_645E_Idle", 0.55F, 40, false),
	DieselGP38dash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP38dash2.class, "nathan_k3la_3", 0.8F, "EMD_16_645E_Notch8", 0.55F, 35, "EMD_16_645E_Idle", 0.55F, 40, false),
	DieselGP38H3(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP38H3.class, "nathan_k5la_5", 1F, "EMD_16_645E3_Notch8", 0.9F, 8, "EMD_16_645E3_Idle", 0.7F, 50, false),
	DieselGP39(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP39.class, "nathan_k3la_3", 0.8F, "EMD_12_645E3_Notch8", 0.55F, 35, "EMD_12_645E3_Idle", 0.55F, 40, false),
	DieselGP40(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP40.class, "nathan_k3la_3", 0.8F, "EMD_16_645E3_Notch8", 0.55F, 35, "EMD_16_645E3_Idle", 0.55F, 40, false),
	DieselGP40TC(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP40TC.class, "nathan_k5la_6", 1F, "EMD_16_645E3_Notch8", 0.9F, 8, "EMD_16_645E3_Idle", 0.7F, 50, false),
	DieselGP49(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP49.class, "nathan_p3_4", 0.8F, "EMD_16_645F3B_Idle", 0.55F, 35, "EMD_16_645E_Notch8", 0.55F, 40, false),
	DieselSD9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD9.class, "nathan_m3", 2.5F, "EMD_16_567C_Notch8", 0.45F, 10, "EMD_16_567C_Idle", 0.75F, 3, true),
	DieselSD40dash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40dash2.class, "leslie_rs3k", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.8F, 5, true),
	DieselSDP40P(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDP40.class, "leslie_rs3k", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.8F, 5, false),
	DieselSD40Tdash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40T2.class, "nathan_p3", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.8F, 5, true),
	DieselSD45dash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD45dash2.class, "leslie_rs5t", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.65F, 3, true),
	DieselSD45dash2B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD45dash2B.class, " ", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.65F, 3, false),
	DieselSD70M(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD70Mac.class, "nathan_k5la_4", 2F, "EMD_16_710G3B_Notch8", 0.5F, 40, "EMD_16_710G3B_Idle", 0.5F, 20, false),
	DieselSDL39(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDL39.class, "nathan_m3", 2F, "EMD_12_645E3_Notch8", 0.65F, 10, "EMD_12_645E3_Idle", 0.65F, 3, true),
	DieselSDP40F(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDP40F.class, "leslie_sl4t", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.8F, 5, false),
	DieselSW1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1.class, "leslie_a200", 0.9F, "EMD_6_567A_Notch8", 0.45F, 40, "EMD_6_567A_Idle", 0.75F, 40, false),
	DieselSW8(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW8.class, "nathan_p3_4", 0.9F, "EMD_12_567B_Notch8", 0.45F, 40, "EMD_12_567B_Idle", 0.75F, 40, false),
	DieselSW1200(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1200.class, "nathan_p3", 0.65F, "EMD_12_645E_Notch8", 0.65F, 10, "EMD_12_645E_Idle", 0.8F, 3, true),
	DieselSW1500(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1500.class, "nathan_p3", 0.65F, "EMD_12_645E_Notch8", 0.65F, 10, "EMD_12_645E_Idle", 0.8F, 3, true),
	//JCTC FM Diesels
	DieselH1044(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselH1044.class, "wabco_e2", 10F, "FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Notch8", 0.45F, 40, false),
	//JCTC GE Diesels
	Diesel25Ton(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGE25Ton.class, "wabco_e2", 10F, "GE_HBI_600_Notch8", 0.5F, 15, "GE_HBI_600_Idle", 0.5F, 25, false),
	Diesel44Ton(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGE44Ton.class, "hancock_airwhistle", 10F, "CAT_8_D17000_Notch8", 0.5F, 15, "CAT_8_D17000_Idle", 0.5F, 25, false),
	DieselB23(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselB23.class, "nathan_m3h", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, true),
	DieselB30(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselB30.class, "nathan_m5", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true),
	DieselBoxcab23Ton(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselBoxcab23Ton.class, "wabco_e2", 10F, "GE_HBI_600_Notch8", 0.5F, 15, "GE_HBI_600_Idle", 0.5F, 25, false),
	DieselDash840B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash840B.class, "leslie_s3l", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true),
	DieselDash840BB(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash840BB.class, " ", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true),
	DieselDash840BW(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash840BW.class, "leslie_s3l", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true),
	DieselDash840C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash840C.class, "leslie_s3lr", 2.5F, "GE_FDL16_Notch8", 0.5F, 10, "GE_FDL16_Idle", 0.5F, 3, true),
	DieselDash9C44W(DieselDash944CW.class, "nathan_k3la_4", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true),
	DieselES44(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselES44.class, "nathan_k5hll", 1F, "GE_GEVO_12_Notch8", 0.65F, 20, "GE_GEVO_12_Idle", 0.75F, 50, true),
	GeGenesis(com.jcirmodelsquad.tcjcir.vehicles.locomotives.GeGenesis.class, "nathan_k5la", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true),
	DieselSF30C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSF30C.class, "leslie_s3lr", 2.5F, "GE_FDL16_Notch8", 0.5F, 10, "GE_FDL16_Idle", 0.5F, 3, true),
	DieselU18B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU18B.class, "leslie_s3l", 2.5F, "GE_7FDL_8_Notch8", 0.25F, 40, "GE_7FDL_8_Idle", 0.35F, 50, true),
	DieselU18BB(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU18BB.class, " ", 2.5F, "GE_7FDL_8_Notch8", 0.25F, 40, "GE_7FDL_8_Idle", 0.35F, 50, true),
	DieselU18BW(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU18BW.class, "leslie_s5t_1", 2.5F, "GE_7FDL_8_Notch8", 0.25F, 40, "GE_7FDL_8_Idle", 0.35F, 50, true),
	DieselU23B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU23B.class, "leslie_s3l", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, true),
	DieselU30C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU30C.class, "leslie_s3lr", 2.5F, "GE_7FDL_16_Notch8", 0.5F, 10, "GE_7FDL_16_Idle", 0.5F, 3, true),
	DieselU36C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU36C.class, "leslie_s3lr", 2.5F, "GE_7FDL_16_Notch8", 0.5F, 10, "GE_7FDL_16_Idle", 0.5F, 3, true),
	//JCTC MOW Diesels
	DieselHighrailTruck(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHighrailTruck.class, "truck_horn", 0.8F, "GE_HBI_600_Notch8", 0.65F, 15, "GE_HBI_600_Idle", 0.65F, 25, true),
	DieselHighrailVan(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHighrailVan.class, "truck_horn", 0.8F, "GE_HBI_600_Notch8", 0.65F, 15, "GE_HBI_600_Idle", 0.65F, 25, true),
	//JCTC Misc Manufactures
	Diesel3GS21B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselNRE3gs21b.class,"nathan_k3ha", 2.5F, "QSK19C_Notch8", 0.50F, 40, "QSK19C_Idle", 1.0F, 60, false ),
	DieselKrautt(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselKrautt.class,"nathan_p3_3", 2.5F, "Maybach_MD870_16_Notch8", 1F, 8, "Maybach_MD870_16_Idle", 1F, 50, false ),
	//JCTC Fictional Diesels
	DieselFOLM1B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFOLM1B.class, "", 0.0F,"FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Idle", 0.65F, 40, false),
	DieselGP7f(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7f.class, "prime_920_4", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false),
	DieselGP389W(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP38dash9W.class, "nathan_k5la_5", 0.8F, "EMD_16_645E_Notch8", 0.55F, 35, "EMD_16_645E_Idle", 0.55F, 40, false),
	Dieselgtavthing(com.jcirmodelsquad.tcjcir.vehicles.locomotives.Dieselgtavthing.class,"leslie_s3l", 1F, "EMD_16_567D3_Notch8", 0.9F, 8, "EMD_16_567D3_Idle", 0.7F, 50, false ),
	DieselHustler(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHustler.class, "wabco3bell", 1F, "Plymouth_V8_Notch8", 0.9F, 8, "Plymouth_V8_Idle", 0.7F, 50, false),
	DieselILMC(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselILMC.class, "eu07_horn", 2.5F, "GE_HBI_600_Notch8", 0.65F, 40, "GE_HBI_600_Idle", 0.65F, 50, true),
	DieselMP15DCW9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselMP15DCW9.class,"leslie_rs3k_2", 2.5F, "EMD_12_645E_Notch8", 1F, 8, "EMD_12_645E_Idle", 1F, 50, false ),
	DieselSB23E(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSB23E.class, "leslie_s3l_2", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, true),
	DieselSB23R(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSB23R.class, "prime_920_3", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, true),
	//JCTC Electrics
	//
	//JCTC EMD Electrics
	ElectricGM6C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricGM6C.class, "leslie_s3l", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true),
	//JCTC ALCO Electrics
	ElectricEF1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricEF1.class, "wabco_e2", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true),
	ElectricEF1B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricEF1B.class, "leslie_s3l", 0, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true),
	ElectricEP1A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricEP1A.class, "wabco_e2", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true),
	//JCTC Fictional Electric
	ElectricILMA(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricILMA.class, "eu07_horn", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true),
	ElectricILMB(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricILMB.class, "eu07_horn", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true),
	ElectricJT7(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricJT7.class, "leslie_a200_3", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true),
	PCH100H(com.jcirmodelsquad.tcjcir.vehicles.locomotives.PCH100H.class, "nathan_p2", 1F, "pch100h_notch8", 0.6F, 8, "pch100h_idle", 0.4F, 50, false),
	PCH120Commute(PCH120Commute.class, "nathan_p2", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	TestControlCar(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.TestControlCar.class, "nathan_p2", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	//JCTC Foreign Electrics
	ElectricClass345(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricClass345.class, "br_horn", 1F, "mg_run", 0.9F, 8, "mg_idle", 0.7F, 50, false),
	ElectricLUEngine(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricLUengine.class, "lu_whistle", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	//JCTC Steam
	//
	//JCTC Baldwin Steam
	SteamSkook(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamSkook.class,"skookum_whistle", 1F, "skookum_notch8", 0.9F, 8, "skookum_idle", 0.7F, 50, false),
	//JCTC Logging
	SteamVBShay(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamVBShay2.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	Steam2TruckClimax(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamClimaxNew.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	Steam3TruckShay(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamShay3Truck.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	//JCTC Fictional Steam
	SteamPE(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamPELoco.class, "pe_whistle", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	SteamOnion(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamOnion.class, "hancock_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	//JCTC Foreign Steam
	SteamC11(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamC11.class, "jnr_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	//JCTC Meme Stuff
	BigMeme(com.jcirmodelsquad.tcjcir.vehicles.locomotives.BigMeme.class, "leslie_a425", 15, "aircompresser", 0.65F, 50, "aircompresser", 0.65F, 50, false),
	DieselHHGregg(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHHgregg.class,"hhgregg600horn", 2.5F, "hhgregg600_run", 1F, 287, "hhgregg600_idle", 1F, 287, false ),
	DieselTGVMobile(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselTGVmobile.class, "truck_horn", 1F, "GE_HBI_600_Notch8", 0.9F, 8, "GE_HBI_600_Idle", 0.7F, 50, false),
	Thanos(com.jcirmodelsquad.tcjcir.vehicles.locomotives.Thanos.class, "thanos_horn", 5, "thanos_run", 0.65F, 50, "thanos_idle", 0.65F, 50, false),

	;

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
