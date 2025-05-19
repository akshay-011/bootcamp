package com.bootcamp.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {

    @Test
    void shouldGiveRemainingChance() {
        Chance chance = Chance.fromPercentage(70);
        Chance expected = Chance.fromPercentage(30);

        assertEquals(expected, chance.compliment());
    }

    @Test
    void representTwoCoin() {
        Chance chance = Chance.fromPercentage(50);
        Chance expected = Chance.fromPercentage(50);

        assertEquals(expected, chance);
    }

    @Test
    void testingCreationOfObject() {
        assertThrows(RuntimeException.class, () -> Chance.fromPercentage(-10), "Should not create chance if percentage is negative");
        assertThrows(RuntimeException.class, () -> Chance.fromPercentage(200), "Should not create chance if percentage is more than 100");
    }

    @Test
    void shouldMultiplyChance() {
        Chance chance1 = Chance.fromPercentage(10);
        Chance chance2 = Chance.fromPercentage(10);
        Chance expected = Chance.fromPercentage(1);

        assertEquals(expected, chance1.and(chance2));
    }

    @Test
    void shouldAddChances() {
        Chance chance1 = Chance.fromPercentage(10);
        Chance chance2 = Chance.fromPercentage(20);
        Chance expected = Chance.fromPercentage(28);

        assertEquals(expected, chance1.or(chance2));
    }
    @Test
    void shouldAddBothChances() {
        Chance chance1 = Chance.fromPercentage(100);
        Chance chance2 = Chance.fromPercentage(100);
        Chance expected = Chance.fromPercentage(100);

        assertEquals(expected, chance1.or(chance2));
    }
}