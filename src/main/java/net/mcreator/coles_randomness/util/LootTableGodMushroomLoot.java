
package net.mcreator.coles_randomness.util;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class LootTableGodMushroomLoot extends ElementsColesRandomnessMod.ModElement {
	public LootTableGodMushroomLoot(ElementsColesRandomnessMod instance) {
		super(instance, 631);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("coles_randomness", "blocks/god_mushroom"));
	}
}
