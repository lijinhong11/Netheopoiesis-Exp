package dev.sefiraat.netheopoiesis.api.plant;

import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Set;

/**
 * This class collates the various classes used to describe the way a plant grows
 * and/or interacts with the world.
 */
public record Growth(@Nonnull GrowthStages stages, @Nonnull Set<String> placements, int purificationValue,
                     double growthRate) {

    @ParametersAreNonnullByDefault
    public Growth(GrowthStages stages, Set<String> placements, int purificationValue, double growthRate) {
        this.stages = stages;
        this.placements = placements;
        this.purificationValue = purificationValue;
        this.growthRate = growthRate;
    }

    @Nonnull
    public ItemStack getFullyGrownPlant() {
        return this.stages.getStages().get(this.stages.getStages().size() - 1).getPlayerHead();
    }
}
