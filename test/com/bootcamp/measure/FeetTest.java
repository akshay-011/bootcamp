package com.bootcamp.measure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeetTest {
    @Test
    void shouldCompareInchAndFeet() {
        Inch inch = new Inch(12.0);
        Feet feet = new Feet(1.0);

        assert(feet.equalsToInch(inch));
    }

    @Test
    void shouldGiveFalse() {
        Inch inch = new Inch(12.0);
        Feet feet = new Feet(1.2);

        assertFalse(feet.equalsToInch(inch));
    }

}