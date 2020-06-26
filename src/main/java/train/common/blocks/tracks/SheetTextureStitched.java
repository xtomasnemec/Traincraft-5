package train.common.blocks.tracks;

import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;

public class SheetTextureStitched extends TextureStitchEvent {
	private final int index;
	private final int rows;
	private final int columns;
	
	private SheetTextureStitched(TextureMap name, int index, int rows, int columns) {
		super(name);
		this.index = index;
		this.rows = rows;
		this.columns = columns;
	}

	public static ModelResourceLocation[] unstitchIcons(TextureMap iconRegister, String name, int numIcons) {
		return unstitchIcons(iconRegister, name, numIcons, 1);
	}

	public static ModelResourceLocation[] unstitchIcons(TextureMap iconRegister, String name, int columns, int rows) {
		int numIcons = rows * columns;
		ModelResourceLocation[] icons = new ModelResourceLocation[numIcons];
		for (int i = 0; i < numIcons; i++) {
			icons[i]=new ModelResourceLocation( new ResourceLocation(name + "." + i), "inventory");
		}
		return icons;
	}
}
