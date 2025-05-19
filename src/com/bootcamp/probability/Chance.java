package com.bootcamp.probability;

import java.util.Objects;

public class Chance {

    private final double chance;

    private Chance(double chance) {
        this.chance = chance;
    }

    @Override
    public String toString() {
        return this.chance + "%";
    }

    public Chance compliment () {
        return new Chance(100 - chance);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Chance chance1 = (Chance) o;
        return chance == chance1.chance;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chance);
    }

    public static Chance fromProbability(double possibleOutComes, double numberOfOutComes) {
        double chance = (possibleOutComes / numberOfOutComes) * 100;

        return  new Chance(chance);
    }
}
