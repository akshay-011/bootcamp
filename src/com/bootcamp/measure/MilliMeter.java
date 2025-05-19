package com.bootcamp.measure;

import java.util.Objects;

public class MilliMeter {
    private final double unit;

    public MilliMeter(double unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MilliMeter that = (MilliMeter) o;
        return Double.compare(unit, that.unit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(unit);
    }
}
