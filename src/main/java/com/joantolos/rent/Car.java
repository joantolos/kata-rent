package com.joantolos.rent;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private final String licensePlate;
    private final String brand;
    private final String model;
    private final List<Rental> rentals;

    public Car(String licensePlate, String brand, String model) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.rentals = new ArrayList<>();
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public double getPendingDamageCost() {
        double pendingDamageCost = 0.0;
        for (Rental rental : rentals) {
            pendingDamageCost += rental.getPendingDamageCost();
        }
        return pendingDamageCost;
    }
}
