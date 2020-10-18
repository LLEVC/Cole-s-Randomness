// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public static class ModelProjectileBig extends ModelBase {
	private final ModelRenderer Dart;

	public ModelProjectileBig() {
		textureWidth = 32;
		textureHeight = 32;

		Dart = new ModelRenderer(this);
		Dart.setRotationPoint(0.0F, 24.0F, 0.0F);
		Dart.cubeList.add(new ModelBox(Dart, 20, 30, -2.5F, -3.0F, -0.5F, 5, 1, 1, 0.0F, false));
		Dart.cubeList.add(new ModelBox(Dart, 20, 26, -0.5F, -3.0F, -2.5F, 1, 1, 5, 0.0F, false));
		Dart.cubeList.add(new ModelBox(Dart, 0, 29, -0.5F, -16.0F, -0.5F, 1, 13, 1, 0.0F, false));
		Dart.cubeList.add(new ModelBox(Dart, 28, 0, -0.5F, -72.0F, -0.5F, 1, 24, 1, 0.0F, false));
		Dart.cubeList.add(new ModelBox(Dart, 0, 0, -1.0F, -48.0F, -1.0F, 2, 33, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Dart.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}