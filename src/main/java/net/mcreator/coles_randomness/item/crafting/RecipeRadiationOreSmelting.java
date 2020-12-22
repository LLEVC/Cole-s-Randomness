
package net.mcreator.coles_randomness.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.coles_randomness.item.ItemRadiationIngot;
import net.mcreator.coles_randomness.block.BlockRadiationOre;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class RecipeRadiationOreSmelting extends ElementsColesRandomnessMod.ModElement {
	public RecipeRadiationOreSmelting(ElementsColesRandomnessMod instance) {
		super(instance, 438);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockRadiationOre.block, (int) (1)), new ItemStack(ItemRadiationIngot.block, (int) (1)), 0.7F);
	}
}
