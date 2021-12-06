package com.xnsdesign.factory.exercise;

public class Female implements Person {

    @Override
    public String wish(String msg) {
        return "Female wish: " + msg;
    }
}
