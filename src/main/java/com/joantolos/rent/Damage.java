package com.joantolos.rent;

public class Damage {

    private final String description;
    private final double cost;
    private boolean repaired;

    public Damage(String description, double cost) {
        this.description = description;
        this.cost = cost;
        this.repaired = false;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public boolean isRepaired() {
        return repaired;
    }

    public void repair(boolean repaired) {
        this.repaired = repaired;
    }
}
