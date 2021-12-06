package com.xnsdesign.factory.exercise;

public class PersonFactory {

    public static Person createPerson(String typePerson) {
        Person person = null;
        if (typePerson.equals("male")) {
            person = new Male();
        } else if (typePerson.equals("female")) {
            person = new Female();;
        }
        return person;
    }
}
