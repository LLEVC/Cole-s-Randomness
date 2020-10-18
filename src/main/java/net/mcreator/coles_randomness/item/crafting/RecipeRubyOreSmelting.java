
package net.mcreator.coles_randomness.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.coles_randomness.item.ItemRubyGem;
import net.mcreator.coles_randomness.block.BlockRubyOre;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class RecipeRubyOreSmelting extends ElementsColesRandomnessMod.ModElement {
	public RecipeRubyOreSmelting(ElementsColesRandomnessMod instance) {
		super(instance, 248);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockRubyOre.block, (int) (1)), new ItemStack(ItemRubyGem.block, (int) (1)), 0F);
	}
}
