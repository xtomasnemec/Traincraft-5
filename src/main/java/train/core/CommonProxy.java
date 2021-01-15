package train.core;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import train.blocks.bench.ContainerTrainWorkbench;
import train.blocks.bench.TileTrainWbench;
import train.blocks.distil.ContainerDistil;
import train.blocks.distil.TileEntityDistil;
import train.blocks.generator.ContainerGeneratorDiesel;
import train.blocks.generator.TileGeneratorDiesel;
import train.blocks.hearth.ContainerOpenHearthFurnace;
import train.blocks.hearth.TileEntityOpenHearthFurnace;
import train.core.handlers.WorldEvents;
import train.core.util.MP3Player;
import train.entity.inventory.InventoryJukeBoxCart;
import train.entity.inventory.InventoryZepp;
import train.entity.rollingStock.EntityJukeBoxCart;
import train.entity.zeppelin.AbstractZeppelin;
import train.library.GuiIDs;

public class CommonProxy implements IGuiHandler {
	public static List<MP3Player> playerList = new ArrayList<MP3Player>();


	public void registerRenderInformation() {}

	public void registerEvents(FMLPreInitializationEvent event){
		registerEvent(new WorldEvents());

	}

	public void registerEvent(Object o){
		FMLCommonHandler.instance().bus().register(o);
		MinecraftForge.EVENT_BUS.register(o);
	}


	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity te = world.getTileEntity(new BlockPos(x, y, z));
		EntityPlayer riddenByEntity = null;
		Entity entity = player.getRidingEntity();

		if (player.getRidingEntity() != null) {
			riddenByEntity = (EntityPlayer) entity.getPassengers().get(0);
		}

		Entity entity1 = null;
		if (y == -1) {
			entity1 = getEntity(world, x);
		}

		switch (ID) {
		case (GuiIDs.DISTIL):
			return te instanceof TileEntityDistil ? new ContainerDistil(player.inventory, (TileEntityDistil) te) : null;
		case (GuiIDs.GENERATOR_DIESEL):
			return te instanceof TileGeneratorDiesel ? new ContainerGeneratorDiesel(player.inventory, (TileGeneratorDiesel) te) : null;
		case (GuiIDs.OPEN_HEARTH_FURNACE):
			return te instanceof TileEntityOpenHearthFurnace ? new ContainerOpenHearthFurnace(player.inventory, (TileEntityOpenHearthFurnace) te) : null;
		case (GuiIDs.TRAIN_WORKBENCH):
			return te instanceof TileTrainWbench ? new ContainerTrainWorkbench(player.inventory, (TileTrainWbench) te) : null;
		case (GuiIDs.ZEPPELIN):
			return riddenByEntity != null ? new InventoryZepp(player.inventory, (AbstractZeppelin) entity) : null;


			/* Stationary entities while player is not riding. */
		case (GuiIDs.JUKEBOX):
			return entity1 instanceof EntityJukeBoxCart ? new InventoryJukeBoxCart(player.inventory, (EntityJukeBoxCart) entity1) : null;
		default:
			return null;
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	public static Entity getEntity(World world, int entityId) {
		if ((world instanceof WorldServer)) {
			return world.getEntityByID(entityId);
		}
		return null;
	}

	public int addArmor(String armor) {
		return 0;
	}

    public void registerSounds() {}

	public Minecraft getMinecraft() {
		return null;
	}

	public void registerVillagerSkin(int villagerId, String textureName) {}

	public static void killAllStreams() {
		for (MP3Player p : playerList) {
			p.stop();
		}
	}

	public EntityPlayer getPlayer() {
		return null;
	}

	public float getJukeboxVolume() {
		return 0;
	}

	public void registerKeyBindingHandler() {}

	public void setHook() {}
	
}