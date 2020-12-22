package net.mcreator.coles_randomness.procedure;

import net.minecraft.world.World;

import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

import java.util.Map;

@ElementsColesRandomnessMod.ModElement.Tag
public class ProcedureBigAxeBlockDestroyedWithTool extends ElementsColesRandomnessMod.ModElement {
	public ProcedureBigAxeBlockDestroyedWithTool(ElementsColesRandomnessMod instance) {
		super(instance, 452);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BigAxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BigAxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BigAxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BigAxeBlockDestroyedWithTool!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			world.createExplosion(null, (int) x, (int) y, (int) z, (float) 2, true);
		}
	}
}
