package com.bootcamp.measure;

import java.util.Objects;

public class Inch {

    private final double value;

    public Inch(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(value, inch.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public boolean equalsToCm(Centimeter centimeter) {
        return centimeter.equals(getCentimeter());
    }

    private Centimeter getCentimeter() {
        double inchToCentimeter = value * 2.5;
        return new Centimeter(inchToCentimeter);
    }
}
