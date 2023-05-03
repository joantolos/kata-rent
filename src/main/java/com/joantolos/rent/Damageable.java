package com.joantolos.rent;

import java.util.List;

public abstract class Damageable {

    private final List<Damage> damages;

    public Damageable(List<Damage> damages) {
        this.damages = damages;
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
