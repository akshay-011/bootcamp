package com.bootcamp.probability;

public class Coin {

    public static Chance flip() {
        return Chance.fromProbability(1, 2);
    }
}
