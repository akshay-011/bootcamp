package com.bootcamp.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {

    @Test
    void shouldGiveRemainingChance() {
        Chance chance = new Chance(70);
        Chance expected = new Chance(30);

        assertEquals(expected, chance.compliment());
    }
}