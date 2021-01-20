package net.mcreator.coles_randomness.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.coles_randomness.item.ItemTestItemGithub;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

import java.util.Map;

@ElementsColesRandomnessMod.ModElement.Tag
public class ProcedureTestItemGithubItemInInventoryTick extends ElementsColesRandomnessMod.ModElement {
	public ProcedureTestItemGithubItemInInventoryTick(ElementsColesRandomnessMod instance) {
		super(instance, 509);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TestItemGithubItemInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemTestItemGithub.block, (int) (1)).getItem(), -1, (int) 1, null);
	}
}
