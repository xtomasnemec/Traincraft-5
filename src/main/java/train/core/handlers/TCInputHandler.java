package train.core.handlers;

import ebf.tim.utility.ClientProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;
import train.Traincraft;
import train.core.network.PacketKeyPress;


public class TCInputHandler {
	public static KeyBinding up;
	public static KeyBinding down;
	public static KeyBinding idle;
	public static KeyBinding furnace;
	public TCInputHandler() {
		up = new KeyBinding("key.traincraft.zepp.up", Keyboard.KEY_Y, "key.categories.traincraft5");
		ClientRegistry.registerKeyBinding(up);
		down = new KeyBinding("key.traincraft.zepp.down", Keyboard.KEY_X, "key.categories.traincraft5");
		ClientRegistry.registerKeyBinding(down);
		idle = new KeyBinding("key.traincraft.zepp.idle", Keyboard.KEY_C, "key.categories.traincraft5");
		ClientRegistry.registerKeyBinding(idle);
		furnace = new KeyBinding("key.traincraft.zepp.furnace", Keyboard.KEY_F, "key.categories.traincraft5");
		ClientRegistry.registerKeyBinding(furnace);


	}

	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		if (!Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen()) {
			if (up.isPressed()) {
				sendKeyControlsPacket(0);
			}
			else if (down.isPressed()) {
				sendKeyControlsPacket(2);
			}
			else if (idle.isPressed()) {
				sendKeyControlsPacket(6);
			}
			else if (ClientProxy.KeyInventory.isPressed()) {
				sendKeyControlsPacket(7);
			}
			else if (furnace.isPressed()) {
				sendKeyControlsPacket(9);
			}
		}

		//if (FMLClientHandler.instance().getClient().gameSettings.keyBindSneak.isPressed() && Keyboard.isKeyDown(Keyboard.KEY_F3)) {
		//	sendKeyControlsPacket(404);
		//}
	}


	
	private static void sendKeyControlsPacket(int key)
	{
		Traincraft.keyChannel.sendToServer(new PacketKeyPress(key));
	}
}