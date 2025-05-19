package com.bootcamp.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
    @Test
    void shouldGiveChanceOf50() {
        Chance chance = new Chance(50);
        assertEquals("50%", chance.toString());
    }

    @Test
    void shouldGiveRemainingChance() {
        Chance chance = new Chance(70);
        assertEquals("30%", chance.compliment().toString());
    }
}