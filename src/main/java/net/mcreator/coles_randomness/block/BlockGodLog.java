
package net.mcreator.coles_randomness.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.coles_randomness.creativetab.TabOpCreativeItems;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

@ElementsColesRandomnessMod.ModElement.Tag
public class BlockGodLog extends ElementsColesRandomnessMod.ModElement {
	@GameRegistry.ObjectHolder("coles_randomness:god_log")
	public static final Block block = null;
	public BlockGodLog(ElementsColesRandomnessMod instance) {
		super(instance, 454);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("god_log"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("coles_randomness:god_log", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.WOOD);
			setUnlocalizedName("god_log");
			setSoundType(SoundType.WOOD);
			setHarvestLevel("axe", 0);
			setHardness(10F);
			setResistance(7.247796636776956F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabOpCreativeItems.tab);
		}

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 25;
		}

		@Override
		public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction,
				net.minecraftforge.common.IPlantable plantable) {
			return true;
		}
	}
}
