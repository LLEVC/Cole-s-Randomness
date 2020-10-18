
package net.mcreator.coles_randomness.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.coles_randomness.item.ItemCopperIngot;
import net.mcreator.coles_randomness.block.BlockCopperOre;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class RecipeCopperOreSmelting extends ElementsColesRandomnessMod.ModElement {
	public RecipeCopperOreSmelting(ElementsColesRandomnessMod instance) {
		super(instance, 200);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockCopperOre.block, (int) (1)), new ItemStack(ItemCopperIngot.block, (int) (1)), 0F);
	}
}
