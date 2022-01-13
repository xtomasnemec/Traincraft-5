package ebf.tim.utility;

import ebf.tim.items.CustomItemModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.util.ClassInheritanceMultiMap;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.model.IModel;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.blocks.RailTileEntity;
import ebf.tim.entities.EntitySeat;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.networking.PacketInteract;
import fexcraft.tmt.slim.Tessellator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.world.ChunkEvent;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>event management</h1>
 * used to manage specific events that can't be predicted, like player key presses.
 * @author Eternal Blue Flame
 */
public class EventManager {

    private static List<GenericRailTransport> stock;
    private static GenericRailTransport selected=null, lastSelected=null;
    private static int holdTimer=0;
    /**
     * <h2>Keybind management</h2>
     * manages key pressed or released, since 1.7.10 has no direct support for key released we have to do it directly through LWJGL.
     * Most cases just send a packet to manage things
     * @see PacketInteract
     *
     * Credit to Ferdinand for help with this function.
     *
     * @param event the event of a key being pressed on client.
     */
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onClientKeyPress(InputEvent.KeyInputEvent event) {
        EntityPlayer player = Minecraft.getMinecraft().player;
        if (player.getRidingEntity() instanceof EntitySeat) {
            //for lamp
            if (ClientProxy.KeyLamp.isPressed()) {
                TrainsInMotion.keyChannel.sendToServer(new PacketInteract(0, ((EntitySeat) player.getRidingEntity()).parentId));
                ((GenericRailTransport) player.world.getEntityByID(((EntitySeat) player.getRidingEntity()).parentId)).setBoolean(GenericRailTransport.boolValues.LAMP, !((GenericRailTransport) player.getRidingEntity()).getBoolean(GenericRailTransport.boolValues.LAMP));
            }
            //for inventory
            if (ClientProxy.KeyInventory.isPressed()) {
                TrainsInMotion.keyChannel.sendToServer(new PacketInteract(1, ((EntitySeat) player.getRidingEntity()).parentId));
            }
            if (((EntitySeat) player.getRidingEntity()).isLocoSeat()) {
                //for speed change
                if (FMLClientHandler.instance().getClient().gameSettings.keyBindForward.isPressed()) {
                    //dont send if controls are TC mode
                    if (holdTimer<15 && ClientProxy.controls!=1){
                        TrainsInMotion.keyChannel.sendToServer(new PacketInteract(2, ((EntitySeat) player.getRidingEntity()).parentId));
                    }
                } else if (FMLClientHandler.instance().getClient().gameSettings.keyBindBack.isPressed()) {
                    //dont send if controls are TC mode
                    if (holdTimer<15 && ClientProxy.controls!=1){
                        TrainsInMotion.keyChannel.sendToServer(new PacketInteract(3, ((EntitySeat) player.getRidingEntity()).parentId));
                    }
                } else if (ClientProxy.KeyHorn.isPressed()){
                    TrainsInMotion.keyChannel.sendToServer(new PacketInteract(9, ((EntitySeat) player.getRidingEntity()).parentId));
                } else if (FMLClientHandler.instance().getClient().gameSettings.keyBindJump.isPressed()){
                    TrainsInMotion.keyChannel.sendToServer(new PacketInteract(16, ((EntitySeat) player.getRidingEntity()).parentId));
                }

                //manage key release events
                if (Keyboard.getEventKey() == FMLClientHandler.instance().getClient().gameSettings.keyBindJump.getKeyCode() && !Keyboard.getEventKeyState()){
                    TrainsInMotion.keyChannel.sendToServer(new PacketInteract(15, ((EntitySeat) player.getRidingEntity()).parentId));
                }
            }
        } else if(DebugUtil.dev()) {
            if (ClientProxy.raildevtoolUp.isPressed()){
                ClientProxy.devSplineModification[ClientProxy.devSplineCurrentPoint][0]+=0.0625;
                Minecraft.getMinecraft().player.sendMessage(new TextComponentString("current spline shape is " +
                        ClientProxy.devSplineModification[0][0] + "," + ClientProxy.devSplineModification[0][1] +"," + ClientProxy.devSplineModification[0][2] +" : " +
                        ClientProxy.devSplineModification[1][0] + "," + ClientProxy.devSplineModification[1][1] +"," + ClientProxy.devSplineModification[1][2] +" : " +
                        ClientProxy.devSplineModification[2][0] + "," + ClientProxy.devSplineModification[2][1] +"," + ClientProxy.devSplineModification[2][2] +" : " +
                        ClientProxy.devSplineModification[3][0] + "," + ClientProxy.devSplineModification[3][1] +"," + ClientProxy.devSplineModification[3][2]));
            } else if (ClientProxy.raildevtoolDown.isPressed()){
                ClientProxy.devSplineModification[ClientProxy.devSplineCurrentPoint][0]-=0.0625;
                Minecraft.getMinecraft().player.sendMessage(new TextComponentString("current spline shape is " +
                        ClientProxy.devSplineModification[0][0] + "," + ClientProxy.devSplineModification[0][1] +"," + ClientProxy.devSplineModification[0][2] +" : " +
                        ClientProxy.devSplineModification[1][0] + "," + ClientProxy.devSplineModification[1][1] +"," + ClientProxy.devSplineModification[1][2] +" : " +
                        ClientProxy.devSplineModification[2][0] + "," + ClientProxy.devSplineModification[2][1] +"," + ClientProxy.devSplineModification[2][2] +" : " +
                        ClientProxy.devSplineModification[3][0] + "," + ClientProxy.devSplineModification[3][1] +"," + ClientProxy.devSplineModification[3][2]));
            }
            if (ClientProxy.raildevtoolLeft.isPressed()){
                ClientProxy.devSplineModification[ClientProxy.devSplineCurrentPoint][2]+=0.0625;
                Minecraft.getMinecraft().player.sendMessage(new TextComponentString("current spline shape is " +
                        ClientProxy.devSplineModification[0][0] + "," + ClientProxy.devSplineModification[0][1] +"," + ClientProxy.devSplineModification[0][2] +" : " +
                        ClientProxy.devSplineModification[1][0] + "," + ClientProxy.devSplineModification[1][1] +"," + ClientProxy.devSplineModification[1][2] +" : " +
                        ClientProxy.devSplineModification[2][0] + "," + ClientProxy.devSplineModification[2][1] +"," + ClientProxy.devSplineModification[2][2] +" : " +
                        ClientProxy.devSplineModification[3][0] + "," + ClientProxy.devSplineModification[3][1] +"," + ClientProxy.devSplineModification[3][2]));
            } else if (ClientProxy.raildevtoolRight.isPressed()){
                ClientProxy.devSplineModification[ClientProxy.devSplineCurrentPoint][2]-=0.0625;
                Minecraft.getMinecraft().player.sendMessage(new TextComponentString("current spline shape is " +
                        ClientProxy.devSplineModification[0][0] + "," + ClientProxy.devSplineModification[0][1] +"," + ClientProxy.devSplineModification[0][2] +" : " +
                        ClientProxy.devSplineModification[1][0] + "," + ClientProxy.devSplineModification[1][1] +"," + ClientProxy.devSplineModification[1][2] +" : " +
                        ClientProxy.devSplineModification[2][0] + "," + ClientProxy.devSplineModification[2][1] +"," + ClientProxy.devSplineModification[2][2] +" : " +
                        ClientProxy.devSplineModification[3][0] + "," + ClientProxy.devSplineModification[3][1] +"," + ClientProxy.devSplineModification[3][2]));
            }
            if (ClientProxy.raildevtoolRaise.isPressed()){
                ClientProxy.devSplineModification[ClientProxy.devSplineCurrentPoint][1]+=0.0625;
                Minecraft.getMinecraft().player.sendMessage(new TextComponentString("current spline shape is " +
                        ClientProxy.devSplineModification[0][0] + "," + ClientProxy.devSplineModification[0][1] +"," + ClientProxy.devSplineModification[0][2] +" : " +
                        ClientProxy.devSplineModification[1][0] + "," + ClientProxy.devSplineModification[1][1] +"," + ClientProxy.devSplineModification[1][2] +" : " +
                        ClientProxy.devSplineModification[2][0] + "," + ClientProxy.devSplineModification[2][1] +"," + ClientProxy.devSplineModification[2][2] +" : " +
                        ClientProxy.devSplineModification[3][0] + "," + ClientProxy.devSplineModification[3][1] +"," + ClientProxy.devSplineModification[3][2]));
            } else if (ClientProxy.raildevtoolLower.isPressed()){
                ClientProxy.devSplineModification[ClientProxy.devSplineCurrentPoint][1]-=0.0625;
                Minecraft.getMinecraft().player.sendMessage(new TextComponentString("current spline shape is " +
                        ClientProxy.devSplineModification[0][0] + "," + ClientProxy.devSplineModification[0][1] +"," + ClientProxy.devSplineModification[0][2] +" : " +
                        ClientProxy.devSplineModification[1][0] + "," + ClientProxy.devSplineModification[1][1] +"," + ClientProxy.devSplineModification[1][2] +" : " +
                        ClientProxy.devSplineModification[2][0] + "," + ClientProxy.devSplineModification[2][1] +"," + ClientProxy.devSplineModification[2][2] +" : " +
                        ClientProxy.devSplineModification[3][0] + "," + ClientProxy.devSplineModification[3][1] +"," + ClientProxy.devSplineModification[3][2]));
            }

            if (ClientProxy.raildevtoolNextPoint.isPressed()){
                ClientProxy.devSplineCurrentPoint++;
                Minecraft.getMinecraft().player.sendMessage(new TextComponentString("current point is now " + ClientProxy.devSplineCurrentPoint));
            } else if (ClientProxy.raildevtoolLastPoint.isPressed()){
                ClientProxy.devSplineCurrentPoint--;
                if (ClientProxy.devSplineCurrentPoint<0){
                    ClientProxy.devSplineCurrentPoint = 0;
                }
                Minecraft.getMinecraft().player.sendMessage(new TextComponentString("current point is now " + ClientProxy.devSplineCurrentPoint));
            }
            if (ClientProxy.raildevtoolQuality.isPressed()){
                ClientProxy.railSkin++;
                if(ClientProxy.railSkin>3){
                    ClientProxy.railSkin=0;
                }
                Minecraft.getMinecraft().player.sendMessage(new TextComponentString("Displaying rail model " + ClientProxy.railSkin));

                for(Object te : Minecraft.getMinecraft().player.world.loadedTileEntityList){
                    if(te instanceof RailTileEntity){
                        ((RailTileEntity) te).railGLID=null;
                    }
                }
            }
        }
    }


    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    @SuppressWarnings("unused")
    public void onClientTick(TickEvent.PlayerTickEvent event) {
        if(event.player.getRidingEntity() instanceof EntityTrainCore){
            if (FMLClientHandler.instance().getClient().gameSettings.keyBindForward.isPressed()) {
                //for TC only controls, skip wait, for TiM only controls just stop.
                if(ClientProxy.controls==1 && holdTimer<40){
                    holdTimer=40;
                } else if (ClientProxy.controls==2){
                    return;
                }
                if (holdTimer==40){
                    TrainsInMotion.keyChannel.sendToServer(new PacketInteract(12, ((EntitySeat) event.player.getRidingEntity()).parentId));
                    holdTimer++;
                } else if (holdTimer<40){
                    holdTimer++;
                }
            } else if (FMLClientHandler.instance().getClient().gameSettings.keyBindBack.isPressed()) {
                //for TC only controls, skip wait, for TiM only controls just stop.
                if(ClientProxy.controls==1 && holdTimer<40){
                    holdTimer=40;
                } else if (ClientProxy.controls==2){
                    return;
                }

                if (holdTimer==40){
                    TrainsInMotion.keyChannel.sendToServer(new PacketInteract(11, ((EntitySeat) event.player.getRidingEntity()).parentId));
                    holdTimer++;
                } else if (holdTimer<40){
                    holdTimer++;
                }
            }
            else if(!FMLClientHandler.instance().getClient().gameSettings.keyBindBack.isPressed() &&
                    !FMLClientHandler.instance().getClient().gameSettings.keyBindForward.isPressed()){
                if (holdTimer>40){
                    if(ClientProxy.controls!=1) {
                        TrainsInMotion.keyChannel.sendToServer(new PacketInteract(4, ((EntitySeat) event.player.getRidingEntity()).parentId));
                    } else {
                        TrainsInMotion.keyChannel.sendToServer(new PacketInteract(14, ((EntitySeat) event.player.getRidingEntity()).parentId));
                    }
                }
                holdTimer=0;
            }
        }
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onClientKeyPress(InputEvent.MouseInputEvent event) {
        if (Mouse.isButtonDown(1) || Mouse.isButtonDown(0)) {
            if (selected != null) {
                (selected).interact(Minecraft.getMinecraft().player.getEntityId(), false, false, Mouse.isButtonDown(1) ? -1 : -999);
                //MinecraftForge.EVENT_BUS.post(new EntityInteractEvent(Minecraft.getMinecraft().player, selected));
            }
        }
    }

    private static void getTrainsInRange(Entity entity){
        stock=new ArrayList<>();
        List e = new ArrayList();
        for(int x=-1;x<=1;x++) {
            for(int z=-1;z<=1;z++) {
                for (ClassInheritanceMultiMap<Entity> l : entity.world.
                        getChunk(entity.chunkCoordX + x, entity.chunkCoordZ + z)
                        .getEntityLists()) {
                    e.addAll(l);
                }
            }
        }

        for (Object obj : e) {
            if (obj instanceof GenericRailTransport) {
                stock.add((GenericRailTransport) obj);
            }
        }
    }

    //we have to maintain a backup value during processing because the entire render tick is threaded.
    //otherwise while the value of selected is being changed it could cause several frames of the tooltip being missing.
    public static GenericRailTransport getSelected() {
        return selected==null?lastSelected:selected;
    }



    @SubscribeEvent
    public void unloadChunk(ChunkEvent.Unload e){
        /*for(List l: e.getChunk().entityLists){
            for(Object o:l){
                if(o instanceof GenericRailTransport){
                    for(ModelBase m: ((GenericRailTransport) o).renderData.modelList){
                        for(Integer i : m.displayList){
                            if(i!=null){
                                GL11.glDeleteLists(i,1);
                            }
                        }
                    }
                    ((GenericRailTransport) o).renderData.modelList=null;
                    ((GenericRailTransport) o).renderData.needsModelUpdate=true;
                }
            }

        }*/
        for (Object te:e.getChunk().getTileEntityMap().entrySet()){
            if(te instanceof RailTileEntity){
                GL11.glDeleteLists(((RailTileEntity) te).railGLID,1);
                ((RailTileEntity) te).railGLID=null;
            }
        }
    }


    @SubscribeEvent
    @SuppressWarnings("unused")
    public void onRenderTick(TickEvent.RenderTickEvent event) {
        if(event.side.isClient() && Minecraft.getMinecraft().currentScreen==null && getSelected()!=null){
            left=new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth()/2;
            disp=getStaticStrings(getSelected(), Minecraft.getMinecraft().player);
            longest=0;
            for(String s: disp){
                if(Minecraft.getMinecraft().fontRenderer.getStringWidth(s)>longest){
                    longest=Minecraft.getMinecraft().fontRenderer.getStringWidth(s);
                }
            }
            longest*=0.3;
            longest+=10;
            GL11.glPushMatrix();
            drawTooltipBox(left-(longest)-35, 2, 70+(longest*2), 8+(10*disp.length), ClientProxy.WAILA_BGCOLOR, ClientProxy.WAILA_GRADIENT1, ClientProxy.WAILA_GRADIENT2,100);

            GL11.glTranslatef(0.0F, 0.0F, 32.0F);
            if(getSelected()!=null && getSelected().getCartItem()!=null) {
                getItemRender().renderItemAndEffectIntoGUI(Minecraft.getMinecraft().player,
                        getSelected().getCartItem(), left - (longest) - 30, 12);
            }
            //GL11.glDisable(GL11.GL_LIGHTING);
            for(int ii=0; ii<disp.length;ii++) {
                Minecraft.getMinecraft().fontRenderer.drawString(disp[ii],
                        40+left-(longest*3)+ ((longest-disp[ii].length())*2), 8+(ii*10),ii==0?0xFFFFFFFF:ClientProxy.WAILA_FONTCOLOR);
            }
            //GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(GL11.GL_BLEND);
            //todo: draw an array of strings for the tooltip info, derrived from the transport's class.
            GL11.glPopMatrix();
        }
    }

    private static int left=0,longest;
    private static String[] disp;

    public static RenderItem getItemRender(){
        return Minecraft.getMinecraft().getRenderItem();
    }

    private static String[] getStaticStrings(GenericRailTransport t, EntityPlayer p){
        return new String[]{
                CommonUtil.translate(t.getName().replace(".storage","")+".name"),
                CommonUtil.translate("gui.owner") +": " + t.getOwnerName(),
                CommonUtil.translate("gui.skin")+": " + CommonUtil.translate(t.getTexture(p).name)
        };
    }




    public static void drawGradientRect(int x, int y, int w, int h, int grad1, int grad2, int alpha) {
        Tessellator.getInstance().startDrawing(GL11.GL_QUADS);
        GL11.glColor4ub((byte)((grad1 >> 16) & 0xFF), (byte)((grad1 >> 8) & 0xFF), (byte)(grad1 & 0xFF), (byte)((255f/100f)*alpha));
        Tessellator.getInstance().addVertex((x + w), y, 0f);
        Tessellator.getInstance().addVertex(x, y, 0f);
        GL11.glColor4ub((byte)((grad2 >> 16) & 0xFF), (byte)((grad2 >> 8) & 0xFF), (byte)(grad2 & 0xFF), (byte)((255f/100f)*alpha));
        Tessellator.getInstance().addVertex(x, (y + h), 0f);
        Tessellator.getInstance().addVertex((x + w), (y + h), 0f);
        Tessellator.getInstance().draw();
    }

    public static void drawTooltipBox(int x, int y, int w, int h, int bg, int grad1, int grad2, int alpha) {
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glShadeModel(GL11.GL_SMOOTH);
        drawGradientRect(x + 1, y, w - 1, 1, bg, bg,alpha);
        drawGradientRect(x + 1, y + h, w - 1, 1, bg, bg,alpha);
        drawGradientRect(x + 1, y + 1, w - 1, h - 1, bg, bg,alpha);
        drawGradientRect(x, y + 1, 1, h - 1, bg, bg,alpha);
        drawGradientRect(x + w, y + 1, 1, h - 1, bg, bg,alpha);
        drawGradientRect(x + 1, y + 2, 1, h - 3, grad1, grad2,alpha);
        drawGradientRect(x + w - 1, y + 2, 1, h - 3, grad1, grad2,alpha);
        drawGradientRect(x + 1, y + 1, w - 1, 1, grad1, grad1,alpha);
        drawGradientRect(x + 1, y + h - 1, w - 1, 1, grad2, grad2,alpha);
        GL11.glShadeModel(GL11.GL_FLAT);
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
    }

    /**
     * <h2>join world</h2>
     * This event is called when a player joins the world, we use this to display the alpha notice, and check for new mod versions, this is only displayed on the client side, but can be used for server..
     *
    @SubscribeEvent
    @SuppressWarnings("unused")
    public void entityJoinWorldEvent(EntityJoinWorldEvent event) {
    }*/

    @SubscribeEvent
    public static void onModelBakeEvent(ModelBakeEvent event) {
        for(ModelResourceLocation res :event.getModelRegistry().getKeys()){
            if(CustomItemModel.instance.accepts(new ResourceLocation(res.getNamespace(),res.getPath()))){
                try {
                    IModel model = CustomItemModel.instance.loadModel(res);
                    event.getModelRegistry().putObject(res,
                            model.bake(model.getDefaultState(), new VertexFormat(),null));
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
