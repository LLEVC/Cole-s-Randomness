
package net.mcreator.coles_randomness.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.coles_randomness.item.ItemSteelIngot;
import net.mcreator.coles_randomness.block.BlockSteelOre;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class RecipeSteelOreSmelting extends ElementsColesRandomnessMod.ModElement {
	public RecipeSteelOreSmelting(ElementsColesRandomnessMod instance) {
		super(instance, 254);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSteelOre.block, (int) (1)), new ItemStack(ItemSteelIngot.block, (int) (1)), 0F);
	}
}
