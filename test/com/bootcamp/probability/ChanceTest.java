package com.bootcamp.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {

    @Test
    void shouldGiveRemainingChance() {
        Chance chance = Chance.fromProbability(70, 100);
        Chance expected = Chance.fromProbability(30, 100);

        assertEquals(expected, chance.compliment());
    }
}