package com.bootcamp.measure;

public class Volume extends Measurement{

    private Volume(double unit) {
        super(unit);
    }

    public static Volume fromGallon(double value) {
        return Volume.fromLitre(value * 3.78);
    }

    public static Volume fromLitre(double value) {
        return new Volume(value);
    }
}
