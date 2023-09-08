package ebf.tim.gui;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntitySeat;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.networking.PacketPaint;
import ebf.tim.networking.PacketSeatUpdate;
import ebf.tim.utility.ClientProxy;
import ebf.tim.utility.ClientUtil;
import ebf.tim.utility.CommonUtil;
import ebf.tim.utility.EventManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

import java.util.*;


/**
 * <h1>Transport GUI</h1>
 * used to draw the GUI for choosing a seat while in a piece of rollingstock (get here from a button in the normal UI).
 * @author broscolotos
 */
public class GUISeatManager extends GUIPaintBucket {

    public ArrayList<Integer> filledSeatIDs = new ArrayList<>();
    public EntitySeat currentSeat;
    public GUISeatManager(GenericRailTransport transport) {
        super(transport);
    }

    @Override
    public void initGui() {
        if(entity !=null && entity.getRiderOffsets().length > 0) {

        }
    }
    @Override
    public void updateScreen() {}

    public static int percentTop(int value){return (int)(guiTop*(value*0.01f));}
    public static int percentLeft(int value){return (int)(guiLeft*(value*0.01f));}

    @Override
    public void drawScreen(int parWidth, int parHeight, float p_73863_3_) {
        this.drawDefaultBackground();
        super.drawScreen(parWidth, parHeight, p_73863_3_);
        guiLeft=new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledWidth();
        guiTop=new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledHeight();

        if (entity.getRiderOffsets().length==0 || entity.getRiderOffsets() == null){
            return;
        }
        for(EntitySeat seat : entity.seats) {
            if (seat.getPassenger() != null) {
                if (seat.getPassenger() == Minecraft.getMinecraft().thePlayer) {
                    currentSeat = seat;
                }
                filledSeatIDs.add(seat.getEntityId());
            }
        }
        if(filledSeatIDs.size() == entity.seats.size()) { //remove after GUI is sorted out
            return;
        }
        switch(guiScreen) {
            case 0:{guiSeatManager();defineButtons();break;}
        }
    }
    @Override
    public boolean doesGuiPauseGame() {return false;}
    @Override
    public void defineButtons(){
        switch (guiScreen){
            case 0:{
                buttonList =new ArrayList();
                //this is for debugging. After its all sorted we will have a GUI with all of the seats laid out on a grid
                int column = 0;
                int activeRow = 0;
                for (int i=0;i<entity.getRiderOffsets().length; i++) {
                    if (percentTop(25)+(28*activeRow+1)>percentTop(60)) {
                        column++;
                        activeRow=0;
                    }

                    if (entity.seats.get(i).getPassenger() instanceof EntityPlayer) {
                        //mc.getTextureManager().bindTexture(((AbstractClientPlayer) entity.riddenByEntity).getLocationSkin());
                        buttonList.add(
                                new GUIButton(percentLeft(50)-240+(column*120), percentTop(25)+(28*activeRow+1), fontRendererObj.getStringWidth(entity.seats.get(i).getPassenger().getCommandSenderName())+7,20,entity.seats.get(i).getPassenger().getCommandSenderName()) {
                                    @Override
                                    public String getHoverText() {
                                        return "Seat is currently occupied";
                                    }
                                    @Override
                                    public void onClick() {}
                                    @Override
                                    public FontRenderer getFont(){return fontRendererObj;}
                                }
                        );
                    } else { //TODO: add an else if for things that aren't players. this becomes important for stuff like stock cars or putting villagers in player seats
                        buttonList.add(
                                new GUIButton( percentLeft(50)-240+(column*120), percentTop(25)+(28*activeRow+1), fontRendererObj.getStringWidth("Empty Seat")+6,20,"Empty Seat") {
                                    @Override
                                    public String getHoverText() {
                                        return "Seat is currently Empty";
                                    }
                                    @Override
                                    public void onClick() {
                                        /*int nextIndex = 0;
                                        if (entity.seats.indexOf(currentSeat) == 0) {
                                            nextIndex = entity.seats.size()-1;
                                        } else {
                                            nextIndex = entity.seats.indexOf(currentSeat)-1;
                                        }*/
                                        ;
                                        EntityLivingBase passenger = currentSeat.getPassenger();
/*                                        currentSeat.removePassenger(passenger);
                                        entity.seats.get(buttonList.indexOf(this)).addPassenger(passenger);
                                        currentSeat = entity.seats.get(buttonList.indexOf(this));*/
                                        TrainsInMotion.updateChannel.sendToServer(new PacketSeatUpdate(entity.getEntityId(),passenger.getEntityId(),entity.seats.indexOf(currentSeat),buttonList.indexOf(this)));
                                        //currentSeat = entity.seats.get(buttonList.indexOf(this));
                                        //TODO: need a way to tell the server that the player and previous EntitySeat need updated.

                                    }
                                    @Override
                                    public FontRenderer getFont(){return fontRendererObj;}
                                }
                        );
                    }
                    activeRow++;
                }
                break;
            }
        }
    }




    public void guiSeatManager(){
        mc.getTextureManager().bindTexture(ClientUtil.vanillaInventory);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glPushMatrix();
        int rows=0;
        //draw the character backgrounds.
        //make a loop that will make a new row every 5 items
        for (int i=0;i<entity.getRiderOffsets().length; i++) {
            if (i/(rows+1) >=5*(rows+1)){
                rows++;
            }
            ClientUtil.drawTexturedRect(guiLeft + 106 + (30*(i-(rows * 5))), guiTop + 30+(30*rows), 54, 51, 27, 27, 20, 20);
        }
        //make a new loop that does the same as above but binds the character's face rather than the inventory slot background.
        for (int i=0;i<entity.getRiderOffsets().length; i++) {
            if (i/(rows+1) >=5*(rows+1)){
                rows++;
            }
            if (i==0 && entity.riddenByEntity instanceof AbstractClientPlayer){
                mc.getTextureManager().bindTexture(((AbstractClientPlayer) entity.riddenByEntity).getLocationSkin());
                ClientUtil.drawTexturedRect(guiLeft + 108 + (30*(i-(rows * 5))), guiTop + 32+(30*rows), 30, 70, 23, 23, 36, 56);
            } else if (i>0 && entity.seats.get(i-1).riddenByEntity instanceof AbstractClientPlayer){
                mc.getTextureManager().bindTexture(((AbstractClientPlayer) entity.seats.get(i-1).riddenByEntity).getLocationSkin());
                ClientUtil.drawTexturedRect(guiLeft + 108 + (30*(i-(rows * 5))), guiTop + 32+(30*rows), 30, 70, 23, 23, 36, 56);
            }
        }
        GL11.glPopMatrix();
        GL11.glEnable(GL11.GL_LIGHTING);
    }
}
