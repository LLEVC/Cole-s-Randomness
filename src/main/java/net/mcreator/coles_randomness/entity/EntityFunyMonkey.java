
package net.mcreator.coles_randomness.entity;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

import net.mcreator.coles_randomness.procedure.ProcedureFunyMonkeyThisEntityKillsAnotherOne;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

@ElementsColesRandomnessMod.ModElement.Tag
public class EntityFunyMonkey extends ElementsColesRandomnessMod.ModElement {
	public static final int ENTITYID = 50;
	public static final int ENTITYID_RANGED = 51;
	public EntityFunyMonkey(ElementsColesRandomnessMod instance) {
		super(instance, 591);
	}

	@Override
	public void initElements() {
		elements.entities.add(
				() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("coles_randomness", "funy_monkey"), ENTITYID)
						.name("funy_monkey").tracker(64, 3, true).egg(-10079488, -13108).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		Biome[] spawnBiomes = allbiomes(Biome.REGISTRY);
		EntityRegistry.addSpawn(EntityCustom.class, 20, 4, 4, EnumCreatureType.MONSTER, spawnBiomes);
	}

	private Biome[] allbiomes(net.minecraft.util.registry.RegistryNamespaced<ResourceLocation, Biome> in) {
		Iterator<Biome> itr = in.iterator();
		ArrayList<Biome> ls = new ArrayList<Biome>();
		while (itr.hasNext())
			ls.add(itr.next());
		return ls.toArray(new Biome[ls.size()]);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
			return new RenderLiving(renderManager, new Modelcustom_model(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("coles_randomness:textures/monkey.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityCreature {
		public EntityCustom(World world) {
			super(world);
			setSize(0.6f, 1.8f);
			experienceValue = 0;
			this.isImmuneToFire = false;
			setNoAI(!true);
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
			this.tasks.addTask(1, new EntityAIOpenDoor(this, false));
			this.tasks.addTask(2, new EntityAIOpenDoor(this, true));
			this.tasks.addTask(3, new EntityAIEatGrass(this));
			this.tasks.addTask(4, new EntityAIWander(this, 1));
			this.tasks.addTask(5, new EntityAILookIdle(this));
		}

		@Override
		public EnumCreatureAttribute getCreatureAttribute() {
			return EnumCreatureAttribute.UNDEFINED;
		}

		@Override
		protected Item getDropItem() {
			return new ItemStack(Blocks.WOOL, (int) (1), 12).getItem();
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
		}

		@Override
		protected float getSoundVolume() {
			return 1.0F;
		}

		@Override
		public void onKillEntity(EntityLivingBase entity) {
			super.onKillEntity(entity);
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureFunyMonkeyThisEntityKillsAnotherOne.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3D);
		}
	}

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
}
