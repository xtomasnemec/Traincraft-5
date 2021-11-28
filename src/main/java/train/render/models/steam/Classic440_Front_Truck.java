//FMT-Marker FVTM-1.5
//Using PER-GROUP-INIT mode with limit '250'!
package train.render.models.steam;


import fexcraft.fvtm.RollingStockModel;
import fexcraft.fvtm.TurboList;
import fexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.6 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class Classic440_Front_Truck extends RollingStockModel {

	public Classic440_Front_Truck(){
		super(); textureX = 256; textureY = 128;
		this.addToCreators("Unregistered Account");
		//
		initGroup_group3();
	}

	private final void initGroup_group3(){
		TurboList group3 = new TurboList("group3");
		group3.add(new ModelRendererTurbo(group3, 44, 47, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-44, 4, -6.05f).setRotationAngle(0, 0, 0).setName("Wheel0")
		);
		group3.add(new ModelRendererTurbo(group3, 174, 40, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-44, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Wheel1")
		);
		group3.add(new ModelRendererTurbo(group3, 241, 16, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-58, 4, 6.05f).setRotationAngle(0, 0, 0).setName("Wheel2")
		);
		group3.add(new ModelRendererTurbo(group3, 0, 60, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 12)
			.setRotationPoint(-55, 7, -6).setRotationAngle(0, 0, 0).setName("Axle0")
		);
		group3.add(new ModelRendererTurbo(group3, 29, 48, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 12)
			.setRotationPoint(-41, 7, -6).setRotationAngle(0, 0, 0).setName("Axle1")
		);
		group3.add(new ModelRendererTurbo(group3, 61, 32, textureX, textureY).addBox(0, 0, 0, 16, 1, 10)
			.setRotationPoint(-56, 5.5f, -5).setRotationAngle(0, 0, 0).setName("Box 110")
		);
		group3.add(new ModelRendererTurbo(group3, 174, 28, textureX, textureY).addBox(0, 0, 0, 16, 1, 10)
			.setRotationPoint(-56, 7.5f, -5).setRotationAngle(0, 0, 0).setName("Box 112")
		);
		group3.add(new ModelRendererTurbo(group3, 221, 0, textureX, textureY).addBox(0, 0, 0, 13, 1, 0)
			.setRotationPoint(-54.5f, 6.5f, -4).setRotationAngle(0, 0, 0).setName("Box 113")
		);
		group3.add(new ModelRendererTurbo(group3, 194, 0, textureX, textureY).addBox(0, 0, 0, 13, 1, 0)
			.setRotationPoint(-54.5f, 6.5f, 4).setRotationAngle(0, 0, 0).setName("Box 114")
		);
		group3.add(new ModelRendererTurbo(group3, 174, 28, textureX, textureY).addBox(0, 0, 0, 2, 3, 2)
			.setRotationPoint(-49, 2.5f, -1).setRotationAngle(0, 0, 0).setName("Box 136")
		);
		group3.add(new ModelRendererTurbo(group3, 243, 2, textureX, textureY).addBox(0, 0, 0, 6, 6, 0)
			.setRotationPoint(-58, 4, -6.05f).setRotationAngle(0, 0, 0).setName("Wheel3")
		);
		this.groups.add(group3);
	}

}
