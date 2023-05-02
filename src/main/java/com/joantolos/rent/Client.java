package com.joantolos.rent;

public class Client {

    private String driverLicenseNumber;
    private String firstName;
    private String lastName;
    private String creditCardNumber;

    public Client(String driverLicenseNumber, String firstName, String lastName, String creditCardNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.creditCardNumber = creditCardNumber;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }
}
