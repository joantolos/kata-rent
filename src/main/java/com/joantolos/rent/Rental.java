package com.joantolos.rent;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rental {

    private final Client client;
    private final Car car;
    private final Date startDate;
    private final Date endDate;
    private final int totalKm;
    private final List<Damage> damages;

    public Rental(Client client, Car car, Date startDate, Date endDate, int totalKm) {
        this.client = client;
        this.car = car;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalKm = totalKm;
        this.damages = new ArrayList<>();
    }

    public void addDamage(Damage damage) {
        damages.add(damage);
    }

    public Client getClient() {
        return client;
    }

    public Car getCar() {
        return car;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getTotalKm() {
        return totalKm;
    }

    public List<Damage> getDamages() {
        return damages;
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
