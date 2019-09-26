package train.common.mtc.packets.handlers;


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import train.common.api.Locomotive;
import train.common.mtc.packets.PacketATO;

public class PacketATOHandler implements IMessageHandler<PacketATO, IMessage> {

   public IMessage onMessage(PacketATO message, MessageContext ctx) {
      Entity theTrain = Minecraft.getMinecraft().theWorld.getEntityByID(message.entity);
      if(theTrain instanceof Locomotive) {
         ((Locomotive)theTrain).atoStatus = message.status;
      }

      return null;
   }
}
