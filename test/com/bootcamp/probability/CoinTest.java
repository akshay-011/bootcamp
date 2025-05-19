package com.bootcamp.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {

    @Test
    void shouldGiveChanceOfGettingTail() {
        Chance chance = Coin.flip();
        Chance expected = Chance.fromProbability(1, 2);
        assertEquals(expected, chance);
    }
}