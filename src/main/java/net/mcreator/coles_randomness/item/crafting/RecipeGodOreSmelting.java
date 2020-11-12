
package net.mcreator.coles_randomness.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.coles_randomness.item.ItemGodGem;
import net.mcreator.coles_randomness.block.BlockGodOre;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class RecipeGodOreSmelting extends ElementsColesRandomnessMod.ModElement {
	public RecipeGodOreSmelting(ElementsColesRandomnessMod instance) {
		super(instance, 385);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockGodOre.block, (int) (1)), new ItemStack(ItemGodGem.block, (int) (1)), 7F);
	}
}
