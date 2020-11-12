
package net.mcreator.coles_randomness.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.coles_randomness.item.ItemDemonGem;
import net.mcreator.coles_randomness.block.BlockDemonOre;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class RecipeDemonOreSmelting extends ElementsColesRandomnessMod.ModElement {
	public RecipeDemonOreSmelting(ElementsColesRandomnessMod instance) {
		super(instance, 406);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDemonOre.block, (int) (1)), new ItemStack(ItemDemonGem.block, (int) (1)), 7F);
	}
}
