package net.mcreator.coles_randomness.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

import java.util.Map;

@ElementsColesRandomnessMod.ModElement.Tag
public class ProcedureHypnosisOnPotionActiveTick extends ElementsColesRandomnessMod.ModElement {
	public ProcedureHypnosisOnPotionActiveTick(ElementsColesRandomnessMod instance) {
		super(instance, 512);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure HypnosisOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.rotationYaw = 0;
		entity.rotationPitch = 0;
		entity.rotationYaw = 1;
		entity.rotationPitch = 0;
		entity.rotationYaw = 2;
		entity.rotationPitch = 0;
		entity.rotationYaw = 3;
		entity.rotationPitch = 0;
		entity.rotationYaw = 4;
		entity.rotationPitch = 0;
		entity.rotationYaw = 5;
		entity.rotationPitch = 0;
		entity.rotationYaw = 6;
		entity.rotationPitch = 0;
		entity.rotationYaw = 7;
		entity.rotationPitch = 0;
		entity.rotationYaw = 8;
		entity.rotationPitch = 0;
		entity.rotationYaw = 9;
		entity.rotationPitch = 0;
		entity.rotationYaw = 10;
		entity.rotationPitch = 0;
		entity.rotationYaw = 9;
		entity.rotationPitch = 0;
		entity.rotationYaw = 8;
		entity.rotationPitch = 0;
		entity.rotationYaw = 7;
		entity.rotationPitch = 0;
		entity.rotationYaw = 6;
		entity.rotationPitch = 0;
		entity.rotationYaw = 5;
		entity.rotationPitch = 0;
		entity.rotationYaw = 4;
		entity.rotationPitch = 0;
		entity.rotationYaw = 3;
		entity.rotationPitch = 0;
		entity.rotationYaw = 2;
		entity.rotationPitch = 0;
		entity.rotationYaw = 1;
		entity.rotationPitch = 0;
	}
}
