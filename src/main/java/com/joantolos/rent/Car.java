package com.joantolos.rent;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private final String licensePlate;
    private final String model;
    private final String brand;
    private final List<Rental> rentals;

    public Car(String licensePlate, String model, String brand) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.brand = brand;
        this.rentals = new ArrayList<>();
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

    public List<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public double getPendingDamageCost() {
        double totalDamageCost = 0.0;
        for (Rental rental : rentals) {
            totalDamageCost += rental.getPendingDamageCost();
        }
        return totalDamageCost;
    }
}
