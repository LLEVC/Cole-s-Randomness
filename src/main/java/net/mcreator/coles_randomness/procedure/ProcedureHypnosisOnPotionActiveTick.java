package net.mcreator.coles_randomness.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
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
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 10, (int) 1, (false), (false)));
		entity.rotationYaw = Math.min(0, 359);
		entity.rotationPitch = Math.min(0, 359);
	}
}
