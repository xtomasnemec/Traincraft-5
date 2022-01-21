package train.core.handlers;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import train.Traincraft;
import train.core.util.MP3Player;

public class ClientTickHandler {

	@SubscribeEvent
	public void tick(TickEvent event) {
		if(event.side != Side.CLIENT) {
			return;
		}
		if(event.phase == TickEvent.Phase.START) {
			if (Minecraft.getMinecraft().world == null) { // fixes streaming after exiting a world
				for (MP3Player player : Traincraft.proxy.playerList) {
					if (player != null) {
						player.stop();
					}
				}
				Traincraft.proxy.playerList.clear();
			}
		}
	}


}