package dev.sefiraat.netheopoiesis.implementation;

import dev.sefiraat.netheopoiesis.utils.ItemStackUtils;
import dev.sefiraat.netheopoiesis.utils.Skulls;
import dev.sefiraat.netheopoiesis.utils.Theme;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Color;
import org.bukkit.Material;

import javax.annotation.Nonnull;
import java.util.stream.Stream;

/**
 * Final class used to store and initialise the {@link SlimefunItemStack}s used in the addon
 */
@SuppressWarnings("java:S1192")
public final class Stacks {

    private Stacks() {
        throw new IllegalStateException("Utility class");
    }

    // region Crafting

    public static final SlimefunItemStack ADDON_BERRY = Theme.themedSlimefunItemStack(
        "NPS_ADDON_BERRY",
        Material.SWEET_BERRIES,
        Theme.CRAFTING,
        "Addon Berry",
        "A deliciously sweet berry that",
        "can be made into jam."
    );

    public static final SlimefunItemStack ADDON_JAM = Theme.themedSlimefunItemStack(
        "NPS_ADDON_JAM",
        ItemStackUtils.potion(Color.RED),
        Theme.CRAFTING,
        "Addon Jam",
        "A very sweet jam.",
        "For some reason, it feels rushed",
        "and incomplete."
    );

    public static final SlimefunItemStack HARMONISED_CRYSTAL_FIRE = Theme.themedSlimefunItemStack(
        "NPS_HARMONISED_CRYSTAL_FIRE",
        Material.RED_DYE,
        Theme.CRAFTING,
        "Harmonised Crystal: Fire",
        "This crystal has been attuned and",
        "harmonised with the power of fire."
    );

    public static final SlimefunItemStack HARMONISED_CRYSTAL_WATER = Theme.themedSlimefunItemStack(
        "NPS_HARMONISED_CRYSTAL_WATER",
        Material.CYAN_DYE,
        Theme.CRAFTING,
        "Harmonised Crystal: Water",
        "This crystal has been attuned and",
        "harmonised with the power of water."
    );

    public static final SlimefunItemStack HARMONISED_CRYSTAL_AIR = Theme.themedSlimefunItemStack(
        "NPS_HARMONISED_CRYSTAL_AIR",
        Material.WHITE_DYE,
        Theme.CRAFTING,
        "Harmonised Crystal: Air",
        "This crystal has been attuned and",
        "harmonised with the power of air."
    );

    public static final SlimefunItemStack HARMONISED_CRYSTAL_EARTH = Theme.themedSlimefunItemStack(
        "NPS_HARMONISED_CRYSTAL_EARTH",
        Material.BROWN_DYE,
        Theme.CRAFTING,
        "Harmonised Crystal: Earth",
        "This crystal has been attuned and",
        "harmonised with the power of earth."
    );

    public static final SlimefunItemStack DISCORDANT_CRYSTAL_FIRE = Theme.themedSlimefunItemStack(
        "NPS_DISCORDANT_CRYSTAL_FIRE",
        Material.MAGENTA_DYE,
        Theme.CRAFTING,
        "Discordant Crystal: Fire",
        "This crystal has been attuned",
        "to the direct vacuum of fire",
        "element."
    );

    public static final SlimefunItemStack DISCORDANT_CRYSTAL_WATER = Theme.themedSlimefunItemStack(
        "NPS_DISCORDANT_CRYSTAL_WATER",
        Material.LIGHT_BLUE_DYE,
        Theme.CRAFTING,
        "Discordant Crystal: Water",
        "This crystal has been attuned",
        "to the direct vacuum of water",
        "element."
    );

    public static final SlimefunItemStack DISCORDANT_CRYSTAL_EARTH = Theme.themedSlimefunItemStack(
        "NPS_DISCORDANT_CRYSTAL_EARTH",
        Material.BLACK_DYE,
        Theme.CRAFTING,
        "Discordant Crystal: Water",
        "This crystal has been attuned",
        "to the direct vacuum of the earth",
        "element."
    );

    public static final SlimefunItemStack DISCORDANT_CRYSTAL_AIR = Theme.themedSlimefunItemStack(
        "NPS_DISCORDANT_CRYSTAL_AIR",
        Material.LIGHT_GRAY_DYE,
        Theme.CRAFTING,
        "Discordant Crystal: Air",
        "This crystal has been attuned",
        "to the direct vacuum of the air",
        "element."
    );

    public static final SlimefunItemStack DISSONANT_CRYSTAL_FIRE = Theme.themedSlimefunItemStack(
        "NPS_DISSONANT_CRYSTAL_FIRE",
        Material.ORANGE_DYE,
        Theme.CRAFTING,
        "Dissonant Crystal: Fire",
        "This crystal has been attuned",
        "to the oddities of fire",
        "element."
    );

    public static final SlimefunItemStack DISSONANT_CRYSTAL_WATER = Theme.themedSlimefunItemStack(
        "NPS_DISSONANT_CRYSTAL_WATER",
        Material.BLUE_DYE,
        Theme.CRAFTING,
        "Dissonant Crystal: Water",
        "This crystal has been attuned",
        "to the oddities of water",
        "element."
    );

    public static final SlimefunItemStack DISSONANT_CRYSTAL_EARTH = Theme.themedSlimefunItemStack(
        "NPS_DISSONANT_CRYSTAL_EARTH",
        Material.GREEN_DYE,
        Theme.CRAFTING,
        "Dissonant Crystal: Water",
        "This crystal has been attuned",
        "to the oddities of the earth",
        "element."
    );

    public static final SlimefunItemStack DISSONANT_CRYSTAL_AIR = Theme.themedSlimefunItemStack(
        "NPS_DISSONANT_CRYSTAL_AIR",
        Material.GRAY_DYE,
        Theme.CRAFTING,
        "Dissonant Crystal: Air",
        "This crystal has been attuned",
        "to the oddities of the air",
        "element."
    );

    public static final SlimefunItemStack ELEMENTAL_CRYSTAL = Theme.themedSlimefunItemStack(
        "NPS_ELEMENTAL_CRYSTAL",
        ItemStackUtils.enchantedItemStack(Material.QUARTZ),
        Theme.CRAFTING,
        "Elemental Crystal",
        "This crystal harnesses the power",
        "of the four base elements to channel",
        "purification power."
    );

    public static final SlimefunItemStack VACUUM_CRYSTAL = Theme.themedSlimefunItemStack(
        "NPS_VACUUM_CRYSTAL",
        ItemStackUtils.enchantedItemStack(Material.QUARTZ),
        Theme.CRAFTING,
        "Vacuum Crystal",
        "This crystal harnesses the vacuum",
        "of power from the base elements to channel",
        "purification power."
    );

    public static final SlimefunItemStack IRREGULAR_CRYSTAL = Theme.themedSlimefunItemStack(
        "NPS_IRREGULAR_CRYSTAL",
        ItemStackUtils.enchantedItemStack(Material.QUARTZ),
        Theme.CRAFTING,
        "Irregular Crystal",
        "This crystal harnesses the oddities",
        "of the four base elements to channel",
        "purification power."
    );

    public static final SlimefunItemStack QUARTZ_BLANK = Theme.themedSlimefunItemStack(
        "NPS_QUARTZ_BLANK",
        Material.QUARTZ_BLOCK,
        Theme.CRAFTING,
        "Quartz Blank",
        "This blank can be filled with",
        "elemental power and used to focus",
        "nearby purification energies"
    );

    // endregion

    // region Tools

    public static final SlimefunItemStack CRUDE_HARVESTING_TOOL = Theme.themedSlimefunItemStack(
        "NPS_CRUDE_HARVESTING_TOOL",
        Material.PRISMARINE_SHARD,
        Theme.TOOL,
        "Crude Harvesting Tool",
        "This tool will harvest plants",
        "where possible.",
        "This one is very shoddy and won't",
        "last long",
        "",
        LoreBuilder.usesLeft(25)
    );

    public static final SlimefunItemStack HARVESTING_TOOL = Theme.themedSlimefunItemStack(
        "NPS_HARVESTING_TOOL",
        Material.PRISMARINE_SHARD,
        Theme.TOOL,
        "Harvesting Tool",
        "This tool will harvest plants",
        "where possible.",
        "This one is sturdier but still won't",
        "last long",
        "",
        LoreBuilder.usesLeft(150)
    );

    public static final SlimefunItemStack PURIFICATION_BAROMETER = Theme.themedSlimefunItemStack(
        "NPS_PURIFICATION_BAROMETER",
        Material.CLOCK,
        Theme.TOOL,
        "Purification Barometer",
        "When used, this tool will tell you",
        "how purified the current chunk is."
    );

    public static final SlimefunItemStack PURIFICATION_SCANNER = Theme.themedSlimefunItemStack(
        "NPS_PURIFICATION_SCANNER",
        Material.BRICK,
        Theme.TOOL,
        "Purification Scanner",
        "When used on a relevant block or plant,",
        "this tool will tell you what its",
        "purifying effect on the world is."
    );

    public static final SlimefunItemStack CRUX_GATHERER = Theme.themedSlimefunItemStack(
        "NPS_CRUX_GATHERER",
        Material.BLAZE_ROD,
        Theme.TOOL,
        "Crux Gatherer",
        "If you break a crux while holding",
        "this tool, you can collect it's drop.",
        "Does NOT change biomes."
    );

    public static final SlimefunItemStack MIXING_QUARTZ = Theme.themedSlimefunItemStack(
        "NPS_MIXING_QUARTZ_1",
        Material.QUARTZ,
        Theme.TOOL,
        "Mixing Quartz",
        "Drop 3 Netheo Paste on the ground",
        "and right click with this mixing",
        "quartz to form a Netheo Ball",
        "The type and flavour depends on the",
        "pastes dropped."
    );

    public static final SlimefunItemStack ENDER_CAKE = Theme.themedSlimefunItemStack(
        "NPS_ENDER_CAKE",
        Material.CAKE,
        Theme.TOOL,
        "Ender Cake",
        "This tasty cake has the power",
        "to break through dimensions",
        "when eaten.",
        Theme.WARNING + "Make sure to sleep in the Nether",
        Theme.WARNING + "if you wish to make it back!"
    );

    public static final SlimefunItemStack NETHER_BEACON = Theme.themedSlimefunItemStack(
        "NPS_BEACON",
        Material.SHROOMLIGHT,
        Theme.TOOL,
        "Nether Beacon",
        "This beacon will draw nearby",
        "purification and convert it into power.",
        "The beacon's beam will slowly",
        "remove any blocks above this block's",
        "y-level. The radius depends on the",
        "power of the whole beacon's structure.",
        "Place beacon base blocks below this to",
        "increase the power.",
        Theme.CLICK_INFO.asTitle("Purification Draw", 20),
        Theme.CLICK_INFO.asTitle("Cumulative Power", 1)
    );

    public static final SlimefunItemStack NETHER_BEACON_BASE_1 = Theme.themedSlimefunItemStack(
        "NPS_BEACON_BASE_1",
        Material.NETHER_WART_BLOCK,
        Theme.TOOL,
        "Nether Beacon Base: Tier 1",
        "This base will draw purification",
        "from the surrounding area and convert",
        "into a form of power.",
        "Can draw power from other base",
        "blocks below this if they are",
        "one tier higher.",
        Theme.CLICK_INFO.asTitle("Purification Draw", 10),
        Theme.CLICK_INFO.asTitle("Cumulative Power", 1)
    );

    public static final SlimefunItemStack NETHER_BEACON_BASE_2 = Theme.themedSlimefunItemStack(
        "NPS_BEACON_BASE_2",
        Material.NETHER_BRICKS,
        Theme.TOOL,
        "Nether Beacon Base: Tier 2",
        "This base will draw purification",
        "from the surrounding area and convert",
        "into a form of power.",
        "Can draw power from other base",
        "blocks below this if they are",
        "one tier higher.",
        Theme.CLICK_INFO.asTitle("Purification Draw", 15),
        Theme.CLICK_INFO.asTitle("Cumulative Power", 1)
    );

    public static final SlimefunItemStack NETHER_BEACON_BASE_3 = Theme.themedSlimefunItemStack(
        "NPS_BEACON_BASE_3",
        Material.RED_CONCRETE,
        Theme.TOOL,
        "Nether Beacon Base: Tier 3",
        "This base will draw purification",
        "from the surrounding area and convert",
        "into a form of power.",
        "Can draw power from other base",
        "blocks below this if they are",
        "one tier higher.",
        Theme.CLICK_INFO.asTitle("Purification Draw", 20),
        Theme.CLICK_INFO.asTitle("Cumulative Power", 1)
    );

    public static final SlimefunItemStack SEED_ANALYSER = Theme.themedSlimefunItemStack(
        "NPS_SEED_ANALYSER",
        Material.COMPASS,
        Theme.TOOL,
        "Seed Analyser",
        "When used on a Nether Plant, this",
        "tool will provide you information",
        "about it's type, growth and",
        "purification values."
    );

    public static final SlimefunItemStack SIPHON_ANALYSER = Theme.themedSlimefunItemStack(
        "NPS_SIPHON_ANALYSER",
        Material.COMPASS,
        Theme.TOOL,
        "Siphon Analyser",
        "When used on a Siphoning block,",
        "tool will provide you information",
        "about it's current power and state"
    );

    // endregion

    // region Crux'

    public static final SlimefunItemStack BASIC_PURIFIED_NETHERRACK = Theme.themedSlimefunItemStack(
        "NPS_BASIC_PURIFIED_NETHERRACK",
        Material.MYCELIUM,
        Theme.CRUX,
        "Basic Purified Netherrack",
        "This Netherrack has been purified",
        "to allow more complex seeds to",
        "be grown on it."
    );

    public static final SlimefunItemStack PURIFIED_NETHERRACK = Theme.themedSlimefunItemStack(
        "NPS_PURIFIED_NETHERRACK",
        Material.PODZOL,
        Theme.CRUX,
        "Purified Netherrack",
        "This Netherrack has been purified",
        "to allow more complex seeds to",
        "be grown on it."
    );

    public static final SlimefunItemStack VORACIOUS_DIRT = Theme.themedSlimefunItemStack(
        "NPS_VORACIOUS_DIRT",
        Material.ROOTED_DIRT,
        Theme.CRUX,
        "Voracious Dirt",
        "The Netherrack has been purified to",
        "a point in which it is a viable soil."
    );

    public static final SlimefunItemStack NETHER_DIRT = Theme.themedSlimefunItemStack(
        "NPS_NETHER_DIRT",
        Material.DIRT,
        Theme.CRUX,
        "Nether Dirt",
        "The Netherrack has been purified to",
        "a point in which it is a good soil."
    );

    public static final SlimefunItemStack NETHER_GRASS = Theme.themedSlimefunItemStack(
        "NPS_NETHER_GRASS",
        Material.GRASS_BLOCK,
        Theme.CRUX,
        "Nether Grass",
        "This grass is positively healthy."
    );

    public static final SlimefunItemStack JUNGLE_CRUX = Theme.themedSlimefunItemStack(
        "NPS_JUNGLE_CRUX",
        Material.MOSS_BLOCK,
        Theme.CRUX,
        "Jungle Crux",
        "This soil is suitable for more",
        "temperate plants."
    );

    public static final SlimefunItemStack BEACH_CRUX = Theme.themedSlimefunItemStack(
        "NPS_BEACH_CRUX",
        Material.SAND,
        Theme.CRUX,
        "Beach Crux",
        "This sand feels great between",
        "your toes."
    );

    public static final SlimefunItemStack DESERT_CRUX = Theme.themedSlimefunItemStack(
        "NPS_DESERT_CRUX",
        Material.RED_SAND,
        Theme.CRUX,
        "Desert Crux",
        "This sand is barren and dull",
        "but still an improvement over",
        "netherrack."
    );

    public static final SlimefunItemStack SNOW_CRUX = Theme.themedSlimefunItemStack(
        "NPS_SNOWY_CRUX",
        Material.SNOW_BLOCK,
        Theme.CRUX,
        "Snowy Crux",
        "A sudden drop in temperature is",
        "sure to bring in new fauna."
    );

    public static final SlimefunItemStack STONEY_CRUX = Theme.themedSlimefunItemStack(
        "NPS_STONEY_CRUX",
        Material.STONE,
        Theme.CRUX,
        "Stoney Crux",
        "While not suitable for plants",
        "there is a reason for everything."
    );

    public static final SlimefunItemStack SWAMP_CRUX = Theme.themedSlimefunItemStack(
        "NPS_SWAMPY_CRUX",
        Material.GRASS_BLOCK,
        Theme.CRUX,
        "Swampy Crux",
        "This soil is over saturated yet",
        "teeming with life."
    );

    public static final SlimefunItemStack CRYSTALLINE_CRUX = Theme.themedSlimefunItemStack(
        "NPS_CRYSTALLINE_CRUX",
        Material.HONEYCOMB_BLOCK,
        Theme.CRUX,
        "Crystalline Crux",
        "This crux is unique in that it",
        "spreads slowly out to other",
        "nearby lava, cobblestone, stone",
        "and obsidian blocks."
    );

    // endregion

    // region Seeds

    // region Spreaders

    public static final SlimefunItemStack PURIFICATION_SEED = Theme.themedSeed(
        "NPS_PURIFICATION_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "Purification Seed",
        new String[]{"This seed, when fully grown,", "will slowly purify surrounding", "blocks."},
        getCanBePlacedOnLore("Netherrack", "Warped Nylium", "Crimson Nylium")
    );

    public static final SlimefunItemStack SOUL_SEED = Theme.themedSeed(
        "NPS_SOUL_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "Soul Seed",
        new String[]{"This seed, when fully grown,", "will further push the purification", "process of nearby blocks."},
        getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack SPIRIT_SEED = Theme.themedSeed(
        "NPS_SPIRIT_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "Spirit Seed",
        new String[]{"This seed, when fully grown,", "will allow an even deeper purification", "for nearby blocks."},
        getCanBePlacedOnLore("Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack SAINTLY_SEED = Theme.themedSeed(
        "NPS_SAINTLY_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "Saintly Seed",
        new String[]{"This seed, when fully grown,", "will remove nearly all of the", "Nether's taint for nearby blocks."},
        getCanBePlacedOnLore("Voracious Dirt (or better)")
    );

    public static final SlimefunItemStack EDEN_SEED = Theme.themedSeed(
        "NPS_EDEN_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "Eden Seed",
        new String[]{"This seed, when fully grown,", "will create and eden in the Nether."},
        getCanBePlacedOnLore("Nether Dirt (or better)")
    );

    public static final SlimefunItemStack JUNGLE_SEED = Theme.themedSeed(
        "NPS_JUNGLE_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "Jungle Seed",
        new String[]{"This seed, when fully grown,", "will begin the process of creating", "a jungle."},
        getCanBePlacedOnLore("Nether Grass or Jungle")
    );

    public static final SlimefunItemStack BEACH_SEED = Theme.themedSeed(
        "NPS_BEACH_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "Beach Seed",
        new String[]{"This seed, when fully grown,", "will begin the process of creating", "a beach."},
        getCanBePlacedOnLore("Nether Grass or Beach")
    );

    public static final SlimefunItemStack DESERT_SEED = Theme.themedSeed(
        "NPS_DESERT_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "Desert Seed",
        new String[]{"This seed, when fully grown,", "will begin the process of creating", "a desert."},
        getCanBePlacedOnLore("Nether Grass or Desert")
    );

    public static final SlimefunItemStack SNOW_SEED = Theme.themedSeed(
        "NPS_SNOW_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "Snow Seed",
        new String[]{"This seed, when fully grown,", "will begin the process of creating a", "cold wonderland."},
        getCanBePlacedOnLore("Nether Grass (or better)")
    );

    public static final SlimefunItemStack STONEY_SEED = Theme.themedSeed(
        "NPS_STONEY_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "Stoney Seed",
        new String[]{"This seed, when fully grown,", "will begin the process of creating", "a stoney plain."},
        getCanBePlacedOnLore("Nether Grass or Stoney")
    );

    public static final SlimefunItemStack SWAMP_SEED = Theme.themedSeed(
        "NPS_SWAMP_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "Swamp Seed",
        new String[]{"This seed, when fully grown,", "will begin the process of creating", "a damp swamp."},
        getCanBePlacedOnLore("Nether Grass or Swamp")
    );

    // endregion

    // region Purification -> Soul

    public static final SlimefunItemStack SPINDLE_SEED = Theme.themedSeed(
        "NPS_SPINDLE_SEED",
        Skulls.SEED_ORANGE.getPlayerHead(),
        Theme.SEED,
        "Spindle Seed",
        new String[]{"This seed, when fully grown,", "will grow it's roots out which", "can be harvested."},
        getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack GRAINY_SEED = Theme.themedSeed(
        "NPS_GRAINY_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "Grainy Seed",
        new String[]{"This seed, when fully grown,", "will slowly drop powder nearby", "which can be picked up."},
        getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack STRINGY_SEED = Theme.themedSeed(
        "NPS_STRINGY_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "Stringy Seed",
        new String[]{"This seed, when fully grown,", "will slowly envelop the nearby", "area in a stringy substance."},
        getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack GRASS_SEED = Theme.themedSeed(
        "NPS_GRASS_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "Grass Seed",
        new String[]{"This seed, when fully grown,", "will slowly generate grass", "cuttings."},
        getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack COBBLED_SEED = Theme.themedSeed(
        "NPS_COBBLED_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "Cobbled Seed",
        new String[]{"This seed, when fully grown,", "will slowly produce small amounts of", "cobblestone."},
        getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack VOLCANIC_SEED = Theme.themedSeed(
        "NPS_VOLCANIC_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "Volcanic Seed",
        new String[]{"This seed, when fully grown,", "can be harvested for Granite."},
        getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack IGNEOUS_SEED = Theme.themedSeed(
        "NPS_IGNEOUS_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "Igneous Seed",
        new String[]{"This seed, when fully grown,", "can be harvested for Andesite."},
        getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack FELDSPAR_SEED = Theme.themedSeed(
        "NPS_FELDSPAR_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "Feldspar Seed",
        new String[]{"This seed, when fully grown,", "can be harvested for Diorite."},
        getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack DEEPSLATE_SEED = Theme.themedSeed(
        "NPS_DEEPSLATE_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "Deepslate Seed",
        new String[]{"This seed, when fully grown,", "can be harvested for Cobbled", "deepslate."},
        getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack DUSTY_SEED = Theme.themedSeed(
        "NPS_DUSTY_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "Dusty Seed",
        new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "gravel."},
        getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack SEASIDE_SEED = Theme.themedSeed(
        "NPS_SEASIDE_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "Seaside Seed",
        new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "sand."},
        getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack NORI_SEED = Theme.themedSeed(
        "NPS_NORI_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "Nori Seed",
        new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "kelp."},
        getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack MOLDABLE_SEED = Theme.themedSeed(
        "NPS_MOLDABLE_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "Moldable Seed",
        new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "clay balls."},
        getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack WET_SEED = Theme.themedSeed(
        "NPS_WET_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.SEED,
        "Wet Seed",
        new String[]{"This seed, when fully grown,", "will fill up a held, empty,", "bucket."},
        getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack SPLINTERED_SEED = Theme.themedSeed(
        "NPS_SPLINTERED_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "Splintered Seed",
        new String[]{"This seed, when fully grown,", "will sometimes cause skeletons to", "spawn in the surrounding area."},
        getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack ROTTEN_SEED = Theme.themedSeed(
        "NPS_ROTTEN_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "Rotten Seed",
        new String[]{"This seed, when fully grown,", "will sometimes cause zombies to", "spawn in the surrounding area."},
        getCanBePlacedOnLore("Basic Purified Netherrack (or better)")
    );

    // endregion

    // region Soul -> Spirit

    public static final SlimefunItemStack METALLIC_SEED = Theme.themedSeed(
        "NPS_METALLIC_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "Metallic Seed",
        new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "iron nuggets."},
        getCanBePlacedOnLore("Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack TARNISHED_SEED = Theme.themedSeed(
        "NPS_TARNISHED_SEED",
        Skulls.SEED_ORANGE.getPlayerHead(),
        Theme.SEED,
        "Tarnished Seed",
        new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "raw copper."},
        getCanBePlacedOnLore("Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack SHINY_SEED = Theme.themedSeed(
        "NPS_SHINY_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "Shiny Seed",
        new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "gold nuggets."},
        getCanBePlacedOnLore("Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack SMOOTH_SEED = Theme.themedSeed(
        "NPS_SMOOTH_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "Smooth Seed",
        new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "amethyst shards."},
        getCanBePlacedOnLore("Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack SEEDY_SEED = Theme.themedSeed(
        "NPS_SEEDY_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "Seedy Seed",
        new String[]{"This seed, when fully grown,", "will sometimes drop random", "seeds."},
        getCanBePlacedOnLore("Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack SWEET_SEED = Theme.themedSeed(
        "NPS_SWEET_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "Sweet Seed",
        new String[]{"This seed, when fully grown,", "will grow sugarcane on nearby", "sand."},
        getCanBePlacedOnLore("Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack ENCHANTED_SEED = Theme.themedSeed(
        "NPS_ENCHANTED_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.SEED,
        "Enchanted Seed",
        new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "lapis lazuli."},
        getCanBePlacedOnLore("Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack COMBUSTIBLE_SEED = Theme.themedSeed(
        "NPS_COMBUSTABLE_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "Combustable Seed",
        new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "coal."},
        getCanBePlacedOnLore("Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack PROTECTIVE_SEED = Theme.themedSeed(
        "NPS_PROTECTIVE_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "Protective Seed",
        new String[]{"This seed, when fully grown,", "will spawn protective iron golems."},
        getCanBePlacedOnLore("Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack PORKY_SEED = Theme.themedSeed(
        "NPS_PORKY_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "Porky Seed",
        new String[]{"This seed, when fully grown,", "will spawn piggies!"},
        getCanBePlacedOnLore("Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack VALUABLE_SEED = Theme.themedSeed(
        "NPS_VALUABLE_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "Valuable Seed",
        new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "emeralds."},
        getCanBePlacedOnLore("Purified Netherrack (or better)")
    );

    public static final SlimefunItemStack PERFECTION_SEED = Theme.themedSeed(
        "NPS_PERFECTION_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.SEED,
        "Perfection Seed",
        new String[]{"This seed, when fully grown,", "can be harvested with a tool for", "diamonds."},
        getCanBePlacedOnLore("Purified Netherrack (or better)")
    );

    // endregion

    // region Spirit -> Saintly

    public static final SlimefunItemStack RAINBOW_SEED = Theme.themedSeed(
        "NPS_RAINBOW_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "Rainbow Seed",
        new String[]{"This seed, when fully grown,", "will periodically drop a random dye"},
        getCanBePlacedOnLore("Voracious Dirt (or better)")
    );

    public static final SlimefunItemStack GLOWING_SEED = Theme.themedSeed(
        "NPS_GLOWING_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "Glowing Seed",
        new String[]{"This seed, when fully grown,", "will periodically drop glowing items"},
        getCanBePlacedOnLore("Voracious Dirt (or better)")
    );

    public static final SlimefunItemStack GLISTENING_SEED = Theme.themedSeed(
        "NPS_GLISTENING_SEED",
        Skulls.SEED_ORANGE.getPlayerHead(),
        Theme.SEED,
        "Glistening Seed",
        new String[]{"This seed, when fully grown,", "can be harvested for some food."},
        getCanBePlacedOnLore("Voracious Dirt (or better)")
    );

    public static final SlimefunItemStack ETHEREAL_SEED = Theme.themedSeed(
        "NPS_ETHEREAL_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "Ethereal Seed",
        new String[]{"This seed, when fully grown,", "will cause Endermen to appear nearby"},
        getCanBePlacedOnLore("Voracious Dirt (or better)")
    );

    public static final SlimefunItemStack IGNITED_SEED = Theme.themedSeed(
        "NPS_IGNITED_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "Ignited Seed",
        new String[]{"This seed, when fully grown,", "will cause Blaze to appear nearby"},
        getCanBePlacedOnLore("Voracious Dirt (or better)")
    );

    public static final SlimefunItemStack BARTERED_SEED = Theme.themedSeed(
        "NPS_BARTERED_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "Bartered Seed",
        new String[]{"This seed, when fully grown,", "will cause Piglins to pop", "by for a visit"},
        getCanBePlacedOnLore("Voracious Dirt (or better)")
    );

    public static final SlimefunItemStack PRISMATIC_SEED = Theme.themedSeed(
        "NPS_PRISMATIC_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "Prismatic Seed",
        new String[]{"This seed, when fully grown,", "will cause prismatic items to drop."},
        getCanBePlacedOnLore("Voracious Dirt (or better)")
    );

    public static final SlimefunItemStack POROUS_SEED = Theme.themedSeed(
        "NPS_POROUS_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "Prismatic Seed",
        new String[]{"This seed, when fully grown,", "can be harvested with a tool", "for sponge"},
        getCanBePlacedOnLore("Voracious Dirt (or better)")
    );

    public static final SlimefunItemStack LEARNED_SEED = Theme.themedSeed(
        "NPS_LEARNED_SEED",
        Skulls.SEED_ORANGE.getPlayerHead(),
        Theme.SEED,
        "Learned Seed",
        new String[]{"This seed, when fully grown,", "can be harvested for a wealth", "of knowledge."},
        getCanBePlacedOnLore("Voracious Dirt (or better)")
    );

    public static final SlimefunItemStack BUSY_SEED = Theme.themedSeed(
        "NPS_BUSY_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "Busy Seed",
        new String[]{"This seed, when fully grown,", "can be harvested for a nice", "cookie."},
        getCanBePlacedOnLore("Voracious Dirt (or better)")
    );

    public static final SlimefunItemStack OAKENDRAN_SEED = Theme.themedSeed(
        "NPS_OAKENDRAN_SEED",
        Skulls.SEED_ORANGE.getPlayerHead(),
        Theme.SEED,
        "Oakendran Seed",
        new String[]{"This seed, when fully grown,", "may cause trees to spontaneously", "grow."},
        getCanBePlacedOnLore("Voracious Dirt (or better)")
    );

    // endregion

    // region Saintly -> Eden

    public static final SlimefunItemStack ADDON_BERRY_SEED = Theme.themedSeed(
        "NPS_ADDON_BERRY_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.SEED,
        "Addon-berry Seed",
        new String[]{"This seed, when fully grown,", "can be harvested for an", "addon berry."},
        getCanBePlacedOnLore("Nether Dirt (or better)")
    );

    public static final SlimefunItemStack CUTE_SEED = Theme.themedSeed(
        "NPS_CUTE_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "Cute Seed",
        new String[]{"This seed, when fully grown,", "will sometimes cause an Axolotl", "to appear."},
        getCanBePlacedOnLore("Nether Dirt (or better)")
    );

    public static final SlimefunItemStack BEST_FRIEND_SEED = Theme.themedSeed(
        "NPS_BEST_FRIEND_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "Best Friend Seed",
        new String[]{"This seed, when fully grown,", "will sometimes spawn wolves."},
        getCanBePlacedOnLore("Nether Dirt (or better)")
    );

    public static final SlimefunItemStack MATH_SEED = Theme.themedSeed(
        "NPS_MATH_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.SEED,
        "Math Seed",
        new String[]{"This seed, when fully grown,", "will try to teach you things."},
        getCanBePlacedOnLore("Nether Dirt (or better)")
    );

    public static final SlimefunItemStack BUZZING_SEED = Theme.themedSeed(
        "NPS_BUZZING_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "Buzzing Seed",
        new String[]{"This seed, when fully grown,", "can be harvested for honeycomb."},
        getCanBePlacedOnLore("Nether Dirt (or better)")
    );

    public static final SlimefunItemStack TERRIFYING_SEED = Theme.themedSeed(
        "NPS_TERRIFYING_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "Terrifying Seed",
        new String[]{"This seed, when fully grown,", "will sometimes cause a Wither Skeleton", "to appear."},
        getCanBePlacedOnLore("Nether Dirt (or better)")
    );

    public static final SlimefunItemStack HATE_FILLED_SEED = Theme.themedSeed(
        "NPS_HATE_FILLED_SEED",
        Skulls.SEED_ORANGE.getPlayerHead(),
        Theme.SEED,
        "Hate-Filled Seed",
        new String[]{"This seed, when fully grown,", "can only cause bad things", "to occur. Be sure to place", "wisely!"},
        getCanBePlacedOnLore("Nether Dirt (or better)")
    );

    public static final SlimefunItemStack PULSING_SEED = Theme.themedSeed(
        "NPS_PULSING_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "Pulsing Seed",
        new String[]{"This seed, when fully grown,", "will pulse out powerful but", "random (positive) effects"},
        getCanBePlacedOnLore("Nether Dirt (or better)")
    );

    public static final SlimefunItemStack GATEWAY_SEED = Theme.themedSeed(
        "NPS_GATEWAY_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "Gateway Seed",
        new String[]{"This seed, when fully grown,", "will allow villagers to cross", "over into your new nirvana."},
        getCanBePlacedOnLore("Nether Dirt (or better)")
    );

    public static final SlimefunItemStack CRYSTALLINE_SEED = Theme.themedSeed(
        "NPS_CRYSTALLINE_SEED",
        Skulls.SEED_ORANGE.getPlayerHead(),
        Theme.SEED,
        "Crystalline Seed",
        new String[]{"This seed is different to all others", "it does nothing when planted.", "Try throwing it into lava."},
        getCanBePlacedOnLore("Nether Grass (or better)")
    );

    // endregion

    // region Jungle +

    public static final SlimefunItemStack BLACK_AND_WHITE_SEED = Theme.themedSeed(
        "NPS_BLACK_AND_WHITE_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.SEED,
        "Black and White Seed",
        new String[]{"This seed, when fully grown,", "will slowly spawn some black", "and white friends."},
        getCanBePlacedOnLore("Jungle +")
    );

    public static final SlimefunItemStack PARROT_SEED = Theme.themedSeed(
        "NPS_PARROT_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "Parrot Seed",
        new String[]{"This seed, when fully grown,", "will slowly spawn beautiful", "feathered friends."},
        getCanBePlacedOnLore("Jungle +")
    );

    public static final SlimefunItemStack WILD_SEED = Theme.themedSeed(
        "NPS_WILD_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "Wild Seed",
        new String[]{"This seed, when fully grown,", "will slowly spawn some cute", "furry friends."},
        getCanBePlacedOnLore("Jungle +")
    );

    // endregion

    // region Beach

    public static final SlimefunItemStack SHELLED_SEED = Theme.themedSeed(
        "NPS_SHELLED_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "Shelled Seed",
        new String[]{"This seed, when fully grown,", "will slowly spawn hardy", "shelled friends."},
        getCanBePlacedOnLore("Beach +")
    );

    public static final SlimefunItemStack TREASURED_SEED = Theme.themedSeed(
        "NPS_TREASURED_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "Treasured Seed",
        new String[]{"This seed, when fully grown,", "has a -very- small chance to drop", "treasured items."},
        getCanBePlacedOnLore("Beach +")
    );

    // endregion

    // region Desert

    public static final SlimefunItemStack SPINEY_SEED = Theme.themedSeed(
        "NPS_SPINEY_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "Spiney Seed",
        new String[]{"This seed, when fully grown,", "will slowly grow catci neaby"},
        getCanBePlacedOnLore("Desert +")
    );

    public static final SlimefunItemStack HUSKY_SEED = Theme.themedSeed(
        "NPS_HUSKY_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "Husky Seed",
        new String[]{"This seed, when fully grown,", "will spawn Husks nearby."},
        getCanBePlacedOnLore("Desert +")
    );

    // endregion

    // region Snow

    public static final SlimefunItemStack STRAY_SEED = Theme.themedSeed(
        "NPS_STRAY_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "Stray Seed",
        new String[]{"This seed, when fully grown,", "will spawn Stray nearby"},
        getCanBePlacedOnLore("Snow +")
    );

    public static final SlimefunItemStack POLAR_SEED = Theme.themedSeed(
        "NPS_POLAR_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "Polar Seed",
        new String[]{"This seed, when fully grown,", "will spawn Polar Bears nearby."},
        getCanBePlacedOnLore("Snow +")
    );

    public static final SlimefunItemStack CHILLY_SEED = Theme.themedSeed(
        "NPS_CHILLY_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "Chilly Seed",
        new String[]{"This seed, when fully grown,", "will spawn Snow Foxes nearby."},
        getCanBePlacedOnLore("Snow +")
    );

    // endregion

    // region Stoney


    // endregion

    // region Swamp

    public static final SlimefunItemStack HEXED_SEED = Theme.themedSeed(
        "NPS_HEXED_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "Hexed Seed",
        new String[]{"This seed, when fully grown,", "will spawn Witches nearby"},
        getCanBePlacedOnLore("Swamp +")
    );

    public static final SlimefunItemStack SLIMY_SEED = Theme.themedSeed(
        "NPS_SLIMY_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "Slimy Seed",
        new String[]{"This seed, when fully grown,", "will spawn Slime nearby."},
        getCanBePlacedOnLore("Swamp +")
    );

    // @formatter:off
    public static final SlimefunItemStack BLOB_SEED = Theme.themedSeed(
                                "NPS_BLOB_SEED",
                          Skulls.SEED_YELLOW.getPlayerHead(),
                                     Theme.SEED,
                               "Blob Seed",
         new String[]{"This seed, when fully grown,", "will get mad, often."},
                    getCanBePlacedOnLore("Swamp +")
    );
         // blob <3                                                         // @formatter:on

    // endregion

    // endregion

    @Nonnull
    public static String[] getCanBePlacedOnLore(@Nonnull String... validPlacements) {
        String[] strings = new String[]{
            "",
            Theme.CRUX + "Can be grown on:"
        };
        return Stream.of(strings, validPlacements).flatMap(Stream::of).toArray(String[]::new);
    }
}
