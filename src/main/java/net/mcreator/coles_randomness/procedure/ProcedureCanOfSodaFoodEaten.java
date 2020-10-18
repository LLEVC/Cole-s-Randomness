package net.mcreator.coles_randomness.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

import java.util.Map;

@ElementsColesRandomnessMod.ModElement.Tag
public class ProcedureCanOfSodaFoodEaten extends ElementsColesRandomnessMod.ModElement {
	public ProcedureCanOfSodaFoodEaten(ElementsColesRandomnessMod instance) {
		super(instance, 282);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CanOfSodaFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 120, (int) 4));
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
		entity.attackEntityFrom(DamageSource.GENERIC, (float) (-1));
	}
}
