package com.joantolos.rent;

import java.time.LocalDate;
import java.util.ArrayList;

public class Rental extends Damageable {

    private final LocalDate start;
    private final LocalDate end;
    private final int totalKm;
    private final Car car;
    private final Client client;

    public Rental(LocalDate start, LocalDate end, int totalKm, Car car, Client client) {
        super(new ArrayList<>( ));
        this.start = start;
        this.end = end;
        this.totalKm = totalKm;
        this.car = car;
        this.client = client;
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

    @Override
    public void addDamage(Damage damage) {
        this.car.addDamage(damage);
        super.addDamage(damage);
    }
}
