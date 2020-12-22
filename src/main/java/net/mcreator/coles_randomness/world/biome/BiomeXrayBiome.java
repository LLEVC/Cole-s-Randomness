
package net.mcreator.coles_randomness.world.biome;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.BiomeManager;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;

import net.mcreator.coles_randomness.block.BlockXrayBlock;
import net.mcreator.coles_randomness.ElementsColesRandomnessMod;

import java.util.Random;

@ElementsColesRandomnessMod.ModElement.Tag
public class BiomeXrayBiome extends ElementsColesRandomnessMod.ModElement {
	@GameRegistry.ObjectHolder("coles_randomness:xraybiome")
	public static final BiomeGenCustom biome = null;
	public BiomeXrayBiome(ElementsColesRandomnessMod instance) {
		super(instance, 84);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 10));
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("Xray Biome").setRainfall(0.5F).setBaseHeight(0.1F).setWaterColor(-14329397).setHeightVariation(0.2F)
					.setTemperature(0.5F));
			setRegistryName("xraybiome");
			topBlock = Blocks.GRASS.getDefaultState();
			fillerBlock = BlockXrayBlock.block.getDefaultState();
			decorator.treesPerChunk = 3;
			decorator.flowersPerChunk = 10;
			decorator.grassPerChunk = 10;
			decorator.mushroomsPerChunk = 1;
			decorator.bigMushroomsPerChunk = 1;
			decorator.reedsPerChunk = 1;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 1;
			decorator.gravelPatchesPerChunk = 1;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getGrassColorAtPos(BlockPos pos) {
			return -13369600;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getFoliageColorAtPos(BlockPos pos) {
			return -13369600;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getSkyColorByTemp(float currentTemperature) {
			return -5916161;
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return super.getRandomTreeFeature(rand);
		}
	}
}
