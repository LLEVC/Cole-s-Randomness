package net.mcreator.coles_randomness.procedure;

import net.minecraft.world.World;
import net.minecraft.util.EnumParticleTypes;

import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

import java.util.Map;

@ElementsColesRandomnessMod.ModElement.Tag
public class ProcedureRiteWandWhileBulletFlyingTick extends ElementsColesRandomnessMod.ModElement {
	public ProcedureRiteWandWhileBulletFlyingTick(ElementsColesRandomnessMod instance) {
		super(instance, 155);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RiteWandWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RiteWandWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RiteWandWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RiteWandWhileBulletFlyingTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.spawnParticle(EnumParticleTypes.CRIT_MAGIC, x, y, z, 1, 1, 1);
		world.spawnParticle(EnumParticleTypes.CRIT_MAGIC, x, y, z, 1, 1, 1);
		world.spawnParticle(EnumParticleTypes.CRIT_MAGIC, x, y, z, 1, 1, 1);
		world.spawnParticle(EnumParticleTypes.CRIT_MAGIC, x, y, z, 1, 1, 1);
		world.spawnParticle(EnumParticleTypes.CRIT_MAGIC, x, y, z, 1, 1, 1);
		world.spawnParticle(EnumParticleTypes.CRIT_MAGIC, x, y, z, 1, 1, 1);
		world.spawnParticle(EnumParticleTypes.CRIT_MAGIC, x, y, z, 1, 1, 1);
	}
}
