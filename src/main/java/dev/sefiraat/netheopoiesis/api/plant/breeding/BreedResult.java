package dev.sefiraat.netheopoiesis.api.plant.breeding;

import javax.annotation.Nonnull;

public record BreedResult(@Nonnull BreedingPair matchedPair, @Nonnull BreedResultType resultType) {

    /**
     * This class represents the result of a breeding attempt including the matched {@link BreedingPair}
     *
     * @param matchedPair The matching {@link BreedingPair} found when testing the possible breeds
     * @param resultType  The {@link BreedResultType} denoting the success type and/or failure
     */
    public BreedResult {
    }
}
