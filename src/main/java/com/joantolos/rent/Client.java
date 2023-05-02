package com.joantolos.rent;

public class Client {

    private String licenseNumber;
    private String name;
    private String surname;
    private String creditCardNumber;

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
