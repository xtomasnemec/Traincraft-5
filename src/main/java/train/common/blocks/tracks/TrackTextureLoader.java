package train.common.blocks.tracks;

import mods.railcraft.api.core.ITextureLoader;
import mods.railcraft.api.tracks.ITrackItemIconProvider;
import mods.railcraft.api.tracks.TrackSpec;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.model.ModelResourceLocation;
import train.common.library.Tracks;

import java.util.HashMap;
import java.util.Map;

public class TrackTextureLoader implements ITextureLoader, ITrackItemIconProvider {
	public static final TrackTextureLoader INSTANCE = new TrackTextureLoader();
	public final Map textures = new HashMap();
	//public final Map itemIcon = new HashMap();
	@Override
	public void registerIcons(TextureMap iconRegister) {
		for (Tracks track : Tracks.values()) {
            ModelResourceLocation[] icons = SheetTextureStitched.unstitchIcons(iconRegister, track.getTextureTag(), track.getNumIcons());
			this.textures.put(track.getTrackSpec(), icons);
			//this.itemIcon.put(track.getTrackSpec(), icons[track.getNumIcons()]);
		}
	}
	@Override
	public ModelResourceLocation getTrackItemIcon(TrackSpec spec) {
		return getTrackIcons(spec)[0];
	}

	public ModelResourceLocation[] getTrackIcons(TrackSpec spec) {
		return (ModelResourceLocation[]) this.textures.get(spec);
	}

}
