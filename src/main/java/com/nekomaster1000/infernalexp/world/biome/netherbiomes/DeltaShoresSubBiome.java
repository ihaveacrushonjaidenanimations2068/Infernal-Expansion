package com.nekomaster1000.infernalexp.world.biome.netherbiomes;

import com.nekomaster1000.infernalexp.init.ModEntityTypes;
import com.nekomaster1000.infernalexp.init.ModSurfaceBuilders;
import com.nekomaster1000.infernalexp.world.biome.BiomeHelper;
import com.nekomaster1000.infernalexp.world.biome.ModBiome;
import net.minecraft.client.audio.BackgroundMusicTracks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.ConfiguredCarvers;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;

public class DeltaShoresSubBiome extends ModBiome {

    @Override
    protected Biome.Category configureCategory() {
        return Biome.Category.NETHER;
    }

    @Override
    protected float configureDepth() {
        return 0.1f;
    }

    @Override
    protected float configureScale() {
        return 0.2f;
    }

    @Override
    protected void configureAmbience(BiomeAmbience.Builder ambience) {
        ambience
                .setWaterColor(4144704)
                .setWaterFogColor(4341314)
                .setFogColor(6840176)
                .withSkyColor(BiomeHelper.calcSkyColor(2.0f))
                .setParticle(new ParticleEffectAmbience(ParticleTypes.WHITE_ASH, 0.118093334F))
                .setAmbientSound(SoundEvents.AMBIENT_BASALT_DELTAS_LOOP)
                .setMoodSound(new MoodSoundAmbience(SoundEvents.AMBIENT_BASALT_DELTAS_MOOD, 8000, 8, 2.0D))
                .setAdditionsSound(new SoundAdditionsAmbience(SoundEvents.AMBIENT_BASALT_DELTAS_ADDITIONS, 0.0111D))
                .setMusic(BackgroundMusicTracks.getDefaultBackgroundMusicSelector(SoundEvents.MUSIC_NETHER_BASALT_DELTAS));
    }

    @Override
    protected Biome.Climate configureClimate() {
        return new Biome.Climate(Biome.RainType.RAIN, 2.0f, Biome.TemperatureModifier.NONE, 0.0f);
    }

    @Override
    protected ConfiguredSurfaceBuilder<?> configureSurfaceBuilder() { return BiomeHelper.newConfiguredSurfaceBuilder
            ("delta_shores", new ConfiguredSurfaceBuilder(ModSurfaceBuilders.DELTA_SHORES_SURFACE_BUILDER,
                    ModSurfaceBuilders.ModSurfaceBuilderConfig.DELTA_SHORES_CONFIG));
    }

    @Override
    protected void configureGeneration(BiomeGenerationSettings.Builder generation) {
        generation.withStructure(StructureFeatures.RUINED_PORTAL_NETHER);
        generation.withStructure(StructureFeatures.FORTRESS);
        generation.withCarver(GenerationStage.Carving.AIR, ConfiguredCarvers.field_243772_f);
        //generation.withFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Features.DELTA);
                /*FeatureSpread.func_242253_a(3, 4), FeatureSpread.func_242253_a(0, 2),
                (((Placement.COUNT_MULTILAYER.configure(new FeatureSpreadConfig(40))));*/
        generation.withFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Features.BASALT_BLOBS);
        generation.withFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Features.BLACKSTONE_BLOBS);
        generation.withFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Features.SMALL_BASALT_COLUMNS);
        generation.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.SPRING_LAVA);
        generation.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.SPRING_LAVA_DOUBLE);
        generation.withFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Features.PATCH_FIRE);
        generation.withFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Features.PATCH_SOUL_FIRE);
        generation.withFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Features.GLOWSTONE);
        generation.withFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Features.GLOWSTONE_EXTRA);
        generation.withFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Features.ORE_MAGMA);
        generation.withFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Features.SPRING_CLOSED_DOUBLE);

 /*
 DELTA = register("delta", Feature.DELTA_FEATURE.withConfiguration(new BasaltDeltasFeature(Features.States.LAVA_BLOCK, Features.States.MAGMA_BLOCK,
 SMALL_BASALT_COLUMNS = register("small_basalt_columns", Feature.BASALT_COLUMNS.withConfiguration(new ColumnConfig(FeatureSpread.func_242252_a(1), FeatureSpread.func_242253_a(1, 3))).withPlacement(Placement.COUNT_MULTILAYER.configure(new FeatureSpreadConfig(4))));
 LARGE_BASALT_COLUMNS = register("large_basalt_columns", Feature.BASALT_COLUMNS.withConfiguration(new ColumnConfig(FeatureSpread.func_242253_a(2, 1), FeatureSpread.func_242253_a(5, 5))).withPlacement(Placement.COUNT_MULTILAYER.configure(new FeatureSpreadConfig(2))));
 BASALT_BLOBS = register("basalt_blobs", Feature.NETHERRACK_REPLACE_BLOBS.withConfiguration(new BlobReplacementConfig(Features.States.NETHERRACK, Features.States.BASALT, FeatureSpread.func_242253_a(3, 4))).range(128).square().func_242731_b(75));
 BLACKSTONE_BLOBS = register("blackstone_blobs", Feature.NETHERRACK_REPLACE_BLOBS.withConfiguration(new BlobReplacementConfig(Features.States.NETHERRACK, Features.States.BLACKSTONE, FeatureSpread.func_242253_a(3, 4))).range(128).square().func_242731_b(25));
 GLOWSTONE_EXTRA = register("glowstone_extra", Feature.GLOWSTONE_BLOB.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.GLOWSTONE.configure(new FeatureSpreadConfig(10))));
 GLOWSTONE = register("glowstone", Feature.GLOWSTONE_BLOB.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).range(128).square().func_242731_b(10));
*/


        DefaultBiomeFeatures.withCommonNetherBlocks(generation);
    }

    @Override
    protected void configureSpawns(MobSpawnInfo.Builder spawns) {
        spawns.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(ModEntityTypes.GLOWSQUITO.get(), 1, 1, 3));
    }
}
