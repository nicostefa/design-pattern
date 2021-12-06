package com.xnsdesign.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {

    private static final long serialVersionUID = -8160739200941080524L;
    private static volatile DateUtil instance;

    private DateUtil() {
    }

    public static DateUtil getInstance() {
        if (instance == null) {
            synchronized (DateUtil.class) {
                if (instance == null) {
                    instance = new DateUtil();
                }
            }
        }
        return instance;
    }

    // Use for enforcing read of stream and use serializable correctly -> deserializing
    protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
