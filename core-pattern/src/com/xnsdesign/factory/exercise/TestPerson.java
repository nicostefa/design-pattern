package com.xnsdesign.factory.exercise;

public class TestPerson {

    public static void main(String[] args) {
        System.out.println("Start Test Exercise Factory - Person wish");

        PersonWish personWish = new PersonWish();
        String msgMale = personWish.wishPerson("male", "car");
        String msgFemale = personWish.wishPerson("female", "dress");

        System.out.println(msgMale);
        System.out.println(msgFemale);

        System.out.println("End Test Exercise Factory - Person wish");
    }
}
