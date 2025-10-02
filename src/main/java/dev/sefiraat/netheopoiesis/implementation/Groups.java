package dev.sefiraat.netheopoiesis.implementation;

import dev.sefiraat.netheopoiesis.Netheopoiesis;
import dev.sefiraat.netheopoiesis.implementation.groups.*;
import dev.sefiraat.netheopoiesis.utils.Keys;
import dev.sefiraat.netheopoiesis.utils.Theme;
import dev.sefiraat.netheopoiesis.utils.item.ItemCreator;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Final class used to store the ItemGroups used in this addon
 */
public final class Groups {

    public static final MainFlexGroup MAIN = new MainFlexGroup(
            Keys.newKey("main"),
            ItemCreator.create(
                    new ItemStack(Material.WITHER_ROSE),
                    Theme.MAIN.color("Netheopoiesis")
            )
    );
    public static final DummyItemGroup CRAFTING = new DummyItemGroup(
            Keys.newKey("crafting"),
            ItemCreator.create(
                    new ItemStack(Material.STICK),
                    Theme.MAIN.color("Netheopoiesis Crafting Items")
            )
    );
    public static final DummyItemGroup TOOLS = new DummyItemGroup(
            Keys.newKey("tools"),
            ItemCreator.create(
                    new ItemStack(Material.COMPASS),
                    Theme.MAIN.color("Netheopoiesis Tools")
            )
    );
    public static final DummyItemGroup SEEDS = new DummyItemGroup(
            Keys.newKey("seeds"),
            ItemCreator.create(
                    new ItemStack(Material.MELON_SEEDS),
                    Theme.MAIN.color("Netheopoiesis Seeds")
            )
    );
    public static final DummyItemGroup PASTES = new DummyItemGroup(
            Keys.newKey("pastes"),
            ItemCreator.create(
                    new ItemStack(Material.GLOWSTONE_DUST),
                    Theme.MAIN.color("Netheopoiesis Seed Pastes")
            )
    );
    public static final DummyItemGroup BALLS = new DummyItemGroup(
            Keys.newKey("netheo-balls"),
            ItemCreator.create(
                    new ItemStack(Material.SNOWBALL),
                    Theme.MAIN.color("Netheopoiesis Netheo Balls")
            )
    );
    public static final DummyItemGroup CRUX = new DummyItemGroup(
            Keys.newKey("crux"),
            ItemCreator.create(
                    new ItemStack(Material.MYCELIUM),
                    Theme.MAIN.color("Netheopoiesis Crux'")
            )
    );
    public static final DiscoveriesFlexGroup DISCOVERIES = new DiscoveriesFlexGroup(
            Keys.newKey("discoveries"),
            ItemCreator.create(
                    new ItemStack(Material.WHEAT_SEEDS),
                    Theme.MAIN.color("Breeding Discoveries")
            )
    );
    public static final TradesFlexGroup TRADES = new TradesFlexGroup(
            Keys.newKey("trades"),
            ItemCreator.create(
                    new ItemStack(Material.GOLD_INGOT),
                    Theme.MAIN.color("Wandering Piglin Trades")
            )
    );
    public static final PurificationFlexGroup GUIDE = new PurificationFlexGroup(
            Keys.newKey("guide"),
            ItemCreator.create(
                    new ItemStack(Material.BOOKSHELF),
                    Theme.MAIN.color("Purification Information")
            )
    );

    static {
        final Netheopoiesis plugin = Netheopoiesis.getInstance();

        SEEDS.setCrossAddonItemGroup(true);

        // Slimefun Registry
        MAIN.register(plugin);
        CRAFTING.register(plugin);
        TOOLS.register(plugin);
        SEEDS.register(plugin);
        CRUX.register(plugin);
    }

    private Groups() {
        throw new IllegalStateException("Utility class");
    }
}
