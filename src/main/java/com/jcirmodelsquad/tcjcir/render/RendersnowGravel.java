package com.jcirmodelsquad.tcjcir.render;

import com.jcirmodelsquad.tcjcir.render.models.ModelsnowGravel;
import com.jcirmodelsquad.tcjcir.tile.TilesnowGravel;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;
import train.client.render.models.blocks.ModelBridgePillar;
import train.common.library.Info;
import train.common.tile.TileBridgePillar;

public class RendersnowGravel extends TileEntitySpecialRenderer {
    private static final ModelsnowGravel modelsnowGravel = new ModelsnowGravel();
    private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "snowgravel.png");

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        GL11.glPushMatrix();
        GL11.glTranslated(x+0.5,y+0.6,z+0.5);
        GL11.glRotated(180,0,1,0);
        Tessellator.bindTexture(texture);
        modelsnowGravel.render(null, 0, 0, 0, 0, 0, 0.0625f);
    }
}
