package com.xnsdesign.factory.exercise;

public class TestPerson {

    public static void main(String[] args) {
        System.out.println("Start Test Exercise Factory - Person wish");

        Person male = PersonFactory.createPerson("male");
        Person female = PersonFactory.createPerson("female");

        System.out.println(male.wish("car"));
        System.out.println(female.wish("dress"));

        System.out.println("End Test Exercise Factory - Person wish");
    }
}
