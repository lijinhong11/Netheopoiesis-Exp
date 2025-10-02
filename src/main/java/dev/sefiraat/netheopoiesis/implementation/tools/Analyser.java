package dev.sefiraat.netheopoiesis.implementation.tools;

import dev.sefiraat.netheopoiesis.api.items.BeaconSiphoningBlock;
import dev.sefiraat.netheopoiesis.api.items.NetherSeed;
import dev.sefiraat.netheopoiesis.utils.ItemStackUtils;
import dev.sefiraat.netheopoiesis.utils.Keys;
import dev.sefiraat.netheopoiesis.utils.ProtectionUtils;
import dev.sefiraat.netheopoiesis.utils.Theme;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

/**
 * The Analyser is used on plants to display information about said plant to the player
 */
public class Analyser extends SlimefunItem {

    private final Set<AnalyserType> types;

    @ParametersAreNonnullByDefault
    public Analyser(ItemGroup group, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, Set<AnalyserType> types) {
        super(group, item, recipeType, recipe);
        this.types = types;
    }

    @Override
    public void preRegister() {
        addItemHandler((ItemUseHandler) this::onUse);
    }

    private void onUse(@Nonnull PlayerRightClickEvent event) {
        final Optional<Block> optional = event.getClickedBlock();
        if (optional.isPresent()) {
            final Block block = optional.get();
            final Player player = event.getPlayer();
            final ItemStack analyser = event.getItem();

            if (!ProtectionUtils.hasPermission(player, block, Interaction.INTERACT_BLOCK)) {
                return;
            }

            if (ItemStackUtils.isOnCooldown(analyser)) {
                player.sendMessage(Theme.WARNING + "This item is still on cooldown.");
                return;
            }

            final SlimefunItem slimefunItem = BlockStorage.check(block);

            if (slimefunItem instanceof NetherSeed plant && types.contains(AnalyserType.SEED)) {
                onUseSeed(block, plant, player);
            } else if (slimefunItem instanceof BeaconSiphoningBlock siphon && types.contains(AnalyserType.SIPHON)) {
                onUseSiphon(block, siphon, player);
            }

            // Put item on cooldown to minimise potential BlockStorage spamming
            ItemStackUtils.addCooldown(analyser, 5);
        }
    }

    @ParametersAreNonnullByDefault
    private void onUseSeed(Block block, NetherSeed plant, Player player) {
        final String growthStage = BlockStorage.getLocationInfo(block.getLocation(), Keys.SEED_GROWTH_STAGE);
        final String ownerString = BlockStorage.getLocationInfo(block.getLocation(), Keys.BLOCK_OWNER);
        final UUID uuid = UUID.fromString(ownerString);
        final OfflinePlayer ownerPlayer = Bukkit.getOfflinePlayer(uuid);

        final String messageType = Theme.CLICK_INFO.asTitle("Seed Type", plant.getItemName());
        final String messageStage = Theme.CLICK_INFO.asTitle("Growth Stage", growthStage);
        final String messageOwner = Theme.CLICK_INFO.asTitle("Owner", ownerPlayer.getName());
        final String messageValue = Theme.CLICK_INFO.asTitle(
            "Purification Value",
            plant.getPurificationValue()
        );
        player.sendMessage(messageType, messageStage, messageOwner, messageValue);
    }

    @ParametersAreNonnullByDefault
    private void onUseSiphon(Block block, BeaconSiphoningBlock siphon, Player player) {
        final int currentPower = siphon.getCurrentPower(block);
        final String powerMessage = Theme.CLICK_INFO.asTitle("Siphon Power", currentPower);

        player.sendMessage(powerMessage);
    }

    public enum AnalyserType {
        SEED,
        SIPHON
    }
}
