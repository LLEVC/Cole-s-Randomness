// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends ModelBase {
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;
	private final ModelRenderer Torso;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer Head;

	public Modelcustom_model() {
		textureWidth = 64;
		textureHeight = 64;

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 15.0F, 0.0F);
		setRotationAngle(LeftLeg, 0.0F, 3.1416F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 53, -1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 15.0F, 0.0F);
		setRotationAngle(RightLeg, 0.0F, 3.1416F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 53, -1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F, true));

		Torso = new ModelRenderer(this);
		Torso.setRotationPoint(0.0F, 15.0F, 0.5F);
		setRotationAngle(Torso, 0.0F, 3.1416F, 0.0F);
		Torso.cubeList.add(new ModelBox(Torso, 11, 51, -3.5F, -10.0F, -1.0F, 7, 10, 3, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-5.5F, 6.0F, 0.0F);
		setRotationAngle(LeftArm, 0.0F, 3.1416F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -2.0F, -1.0F, -1.0F, 2, 10, 2, 0.0F, true));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(5.5F, 6.0F, 0.0F);
		setRotationAngle(RightArm, 0.0F, 3.1416F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, 0.0F, -1.0F, -1.0F, 2, 10, 2, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.5F, 5.0F, 0.0F);
		setRotationAngle(Head, 0.0F, 3.1416F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 40, 52, -2.5F, -6.0F, -3.0F, 6, 6, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		LeftLeg.render(f5);
		RightLeg.render(f5);
		Torso.render(f5);
		LeftArm.render(f5);
		RightArm.render(f5);
		Head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}