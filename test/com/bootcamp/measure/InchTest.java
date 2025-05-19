package com.bootcamp.measure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchTest {
    @Test
    void shouldCompareWithCentimeter() {
        Inch inch = new Inch(2);
        Centimeter centimeter = new Centimeter(5);

        assert(inch.equalsToCm(centimeter));
    }

    @Test
    void shouldGiveFalse() {
        Inch inch = new Inch(2);
        Centimeter centimeter = new Centimeter(6);

        assertFalse(inch.equalsToCm(centimeter));
    }
}