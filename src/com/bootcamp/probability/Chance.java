package com.bootcamp.probability;

public class Chance {

    private final int chance;

    public Chance(int chance) {
        this.chance = chance;
    }

    @Override
    public String toString() {
        return this.chance + "%";
    }

    public Chance compliment () {
        return new Chance(100 - chance);
    }
}
