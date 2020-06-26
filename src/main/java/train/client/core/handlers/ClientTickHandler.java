package train.client.core.handlers;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import train.common.Traincraft;
import train.common.core.util.MP3Player;
import train.common.library.Info;

public class ClientTickHandler {
	private static final Minecraft mc = Minecraft.getMinecraft();
	private static boolean isHidden = false;

	@SubscribeEvent
	public void tick(TickEvent event) {
		if(event.side != Side.CLIENT) {
			return;
		}
		switch(event.phase) {
			case START:
				tickStart(event);
				break;
			case END:
				break;
			default:
				break;
		}
	}

	private void tickStart(TickEvent event) {
		if (mc.theWorld == null) { // fixes streaming after exiting a world
			for (MP3Player player : Traincraft.proxy.playerList) if (player != null) player.stop();
			Traincraft.proxy.playerList.clear();
		}
		//i think 1.8+ handles this itself?
		/*if(mc.theWorld != null && mc.theWorld.playerEntities != null) {
			for (Object p: mc.theWorld.playerEntities) {
				AbstractClientPlayer player = (AbstractClientPlayer) p;
				CapesHelper user = CapesHelper.users.get(player.getDisplayName());
				if(user == null) {
					user = new CapesHelper(player.getDisplayName().getUnformattedText());
					CapesHelper.users.put(player.getDisplayName().getUnformattedText(), user);
					user.setDaemon(true);
					user.setName("Cape for " + player.getDisplayName());
					user.start();
				}else if(CapesHelper.isLoaded && user.MCCape) {
					// NOTE: func_152121_a = switchTexture
					//player.func_152121_a(MinecraftProfileTexture.Type.CAPE, user.getCurrentRL());
				}
			}
		}*/
		if(!isHidden && Loader.isModLoaded("NotEnoughItems")) {
			if(mc.theWorld != null && mc.theWorld.playerEntities != null) {
				Traincraft.proxy.doNEICheck(new ItemStack(Block.getBlockFromName(Info.modID + ":tcRail")));
				Traincraft.proxy.doNEICheck(new ItemStack(Block.getBlockFromName(Info.modID + ":tcRailGag")));
				isHidden = true;
			}
		}
	}

}