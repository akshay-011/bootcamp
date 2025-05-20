package com.bootcamp.measure;

abstract public class MeasurementUnit {
    abstract public double convert();

    public boolean isEqual(MeasurementUnit target) {
        return this.convert() == target.convert();
    }
}
