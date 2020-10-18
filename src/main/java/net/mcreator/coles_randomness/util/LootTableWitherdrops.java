
package net.mcreator.coles_randomness.util;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class LootTableWitherdrops extends ElementsColesRandomnessMod.ModElement {
	public LootTableWitherdrops(ElementsColesRandomnessMod instance) {
		super(instance, 337);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("minecraft", "entities/wither"));
	}
}
