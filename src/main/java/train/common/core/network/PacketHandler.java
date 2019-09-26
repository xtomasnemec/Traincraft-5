/*******************************************************************************
 * Copyright (c) 20getNetworkID()2 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.network;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import train.common.Traincraft;
import train.common.adminbook.ItemAdminBook;
import train.common.library.Info;
import train.common.mtc.packets.PacketATO;
import train.common.mtc.packets.PacketATODoSlowDown;
import train.common.mtc.packets.PacketATOSetStopPoint;
import train.common.mtc.packets.PacketDoAccel;
import train.common.mtc.packets.PacketGetSomethingFromServer;
import train.common.mtc.packets.PacketMTC;
import train.common.mtc.packets.PacketMTCLevelUpdate;
import train.common.mtc.packets.PacketNCSlowDown;
import train.common.mtc.packets.PacketNextSpeed;
import train.common.mtc.packets.PacketSetSpeed;
import train.common.mtc.packets.PacketThingFromServer;
import train.common.mtc.packets.handlers.PacketATODOSlowDownHandler;
import train.common.mtc.packets.handlers.PacketATODoAccelHandler;
import train.common.mtc.packets.handlers.PacketATOHandler;
import train.common.mtc.packets.handlers.PacketATOSetStopPointHandler;
import train.common.mtc.packets.handlers.PacketGetSomethingFromServerHandler;
import train.common.mtc.packets.handlers.PacketMTCLevelUpdateHandler;
import train.common.mtc.packets.handlers.PacketMTChandler;
import train.common.mtc.packets.handlers.PacketNCSlowDownHandler;
import train.common.mtc.packets.handlers.PacketNextSpeedHandler;
import train.common.mtc.packets.handlers.PacketSetSpeedHandler;
import train.common.mtc.packets.handlers.PacketThingFromServerHandler;

public class PacketHandler {

	public static void init(){
		Traincraft.tcLog.info("Initialize Packets");
		Traincraft.modChannel = NetworkRegistry.INSTANCE.newSimpleChannel(Info.channel);
		Traincraft.keyChannel = NetworkRegistry.INSTANCE.newSimpleChannel(Info.keyChannel);
		Traincraft.rotationChannel = NetworkRegistry.INSTANCE.newSimpleChannel(Info.rotationChannel);


		Traincraft.slotschannel = NetworkRegistry.INSTANCE.newSimpleChannel("slots");
		Traincraft.ignitionChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ignition");
		Traincraft.brakeChannel = NetworkRegistry.INSTANCE.newSimpleChannel("brake");
		Traincraft.lockChannel = NetworkRegistry.INSTANCE.newSimpleChannel("lock");
		Traincraft.builderChannel = NetworkRegistry.INSTANCE.newSimpleChannel("builder");



		Traincraft.keyChannel.registerMessage(ItemAdminBook.PacketAdminBook.Handler.class, ItemAdminBook.PacketAdminBook.class, 4, Side.CLIENT);
		Traincraft.keyChannel.registerMessage(ItemAdminBook.PacketAdminBookClient.Handler.class, ItemAdminBook.PacketAdminBookClient.class, 5, Side.SERVER);

		Traincraft.keyChannel.registerMessage(PacketKeyPress.Handler.class, PacketKeyPress.class, 1,
				Side.SERVER);
		Traincraft.rotationChannel.registerMessage(PacketRollingStockRotation.Handler.class,
				PacketRollingStockRotation.class, 2, Side.CLIENT);
		 Traincraft.modChannel.registerMessage(PacketSetJukeboxStreamingUrl.Handler.class,
				PacketSetJukeboxStreamingUrl.class, 1, Side.SERVER);
		Traincraft.slotschannel.registerMessage(PacketSlotsFilled.Handler.class, PacketSlotsFilled.class,
				3, Side.CLIENT);
		Traincraft.brakeChannel.registerMessage(PacketParkingBrake.Handler.class, PacketParkingBrake.class,
				4, Side.SERVER);
		Traincraft.lockChannel.registerMessage(PacketSetTrainLockedToClient.Handler.class,
				PacketSetTrainLockedToClient.class, 5, Side.SERVER);
		Traincraft.ignitionChannel.registerMessage(PacketSetLocoTurnedOn.Handler.class, PacketSetLocoTurnedOn.class,
				6, Side.SERVER);
		Traincraft.modChannel.registerMessage(PacketLantern.Handler.class, PacketLantern.class, 7,
				Side.SERVER);
		Traincraft.builderChannel.registerMessage(PacketTrackBuilderHeight.Handler.class,
				PacketTrackBuilderHeight.class, 8, Side.SERVER);
		Traincraft.builderChannel.registerMessage(PacketTrackBuilderFollow.Handler.class,
				PacketTrackBuilderFollow.class, 9, Side.SERVER);

		//Traincraft.degActivateChannel.registerMessage(PacketDEGActivate.Handler.class,
		//		PacketDEGActivate.class, 10, Side.SERVER);

		/*Traincraft.degActivateChannel.registerMessage(PacketDEGActivate.Handler.class,
				PacketDEGActivate.class, 10, Side.SERVER);*/

		Traincraft.updateTrainIDChannel.registerMessage(PacketUpdateTrainID.Handler.class, PacketUpdateTrainID.class, 11, Side.SERVER);
        Traincraft.updateDestinationChannel.registerMessage(PacketDestination.Handler.class, PacketDestination.class, 12, Side.SERVER);
		Traincraft.itsChannel.registerMessage(PacketSetSpeedHandler.class, PacketSetSpeed.class, 200, Side.CLIENT);
		Traincraft.itsChannel.registerMessage(PacketSetSpeedHandler.class, PacketSetSpeed.class, 212, Side.SERVER);

		Traincraft.itnsChannel.registerMessage(PacketNextSpeedHandler.class, PacketNextSpeed.class, 211, Side.CLIENT);
		Traincraft.mtlChannel.registerMessage(PacketMTCLevelUpdateHandler.class,  PacketMTCLevelUpdate.class, 201, Side.SERVER);
		Traincraft.msChannel.registerMessage(PacketMTChandler.class, PacketMTC.class, 202, Side.SERVER);
		Traincraft.mscChannel.registerMessage(PacketMTChandler.class, PacketMTC.class, 203, Side.CLIENT);
		Traincraft.atoChannel.registerMessage(PacketATOHandler.class, PacketATO.class, 205, Side.SERVER);
		Traincraft.atoDoSlowDownChannel.registerMessage(PacketATODOSlowDownHandler.class, PacketATODoSlowDown.class, 206, Side.SERVER);
		Traincraft.atoDoAccelChannel.registerMessage(PacketATODoAccelHandler.class, PacketDoAccel.class, 207, Side.SERVER);
		Traincraft.atoSetStopPoint.registerMessage(PacketATOSetStopPointHandler.class, PacketATOSetStopPoint.class, 208, Side.CLIENT);
		Traincraft.NCSlowDownChannel.registerMessage(PacketNCSlowDownHandler.class, PacketNCSlowDown.class, 209, Side.SERVER);
		//Traincraft.ctChannel.registerMessage(PacketWMTCChannelTransmitHandler.class, PacketWMTCChannelTransmit.class, 210, Side.CLIENT);
		Traincraft.gsfsChannel.registerMessage(PacketGetSomethingFromServerHandler.class, PacketGetSomethingFromServer.class, 213, Side.SERVER);
		Traincraft.gsfsrChannel.registerMessage(PacketThingFromServerHandler.class, PacketThingFromServer.class, 214, Side.CLIENT);
	}
}
