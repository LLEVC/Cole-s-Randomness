package net.mcreator.coles_randomness.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

import java.util.Map;

@ElementsColesRandomnessMod.ModElement.Tag
public class ProcedureRedstoneMasterOnEntityTickUpdate extends ElementsColesRandomnessMod.ModElement {
	public ProcedureRedstoneMasterOnEntityTickUpdate(ElementsColesRandomnessMod instance) {
		super(instance, 348);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RedstoneMasterOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, (int) 99999999, (int) 255, (false), (false)));
	}
}
