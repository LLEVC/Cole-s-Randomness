
package net.mcreator.coles_randomness.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.coles_randomness.item.ItemSilverIngot;
import net.mcreator.coles_randomness.block.BlockSilverOre;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class RecipeSilverOreSmelting extends ElementsColesRandomnessMod.ModElement {
	public RecipeSilverOreSmelting(ElementsColesRandomnessMod instance) {
		super(instance, 221);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSilverOre.block, (int) (1)), new ItemStack(ItemSilverIngot.block, (int) (1)), 0F);
	}
}
