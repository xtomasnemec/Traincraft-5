package train.common.mtc.packets;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class PacketMTCLevelUpdate implements IMessage {
    public int entity;
    public int level;


    public PacketMTCLevelUpdate() {}
    public PacketMTCLevelUpdate(int entity, int level) {

        this.entity = entity;
        this.level = level;
    }
    @Override
    public void fromBytes(ByteBuf buf) {
     entity = buf.readInt();
     level = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
    buf.writeInt(entity);
    buf.writeInt(level);
    }
}
