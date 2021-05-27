
package net.mcreator.coles_randomness.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.coles_randomness.item.ItemRandomnessIngot;
import net.mcreator.coles_randomness.block.BlockRandomnessOre;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class RecipeRandomnessOreSmelting extends ElementsColesRandomnessMod.ModElement {
	public RecipeRandomnessOreSmelting(ElementsColesRandomnessMod instance) {
		super(instance, 549);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockRandomnessOre.block, (int) (1)), new ItemStack(ItemRandomnessIngot.block, (int) (1)), 7F);
	}
}
