package baguchan.tofucraft;

import baguchan.tofucraft.block.ModBlocks;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.core.world.generate.feature.WorldFeatureTallGrass;
import useless.terrainapi.api.TerrainAPI;
import useless.terrainapi.generation.overworld.api.ChunkDecoratorOverworldAPI;

public class TerrainAPIPlugin implements TerrainAPI {
	@Override
	public String getModID() {
		return TofuCraft.MOD_ID;
	}

	@Override
	public void onInitialize() {
		ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureTallGrass(ModBlocks.wild_soybean.id), 28, -1, 1,
			new Biome[]{Biomes.OVERWORLD_BIRCH_FOREST, Biomes.OVERWORLD_RETRO, Biomes.OVERWORLD_MEADOW, Biomes.OVERWORLD_FOREST, Biomes.OVERWORLD_BOREAL_FOREST, Biomes.OVERWORLD_SEASONAL_FOREST, Biomes.OVERWORLD_SHRUBLAND, Biomes.OVERWORLD_RAINFOREST});
	}
}
