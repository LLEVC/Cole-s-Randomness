
package net.mcreator.coles_randomness.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.coles_randomness.item.ItemAquamarine;
import net.mcreator.coles_randomness.block.BlockAquamarineOre;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class RecipeAquamarineOreSmelting extends ElementsColesRandomnessMod.ModElement {
	public RecipeAquamarineOreSmelting(ElementsColesRandomnessMod instance) {
		super(instance, 528);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockAquamarineOre.block, (int) (1)), new ItemStack(ItemAquamarine.block, (int) (1)), 3.5F);
	}
}
