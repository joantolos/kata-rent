package com.joantolos.rent;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Rental {

    private final LocalDate start;
    private final LocalDate end;
    private final int totalKm;
    private final Car car;
    private final Client client;
    private final List<Damage> damages;

    public Rental(LocalDate start, LocalDate end, int totalKm, Car car, Client client) {
        this.start = start;
        this.end = end;
        this.totalKm = totalKm;
        this.car = car;
        this.client = client;
        this.damages = new ArrayList<>();
        this.car.addRental(this);
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public int getTotalKm() {
        return totalKm;
    }

    public Car getCar() {
        return car;
    }

    public Client getClient() {
        return client;
    }

    public List<Damage> getDamages() {
        return damages;
    }

    public void addDamage(Damage damage) {
        damages.add(damage);
    }

    public double getPendingDamageCost() {
        double pendingDamageCost = 0.0;
        for (Damage damage : damages) {
            if (!damage.isRepaired()) {
                pendingDamageCost += damage.getCost();
            }
        }
        return pendingDamageCost;
    }

}
