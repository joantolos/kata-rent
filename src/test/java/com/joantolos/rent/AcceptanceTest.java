package com.joantolos.rent;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class AcceptanceTest {

    private final Car car = new Car("1234 ABC", "Toyota", "Corolla");
    private final Client client = new Client("12345678A", "Pep", "Garcia", "1234 5678 9012 3456");
    private final Rental rental = new Rental(LocalDate.of(2023, 5, 1), LocalDate.of(2023, 5, 8), 500, car, client);
    @Test
    public void shouldAddNewDamageToRental() {
        rental.addDamage(new Damage("Esquerda al paraxocs", 150));
        rental.addDamage(new Damage("Ratpenat al para-brises", 50));

        Assert.assertFalse(rental.getDamages().isEmpty());
    }

    @Test
    public void shouldGetAllDamagesFromARental() {
        rental.addDamage(new Damage("Esquerda al paraxocs", 150));
        rental.addDamage(new Damage("Ratpenat al para-brises", 50));

        Assert.assertEquals(2, rental.getDamages().size());
    }

    @Test
    public void shouldGetTotalDamageAmountForACar() {
        rental.addDamage(new Damage("Esquerda al paraxocs", 150));
        rental.addDamage(new Damage("Ratpenat al para-brises", 50));

        Assert.assertEquals(200.0, car.getPendingDamageCost(), 0);
    }
}
