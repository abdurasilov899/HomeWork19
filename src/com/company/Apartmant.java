package com.company;

import java.util.Arrays;

public class Apartmant implements Utilities {
    private String address;
    private Person[] Person;

    public Apartmant(String address, com.company.Person[] person) {
        this.address = address;
        Person = person;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public com.company.Person[] getPerson() {
        return Person;
    }

    public void setPerson(com.company.Person[] person) {
        Person = person;
    }

    @Override
    public void utilities() {
        System.out.println("UTILITIES: 25$ ");
    }

    @Override
    public String toString() {
        return "Apartmant:" +
                "\naddress:" + address +
                "\nPerson:" + Arrays.toString(Person);
    }
}
