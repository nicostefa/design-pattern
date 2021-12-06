package com.xnsdesign.factory.exercise;

public class Male implements Person {

    @Override
    public String wish(String msg) {
        return "Male wish: " + msg;
    }
}
