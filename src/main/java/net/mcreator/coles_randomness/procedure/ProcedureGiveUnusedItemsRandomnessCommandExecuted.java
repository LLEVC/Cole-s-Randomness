package net.mcreator.coles_randomness.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.coles_randomness.item.ItemTestItemGithub;
import net.mcreator.coles_randomness.item.ItemPizzaSlice;
import net.mcreator.coles_randomness.item.ItemOPicon;
import net.mcreator.coles_randomness.item.ItemGithubTestItem;
import net.mcreator.coles_randomness.item.ItemCatGun;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

import java.util.Map;

@ElementsColesRandomnessMod.ModElement.Tag
public class ProcedureGiveUnusedItemsRandomnessCommandExecuted extends ElementsColesRandomnessMod.ModElement {
	public ProcedureGiveUnusedItemsRandomnessCommandExecuted(ElementsColesRandomnessMod instance) {
		super(instance, 604);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure GiveUnusedItemsRandomnessCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemOPicon.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemCatGun.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemPizzaSlice.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemGithubTestItem.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemTestItemGithub.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
