package com.joantolos.rent;

public class Client {

    private final String licenseNumber;
    private final String name;
    private final String surname;
    private final String creditCardNumber;

    public Client(String licenseNumber, String name, String surname, String creditCardNumber) {
        this.licenseNumber = licenseNumber;
        this.name = name;
        this.surname = surname;
        this.creditCardNumber = creditCardNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }
}
