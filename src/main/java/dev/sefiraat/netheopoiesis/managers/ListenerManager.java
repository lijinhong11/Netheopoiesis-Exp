package dev.sefiraat.netheopoiesis.managers;

import com.google.common.base.Preconditions;
import dev.sefiraat.netheopoiesis.Netheopoiesis;
import dev.sefiraat.netheopoiesis.listeners.*;
import org.bukkit.event.Listener;

import javax.annotation.Nonnull;

/**
 * This class is used to register all listeners in one place
 */
public class ListenerManager {

    private static ListenerManager instance;

    public ListenerManager() {
        Preconditions.checkArgument(instance == null, "Cannot create a new instance of the ListenerManager");
        instance = this;
        addListener(new DropListener());
        addListener(new CustomPlacementListener());
        addListener(new MobSpawnListener());
        addListener(new PlayerSleepListener());
        addListener(new WaterPlaceListener());
        addListener(new FriendlyMobsListener());
        addListener(new BlockProtectionListener());
        addListener(new CrystallineSeedListener());
        addListener(new ManagedMobListener());
        addListener(new CrushingListener());
        addListener(new WanderingPiglinListener());
        addListener(new NetherRoofListener());
    }

    public static ListenerManager getInstance() {
        return instance;
    }

    private void addListener(@Nonnull Listener listener) {
        Netheopoiesis.getPluginManager().registerEvents(listener, Netheopoiesis.getInstance());
    }
}
