package com.bootcamp.probability;

public class Coin {

    public static Chance flip(int i) {
        return Chance.fromProbability(1, 2);
    }
}
