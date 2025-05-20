package com.bootcamp.measure;

import java.util.Objects;

public class Measurement {
    private final double unit;

    private Measurement(double unit) {
        this.unit = unit;
    }

    public static Measurement fromMM(double v) {
        return new Measurement(v);
    }

    public static Measurement fromCM(double v) {
        return Measurement.fromMM(v * 10);
    }

    public static Measurement fromFeet(double value) {
        return Measurement.fromMM(value * 304.8);
    }

    public static Measurement fromInch(double value) {
        return Measurement.fromMM(value * 25.4);
    }

    public static boolean compare(double value1, double value2, double delta) {
        return (value2 - value1) < delta;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Measurement that = (Measurement) o;

        return Measurement.compare(unit, that.unit, 0.1);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(unit);
    }
}
