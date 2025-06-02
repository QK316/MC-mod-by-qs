package com.lzzkill.quenching.event;

import com.lzzkill.quenching.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class OreGenerationEvent
{

    @SubscribeEvent
    public static void onBiomeLoadingEvent(final BiomeLoadingEvent event)
    {
        if (event.getCategory() != Biome.Category.NETHER && event.getCategory() != Biome.Category.THEEND) {
            ConfiguredFeature<?, ?> aluminumOre = buildOreFeature(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.ALUMINUM_ORE.get().defaultBlockState(), 8), 16, 0, 64, 32);
            ConfiguredFeature<?, ?> zincOre = buildOreFeature(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.ZINC_ORE.get().defaultBlockState(), 4), 16, 0, 32, 16);
            ConfiguredFeature<?, ?> copperOre = buildOreFeature(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.COPPER_ORE.get().defaultBlockState(), 12), 16, 2, 80, 32);

            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, aluminumOre);
            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, zincOre);
            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, copperOre);
        }
    }

    private static ConfiguredFeature<?,?> buildOreFeature(final OreFeatureConfig oreFeatureConfig, final int minHeight, final int Offset, final int maxHeight, final int count)
    {
        return Feature.ORE.configured(oreFeatureConfig).decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, Offset, maxHeight))).count(count).squared();
    }

}