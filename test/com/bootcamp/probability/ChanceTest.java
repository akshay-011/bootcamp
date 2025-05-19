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

    @Test
    void representTwoCoin() {
        Chance chance = Chance.fromProbability(2,4);
        Chance expected = Chance.fromProbability(1,2);

        assertEquals(expected, chance);
    }

    @Test
    void shouldNotCreateChance() {
        assertThrows(RuntimeException.class, () -> Chance.fromPercentage(-10), "Should not create chance if percentage is negative");
        assertThrows(RuntimeException.class, () -> Chance.fromPercentage(200), "Should not create chance if percentage is more than 100");
    }
}