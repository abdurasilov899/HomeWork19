package com.company;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person(4);
        Person person2 = new Person(2);
        Person person3 = new Person(7);

        Person[] pers1 = {person1};
        Person[] pers2 = {person2};
        Person[] pers3 = {person3};

        Apartmant app =new Apartmant(" KOK-JAR ",pers1);
        System.out.println(app);
        app.utilities();
        Hotel hotel = new Hotel(" DJAL ",pers2);
        System.out.println(hotel);
        hotel.rpayment();
        Hostel hostel = new Hostel(" AKHUNBAEV ",pers3);
        System.out.println(hostel);
        hostel.rpayment();
    }
}

