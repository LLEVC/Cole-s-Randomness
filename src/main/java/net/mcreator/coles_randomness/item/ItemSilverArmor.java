
package net.mcreator.coles_randomness.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class ItemSilverArmor extends ElementsColesRandomnessMod.ModElement {
	@GameRegistry.ObjectHolder("coles_randomness:silverarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("coles_randomness:silverarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("coles_randomness:silverarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("coles_randomness:silverarmorboots")
	public static final Item boots = null;
	public ItemSilverArmor(ElementsColesRandomnessMod instance) {
		super(instance, 232);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("SILVERARMOR", "coles_randomness:silver", 15, new int[]{2, 6, 5, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("silverarmorhelmet")
				.setRegistryName("silverarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("silverarmorbody")
				.setRegistryName("silverarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("silverarmorlegs")
				.setRegistryName("silverarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("silverarmorboots")
				.setRegistryName("silverarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("coles_randomness:silverarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("coles_randomness:silverarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("coles_randomness:silverarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("coles_randomness:silverarmorboots", "inventory"));
	}
}
