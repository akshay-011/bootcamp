package com.bootcamp.measure;

import java.util.Objects;

public class Measurement {
    public static final double CENTIMETER_CF = 10;
    public static final double FEET_CF = 304.8;
    public static final double INCH_CF = 25.4;
    public static final int MILLIMETER_CF = 1;
    private final double unit;

    protected Measurement(double unit) {
        this.unit = unit;
    }

    private static Measurement create(double value, double cf) {
        if (value < 0) throw new InvalidMeasurement();

        return new Measurement(value * cf);
    }

    public static Measurement fromMM(double value) {
        return Measurement.create(value, MILLIMETER_CF);
    }

    public static Measurement fromCM(double value) {
        return Measurement.create(value, CENTIMETER_CF);
    }

    public static Measurement fromFeet(double value) {
        return Measurement.create(value, FEET_CF);
    }

    public static Measurement fromInch(double value) {
        return Measurement.create(value, INCH_CF);
    }

    public static boolean compare(double value1, double value2, double delta) {
        return Math.abs(value2 - value1) < delta;
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

    public Measurement add(Measurement addend) {
        return Measurement.fromMM(this.unit + addend.unit);
    }
}
