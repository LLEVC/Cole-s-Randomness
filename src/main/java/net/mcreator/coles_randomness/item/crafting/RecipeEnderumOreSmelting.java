
package net.mcreator.coles_randomness.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.coles_randomness.item.ItemEnderumDust;
import net.mcreator.coles_randomness.block.BlockEnderumOre;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class RecipeEnderumOreSmelting extends ElementsColesRandomnessMod.ModElement {
	public RecipeEnderumOreSmelting(ElementsColesRandomnessMod instance) {
		super(instance, 571);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockEnderumOre.block, (int) (1)), new ItemStack(ItemEnderumDust.block, (int) (1)), 3.5F);
	}
}
