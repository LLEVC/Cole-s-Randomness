package net.mcreator.coles_randomness.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.coles_randomness.block.BlockCompressedEmeraldBlockLol;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

import java.util.Map;

@ElementsColesRandomnessMod.ModElement.Tag
public class ProcedureCompressEmeraldBlock extends ElementsColesRandomnessMod.ModElement {
	public ProcedureCompressEmeraldBlock(ElementsColesRandomnessMod instance) {
		super(instance, 635);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CompressEmeraldBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof EntityPlayer)
				? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(Blocks.EMERALD_BLOCK, (int) (1)))
				: false)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(BlockCompressedEmeraldBlockLol.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Blocks.EMERALD_BLOCK, (int) (1)).getItem(), -1, (int) 9, null);
		} else {
			System.out.println("No Trade");
		}
	}
}
