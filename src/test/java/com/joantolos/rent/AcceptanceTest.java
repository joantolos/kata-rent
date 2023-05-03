package com.joantolos.rent;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class AcceptanceTest {

    private Car car;
    private Rental rental;
    private Client client;

    @Before
    public void setUp() {
        // Nou cotxe
        this.car = new Car("1234 ABC", "Toyota", "Corolla");
        // Nou client
        this.client = new Client("12345678A", "Pep", "Garcia", "1234 5678 9012 3456");
        // El client lloga el cotxe per una setmana i li fa 500 km
        this.rental = new Rental(
                LocalDate.of(2023, 5, 1),
                LocalDate.of(2023, 5, 8),
                500,
                car,
                client
        );
        // Afegim dos desperfectes al lloger
        rental.addDamage(new Damage("Esquerda al paraxocs", 50));
        rental.addDamage(new Damage("Cop al para-brises", 150));
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
    public void shouldGetTotalDamageFromARental() {
        Assert.assertEquals(200.0, rental.getPendingDamageCost(), 0);
    }

    @Test
    public void shouldGetTotalDamageAmountForACar() {
        Assert.assertEquals(200.0, car.getPendingDamageCost(), 0);
    }

    @Test
    public void sameCarShouldAccumulateDamagesFromAnotherRental() {
        Rental anotherRental = new Rental(
                LocalDate.of(2023, 5, 10),
                LocalDate.of(2023, 5, 5),
                500,
                car,
                client
        );
        anotherRental.addDamage(new Damage("Rascada a la porta", 30));
        Assert.assertEquals(230.0, car.getPendingDamageCost(), 0);
        Assert.assertEquals(30.0, anotherRental.getPendingDamageCost(), 0);
        Assert.assertEquals(200.0, rental.getPendingDamageCost(), 0);
    }
}
