package com.company;

import java.util.Arrays;

public class Hotel implements Rentpayment {
    private String address;
    private Person[] person;

    public Hotel(String address, Person[] person) {
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
        System.out.println("RENT PAYMENT: 225$");
    }

    @Override
    public String toString() {
        return "Hotel:" +
                "\naddress:" + address +
                "\nperson:" + Arrays.toString(person);
    }
}
