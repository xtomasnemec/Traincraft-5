package ebf.tim.utility;


import ebf.tim.blocks.TileEntityStorage;
import ebf.tim.entities.EntityBogie;
import ebf.tim.entities.EntitySeat;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.gui.*;
import ebf.tim.items.CustomItemModel;
import ebf.tim.items.ItemCraftGuide;
import ebf.tim.items.ItemPaintBucket;
import ebf.tim.render.RenderWagon;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;

/**
 * <h1>client proxy</h1>
 * defines some of the more important client-only functionality that runs on the main thread of the mod.
 * @author Eternal Blue Flame
 */
public class ClientProxy extends CommonProxy {

    public static double[][] devSplineModification = {{0,0,0},{0,0,0},{0,0,0},{0,0,0}};
    public static int devSplineCurrentPoint=0;
    /**Instance the event handler, This is used for event based functionality, things like when you right-click an entity.*/
    public static EventManager eventManager = new EventManager();

    /*
     * <h3>keybinds</h3>
     * Initialize the default values for keybinds.
     * Default values courtesy of Ferdinand
     */
    /**whether or not smoke and steam should be enabled*/
    public static boolean EnableParticles = true;
    /**whether or not animations should be enabled*/
    public static boolean EnableAnimations = true;
    /**whether or not to force texture binding*/
    public static boolean ForceTextureBinding = false;
    /**defines if the inventory graphics should be loaded from a TiM URI or if vanilla graphics should be used*/
    public static boolean useVanillaInventoryTextures = true;
    /**enables 3d items for trains and stock*/
    public static boolean hdTransportItems = true;
    /**enables pre-render of models*/
    public static boolean preRenderModels = false;
    /**the keybind for the lamp toggle*/
    public static KeyBinding KeyLamp;
    /**the keybind for the horn/whistle*/
    public static KeyBinding KeyHorn;
    /**the keybind for opening the inventory*/
    public static KeyBinding KeyInventory;
    /**the model to use for the rail*/
    public static int railSkin = 3;
    /**toggles whether to show speed in km/h or mph*/
    public static boolean speedInKmh = true;

    public static boolean disableCache = false;

    public static boolean debugHUD=false;
    /**Defines the control scheme used, auto is 0, TC is 1, TiM is 2.
     * for TiM releases this should be 0, for TC it should be 1*/
    public static int controls = 1;

    public static KeyBinding raildevtoolUp, raildevtoolDown,
            raildevtoolLeft, raildevtoolRight, raildevtoolRaise, raildevtoolLower;

    public static KeyBinding raildevtoolNextPoint, raildevtoolLastPoint;

    public static KeyBinding raildevtoolQuality;
    public static KeyBinding modeldevtoolReloadAll;

    /**
     * <h2> Client GUI Redirect </h2>
     *
     * Mostly a redirect between the event handler and the actual GUI
     *
     * defines the GUI element to display based on the ID
     * returns null if the player, cart or ID is invalid
     *
     * the inventory manager that server uses for this menu is defined in
     * @see CommonProxy#getServerGuiElement(int, EntityPlayer, World, int, int, int)
     */
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (player != null) {
            if(x==0&&y==0&&z==0 && player.getHeldItem(EnumHand.MAIN_HAND)!= ItemStack.EMPTY) {
                if (player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof ItemCraftGuide) {
                    return new GUICraftBook();
                } else if (player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof ItemPaintBucket){
                    return new GUIPaintBucket((GenericRailTransport) player.world.getEntityByID(ID));
                }
            }
            //Trains
            if (player.world.getEntityByID(ID) instanceof GenericRailTransport && !((GenericRailTransport) player.world.getEntityByID(ID)).hasCustomGUI()) {
                return new GUITransport(player.inventory, (GenericRailTransport) player.world.getEntityByID(ID));
                //tile entities
            } else if (player.world.getTileEntity(new BlockPos(x,y,z)) instanceof TileEntityStorage) {
                return new GUITrainTable(player.inventory, player.world, x, y, z);
            }
        }
        return null;
    }

    @Override
    public void adminGui(String datacsv){
        Minecraft.getMinecraft().displayGuiScreen(new GUIAdminBook(datacsv));
    };

    @Override
    public boolean isClient(){return true;}

    /**
     * <h2>Load config</h2>
     * this loads the config values that will only effect client.
     */
    @Override
    public void loadConfig(FMLPreInitializationEvent event){
        super.loadConfig(event);

        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();

        config.addCustomCategoryComment("Quality (Client only)", "");
        EnableParticles = config.getBoolean("EnableParticles","Quality (Client only)", true,
                "Smoke, steam, sparks, and lighting effects are several hundred more lightweight than those of normal minecraft. These shouldn't cause much lag if any, but its client only so if you wanna disable it you can.");


        EnableAnimations = config.getBoolean("EnableAnimations","Quality (Client only)", true,
                "Animations are calculated by vector positioning and rotation every frame. These shouldn't cause much lag if any, but its client only so if you wanna disable it you can.");

        hdTransportItems = config.getBoolean("3dTransportItems","Quality (Client only)", true,
                "Overrides the render of train and rollingstock items to use their full model. NOTICE: after the pre-alpha stages this should default to false.");



        config.addCustomCategoryComment("Customization (Client only)", "");
        railSkin = config.getInt("railSkin","Customization (Client only)", 3,0,3,
                "Defines the rail model to use. 0: flat 2D rail similar to vanilla. 1: basic 3D rail similar to an extruded 2D. 2: Normal 3D rail. 3: High detail 3D rail");

        speedInKmh = config.getBoolean("SpeedInKmh","Customization (Client only)", true,
                "Sets the HUD to show speeds in km/h. set to false for mph");

        useVanillaInventoryTextures = config.getBoolean("UseVanillaInventoryTextures","Customization (Client only)", true,
                "Overrides the render of train and rollingstock inventories to use textures from vanilla (including resourcepacks), so you can use textures in a texturepack specifically for this mod");

        controls = config.getInt("controls","Customization (Client only)", 1,0,2,
                "Defines the train controls, 1 is the old TC method (default), 2 is TiM's notch system that allows for control in 20% increments. 0 allows you to switch between them");



        config.addCustomCategoryComment("Debugging and Fixes (Client only)", "");
        debugHUD = config.getBoolean("debugHUD","Debugging and Fixes (Client only)", false,
                "displays additional information in the HUD, such as the train name, if it's running, and the state of the brake and lamp");

        preRenderModels = config.getBoolean("preRenderModels","Debugging and Fixes (Client only)", false,
                "Pre-renders transport entity and item models during loading screen and stores them on GPU, Requires a lot of VRAM but makes the game run smoother, especially with NEI/JEI, Don't use if get the GL error 1285 (Out of memory)");

        disableCache = config.getBoolean("disableGLCache","Debugging and Fixes (Client only)", false,
                "When true, forces the render to skip model caching, this will cause significant lag, but is good for debugging, or if you get the GL error 1285 (Out of memory)");

        ForceTextureBinding = config.getBoolean("ForceTextureBinding","Debugging and Fixes (Client only)", false,
                "Forces textures to be bound, slows performance on some machines, speeds it up on others, and fixes a rare bug where the the texture does not get bound. So... This REALLY depends on your machine, see what works best for you.");



        config.save();

        configDirectory = event.getModConfigurationDirectory().getAbsolutePath();

    }

    public static int WAILA_BGCOLOR = 1048592,WAILA_GRADIENT1 = 5243135,WAILA_GRADIENT2 = 2621567,WAILA_ALPHA = 0xEE,WAILA_FONTCOLOR=10526880;
    /**
     * <h2>Client Register</h2>
     * Used for registering client only functions and redirecting registering the items in the train registry with their own textures and models.
     */
    @Override
    public void register() {
        super.register();
        //bogies
        RenderingRegistry.registerEntityRenderingHandler(EntityBogie.class, nullRender);
        //seats
        RenderingRegistry.registerEntityRenderingHandler(EntitySeat.class, nullRender);
        //hitboxes
        RenderingRegistry.registerEntityRenderingHandler(CollisionBox.class, nullRender);
        //player scaler
        RenderingRegistry.registerEntityRenderingHandler(EntityPlayer.class, playerRender);

        //item render
        ModelLoaderRegistry.registerLoader(CustomItemModel.instance);


        //keybinds
        KeyHorn = new KeyBinding("Use Horn/Whistle", Keyboard.KEY_H, "Trains in Motion");
        ClientRegistry.registerKeyBinding(KeyHorn);
        KeyLamp = new KeyBinding("Lamp Toggle", Keyboard.KEY_L, "Trains in Motion");
        ClientRegistry.registerKeyBinding(KeyLamp);
        KeyInventory = new KeyBinding("Open Train/rollingstock GUI",  Keyboard.KEY_R, "Trains in Motion");
        ClientRegistry.registerKeyBinding(KeyInventory);

        if(DebugUtil.dev()) {
            raildevtoolUp = new KeyBinding("Move Point Z+", Keyboard.KEY_UP, "Trains in Motion Dev");
            raildevtoolDown = new KeyBinding("Move Point Z-", Keyboard.KEY_DOWN, "Trains in Motion Dev");
            raildevtoolLeft = new KeyBinding("Move Point X+", Keyboard.KEY_LEFT, "Trains in Motion Dev");
            raildevtoolRight = new KeyBinding("Move Point X-", Keyboard.KEY_RIGHT, "Trains in Motion Dev");
            raildevtoolRaise = new KeyBinding("Move Point Y+", Keyboard.KEY_PRIOR, "Trains in Motion Dev");
            raildevtoolLower = new KeyBinding("Move Point Y-", Keyboard.KEY_NEXT, "Trains in Motion Dev");

            raildevtoolNextPoint = new KeyBinding("Next Point", Keyboard.KEY_ADD, "Trains in Motion Dev");
            raildevtoolLastPoint = new KeyBinding("Previous Point", Keyboard.KEY_SUBTRACT, "Trains in Motion Dev");

            raildevtoolQuality = new KeyBinding("Track Model Quality", Keyboard.KEY_DIVIDE, "Trains in Motion Dev");

            modeldevtoolReloadAll = new KeyBinding("Entity Model Reload", Keyboard.KEY_APOSTROPHE, "Trains in Motion Dev");


            ClientRegistry.registerKeyBinding(raildevtoolUp);
            ClientRegistry.registerKeyBinding(raildevtoolDown);
            ClientRegistry.registerKeyBinding(raildevtoolLeft);
            ClientRegistry.registerKeyBinding(raildevtoolRight);
            ClientRegistry.registerKeyBinding(raildevtoolRaise);
            ClientRegistry.registerKeyBinding(raildevtoolLower);
            ClientRegistry.registerKeyBinding(raildevtoolNextPoint);
            ClientRegistry.registerKeyBinding(raildevtoolLastPoint);
            ClientRegistry.registerKeyBinding(raildevtoolQuality);
            ClientRegistry.registerKeyBinding(modeldevtoolReloadAll);
        }




        //register the transport HUD.
        HUDTrain hud = new HUDTrain();
        FMLCommonHandler.instance().bus().register(hud);
        MinecraftForge.EVENT_BUS.register(hud);

    }

    @Override
    public Object getTESR(){return specialRenderer;}

    @Override
    public net.minecraft.client.renderer.entity.Render getEntityRender(){return transportRenderer;}
    @Override
    public Object getNullRender(){return nullRender;}


    public static final TileEntitySpecialRenderer specialRenderer = new TileEntitySpecialRenderer() {
        @Override
        public void render(TileEntity tileEntity, double x, double y, double z, float p_147500_8_, int destroyStage, float alpha) {
            GL11.glPushMatrix();
            GL11.glTranslated(x,y, z);
            tileEntity.addInfoToCrashReport(null);
            GL11.glPopMatrix();
        }

        @Override
        protected void bindTexture(ResourceLocation p_147499_1_){}
    };


    private static RenderWagon transportRenderer=null;

    public static RenderWagon getTransportRenderer(){
        if(transportRenderer==null){
            transportRenderer=new RenderWagon(Minecraft.getMinecraft().getRenderManager());
        }
        return transportRenderer;
    }


    /**
     * <h3>null render</h3>
     * this is just a simple render that never draws anything, since its static it only ever needs to exist once, which makes it lighter on the render.
     */
    private static net.minecraft.client.renderer.entity.Render nullRender = new net.minecraft.client.renderer.entity.Render(null) {
        @Override
        public void doRender(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {}
        public void doRender(EntitySeat p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {}
        public void doRender(EntityBogie p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {}

        @Override
        protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
            return null;
        }

        @Override
        public boolean shouldRender(Entity livingEntity, ICamera camera, double camX, double camY, double camZ){return false;}

        public void doRenderShadowAndFire(Entity entityIn, double x, double y, double z, float yaw, float partialTicks) {}
    };

    private static net.minecraft.client.renderer.entity.Render<EntityPlayer> playerRender= new net.minecraft.client.renderer.entity.Render<EntityPlayer>(null){
        GenericRailTransport t;
        @Override
        public void doRender(EntityPlayer p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_){
            DebugUtil.println("RANDAR");
            if (p_76986_1_.getRidingEntity() instanceof EntitySeat){
                t=(GenericRailTransport) p_76986_1_.world.getEntityByID(((EntitySeat) p_76986_1_.getRidingEntity()).parentId);
                GL11.glPushMatrix();
                GL11.glScalef(t.getPlayerScale(), t.getPlayerScale(), t.getPlayerScale());
                if(p_76986_1_.getRidingEntity().getLookVec() !=null) {
                    GL11.glRotated(p_76986_1_.getRidingEntity().getLookVec().x, 0, 1, 0);
                    GL11.glRotated(p_76986_1_.getRidingEntity().getLookVec().y, 0, 0, 1);
                    GL11.glRotated(p_76986_1_.getRidingEntity().getLookVec().z, 1, 0, 0);
                }
                super.doRender(p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
                GL11.glPopMatrix();

            } else {
                super.doRender(p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
            }
        }
        @Nullable
        @Override
        protected ResourceLocation getEntityTexture(EntityPlayer entity) {
            return null;
        }
    };
}
