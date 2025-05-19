package com.bootcamp.measure;

import java.util.Objects;

public class Centimeter {
    private final double unit;

    public Centimeter(double unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Centimeter that = (Centimeter) o;
        return Double.compare(unit, that.unit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(unit);
    }

    public boolean equalsToMM(MilliMeter milliMeter) {
        return milliMeter.equals(toMilliMeter());
    }

    private MilliMeter toMilliMeter() {
        return new MilliMeter(unit * 10);
    }
}
