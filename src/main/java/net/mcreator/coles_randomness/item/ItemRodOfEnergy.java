
package net.mcreator.coles_randomness.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.ActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.init.Blocks;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.coles_randomness.procedure.ProcedureRodOfEnergyBulletHitsPlayer;
import net.mcreator.coles_randomness.procedure.ProcedureLightningEnergyBlock;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

import java.util.Map;
import java.util.HashMap;

@ElementsColesRandomnessMod.ModElement.Tag
public class ItemRodOfEnergy extends ElementsColesRandomnessMod.ModElement {
	@GameRegistry.ObjectHolder("coles_randomness:rodofenergy")
	public static final Item block = null;
	public static final int ENTITYID = 17;
	public ItemRodOfEnergy(ElementsColesRandomnessMod instance) {
		super(instance, 71);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new RangedItem());
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityArrowCustom.class)
				.id(new ResourceLocation("coles_randomness", "entitybulletrodofenergy"), ENTITYID).name("entitybulletrodofenergy")
				.tracker(64, 1, true).build());
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("coles_randomness:rodofenergy", "inventory"));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityArrowCustom.class, renderManager -> {
			return new RenderSnowball(renderManager, new ItemStack(Blocks.END_GATEWAY, (int) (1)).getItem(),
					Minecraft.getMinecraft().getRenderItem());
		});
	}
	public static class RangedItem extends Item {
		public RangedItem() {
			super();
			setMaxDamage(1);
			setFull3D();
			setUnlocalizedName("rodofenergy");
			setRegistryName("rodofenergy");
			maxStackSize = 1;
			setCreativeTab(CreativeTabs.COMBAT);
		}

		@Override
		public void onPlayerStoppedUsing(ItemStack itemstack, World world, EntityLivingBase entityLivingBase, int timeLeft) {
			if (!world.isRemote && entityLivingBase instanceof EntityPlayerMP) {
				EntityPlayerMP entity = (EntityPlayerMP) entityLivingBase;
				float power = 1.5f;
				EntityArrowCustom entityarrow = new EntityArrowCustom(world, entity);
				entityarrow.shoot(entity.getLookVec().x, entity.getLookVec().y, entity.getLookVec().z, power * 2, 0);
				entityarrow.setSilent(true);
				entityarrow.setIsCritical(true);
				entityarrow.setDamage(10);
				entityarrow.setKnockbackStrength(1);
				itemstack.damageItem(1, entity);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				world.playSound((EntityPlayer) null, (double) x, (double) y, (double) z,
						(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
								.getObject(new ResourceLocation(("entity.lightning.thunder"))),
						SoundCategory.NEUTRAL, 1, 1f / (itemRand.nextFloat() * 0.5f + 1f) + (power / 2));
				entityarrow.pickupStatus = EntityArrow.PickupStatus.DISALLOWED;
				if (!world.isRemote)
					world.spawnEntity(entityarrow);
			}
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entity, EnumHand hand) {
			entity.setActiveHand(hand);
			return new ActionResult(EnumActionResult.SUCCESS, entity.getHeldItem(hand));
		}

		@Override
		public EnumAction getItemUseAction(ItemStack itemstack) {
			return EnumAction.BOW;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 72000;
		}
	}

	public static class EntityArrowCustom extends EntityTippedArrow {
		public EntityArrowCustom(World a) {
			super(a);
		}

		public EntityArrowCustom(World worldIn, double x, double y, double z) {
			super(worldIn, x, y, z);
		}

		public EntityArrowCustom(World worldIn, EntityLivingBase shooter) {
			super(worldIn, shooter);
		}

		@Override
		public void onCollideWithPlayer(EntityPlayer entity) {
			super.onCollideWithPlayer(entity);
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			World world = this.world;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureRodOfEnergyBulletHitsPlayer.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void arrowHit(EntityLivingBase entity) {
			super.arrowHit(entity);
			entity.setArrowCountInEntity(entity.getArrowCountInEntity() - 1);
		}

		@Override
		public void onUpdate() {
			super.onUpdate();
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			World world = this.world;
			Entity entity = (Entity) shootingEntity;
			if (this.inGround) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureLightningEnergyBlock.executeProcedure($_dependencies);
				}
				this.world.removeEntity(this);
			}
		}
	}
}