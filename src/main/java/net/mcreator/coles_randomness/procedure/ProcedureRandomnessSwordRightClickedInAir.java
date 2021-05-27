package net.mcreator.coles_randomness.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Enchantments;

import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

import java.util.Map;

@ElementsColesRandomnessMod.ModElement.Tag
public class ProcedureRandomnessSwordRightClickedInAir extends ElementsColesRandomnessMod.ModElement {
	public ProcedureRandomnessSwordRightClickedInAir(ElementsColesRandomnessMod instance) {
		super(instance, 565);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure RandomnessSwordRightClickedInAir!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(Enchantments.SHARPNESS, (int) 50);
	}
}
