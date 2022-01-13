package ebf.tim.utility;

import ebf.tim.entities.EntitySeat;
import ebf.tim.entities.GenericRailTransport;
import net.minecraftforge.event.entity.EntityStruckByLightningEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

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


}
