package ebf.tim.networking;

import ebf.tim.blocks.TileEntityStorage;
import ebf.tim.utility.DebugUtil;
import fexcraft.fcl.common.Static;
import io.netty.buffer.ByteBuf;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

/**
 * <h1>Mount packet</h1>
 * This is intended to be a replacement for
 * @see net.minecraft.network.play.client.C02PacketUseEntity
 * because for whatever reason, the stupid thing refuses to send for our entities.
 * @author Eternal Blue Flame
 */
public class PacketCraftingPage implements IMessage {
    /**the ID of the entity to dismount from*/
    private boolean key;
    private int x,y,z, dim;

    public PacketCraftingPage() {}
    public PacketCraftingPage(boolean key, int xCoord, int yCoord, int zCoord, int dimension) {
        this.key=key;
        x=xCoord;y=yCoord;z=zCoord;dim=dimension;

    }
    /**reads the packet on server to get the variables from the Byte Buffer*/
    @Override
    public void fromBytes(ByteBuf bbuf) {
        key = bbuf.readBoolean();
        dim= bbuf.readInt();
        x= bbuf.readInt();
        y= bbuf.readInt();
        z= bbuf.readInt();

        TileEntity te = Static.getServer().worlds[dim].getTileEntity(new BlockPos(x,y,z));

        DebugUtil.println(dim,x,y,z);
        if(te instanceof TileEntityStorage){
            if(key) {
                ((TileEntityStorage) te).incrementPage();
            } else {
                ((TileEntityStorage) te).decrementPage();
            }
        }
    }
    /**puts the variables into a Byte Buffer so they can be sent to server*/
    @Override
    public void toBytes(ByteBuf bbuf) {
        bbuf.writeBoolean(key);
        bbuf.writeInt(dim);
        bbuf.writeInt(x);
        bbuf.writeInt(y);
        bbuf.writeInt(z);
    }
}
