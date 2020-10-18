
package net.mcreator.coles_randomness.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.coles_randomness.item.ItemFools_GoldIngot;
import net.mcreator.coles_randomness.block.BlockFools_GoldOre;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class RecipeFools_GoldOreSmelting extends ElementsColesRandomnessMod.ModElement {
	public RecipeFools_GoldOreSmelting(ElementsColesRandomnessMod instance) {
		super(instance, 138);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockFools_GoldOre.block, (int) (1)), new ItemStack(ItemFools_GoldIngot.block, (int) (1)), 0F);
	}
}
