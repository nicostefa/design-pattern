package com.xnsdesign.singleton;

import java.io.*;

public class MainTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Start Test Singleton");

        DateUtil dateUtil1 = DateUtil.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\Utente\\Desktop\\Design Pattern\\dateUtil.ser")));
        oos.writeObject(dateUtil1);

        DateUtil dateUtil2 = null;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\Utente\\Desktop\\Design Pattern\\dateUtil.ser")));
        dateUtil2 = (DateUtil) ois.readObject();

        oos.close();
        ois.close();

        System.out.println(dateUtil1 == dateUtil2);

        System.out.println("End Test Singleton");
    }
}
