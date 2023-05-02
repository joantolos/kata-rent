package com.joantolos.rent;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class AcceptanceTest {

    private Car car;
    private Rental rental;

    @Before
    public void setUp() {
        // Nou cotxe
        this.car = new Car("1234 ABC", "Toyota", "Corolla");

        // Nou client
        Client client = new Client("12345678A", "Pep", "Garcia", "1234 5678 9012 3456");

        // El client lloga el cotxe per una setmana
        this.rental = new Rental(LocalDate.of(2023, 5, 1), LocalDate.of(2023, 5, 8), 500, car, client);

        // Afegim dos desperfectes al lloger
        rental.addDamage(new Damage("Esquerda al paraxocs", 150));
        rental.addDamage(new Damage("Ratpenat al para-brises", 50));
    }

    @Test
    public void shouldAddNewDamageToRental() {
        Assert.assertFalse(rental.getDamages().isEmpty());
    }

    @Test
    public void shouldGetAllDamagesFromARental() {
        Assert.assertEquals(2, rental.getDamages().size());
    }

    @Test
    public void shouldGetTotalDamageAmountForACar() {
        Assert.assertEquals(200.0, car.getPendingDamageCost(), 0);
    }
}
