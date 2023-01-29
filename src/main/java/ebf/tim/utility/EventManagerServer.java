package ebf.tim.utility;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import ebf.tim.entities.EntitySeat;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.registry.TiMGenericRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityStruckByLightningEvent;
import net.minecraftforge.event.entity.player.FillBucketEvent;

public class EventManagerServer {

    @SubscribeEvent
    @SuppressWarnings("unused")
    public void playerQuitEvent(PlayerEvent.PlayerLoggedOutEvent event){
        if (event.player.getRidingEntity() instanceof EntitySeat){
            event.player.dismountEntity(event.player.getRidingEntity());
        }
    }


    @SubscribeEvent
    @SuppressWarnings("unused")
    public void entityStruckByLightningEvent(EntityStruckByLightningEvent event) {
        if (event.getEntity() instanceof GenericRailTransport){
            event.setCanceled(true);
        }
    }

    /**
     * used to make vanilla buckets pickup custom fluids.
     * i think it only runs on client, which is a HORRIBLE and LAZY design by mojank, but oh well.
     * @see EventManager#onBucketFill(FillBucketEvent)
     * adding to server event manager anyway, just in case.
     * @param event
     */
    @SubscribeEvent
    @SuppressWarnings("unused")
    public void onBucketFillServer(FillBucketEvent event){
        Block b = CommonUtil.getBlockAt(event.world,event.target.blockX, event.target.blockY, event.target.blockZ);
        if(TiMGenericRegistry.fluidMap.get(b) !=null){
            event.result= new ItemStack(TiMGenericRegistry.fluidMap.get(b));
            event.setResult(Event.Result.ALLOW);
        }
    }

}
