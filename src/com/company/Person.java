package com.company;

public class Person {

    private int howmany;

    public Person(int bir) {

        this.howmany = bir;
    }
    public int getBir() {
        return howmany;
    }

    public void setBir(int bir) {
        this.howmany = bir;
    }

    @Override
    public String toString() {
        return " " + howmany;
    }
}
