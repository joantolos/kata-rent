package com.joantolos.rent;

import java.util.ArrayList;

public class Car extends Damageable {

    private final String licensePlate;
    private final String model;
    private final String brand;

    public Car(String licensePlate, String model, String brand) {
        super(new ArrayList<>());
        this.licensePlate = licensePlate;
        this.model = model;
        this.brand = brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
}
