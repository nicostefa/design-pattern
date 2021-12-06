package com.xnsdesign.factory.exercise;

public class PersonWish {

    public String wishPerson(String typePerson, String wish) {
        String msg = "";
        msg = PersonFactory.createWish(typePerson, wish);
        return msg;
    }
}
