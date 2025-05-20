package com.bootcamp.measure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {
    @Test
    void shouldCreateCMUnit() {
        Measurement cm = Measurement.fromCM(1.0);
        Measurement mm = Measurement.fromMM(10);

        assertEquals(mm, cm);
    }

    @Test
    void shouldCompareFeetToInch() {
        Measurement feet = Measurement.fromFeet(1);
        Measurement inch = Measurement.fromInch(12);

        assertEquals(feet, inch);
    }

    @Test
    void compareWithDelta() {
        assert(Measurement.compare(0.1, 0.09, 0.1));
        assertFalse(Measurement.compare(0.1, 0.7, 0.1), "should fail these are not same");
    }

    @Test
    void shouldAdd2Units() {
        Measurement augend = Measurement.fromInch(2);
        Measurement addend = Measurement.fromInch(3);

        assertEquals(Measurement.fromInch(5), augend.add(addend), "should add 2 units");
    }

    @Test
    void shouldThrowError() {
        assertThrows(InvalidMeasurement.class, () -> Measurement.fromMM(-10));
    }
}