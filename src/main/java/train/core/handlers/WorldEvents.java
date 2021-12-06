package train.core.handlers;

import net.minecraft.entity.passive.EntityAnimal;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import train.entity.ai.EntityAIFearHorn;
import train.entity.rollingStock.EntityJukeBoxCart;

import java.util.Random;

public class WorldEvents{
	private int windTicker = 0;
	private static Random rand = new Random();
	public static int windStrength = 10 + rand.nextInt(10);

	@SubscribeEvent
	public void onWorldTick(TickEvent.WorldTickEvent handler){
		if(handler.world.isRemote){
			if(windTicker % 128 == 0){
				int upChance = 10;
				int downChance = 10;
				if (windStrength > 20) {
					upChance -= windStrength - 20;
				}
				else if (windStrength < 10) {
					downChance -= 10 - windStrength;
				}
				if (rand.nextInt(100) <= upChance) {
					windStrength += 1;
				}
				if (rand.nextInt(100) <= downChance) {
					windStrength -= 1;
				}
				windTicker=0;
			}
			windTicker++;
		}
	}

	
	@SubscribeEvent
	public void entitySpawn(EntityJoinWorldEvent event) {
		if(event.getEntity() instanceof EntityAnimal) {
			((EntityAnimal) event.getEntity()).tasks.addTask(0, new EntityAIFearHorn(((EntityAnimal) event.getEntity())));
		}
	}

	@SubscribeEvent
	public void chunkUnloadEvent(ChunkEvent.Unload event){
		for(Object o : event.getChunk().getEntityLists()){
			if (o instanceof EntityJukeBoxCart){
				((EntityJukeBoxCart) o).player.setVolume(0);
				((EntityJukeBoxCart) o).player.stop();
			}
		}
	}

}
