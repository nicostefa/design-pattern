package com.xnsdesign.factory.exercise;

public class PersonFactory {

    public static String createWish(String typePerson, String wish) {
        String wishMsg = "";
        if (typePerson.equals("male")) {
            Person person = new Male();
            wishMsg = person.wish(wish);
        } else if (typePerson.equals("female")) {
            Person person = new Female();
            wishMsg = person.wish(wish);
        }
        return wishMsg;
    }
}
