
package net.mcreator.coles_randomness.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.init.Blocks;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.coles_randomness.procedure.ProcedureBigAxeToolInHandTick;
import net.mcreator.coles_randomness.procedure.ProcedureBigAxeBlockDestroyedWithTool;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.Multimap;

@ElementsColesRandomnessMod.ModElement.Tag
public class ItemBigAxe extends ElementsColesRandomnessMod.ModElement {
	@GameRegistry.ObjectHolder("coles_randomness:big_axe")
	public static final Item block = null;
	public ItemBigAxe(ElementsColesRandomnessMod instance) {
		super(instance, 451);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
			@Override
			public boolean onBlockDestroyed(ItemStack itemstack, World world, IBlockState bl, BlockPos pos, EntityLivingBase entity) {
				boolean retval = super.onBlockDestroyed(itemstack, world, bl, pos, entity);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureBigAxeBlockDestroyedWithTool.executeProcedure($_dependencies);
				}
				return retval;
			}

			@Override
			public void onUpdate(ItemStack itemstack, World world, Entity entity, int slot, boolean par5) {
				super.onUpdate(itemstack, world, entity, slot, par5);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				if (entity instanceof EntityLivingBase && ((EntityLivingBase) entity).getHeldItemMainhand().equals(itemstack)) {
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureBigAxeToolInHandTick.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("big_axe").setRegistryName("big_axe").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("coles_randomness:big_axe", "inventory"));
	}
	private static class ItemToolCustom extends Item {
		protected ItemToolCustom() {
			setMaxDamage(10000);
			setMaxStackSize(1);
		}

		@Override
		public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
			Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);
			if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
				multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(),
						new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", 9996f, 0));
				multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", -3, 0));
			}
			return multimap;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			IBlockState require;
			require = Blocks.LOG.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 18f;
			require = Blocks.PLANKS.getStateFromMeta(0);
			try {
				if ((par2Block.getBlock() == require.getBlock())
						&& (par2Block.getBlock().getMetaFromState(par2Block) == require.getBlock().getMetaFromState(require)))
					return 18f;
			} catch (Exception e) {
				if (par2Block.getBlock() == require.getBlock())
					return 18f;
			}
			require = Blocks.PLANKS.getStateFromMeta(1);
			try {
				if ((par2Block.getBlock() == require.getBlock())
						&& (par2Block.getBlock().getMetaFromState(par2Block) == require.getBlock().getMetaFromState(require)))
					return 18f;
			} catch (Exception e) {
				if (par2Block.getBlock() == require.getBlock())
					return 18f;
			}
			require = Blocks.PLANKS.getStateFromMeta(2);
			try {
				if ((par2Block.getBlock() == require.getBlock())
						&& (par2Block.getBlock().getMetaFromState(par2Block) == require.getBlock().getMetaFromState(require)))
					return 18f;
			} catch (Exception e) {
				if (par2Block.getBlock() == require.getBlock())
					return 18f;
			}
			require = Blocks.PLANKS.getStateFromMeta(3);
			try {
				if ((par2Block.getBlock() == require.getBlock())
						&& (par2Block.getBlock().getMetaFromState(par2Block) == require.getBlock().getMetaFromState(require)))
					return 18f;
			} catch (Exception e) {
				if (par2Block.getBlock() == require.getBlock())
					return 18f;
			}
			require = Blocks.PLANKS.getStateFromMeta(4);
			try {
				if ((par2Block.getBlock() == require.getBlock())
						&& (par2Block.getBlock().getMetaFromState(par2Block) == require.getBlock().getMetaFromState(require)))
					return 18f;
			} catch (Exception e) {
				if (par2Block.getBlock() == require.getBlock())
					return 18f;
			}
			require = Blocks.PLANKS.getStateFromMeta(5);
			try {
				if ((par2Block.getBlock() == require.getBlock())
						&& (par2Block.getBlock().getMetaFromState(par2Block) == require.getBlock().getMetaFromState(require)))
					return 18f;
			} catch (Exception e) {
				if (par2Block.getBlock() == require.getBlock())
					return 18f;
			}
			require = Blocks.WEB.getDefaultState();
			if (par2Block.getBlock() == require.getBlock())
				return 18f;
			return 0;
		}

		@Override
		public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
			stack.damageItem(1, entityLiving);
			return true;
		}

		@Override
		public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
			stack.damageItem(2, attacker);
			return true;
		}

		@Override
		public boolean isFull3D() {
			return true;
		}

		@Override
		public int getItemEnchantability() {
			return 2;
		}
	}
}
