package com.bootcamp.measure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentimeterTest {
    @Test
    void shouldCompareCmAndMM() {
        Centimeter centimeter = new Centimeter(5);
        MilliMeter milliMeter = new MilliMeter(50);

        assert(centimeter.equalsToMM(milliMeter));
    }

    @Test
    void shouldGiveFalse() {
        Centimeter centimeter = new Centimeter(5);
        MilliMeter milliMeter = new MilliMeter(51);

        assertFalse(centimeter.equalsToMM(milliMeter));
    }
}