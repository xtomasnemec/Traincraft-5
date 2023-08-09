package ebf.tim.utility;

import ebf.tim.entities.EntitySeat;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.registry.TiMGenericRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityStruckByLightningEvent;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class EventManagerServer {

    @SubscribeEvent
    @SuppressWarnings("unused")
    public void playerQuitEvent(PlayerEvent.PlayerLoggedOutEvent event){
        if (event.player.getControllingPassenger() instanceof EntitySeat){
            event.player.dismountEntity(event.player.getControllingPassenger());
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
        if(event.getTarget()==null || event.getTarget().getBlockPos()==null){
            return;
        }
        Block b = CommonUtil.getBlockAt(event.getWorld(),event.getTarget().getBlockPos().getX(), event.getTarget().getBlockPos().getY(), event.getTarget().getBlockPos().getZ());
        if(TiMGenericRegistry.fluidMap.get(b) !=null){
            event.setFilledBucket(new ItemStack(TiMGenericRegistry.fluidMap.get(b)));
            event.setResult(Event.Result.ALLOW);
        }
    }

}
