package net.mcreator.coles_randomness.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.coles_randomness.item.ItemNeedlePaperBlood;
import net.mcreator.coles_randomness.item.ItemNeedlePaper;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

import java.util.Map;

@ElementsColesRandomnessMod.ModElement.Tag
public class ProcedureNeedlePaperLivingEntityIsHitWithItem extends ElementsColesRandomnessMod.ModElement {
	public ProcedureNeedlePaperLivingEntityIsHitWithItem(ElementsColesRandomnessMod instance) {
		super(instance, 430);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure NeedlePaperLivingEntityIsHitWithItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemNeedlePaperBlood.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemNeedlePaper.block, (int) (1)).getItem(), -1, (int) 1, null);
	}
}
