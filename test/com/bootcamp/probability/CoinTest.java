package com.bootcamp.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {

    @Test
    void shouldGiveChanceOfGettingTail() {
        Chance chance = Coin.flip();
        assertEquals("50%", chance.toString());
    }
}