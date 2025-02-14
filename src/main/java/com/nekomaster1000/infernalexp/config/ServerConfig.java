package com.nekomaster1000.infernalexp.config;

import com.nekomaster1000.infernalexp.InfernalExpansion;
import net.minecraftforge.common.ForgeConfigSpec;

public class ServerConfig {

    //Mob Interactions
    final ForgeConfigSpec.BooleanValue piglinFearWarpbeetle;
    final ForgeConfigSpec.BooleanValue piglinFearEmbody;
    final ForgeConfigSpec.BooleanValue hoglinFearWarpbeetle;
    final ForgeConfigSpec.BooleanValue hoglinFearEmbody;
    final ForgeConfigSpec.BooleanValue spiderAttackWarpbeetle;
    final ForgeConfigSpec.BooleanValue skeletonAttackPiglin;
    final ForgeConfigSpec.BooleanValue skeletonAttackBrute;
    final ForgeConfigSpec.BooleanValue skeletonAttackEmbody;
    final ForgeConfigSpec.BooleanValue skeletonAttackGiant;
    final ForgeConfigSpec.BooleanValue piglinAttackSkeleton;
    final ForgeConfigSpec.BooleanValue piglinAttackVoline;
    final ForgeConfigSpec.BooleanValue bruteAttackSkeleton;
    final ForgeConfigSpec.BooleanValue bruteAttackVoline;
    final ForgeConfigSpec.BooleanValue ghastAttackEmbody;
    final ForgeConfigSpec.BooleanValue ghastAttackVoline;
    final ForgeConfigSpec.BooleanValue ghastAttackSkeleton;

    //Mob Spawning Booleans
    final ForgeConfigSpec.BooleanValue volineInWastes;
    final ForgeConfigSpec.BooleanValue shroomloinInCrimson;
    final ForgeConfigSpec.BooleanValue volineInCrimson;
    final ForgeConfigSpec.BooleanValue warpbeetleInWarped;
    final ForgeConfigSpec.BooleanValue giantInDeltas;
    final ForgeConfigSpec.BooleanValue embodyInSSV;

    //Mob Spawn Rates
    final ForgeConfigSpec.IntValue volineWastesRate;
    final ForgeConfigSpec.IntValue shroomloinCrimsonRate;
    final ForgeConfigSpec.IntValue volineCrimsonRate;
    final ForgeConfigSpec.IntValue warpbeetleWarpedRate;
    final ForgeConfigSpec.IntValue giantDeltasRate;
    final ForgeConfigSpec.IntValue embodySSVRate;

    ServerConfig(final ForgeConfigSpec.Builder builder){
        //Mob Interactions
        builder.push("Mob Interactions");

        piglinFearWarpbeetle = builder
                .comment("Determines if Piglins will run away from Warpbeetles")
                .translation(InfernalExpansion.MOD_ID + ".config.piglinFearWarpbeetle")
                .define("piglinFearWarpbeetle", true);

        piglinFearEmbody = builder
                .comment("Determines if Piglins will run away from Embodies")
                .translation(InfernalExpansion.MOD_ID + ".config.piglinFearEmbody")
                .define("piglinFearEmbody", true);

        hoglinFearWarpbeetle = builder
                .comment("Determines if Hoglins will run away from Warpbeetles")
                .translation(InfernalExpansion.MOD_ID + ".config.hoglinFearWarpbeetle")
                .define("hoglinFearWarpbeetle", true);

        hoglinFearEmbody = builder
                .comment("Determines if Hoglins will run away from Embodies")
                .translation(InfernalExpansion.MOD_ID + ".config.hoglinFearEmbody")
                .define("hoglinFearEmbody", true);

        spiderAttackWarpbeetle = builder
                .comment("Determines if Spiders will attack Warpbeetles")
                .translation(InfernalExpansion.MOD_ID + ".config.spiderAttackWarpbeetle")
                .define("spiderAttackWarpbeetle", true);

        skeletonAttackPiglin = builder
                .comment("Determines if Skeletons will attack Piglins")
                .translation(InfernalExpansion.MOD_ID + ".config.skeletonAttackPiglin")
                .define("skeletonAttackPiglin", true);

        skeletonAttackBrute = builder
                .comment("Determines if Skeletons will attack Piglin Brutes")
                .translation(InfernalExpansion.MOD_ID + ".config.skeletonAttackBrute")
                .define("skeletonAttackBrute", true);

        skeletonAttackEmbody = builder
                .comment("Determines if Skeletons will attack Embodies")
                .translation(InfernalExpansion.MOD_ID + ".config.skeletonAttackEmbody")
                .define("skeletonAttackEmbody", true);

        skeletonAttackGiant = builder
                .comment("Determines if Skeletons will attack Basalt Giants")
                .translation(InfernalExpansion.MOD_ID + ".config.skeletonAttackGiant")
                .define("skeletonAttackGiant", true);

        piglinAttackSkeleton = builder
                .comment("Determines if Piglins will attack Skeletons")
                .translation(InfernalExpansion.MOD_ID + ".config.piglinAttackSkeleton")
                .define("piglinAttackSkeleton", true);

        piglinAttackVoline = builder
                .comment("Determines if Piglins will attack Volines")
                .translation(InfernalExpansion.MOD_ID + ".config.piglinAttackVoline")
                .define("piglinAttackVoline", true);

        bruteAttackSkeleton = builder
                .comment("Determines if Piglin Brutes will attack Skeletons")
                .translation(InfernalExpansion.MOD_ID + ".config.bruteAttackSkeleton")
                .define("bruteAttackSkeleton", true);

        bruteAttackVoline = builder
                .comment("Determines if Piglin Brutes will attack Volines")
                .translation(InfernalExpansion.MOD_ID + ".config.bruteAttackVoline")
                .define("bruteAttackVoline", true);

        ghastAttackEmbody = builder
                .comment("Determines if Ghasts will shoot at Embodies")
                .translation(InfernalExpansion.MOD_ID + ".config.ghastAttackEmbody")
                .define("ghastAttackEmbody", true);

        ghastAttackVoline = builder
                .comment("Determines if Ghasts will shoot at Volines")
                .translation(InfernalExpansion.MOD_ID + ".config.ghastAttackVoline")
                .define("ghastAttackVoline", false);

        ghastAttackSkeleton = builder
                .comment("Determines if Ghasts will shoot at Skeletons")
                .translation(InfernalExpansion.MOD_ID + ".config.ghastAttackSkeleton")
                .define("ghastAttackSkeleton", true);

        builder.pop();

        //Mob Spawning
        builder.push("Mob Spawning");

        //Spawn Booleans
        builder.push("Toggle Spawns");

        volineInWastes = builder
                .comment("Determines if Volines will spawn in Nether Wastes")
                .translation(InfernalExpansion.MOD_ID + ".config.volineInWastes")
                .define("volineInWastes", true);

        shroomloinInCrimson = builder
                .comment("Determines if Shroomloins will spawn in the Crimson Forests")
                .translation(InfernalExpansion.MOD_ID + ".config.shroomloinInCrimson")
                .define("shroomloinInCrimson", true);

        volineInCrimson = builder
                .comment("Determines if Volines will spawn in Crimson Forests")
                .translation(InfernalExpansion.MOD_ID + ".config.volineInCrimson")
                .define("volineInCrimson", true);

        warpbeetleInWarped = builder
                .comment("Determines if Warpbeetles will spawn in Warped Forests")
                .translation(InfernalExpansion.MOD_ID + ".config.warpbeetleInWarped")
                .define("warpbeetleInWarped", true);

        giantInDeltas = builder
                .comment("Determines if Basalt Giants will spawn in Basalt Deltas")
                .translation(InfernalExpansion.MOD_ID + ".config.giantInDeltas")
                .define("giantInDeltas", true);

        embodyInSSV = builder
                .comment("Determines if Embodies will spawn in the Soul Sand Valleys")
                .translation(InfernalExpansion.MOD_ID + ".config.embodyInSSV")
                .define("embodyInSSV", true);

        builder.pop();

        //Spawn Rates
        builder.push("Spawn Rates");

        volineWastesRate = builder
                .comment("Determines the rate at which Volines spawn in the Nether Wastes")
                .translation(InfernalExpansion.MOD_ID + ".config.volineWastesRate")
                .defineInRange("volineWastesRate", 50, 0, Integer.MAX_VALUE);

        shroomloinCrimsonRate = builder
                .comment("Determines the rate at which Shroomloins spawn in the Crimson Forests")
                .translation(InfernalExpansion.MOD_ID + ".config.shroomloinCrimsonRate")
                .defineInRange("shroomloinCrimsonRate", 5, 0, Integer.MAX_VALUE);

        volineCrimsonRate = builder
                .comment("Determines the rate at which Volines spawn in the Crimson Forests")
                .translation(InfernalExpansion.MOD_ID + ".config.volineCrimsonRate")
                .defineInRange("volineCrimsonRate", 1, 0, Integer.MAX_VALUE);

        warpbeetleWarpedRate = builder
                .comment("Determines the rate at which Warpbeetles spawn in the Warped Forests")
                .translation(InfernalExpansion.MOD_ID + ".config.warpbeetleWarpedRate")
                .defineInRange("warpbeetleWarpedRate", 5, 0, Integer.MAX_VALUE);

        giantDeltasRate = builder
                .comment("Determines the rate at which Basalt Giants spawn in the Basalt Deltas")
                .translation(InfernalExpansion.MOD_ID + ".config.giantDeltasRate")
                .defineInRange("giantDeltasRate", 30, 0, Integer.MAX_VALUE);

        embodySSVRate = builder
                .comment("Determines the rate at which Embodies spawn in the Soul Sand Valleys")
                .translation(InfernalExpansion.MOD_ID + ".config.embodySSVRate")
                .defineInRange("embodySSVRate", 60, 0, Integer.MAX_VALUE);

        builder.pop();

        builder.pop();
    }
}
