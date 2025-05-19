package com.bootcamp.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {

    @Test
    void shouldGiveChanceOfGettingTail() {
        Chance chance = Coin.flip(1);
        Chance expected = Chance.fromProbability(1, 2);
        assertEquals(expected, chance);
    }

    @Test
    void shouldGiveChanceOfMultipleCoin() {
        Chance chance = Coin.flip(2);
//        Chance expected
    }
}