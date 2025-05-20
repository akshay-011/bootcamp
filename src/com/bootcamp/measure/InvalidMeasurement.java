package com.bootcamp.measure;

public class InvalidMeasurement extends RuntimeException {
    public InvalidMeasurement() {
        super("Invalid argument\nUnit cannot be negative");
    }
}
