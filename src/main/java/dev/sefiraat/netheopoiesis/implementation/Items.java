package dev.sefiraat.netheopoiesis.implementation;

import dev.sefiraat.netheopoiesis.Netheopoiesis;
import dev.sefiraat.netheopoiesis.api.RecipeTypes;
import dev.sefiraat.netheopoiesis.api.items.BeaconSiphoningBlock;
import dev.sefiraat.netheopoiesis.api.items.BiomeSpreadingSeed;
import dev.sefiraat.netheopoiesis.api.items.CruxSpreadingSeed;
import dev.sefiraat.netheopoiesis.api.items.DoNothingSeed;
import dev.sefiraat.netheopoiesis.api.items.DroppingSeed;
import dev.sefiraat.netheopoiesis.api.items.EntitySpawningSeed;
import dev.sefiraat.netheopoiesis.api.items.GenericTickingSeed;
import dev.sefiraat.netheopoiesis.api.items.HarvestableSeed;
import dev.sefiraat.netheopoiesis.api.items.NetherCrux;
import dev.sefiraat.netheopoiesis.api.plant.Growth;
import dev.sefiraat.netheopoiesis.api.plant.netheos.NetheoBalls;
import dev.sefiraat.netheopoiesis.implementation.blocks.NetherBeacon;
import dev.sefiraat.netheopoiesis.implementation.flora.CrystallineCrux;
import dev.sefiraat.netheopoiesis.implementation.flora.PurificationSeed;
import dev.sefiraat.netheopoiesis.implementation.flora.WetSeed;
import dev.sefiraat.netheopoiesis.api.plant.GrowthStages;
import dev.sefiraat.netheopoiesis.api.plant.Placements;
import dev.sefiraat.netheopoiesis.implementation.tools.Analyser;
import dev.sefiraat.netheopoiesis.implementation.tools.EnderCake;
import dev.sefiraat.netheopoiesis.implementation.tools.HarvestingTool;
import dev.sefiraat.netheopoiesis.implementation.tools.MixingQuartz;
import dev.sefiraat.netheopoiesis.implementation.tools.PurificationBarometer;
import dev.sefiraat.netheopoiesis.implementation.tools.PurificationScanner;
import dev.sefiraat.netheopoiesis.utils.EasterEggUtils;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.bukkit.Material;
import org.bukkit.block.Biome;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fox;
import org.bukkit.inventory.ItemStack;

import java.util.Set;

/**
 * Final class used to store and initialise the {@link SlimefunItem}s used in the addon
 */
public final class Items {

    private Items() {
        throw new IllegalStateException("Utility class");
    }

    public static void setup(Netheopoiesis addon) {

        // Vanilla Reference ItemStacks
        final ItemStack oakPlank = new ItemStack(Material.OAK_PLANKS);
        final ItemStack ironIngot = new ItemStack(Material.IRON_INGOT);
        final ItemStack glass = new ItemStack(Material.GLASS);
        final ItemStack quartz = new ItemStack(Material.QUARTZ);
        final ItemStack redstone = new ItemStack(Material.REDSTONE);
        final ItemStack wheat = new ItemStack(Material.WHEAT);
        final ItemStack milkBucket = new ItemStack(Material.MILK_BUCKET);

        // region Crux'

        new NetherCrux(
            Groups.CRUX,
            Stacks.BASIC_PURIFIED_NETHERRACK,
            1
        ).register(addon);

        new NetherCrux(
            Groups.CRUX,
            Stacks.PURIFIED_NETHERRACK,
            2
        ).register(addon);

        new NetherCrux(
            Groups.CRUX,
            Stacks.VORACIOUS_DIRT,
            4
        ).register(addon);

        new NetherCrux(
            Groups.CRUX,
            Stacks.NETHER_DIRT,
            8
        ).register(addon);

        new NetherCrux(
            Groups.CRUX,
            Stacks.NETHER_GRASS,
            16
        ).register(addon);

        new NetherCrux(
            Groups.CRUX,
            Stacks.JUNGLE_CRUX,
            16
        ).register(addon);

        new NetherCrux(
            Groups.CRUX,
            Stacks.BEACH_CRUX,
            16
        ).register(addon);

        new NetherCrux(
            Groups.CRUX,
            Stacks.DESERT_CRUX,
            16
        ).register(addon);

        new NetherCrux(
            Groups.CRUX,
            Stacks.SNOW_CRUX,
            16
        ).register(addon);

        new NetherCrux(
            Groups.CRUX,
            Stacks.STONEY_CRUX,
            16
        ).register(addon);

        new NetherCrux(
            Groups.CRUX,
            Stacks.SWAMP_CRUX,
            16
        ).register(addon);

        new CrystallineCrux(
            Groups.CRUX,
            Stacks.CRYSTALLINE_CRUX,
            1
        ).register(addon);

        // endregion

        // region Crafting

        new SlimefunItem(
            Groups.CRAFTING,
            Stacks.ADDON_BERRY,
            RecipeTypes.PLANT_HARVEST,
            new ItemStack[0]
        ).register(addon);

        new SlimefunItem(
            Groups.CRAFTING,
            Stacks.ADDON_JAM,
            RecipeType.ORE_CRUSHER,
            new ItemStack[]{
                Stacks.ADDON_BERRY.item()
            }
        ).register(addon);

        new SlimefunItem(
            Groups.CRAFTING,
            Stacks.HARMONISED_CRYSTAL_FIRE,
            RecipeTypes.WANDERING_PIGLIN_TRADE,
            RecipeTypes.createTradingRecipe(
                Stacks.HARMONISED_CRYSTAL_FIRE.item(),
                NetheoBalls.BAD,
                20
            )
        ).register(addon);

        new SlimefunItem(
            Groups.CRAFTING,
            Stacks.HARMONISED_CRYSTAL_WATER,
            RecipeTypes.WANDERING_PIGLIN_TRADE,
            RecipeTypes.createTradingRecipe(
                Stacks.HARMONISED_CRYSTAL_WATER.item(),
                NetheoBalls.ANCHOVY,
                20
            )
        ).register(addon);

        new SlimefunItem(
            Groups.CRAFTING,
            Stacks.HARMONISED_CRYSTAL_EARTH,
            RecipeTypes.WANDERING_PIGLIN_TRADE,
            RecipeTypes.createTradingRecipe(
                Stacks.HARMONISED_CRYSTAL_EARTH.item(),
                NetheoBalls.BERRY,
                20
            )
        ).register(addon);
        
        new SlimefunItem(
            Groups.CRAFTING,
            Stacks.HARMONISED_CRYSTAL_AIR,
            RecipeTypes.WANDERING_PIGLIN_TRADE,
            RecipeTypes.createTradingRecipe(
                Stacks.HARMONISED_CRYSTAL_AIR.item(),
                NetheoBalls.ASTRINGENT,
                20
            )
        ).register(addon);

        new SlimefunItem(
            Groups.CRAFTING,
            Stacks.DISCORDANT_CRYSTAL_FIRE,
            RecipeTypes.WANDERING_PIGLIN_TRADE,
            RecipeTypes.createTradingRecipe(
                Stacks.DISCORDANT_CRYSTAL_FIRE.item(),
                NetheoBalls.BITTERSWEET,
                20
            )
        ).register(addon);

        new SlimefunItem(
            Groups.CRAFTING,
            Stacks.DISCORDANT_CRYSTAL_WATER,
            RecipeTypes.WANDERING_PIGLIN_TRADE,
            RecipeTypes.createTradingRecipe(
                Stacks.DISCORDANT_CRYSTAL_WATER.item(),
                NetheoBalls.BONITO,
                20
            )
        ).register(addon);

        new SlimefunItem(
            Groups.CRAFTING,
            Stacks.DISCORDANT_CRYSTAL_EARTH,
            RecipeTypes.WANDERING_PIGLIN_TRADE,
            RecipeTypes.createTradingRecipe(
                Stacks.DISCORDANT_CRYSTAL_EARTH.item(),
                NetheoBalls.BROTHY,
                20
            )
        ).register(addon);
        
        new SlimefunItem(
            Groups.CRAFTING,
            Stacks.DISCORDANT_CRYSTAL_AIR,
            RecipeTypes.WANDERING_PIGLIN_TRADE,
            RecipeTypes.createTradingRecipe(
                Stacks.DISCORDANT_CRYSTAL_AIR.item(),
                NetheoBalls.CANDY,
                20
            )
        ).register(addon);

        new SlimefunItem(
            Groups.CRAFTING,
            Stacks.DISSONANT_CRYSTAL_FIRE,
            RecipeTypes.WANDERING_PIGLIN_TRADE,
            RecipeTypes.createTradingRecipe(
                Stacks.DISSONANT_CRYSTAL_FIRE.item(),
                NetheoBalls.BITTERSWEET,
                20
            )
        ).register(addon);

        new SlimefunItem(
            Groups.CRAFTING,
            Stacks.DISSONANT_CRYSTAL_WATER,
            RecipeTypes.WANDERING_PIGLIN_TRADE,
            RecipeTypes.createTradingRecipe(
                Stacks.DISSONANT_CRYSTAL_WATER.item(),
                NetheoBalls.BONITO,
                20
            )
        ).register(addon);

        new SlimefunItem(
            Groups.CRAFTING,
            Stacks.DISSONANT_CRYSTAL_EARTH,
            RecipeTypes.WANDERING_PIGLIN_TRADE,
            RecipeTypes.createTradingRecipe(
                Stacks.DISSONANT_CRYSTAL_EARTH.item(),
                NetheoBalls.BROTHY,
                20
            )
        ).register(addon);
        
        new SlimefunItem(
            Groups.CRAFTING,
            Stacks.DISSONANT_CRYSTAL_AIR,
            RecipeTypes.WANDERING_PIGLIN_TRADE,
            RecipeTypes.createTradingRecipe(
                Stacks.DISSONANT_CRYSTAL_AIR.item(),
                NetheoBalls.CANDY,
                20
            )
        ).register(addon);
        
        new SlimefunItem(
            Groups.CRAFTING,
            Stacks.ELEMENTAL_CRYSTAL,
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                null, Stacks.HARMONISED_CRYSTAL_FIRE.item(), null,
                Stacks.HARMONISED_CRYSTAL_WATER.item(), new ItemStack(Material.NETHER_STAR), Stacks.HARMONISED_CRYSTAL_EARTH.item(),
                null, Stacks.HARMONISED_CRYSTAL_AIR.item(), null
            }
        ).register(addon);
        
        new SlimefunItem(
            Groups.CRAFTING,
            Stacks.VACUUM_CRYSTAL,
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                null, Stacks.DISCORDANT_CRYSTAL_FIRE.item(), null,
                Stacks.DISCORDANT_CRYSTAL_WATER.item(), Stacks.ELEMENTAL_CRYSTAL.item(), Stacks.DISCORDANT_CRYSTAL_EARTH.item(),
                null, Stacks.DISCORDANT_CRYSTAL_AIR.item(), null
            }
        ).register(addon);
        
        new SlimefunItem(
            Groups.CRAFTING,
            Stacks.IRREGULAR_CRYSTAL,
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                null, Stacks.DISSONANT_CRYSTAL_FIRE.item(), null,
                Stacks.DISSONANT_CRYSTAL_WATER.item(), Stacks.VACUUM_CRYSTAL.item(), Stacks.DISSONANT_CRYSTAL_EARTH.item(),
                null, Stacks.DISSONANT_CRYSTAL_AIR.item(), null
            }
        ).register(addon);

        new UnplaceableBlock(
            Groups.CRAFTING,
            Stacks.QUARTZ_BLANK,
            RecipeTypes.WANDERING_PIGLIN_TRADE,
            RecipeTypes.createTradingRecipe(
                Stacks.QUARTZ_BLANK.item(),
                NetheoBalls.CITRUS,
                20
            )
        ).register(addon);

        // endregion

        // region Tools

        new HarvestingTool(
            Groups.TOOLS,
            Stacks.CRUDE_HARVESTING_TOOL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                null, null, oakPlank,
                oakPlank, oakPlank, null,
                oakPlank, oakPlank, null,
            },
            25
        ).register(addon);

        new HarvestingTool(
            Groups.TOOLS,
            Stacks.HARVESTING_TOOL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                null, null, ironIngot,
                ironIngot, ironIngot, null,
                ironIngot, ironIngot, null,
            },
            150
        ).register(addon);

        new PurificationBarometer(
            Groups.TOOLS,
            Stacks.PURIFICATION_BAROMETER,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SlimefunItems.ZINC_INGOT.item(), glass, SlimefunItems.ZINC_INGOT.item(),
                glass, redstone, glass,
                SlimefunItems.ZINC_INGOT.item(), glass, SlimefunItems.ZINC_INGOT.item(),
            }
        ).register(addon);

        new PurificationScanner(
            Groups.TOOLS,
            Stacks.PURIFICATION_SCANNER,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SlimefunItems.BILLON_INGOT.item(), glass, SlimefunItems.BILLON_INGOT.item(),
                glass, Stacks.PURIFICATION_BAROMETER.item(), glass,
                SlimefunItems.BILLON_INGOT.item(), glass, SlimefunItems.BILLON_INGOT.item(),
            }
        ).register(addon);

        new SlimefunItem(
            Groups.TOOLS,
            Stacks.CRUX_GATHERER,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SlimefunItems.REINFORCED_ALLOY_INGOT.item(), SlimefunItems.REINFORCED_ALLOY_INGOT.item(), SlimefunItems.REINFORCED_ALLOY_INGOT.item(),
                null, glass, null,
                null, glass, null,
            }
        ).register(addon);

        new MixingQuartz(
            Groups.TOOLS,
            Stacks.MIXING_QUARTZ,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                null, quartz, null,
                quartz, Stacks.HARVESTING_TOOL.item(), quartz,
                Stacks.SAINTLY_SEED.item(), glass, Stacks.SAINTLY_SEED.item(),
            },
            50
        ).register(addon);

        new EnderCake(
            Groups.TOOLS,
            Stacks.ENDER_CAKE,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                milkBucket, milkBucket, milkBucket,
                Stacks.ADDON_JAM.item(), Stacks.ADDON_JAM.item(), Stacks.ADDON_JAM.item(),
                wheat, wheat, wheat,
            }
        ).register(addon);

        new NetherBeacon(
            Groups.TOOLS,
            Stacks.NETHER_BEACON,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                null, null, null,
                null, Stacks.ELEMENTAL_CRYSTAL.item(), null,
                null, new ItemStack(Material.BEACON), null
            },
            0,
            20,
            1
        ).register(addon);

        new BeaconSiphoningBlock(
            Groups.TOOLS,
            Stacks.NETHER_BEACON_BASE_1,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                null, null, null,
                null, Stacks.ELEMENTAL_CRYSTAL.item(), null,
                null, Stacks.QUARTZ_BLANK.item(), null
            },
            1,
            10,
            1
        ).register(addon);

        new BeaconSiphoningBlock(
            Groups.TOOLS,
            Stacks.NETHER_BEACON_BASE_2,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                null, null, null,
                null, Stacks.VACUUM_CRYSTAL.item(), null,
                null, Stacks.QUARTZ_BLANK.item(), null
            },
            2,
            15,
            1
        ).register(addon);

        new BeaconSiphoningBlock(
            Groups.TOOLS,
            Stacks.NETHER_BEACON_BASE_3,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                null, null, null,
                null, Stacks.IRREGULAR_CRYSTAL.item(), null,
                null, Stacks.QUARTZ_BLANK.item(), null
            },
            3,
            20,
            1
        ).register(addon);

        new Analyser(
            Groups.TOOLS,
            Stacks.SEED_ANALYSER,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SlimefunItems.DAMASCUS_STEEL_INGOT.item(), glass, SlimefunItems.DAMASCUS_STEEL_INGOT.item(),
                SlimefunItems.BRASS_INGOT.item(), glass, SlimefunItems.BRASS_INGOT.item(),
                SlimefunItems.DAMASCUS_STEEL_INGOT.item(), redstone, SlimefunItems.DAMASCUS_STEEL_INGOT.item(),
            },
            Set.of(
                Analyser.AnalyserType.SEED
            )
        ).register(addon);

        new Analyser(
            Groups.TOOLS,
            Stacks.SIPHON_ANALYSER,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SlimefunItems.REINFORCED_ALLOY_INGOT.item(), glass, SlimefunItems.REINFORCED_ALLOY_INGOT.item(),
                SlimefunItems.BRASS_INGOT.item(), Stacks.SEED_ANALYSER.item(), SlimefunItems.BRASS_INGOT.item(),
                SlimefunItems.REINFORCED_ALLOY_INGOT.item(), redstone, SlimefunItems.REINFORCED_ALLOY_INGOT.item(),
            },
            Set.of(
                Analyser.AnalyserType.SIPHON
            )
        ).register(addon);

        // endregion

        // region Seeds

        new PurificationSeed(
            Stacks.PURIFICATION_SEED,
            RecipeTypes.createWorldDropRecipe(Stacks.PURIFICATION_SEED.item(), new ItemStack(Material.SOUL_SOIL), 0.05)
        )
            .setGrowth(new Growth(GrowthStages.VINEY_BLUE, Placements.NULL, 1, 0.30))
            .tryRegister(addon);

        new CruxSpreadingSeed(Stacks.SOUL_SEED)
            .setSpreadChance(0.25)
            .setCrux(Stacks.PURIFIED_NETHERRACK)
            .setGrowth(new Growth(GrowthStages.VINEY_BLUE, Placements.ALL, 2, 0.2))
            .addBreedingPair(Stacks.ROTTEN_SEED.getItemId(), Stacks.PURIFICATION_SEED.getItemId(), 0.1, 0.2)
            .addFlavourProfile(2, 0, 0, 0, 0)
            .tryRegister(addon);

        new CruxSpreadingSeed(Stacks.SPIRIT_SEED)
            .setSpreadChance(0.2)
            .setCrux(Stacks.VORACIOUS_DIRT)
            .setGrowth(new Growth(GrowthStages.VINEY_BLUE, Placements.PURIFIED_AND_UP, 4, 0.15))
            .addBreedingPair(Stacks.SOUL_SEED.getItemId(), Stacks.PERFECTION_SEED.getItemId(), 0.1, 0.15)
            .addFlavourProfile(4, 0, 0, 0, 0)
            .tryRegister(addon);

        new CruxSpreadingSeed(Stacks.SAINTLY_SEED)
            .setSpreadChance(0.15)
            .setCrux(Stacks.NETHER_DIRT)
            .setGrowth(new Growth(GrowthStages.VINEY_BLUE, Placements.VORACIOUS_AND_UP, 8, 0.1))
            .addBreedingPair(Stacks.OAKENDRAN_SEED.getItemId(), Stacks.SPIRIT_SEED.getItemId(), 0.1, 0.15)
            .addFlavourProfile(8, 0, 0, 0, 0)
            .tryRegister(addon);

        new CruxSpreadingSeed(Stacks.EDEN_SEED)
            .setSpreadChance(0.1)
            .setCrux(Stacks.NETHER_GRASS)
            .setGrowth(new Growth(GrowthStages.VINEY_BLUE, Placements.NETHER_DIRT_AND_UP, 16, 0.1))
            .addBreedingPair(Stacks.GATEWAY_SEED.getItemId(), Stacks.PERFECTION_SEED.getItemId(), 0.15, 0.2)
            .addFlavourProfile(16, 0, 0, 0, 0)
            .tryRegister(addon);

        new BiomeSpreadingSeed(Stacks.JUNGLE_SEED)
            .setBiome(Biome.JUNGLE)
            .setSpreadChance(0.1)
            .setCrux(Stacks.JUNGLE_CRUX)
            .setGrowth(new Growth(GrowthStages.VINEY_GREEN, Placements.JUNGLE_FRINGE, 16, 0.1))
            .addBreedingPair(Stacks.EDEN_SEED.getItemId(), Stacks.EDEN_SEED.getItemId(), 0.05, 0.05)
            .addFlavourProfile(16, 0, 0, 4, 0)
            .tryRegister(addon);

        new BiomeSpreadingSeed(Stacks.BEACH_SEED)
            .setBiome(Biome.BEACH)
            .setSpreadChance(0.1)
            .setCrux(Stacks.BEACH_CRUX)
            .setGrowth(new Growth(GrowthStages.VINEY_YELLOW, Placements.BEACH_FRINGE, 16, 0.1))
            .addBreedingPair(Stacks.EDEN_SEED.getItemId(), Stacks.EDEN_SEED.getItemId(), 0.05, 0.05)
            .addFlavourProfile(16, 0, 4, 0, 0)
            .tryRegister(addon);

        new BiomeSpreadingSeed(Stacks.DESERT_SEED)
            .setBiome(Biome.DESERT)
            .setSpreadChance(0.1)
            .setCrux(Stacks.DESERT_CRUX)
            .setGrowth(new Growth(GrowthStages.VINEY_RED, Placements.DESERT_FRINGE, 16, 0.1))
            .addBreedingPair(Stacks.EDEN_SEED.getItemId(), Stacks.EDEN_SEED.getItemId(), 0.05, 0.05)
            .addFlavourProfile(16, 0, 0, 0, 4)
            .tryRegister(addon);

        new BiomeSpreadingSeed(Stacks.SNOW_SEED)
            .setBiome(Biome.SNOWY_PLAINS)
            .setSpreadChance(0.1)
            .setCrux(Stacks.SNOW_CRUX)
            .setGrowth(new Growth(GrowthStages.VINEY_CYAN, Placements.SNOW_FRINGE, 16, 0.1))
            .addBreedingPair(Stacks.EDEN_SEED.getItemId(), Stacks.EDEN_SEED.getItemId(), 0.05, 0.05)
            .addFlavourProfile(20, 0, 0, 0, 0)
            .tryRegister(addon);

        new BiomeSpreadingSeed(Stacks.STONEY_SEED)
            .setBiome(Biome.STONY_SHORE)
            .setSpreadChance(0.1)
            .setCrux(Stacks.STONEY_CRUX)
            .setGrowth(new Growth(GrowthStages.VINEY_PURPLE, Placements.STONEY_FRINGE, 16, 0.1))
            .addBreedingPair(Stacks.EDEN_SEED.getItemId(), Stacks.EDEN_SEED.getItemId(), 0.05, 0.05)
            .addFlavourProfile(16, 0, 2, 2, 0)
            .tryRegister(addon);

        new BiomeSpreadingSeed(Stacks.SWAMP_SEED)
            .setBiome(Biome.SWAMP)
            .setSpreadChance(0.1)
            .setCrux(Stacks.SWAMP_CRUX)
            .setGrowth(new Growth(GrowthStages.VINEY_GREEN, Placements.SWAMP_FRINGE, 16, 0.1))
            .addBreedingPair(Stacks.EDEN_SEED.getItemId(), Stacks.EDEN_SEED.getItemId(), 0.05, 0.05)
            .addFlavourProfile(16, 4, 0, 0, 0)
            .tryRegister(addon);

        new GenericTickingSeed(Stacks.SPINDLE_SEED)
            .setConsumer(GenericTickingMethods::onTickSpindleSeed)
            .setGrowth(new Growth(GrowthStages.SPIKEY_ORANGE, Placements.ALL, 1, 0.09))
            .addBreedingPair(Stacks.PURIFICATION_SEED.getItemId(), Stacks.PURIFICATION_SEED.getItemId(), 0.1, 0.2)
            .addFlavourProfile(0, 1, 0, 1, 0)
            .tryRegister(addon);

        new DroppingSeed(Stacks.GRAINY_SEED)
            .addDrop(new ItemStack(Material.REDSTONE), 1)
            .setTriggerChance(0.01)
            .setGrowth(new Growth(GrowthStages.VINEY_RED, Placements.ALL, 1, 0.09))
            .addBreedingPair(Stacks.PURIFICATION_SEED.getItemId(), Stacks.PURIFICATION_SEED.getItemId(), 0.1, 0.2)
            .addFlavourProfile(0, 0, 0, 1, 1)
            .tryRegister(addon);

        new DroppingSeed(Stacks.STRINGY_SEED)
            .addDrop(new ItemStack(Material.STRING), 1)
            .setTriggerChance(0.01)
            .setGrowth(new Growth(GrowthStages.VINEY_GREEN, Placements.ALL, 1, 0.09))
            .addBreedingPair(Stacks.PURIFICATION_SEED.getItemId(), Stacks.PURIFICATION_SEED.getItemId(), 0.1, 0.2)
            .addFlavourProfile(0, 1, 1, 0, 0)
            .tryRegister(addon);

        new DroppingSeed(Stacks.GRASS_SEED)
            .addDrop(new ItemStack(Material.SHORT_GRASS), 2)
            .addDrop(new ItemStack(Material.TALL_GRASS), 2)
            .addDrop(new ItemStack(Material.SEAGRASS), 1)
            .setTriggerChance(0.01)
            .setGrowth(new Growth(GrowthStages.VINEY_GREEN, Placements.ALL, 1, 0.09))
            .addBreedingPair(Stacks.SPINDLE_SEED.getItemId(), Stacks.STRINGY_SEED.getItemId(), 0.1, 0.2)
            .addFlavourProfile(2, 0, 0, 0, 0)
            .tryRegister(addon);

        new DroppingSeed(Stacks.COBBLED_SEED)
            .addDrop(new ItemStack(Material.COBBLESTONE), 1)
            .setTriggerChance(0.01)
            .setGrowth(new Growth(GrowthStages.VINEY_PURPLE, Placements.ALL, 1, 0.09))
            .addBreedingPair(Stacks.SPINDLE_SEED.getItemId(), Stacks.GRAINY_SEED.getItemId(), 0.1, 0.2)
            .addFlavourProfile(0, 0, 1, 1, 0)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.VOLCANIC_SEED)
            .setHarvestingResult(new ItemStack(Material.GRANITE))
            .setGrowth(new Growth(GrowthStages.FUNGAL_RED, Placements.ALL, 1, 0.09))
            .addBreedingPair(Stacks.COBBLED_SEED.getItemId(), Stacks.COBBLED_SEED.getItemId(), 0.1, 0.2)
            .addFlavourProfile(0, 0, 1, 1, 1)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.IGNEOUS_SEED)
            .setHarvestingResult(new ItemStack(Material.ANDESITE))
            .setGrowth(new Growth(GrowthStages.FUNGAL_CYAN, Placements.ALL, 1, 0.09))
            .addBreedingPair(Stacks.COBBLED_SEED.getItemId(), Stacks.COBBLED_SEED.getItemId(), 0.1, 0.2)
            .addFlavourProfile(0, 0, 1, 1, 1)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.FELDSPAR_SEED)
            .setHarvestingResult(new ItemStack(Material.DIORITE))
            .setGrowth(new Growth(GrowthStages.FUNGAL_YELLOW, Placements.ALL, 1, 0.09))
            .addBreedingPair(Stacks.COBBLED_SEED.getItemId(), Stacks.COBBLED_SEED.getItemId(), 0.1, 0.2)
            .addFlavourProfile(0, 0, 1, 1, 1)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.DEEPSLATE_SEED)
            .setHarvestingResult(new ItemStack(Material.COBBLED_DEEPSLATE))
            .setGrowth(new Growth(GrowthStages.VINEY_PURPLE, Placements.ALL, 1, 0.09))
            .addBreedingPair(Stacks.IGNEOUS_SEED.getItemId(), Stacks.VOLCANIC_SEED.getItemId(), 0.1, 0.2)
            .addFlavourProfile(0, 0, 1, 1, 1)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.DUSTY_SEED)
            .setHarvestingResult(new ItemStack(Material.GRAVEL))
            .setGrowth(new Growth(GrowthStages.SPIKEY_CYAN, Placements.ALL, 1, 0.09))
            .addBreedingPair(Stacks.COBBLED_SEED.getItemId(), Stacks.GRAINY_SEED.getItemId(), 0.1, 0.2)
            .addFlavourProfile(1, 0, 1, 0, 1)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.SEASIDE_SEED)
            .setHarvestingResult(new ItemStack(Material.SAND))
            .setGrowth(new Growth(GrowthStages.SPIKEY_YELLOW, Placements.ALL, 1, 0.09))
            .addBreedingPair(Stacks.SPINDLE_SEED.getItemId(), Stacks.DUSTY_SEED.getItemId(), 0.05, 0.2)
            .addFlavourProfile(0, 0, 2, 0, 0)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.NORI_SEED)
            .setHarvestingResult(new ItemStack(Material.KELP))
            .setGrowth(new Growth(GrowthStages.SPIKEY_GREEN, Placements.ALL, 1, 0.09))
            .addBreedingPair(Stacks.SEASIDE_SEED.getItemId(), Stacks.GRASS_SEED.getItemId(), 0.05, 0.2)
            .addFlavourProfile(0, 0, 3, 0, 0)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.MOLDABLE_SEED)
            .setHarvestingResult(new ItemStack(Material.CLAY_BALL))
            .setGrowth(new Growth(GrowthStages.FUNGAL_PURPLE, Placements.ALL, 1, 0.09))
            .addBreedingPair(Stacks.SEASIDE_SEED.getItemId(), Stacks.COBBLED_SEED.getItemId(), 0.05, 0.2)
            .addFlavourProfile(0, 0, 2, 0, 1)
            .tryRegister(addon);

        new WetSeed(Stacks.WET_SEED)
            .setGrowth(new Growth(GrowthStages.VINEY_BLUE, Placements.ALL, 2, 0.11))
            .addBreedingPair(Stacks.SEASIDE_SEED.getItemId(), Stacks.MOLDABLE_SEED.getItemId(), 0.1, 0.1)
            .addFlavourProfile(1, 0, 0, 0, 1)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.SPLINTERED_SEED)
            .setEntityType(EntityType.SKELETON)
            .setGrowth(new Growth(GrowthStages.SPAWNING_CYAN, Placements.ALL, 2, 0.08))
            .addBreedingPair(Stacks.SPINDLE_SEED.getItemId(), Stacks.STRINGY_SEED.getItemId(), 0.05, 0.2)
            .addFlavourProfile(0, 3, 0, 0, 0)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.ROTTEN_SEED)
            .setEntityType(EntityType.ZOMBIE)
            .setGrowth(new Growth(GrowthStages.SPAWNING_GREEN, Placements.ALL, 2, 0.08))
            .addBreedingPair(Stacks.SPLINTERED_SEED.getItemId(), Stacks.DUSTY_SEED.getItemId(), 0.05, 0.2)
            .addFlavourProfile(0, 2, 0, 0, 1)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.METALLIC_SEED)
            .setHarvestingResult(new ItemStack(Material.IRON_NUGGET))
            .setGrowth(new Growth(GrowthStages.VINEY_RED, Placements.ALL, 2, 0.08))
            .addBreedingPair(Stacks.SOUL_SEED.getItemId(), Stacks.SOUL_SEED.getItemId(), 0.05, 0.2)
            .addFlavourProfile(0, 0, 0, 0, 4)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.TARNISHED_SEED)
            .setHarvestingResult(new ItemStack(Material.RAW_COPPER))
            .setGrowth(new Growth(GrowthStages.VINEY_ORANGE, Placements.ALL, 2, 0.08))
            .addBreedingPair(Stacks.METALLIC_SEED.getItemId(), Stacks.DUSTY_SEED.getItemId(), 0.05, 0.2)
            .addFlavourProfile(2, 2, 0, 0, 0)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.SHINY_SEED)
            .setHarvestingResult(new ItemStack(Material.GOLD_NUGGET))
            .setGrowth(new Growth(GrowthStages.VINEY_YELLOW, Placements.ALL, 2, 0.08))
            .addBreedingPair(Stacks.SOUL_SEED.getItemId(), Stacks.SOUL_SEED.getItemId(), 0.05, 0.2)
            .addFlavourProfile(0, 0, 1, 2, 0)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.SMOOTH_SEED)
            .setHarvestingResult(new ItemStack(Material.AMETHYST_SHARD))
            .setGrowth(new Growth(GrowthStages.VINEY_PURPLE, Placements.ALL, 2, 0.08))
            .addBreedingPair(Stacks.SOUL_SEED.getItemId(), Stacks.SOUL_SEED.getItemId(), 0.05, 0.2)
            .addFlavourProfile(1, 1, 1, 1, 0)
            .tryRegister(addon);

        new DroppingSeed(Stacks.SEEDY_SEED)
            .addDrop(new ItemStack(Material.WHEAT_SEEDS), 1)
            .addDrop(new ItemStack(Material.MELON_SEEDS), 1)
            .addDrop(new ItemStack(Material.BEETROOT_SEEDS), 1)
            .addDrop(new ItemStack(Material.PUMPKIN_SEEDS), 1)
            .setTriggerChance(0.01)
            .setGrowth(new Growth(GrowthStages.FUNGAL_YELLOW, Placements.PURIFIED_AND_UP, 2, 0.08))
            .addBreedingPair(Stacks.SMOOTH_SEED.getItemId(), Stacks.GRASS_SEED.getItemId(), 0.05, 0.2)
            .addFlavourProfile(2, 1, 0, 1, 0)
            .tryRegister(addon);

        new GenericTickingSeed(Stacks.SWEET_SEED)
            .setConsumer(GenericTickingMethods::onTickSweetSeed)
            .setGrowth(new Growth(GrowthStages.SPIKEY_CYAN, Placements.PURIFIED_AND_UP, 3, 0.07))
            .addBreedingPair(Stacks.SEEDY_SEED.getItemId(), Stacks.SEASIDE_SEED.getItemId(), 0.05, 0.2)
            .addFlavourProfile(5, 0, 0, 0, 0)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.ENCHANTED_SEED)
            .setHarvestingResult(new ItemStack(Material.LAPIS_LAZULI))
            .setGrowth(new Growth(GrowthStages.VINEY_BLUE, Placements.PURIFIED_AND_UP, 3, 0.07))
            .addBreedingPair(Stacks.SHINY_SEED.getItemId(), Stacks.SOUL_SEED.getItemId(), 0.05, 0.2)
            .addFlavourProfile(0, 0, 0, 0, 4)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.COMBUSTIBLE_SEED)
            .setHarvestingResult(new ItemStack(Material.COAL))
            .setGrowth(new Growth(GrowthStages.SPIKEY_RED, Placements.PURIFIED_AND_UP, 3, 0.07))
            .addBreedingPair(Stacks.SMOOTH_SEED.getItemId(), Stacks.SPLINTERED_SEED.getItemId(), 0.05, 0.2)
            .addFlavourProfile(0, 0, 0, 2, 3)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.PROTECTIVE_SEED)
            .setEntityType(EntityType.IRON_GOLEM)
            .setGrowth(new Growth(GrowthStages.SPAWNING_PURPLE, Placements.PURIFIED_AND_UP, 5, 0.03))
            .addBreedingPair(Stacks.METALLIC_SEED.getItemId(), Stacks.SOUL_SEED.getItemId(), 0.2, 0.1)
            .addFlavourProfile(3, 0, 2, 0, 0)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.PORKY_SEED)
            .setEntityType(EntityType.PIG)
            .setGrowth(new Growth(GrowthStages.SPAWNING_RED, Placements.PURIFIED_AND_UP, 3, 0.08))
            .addBreedingPair(Stacks.SPINDLE_SEED.getItemId(), Stacks.SOUL_SEED.getItemId(), 0.07, 0.1)
            .addFlavourProfile(0, 0, 2, 0, 3)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.VALUABLE_SEED)
            .setHarvestingResult(new ItemStack(Material.EMERALD))
            .setGrowth(new Growth(GrowthStages.VINEY_GREEN, Placements.PURIFIED_AND_UP, 3, 0.07))
            .addBreedingPair(Stacks.SHINY_SEED.getItemId(), Stacks.ENCHANTED_SEED.getItemId(), 0.05, 0.2)
            .addFlavourProfile(0, 0, 2, 2, 1)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.PERFECTION_SEED)
            .setHarvestingResult(new ItemStack(Material.DIAMOND))
            .setGrowth(new Growth(GrowthStages.FUNGAL_BLUE, Placements.PURIFIED_AND_UP, 5, 0.07))
            .addBreedingPair(Stacks.SHINY_SEED.getItemId(), Stacks.VALUABLE_SEED.getItemId(), 0.05, 0.2)
            .addFlavourProfile(0, 2, 0, 3, 0)
            .tryRegister(addon);

        new DroppingSeed(Stacks.RAINBOW_SEED)
            .addDrop(new ItemStack(Material.WHITE_DYE), 1)
            .addDrop(new ItemStack(Material.ORANGE_DYE), 1)
            .addDrop(new ItemStack(Material.MAGENTA_DYE), 1)
            .addDrop(new ItemStack(Material.LIGHT_BLUE_DYE), 1)
            .addDrop(new ItemStack(Material.YELLOW_DYE), 1)
            .addDrop(new ItemStack(Material.LIME_DYE), 1)
            .addDrop(new ItemStack(Material.PINK_DYE), 1)
            .addDrop(new ItemStack(Material.GRAY_DYE), 1)
            .addDrop(new ItemStack(Material.LIGHT_GRAY_DYE), 1)
            .addDrop(new ItemStack(Material.CYAN_DYE), 1)
            .addDrop(new ItemStack(Material.PURPLE_DYE), 1)
            .addDrop(new ItemStack(Material.BLUE_DYE), 1)
            .addDrop(new ItemStack(Material.BROWN_DYE), 1)
            .addDrop(new ItemStack(Material.GREEN_DYE), 1)
            .addDrop(new ItemStack(Material.RED_DYE), 1)
            .addDrop(new ItemStack(Material.BLACK_DYE), 1)
            .setTriggerChance(0.01)
            .setGrowth(new Growth(GrowthStages.VINEY_CYAN, Placements.VORACIOUS_AND_UP, 8, 0.06))
            .addBreedingPair(Stacks.SPIRIT_SEED.getItemId(), Stacks.SPIRIT_SEED.getItemId(), 0.05, 0.2)
            .addFlavourProfile(4, 2, 2, 0, 0)
            .tryRegister(addon);

        new DroppingSeed(Stacks.GLOWING_SEED)
            .addDrop(new ItemStack(Material.GLOW_LICHEN), 1)
            .addDrop(new ItemStack(Material.GLOW_BERRIES), 1)
            .addDrop(new ItemStack(Material.GLOW_INK_SAC), 1)
            .setTriggerChance(0.01)
            .setGrowth(new Growth(GrowthStages.FUNGAL_RED, Placements.VORACIOUS_AND_UP, 8, 0.06))
            .addBreedingPair(Stacks.SPIRIT_SEED.getItemId(), Stacks.SPIRIT_SEED.getItemId(), 0.05, 0.2)
            .addFlavourProfile(0, 0, 4, 0, 4)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.GLISTENING_SEED)
            .setHarvestingResult(new ItemStack(Material.GLISTERING_MELON_SLICE))
            .setGrowth(new Growth(GrowthStages.SPIKEY_ORANGE, Placements.VORACIOUS_AND_UP, 5, 0.07))
            .addBreedingPair(Stacks.GLOWING_SEED.getItemId(), Stacks.METALLIC_SEED.getItemId(), 0.05, 0.2)
            .addFlavourProfile(3, 3, 2, 0, 0)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.ETHEREAL_SEED)
            .setEntityType(EntityType.ENDERMAN)
            .setGrowth(new Growth(GrowthStages.SPAWNING_GREEN, Placements.VORACIOUS_AND_UP, 6, 0.06))
            .addBreedingPair(Stacks.SPIRIT_SEED.getItemId(), Stacks.SPIRIT_SEED.getItemId(), 0.1, 0.1)
            .addFlavourProfile(0, 0, 0, 2, 6)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.IGNITED_SEED)
            .setEntityType(EntityType.BLAZE)
            .setGrowth(new Growth(GrowthStages.SPAWNING_RED, Placements.VORACIOUS_AND_UP, 8, 0.07))
            .addBreedingPair(Stacks.ETHEREAL_SEED.getItemId(), Stacks.COMBUSTIBLE_SEED.getItemId(), 0.2, 0.25)
            .addFlavourProfile(0, 4, 4, 0, 0)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.BARTERED_SEED)
            .setEntityType(EntityType.PIGLIN)
            .setGrowth(new Growth(GrowthStages.SPAWNING_CYAN, Placements.VORACIOUS_AND_UP, 8, 0.06))
            .addBreedingPair(Stacks.IGNEOUS_SEED.getItemId(), Stacks.PORKY_SEED.getItemId(), 0.2, 0.25)
            .addFlavourProfile(0, 0, 0, 0, 8)
            .tryRegister(addon);

        new DroppingSeed(Stacks.PRISMATIC_SEED)
            .addDrop(new ItemStack(Material.PRISMARINE_SHARD), 2)
            .addDrop(new ItemStack(Material.PRISMARINE_CRYSTALS), 1)
            .setTriggerChance(0.005)
            .setGrowth(new Growth(GrowthStages.SPIKEY_GREEN, Placements.VORACIOUS_AND_UP, 9, 0.06))
            .addBreedingPair(Stacks.RAINBOW_SEED.getItemId(), Stacks.SPLINTERED_SEED.getItemId(), 0.1, 0.15)
            .addFlavourProfile(0, 0, 8, 0, 0)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.POROUS_SEED)
            .setHarvestingResult(new ItemStack(Material.SPONGE))
            .setGrowth(new Growth(GrowthStages.FUNGAL_YELLOW, Placements.VORACIOUS_AND_UP, 9, 0.06))
            .addBreedingPair(Stacks.PRISMATIC_SEED.getItemId(), Stacks.SEASIDE_SEED.getItemId(), 0.05, 0.05)
            .addFlavourProfile(2, 2, 4, 0, 0)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.LEARNED_SEED)
            .setHarvestingResult(new ItemStack(Material.EXPERIENCE_BOTTLE))
            .setGrowth(new Growth(GrowthStages.VINEY_ORANGE, Placements.VORACIOUS_AND_UP, 9, 0.06))
            .addBreedingPair(Stacks.ETHEREAL_SEED.getItemId(), Stacks.ENCHANTED_SEED.getItemId(), 0.1, 0.15)
            .addFlavourProfile(2, 0, 0, 6, 0)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.BUSY_SEED)
            .setHarvestingResult(new ItemStack(Material.COOKIE))
            .setGrowth(new Growth(GrowthStages.SPIKEY_RED, Placements.VORACIOUS_AND_UP, 9, 0.06))
            .addBreedingPair(Stacks.LEARNED_SEED.getItemId(), Stacks.SWEET_SEED.getItemId(), 0.1, 0.15)
            .addFlavourProfile(2, 2, 2, 2, 2)
            .tryRegister(addon);

        new GenericTickingSeed(Stacks.OAKENDRAN_SEED)
            .setConsumer(GenericTickingMethods::onTickOakendranSeed)
            .setGrowth(new Growth(GrowthStages.VINEY_ORANGE, Placements.VORACIOUS_AND_UP, 12, 0.04))
            .addBreedingPair(Stacks.ETHEREAL_SEED.getItemId(), Stacks.SPINDLE_SEED.getItemId(), 0.1, 0.15)
            .addFlavourProfile(3, 2, 1, 1, 1)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.ADDON_BERRY_SEED)
            .setHarvestingResult(Stacks.ADDON_BERRY.item())
            .setGrowth(new Growth(GrowthStages.SPIKEY_RED, Placements.NETHER_DIRT_AND_UP, 10, 0.2))
            .addBreedingPair(Stacks.SAINTLY_SEED.getItemId(), Stacks.SAINTLY_SEED.getItemId(), 0.1, 0.15)
            .addFlavourProfile(16, 0, 0, 0, 0)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.CUTE_SEED)
            .setEntityType(EntityType.AXOLOTL)
            .setGrowth(new Growth(GrowthStages.SPAWNING_BLUE, Placements.NETHER_DIRT_AND_UP, 15, 0.15))
            .addBreedingPair(Stacks.SAINTLY_SEED.getItemId(), Stacks.SAINTLY_SEED.getItemId(), 0.1, 0.15)
            .addFlavourProfile(12, 2, 2, 0, 0)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.BEST_FRIEND_SEED)
            .setEntityType(EntityType.WOLF)
            .setGrowth(new Growth(GrowthStages.SPAWNING_CYAN, Placements.NETHER_DIRT_AND_UP, 16, 0.10))
            .addBreedingPair(Stacks.CUTE_SEED.getItemId(), Stacks.SPLINTERED_SEED.getItemId(), 0.1, 0.15)
            .addFlavourProfile(0, 0, 8, 0, 8)
            .tryRegister(addon);

        new GenericTickingSeed(Stacks.MATH_SEED)
            .setConsumer(GenericTickingMethods::onAlessioTeach)
            .setGrowth(new Growth(GrowthStages.SPIKEY_BLUE, Placements.NETHER_DIRT_AND_UP, 16, 0.10))
            .addBreedingPair(Stacks.BEST_FRIEND_SEED.getItemId(), Stacks.PERFECTION_SEED.getItemId(), 0.1, 0.15)
            .addFlavourProfile(4, 4, 4, 0, 4)
            .tryRegister(addon);

        new HarvestableSeed(Stacks.BUZZING_SEED)
            .setHarvestingResult(new ItemStack(Material.HONEYCOMB))
            .setGrowth(new Growth(GrowthStages.VINEY_YELLOW, Placements.NETHER_DIRT_AND_UP, 10, 0.2))
            .addBreedingPair(Stacks.CUTE_SEED.getItemId(), Stacks.SPINDLE_SEED.getItemId(), 0.15, 0.2)
            .addFlavourProfile(2, 4, 2, 6, 2)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.TERRIFYING_SEED)
            .setEntityType(EntityType.WITHER_SKELETON)
            .setGrowth(new Growth(GrowthStages.SPAWNING_PURPLE, Placements.NETHER_DIRT_AND_UP, 15, 0.10))
            .addBreedingPair(Stacks.SAINTLY_SEED.getItemId(), Stacks.SAINTLY_SEED.getItemId(), 0.10, 0.3)
            .addFlavourProfile(0, 0, 16, 0, 0)
            .tryRegister(addon);

        new GenericTickingSeed(Stacks.HATE_FILLED_SEED)
            .setConsumer(GenericTickingMethods::onTickHateFilledSeed)
            .setGrowth(new Growth(GrowthStages.FUNGAL_ORANGE, Placements.NETHER_DIRT_AND_UP, 0, 0.2))
            .addBreedingPair(Stacks.TERRIFYING_SEED.getItemId(), Stacks.PROTECTIVE_SEED.getItemId(), 0.2, 0.05)
            .addFlavourProfile(0, 0, 10, 6, 0)
            .tryRegister(addon);

        new GenericTickingSeed(Stacks.PULSING_SEED)
            .setConsumer(GenericTickingMethods::onTickPulsingSeed)
            .setGrowth(new Growth(GrowthStages.VINEY_GREEN, Placements.NETHER_DIRT_AND_UP, 20, 0.08))
            .addBreedingPair(Stacks.HATE_FILLED_SEED.getItemId(), Stacks.GLOWING_SEED.getItemId(), 0.15, 0.2)
            .addFlavourProfile(10, 6, 0, 0, 0)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.GATEWAY_SEED)
            .setEntityType(EntityType.VILLAGER)
            .setGrowth(new Growth(GrowthStages.SPAWNING_PURPLE, Placements.NETHER_DIRT_AND_UP, 20, 0.08))
            .addBreedingPair(Stacks.PULSING_SEED.getItemId(), Stacks.BARTERED_SEED.getItemId(), 0.15, 0.2)
            .addFlavourProfile(0, 0, 0, 0, 16)
            .tryRegister(addon);

        new DoNothingSeed(Stacks.CRYSTALLINE_SEED)
            .setGrowth(new Growth(GrowthStages.SPIKEY_ORANGE, Placements.NETHER_GRASS_AND_UP, 0, 0.02))
            .addBreedingPair(Stacks.EDEN_SEED.getItemId(), Stacks.WET_SEED.getItemId(), 0.15, 0.2)
            .addFlavourProfile(8, 0, 0, 8, 0)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.BLACK_AND_WHITE_SEED)
            .setEntityType(EntityType.PANDA)
            .setCallback(livingEntity -> {
                             if (EasterEggUtils.isJeffBirthdayPeriod()) {
                                 livingEntity.setCustomName("✮ Jeff ✮");
                                 livingEntity.setCustomNameVisible(true);
                             }
                         }
            )
            .setGrowth(new Growth(GrowthStages.SPAWNING_BLUE, Placements.JUNGLE_BIOME, 25, 0.03))
            .addBreedingPair(Stacks.JUNGLE_SEED.getItemId(), Stacks.PORKY_SEED.getItemId(), 0.01, 0.05)
            .addFlavourProfile(0, 10, 1, 10, 0)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.PARROT_SEED)
            .setEntityType(EntityType.PARROT)
            .setGrowth(new Growth(GrowthStages.SPAWNING_GREEN, Placements.JUNGLE_BIOME, 15, 0.10))
            .addBreedingPair(Stacks.JUNGLE_SEED.getItemId(), Stacks.RAINBOW_SEED.getItemId(), 0.09, 0.15)
            .addFlavourProfile(0, 5, 5, 5, 5)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.WILD_SEED)
            .setEntityType(EntityType.OCELOT)
            .setGrowth(new Growth(GrowthStages.SPAWNING_YELLOW, Placements.JUNGLE_BIOME, 15, 0.10))
            .addBreedingPair(Stacks.JUNGLE_SEED.getItemId(), Stacks.CUTE_SEED.getItemId(), 0.05, 0.15)
            .addFlavourProfile(5, 5, 5, 0, 5)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.SHELLED_SEED)
            .setEntityType(EntityType.TURTLE)
            .setGrowth(new Growth(GrowthStages.SPAWNING_GREEN, Placements.BEACH_BIOME, 15, 0.10))
            .addBreedingPair(Stacks.BEACH_SEED.getItemId(), Stacks.PROTECTIVE_SEED.getItemId(), 0.05, 0.15)
            .addFlavourProfile(4, 4, 12, 0, 0)
            .tryRegister(addon);

        new DroppingSeed(Stacks.TREASURED_SEED)
            .addDrop(new ItemStack(Material.HEART_OF_THE_SEA), 1)
            .addDrop(new ItemStack(Material.NAUTILUS_SHELL), 9)
            .setTriggerChance(0.001)
            .setGrowth(new Growth(GrowthStages.SPIKEY_GREEN, Placements.BEACH_BIOME, 15, 0.06))
            .addBreedingPair(Stacks.BEACH_SEED.getItemId(), Stacks.SHINY_SEED.getItemId(), 0.1, 0.5)
            .addFlavourProfile(4, 4, 4, 4, 4)
            .tryRegister(addon);

        new GenericTickingSeed(Stacks.SPINEY_SEED)
            .setConsumer(GenericTickingMethods::onTickSpineySeed)
            .setGrowth(new Growth(GrowthStages.SPIKEY_GREEN, Placements.DESERT_BIOME, 10, 0.03))
            .addBreedingPair(Stacks.DESERT_SEED.getItemId(), Stacks.SPINDLE_SEED.getItemId(), 0.2, 0.2)
            .addFlavourProfile(0, 10, 0, 5, 5)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.HUSKY_SEED)
            .setEntityType(EntityType.HUSK)
            .setGrowth(new Growth(GrowthStages.SPAWNING_YELLOW, Placements.DESERT_BIOME, 15, 0.06))
            .addBreedingPair(Stacks.DESERT_SEED.getItemId(), Stacks.ROTTEN_SEED.getItemId(), 0.05, 0.25)
            .addFlavourProfile(0, 0, 20, 0, 0)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.STRAY_SEED)
            .setEntityType(EntityType.STRAY)
            .setGrowth(new Growth(GrowthStages.SPAWNING_CYAN, Placements.SNOW_BIOME, 15, 0.06))
            .addBreedingPair(Stacks.SNOW_SEED.getItemId(), Stacks.SPLINTERED_SEED.getItemId(), 0.1, 0.25)
            .addFlavourProfile(0, 20, 0, 0, 0)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.POLAR_SEED)
            .setEntityType(EntityType.POLAR_BEAR)
            .setGrowth(new Growth(GrowthStages.SPAWNING_YELLOW, Placements.SNOW_BIOME, 12, 0.08))
            .addBreedingPair(Stacks.SNOW_SEED.getItemId(), Stacks.PORKY_SEED.getItemId(), 0.05, 0.25)
            .addFlavourProfile(0, 0, 1, 1, 1)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.CHILLY_SEED)
            .setEntityType(EntityType.FOX)
            .setCallback(livingEntity -> {
                             final Fox fox = (Fox) livingEntity;
                             fox.setFoxType(Fox.Type.SNOW);
                         }
            )
            .setGrowth(new Growth(GrowthStages.SPAWNING_PURPLE, Placements.SNOW_BIOME, 12, 0.08))
            .addBreedingPair(Stacks.SNOW_SEED.getItemId(), Stacks.BEST_FRIEND_SEED.getItemId(), 0.05, 0.1)
            .addFlavourProfile(20, 0, 0, 0, 0)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.HEXED_SEED)
            .setEntityType(EntityType.WITCH)
            .setGrowth(new Growth(GrowthStages.SPAWNING_PURPLE, Placements.SWAMP_BIOME, 12, 0.04))
            .addBreedingPair(Stacks.SWAMP_SEED.getItemId(), Stacks.ENCHANTED_SEED.getItemId(), 0.03, 0.1)
            .addFlavourProfile(0, 0, 0, 20, 0)
            .tryRegister(addon);

        new EntitySpawningSeed(Stacks.SLIMY_SEED)
            .setEntityType(EntityType.SLIME)
            .setGrowth(new Growth(GrowthStages.SPAWNING_GREEN, Placements.SWAMP_BIOME, 12, 0.08))
            .addBreedingPair(Stacks.SWAMP_SEED.getItemId(), Stacks.GLISTENING_SEED.getItemId(), 0.05, 0.1)
            .addFlavourProfile(0, 0, 0, 0, 20)
            .tryRegister(addon);

        new GenericTickingSeed(Stacks.BLOB_SEED)
            .setConsumer(GenericTickingMethods::onWalshyIsMad)
            .setGrowth(new Growth(GrowthStages.FUNGAL_YELLOW, Placements.SWAMP_BIOME, 12, 0.08))
            .addBreedingPair(Stacks.SLIMY_SEED.getItemId(), Stacks.BEST_FRIEND_SEED.getItemId(), 0.05, 0.1)
            .addFlavourProfile(0, 20, 0, 0, 0)
            .tryRegister(addon);

        // endregion
    }
}
