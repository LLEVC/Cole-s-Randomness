
package net.mcreator.coles_randomness.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemShears;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class ItemPocketKnife1 extends ElementsColesRandomnessMod.ModElement {
	@GameRegistry.ObjectHolder("coles_randomness:pocket_knife_1")
	public static final Item block = null;
	public ItemPocketKnife1(ElementsColesRandomnessMod instance) {
		super(instance, 595);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemShears() {
			{
				setMaxDamage(70000);
			}
			@Override
			public int getItemEnchantability() {
				return 2;
			}

			@Override
			public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
				return 4f;
			}
		}.setUnlocalizedName("pocket_knife_1").setRegistryName("pocket_knife_1").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("coles_randomness:pocket_knife_1", "inventory"));
	}
}
