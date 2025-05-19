package com.bootcamp.measure;

import java.util.Objects;

public class Feet {

    private final double value;

    public Feet(double value) {
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(value, feet.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    private Inch getInch() {
        double feetInInch = value * 12;
        return new Inch(feetInInch);
    }

    public boolean equalsToInch(Inch inch) {
        Inch target = getInch();
        return inch.equals(target);
    }
}
