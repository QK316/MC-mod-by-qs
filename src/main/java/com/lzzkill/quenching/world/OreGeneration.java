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

    private static final ConfiguredFeature<?, ?> ALUMINUM_ORE = Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.ALUMINUM_ORE.get().getBlock().defaultBlockState(), 8)).range(80).squared().count(64);
    private static final ConfiguredFeature<?, ?> ZINC_ORE = Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.ZINC_ORE.get().getBlock().defaultBlockState(), 6)).range(48).squared().count(48);
    private static final ConfiguredFeature<?, ?> COPPER_ORE = Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.COPPER_ORE.get().getBlock().defaultBlockState(), 10)).range(64).squared().count(40);

    @SubscribeEvent
    public static void onBiomeLoadingEvent(final BiomeLoadingEvent event)
    {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || (event.getCategory().equals(Biome.Category.THEEND)))) {
            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ALUMINUM_ORE);
            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ZINC_ORE);
            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, COPPER_ORE);
        }
    }


}
