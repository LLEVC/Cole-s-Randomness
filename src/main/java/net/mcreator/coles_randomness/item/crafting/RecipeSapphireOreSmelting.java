
package net.mcreator.coles_randomness.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.coles_randomness.item.ItemSapphire;
import net.mcreator.coles_randomness.block.BlockSapphireOre;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class RecipeSapphireOreSmelting extends ElementsColesRandomnessMod.ModElement {
	public RecipeSapphireOreSmelting(ElementsColesRandomnessMod instance) {
		super(instance, 613);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSapphireOre.block, (int) (1)), new ItemStack(ItemSapphire.block, (int) (1)), 2.0999999999999996F);
	}
}
