package com.company;

import java.util.Arrays;

public class Hostel implements Rentpayment{
    private String address;
    private Person[] person;

    public Hostel(String address, Person[] person) {
        this.address = address;
        this.person = person;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person[] getPerson() {
        return person;
    }

    public void setPerson(Person[] person) {
        this.person = person;
    }

    @Override
    public void rpayment() {
        System.out.println("RENT PAYMENT: 100$");
    }

    @Override
    public String toString() {
        return "Hostel: " +
                "\naddress: " + address  +
                "\nperson: " + Arrays.toString(person) ;
    }
}
