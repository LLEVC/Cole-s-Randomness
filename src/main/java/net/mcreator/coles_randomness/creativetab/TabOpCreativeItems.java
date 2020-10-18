
package net.mcreator.coles_randomness.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.coles_randomness.item.ItemOPicon;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class TabOpCreativeItems extends ElementsColesRandomnessMod.ModElement {
	public TabOpCreativeItems(ElementsColesRandomnessMod instance) {
		super(instance, 302);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabopcreativeitems") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemOPicon.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
