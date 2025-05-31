package com.lzzkill.quenching.world;

import com.lzzkill.quenching.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class OreGeneration
{

    @SubscribeEvent
    public static void onBiomeLoadingEvent(final BiomeLoadingEvent event)
    {
        if (event.getCategory() != Biome.Category.NETHER && event.getCategory() != Biome.Category.THEEND) {
            ConfiguredFeature<?, ?> aluminumOre = Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.ALUMINUM_ORE.get().defaultBlockState(), 8)).range(80).squared().count(64);
            ConfiguredFeature<?, ?> zincOre = Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.ZINC_ORE.get().defaultBlockState(), 6)).range(48).squared().count(48);
            ConfiguredFeature<?, ?> copperOre = Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.COPPER_ORE.get().defaultBlockState(), 10)).range(64).squared().count(40);

            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, aluminumOre);
            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, zincOre);
            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, copperOre);
        }
    }
}