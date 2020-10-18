
package net.mcreator.coles_randomness.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.coles_randomness.item.ItemRiteGem;
import net.mcreator.coles_randomness.item.ItemEnergy;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class RecipeEnergyRecipe extends ElementsColesRandomnessMod.ModElement {
	public RecipeEnergyRecipe(ElementsColesRandomnessMod instance) {
		super(instance, 341);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemRiteGem.block, (int) (1)), new ItemStack(ItemEnergy.block, (int) (1)), 1F);
	}
}
