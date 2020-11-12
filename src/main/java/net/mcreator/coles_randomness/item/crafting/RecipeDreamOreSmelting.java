
package net.mcreator.coles_randomness.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.coles_randomness.item.ItemDreamGem;
import net.mcreator.coles_randomness.block.BlockDreamOre;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class RecipeDreamOreSmelting extends ElementsColesRandomnessMod.ModElement {
	public RecipeDreamOreSmelting(ElementsColesRandomnessMod instance) {
		super(instance, 369);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDreamOre.block, (int) (1)), new ItemStack(ItemDreamGem.block, (int) (1)), 5.6F);
	}
}
