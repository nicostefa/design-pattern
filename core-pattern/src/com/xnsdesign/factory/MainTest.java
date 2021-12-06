package com.xnsdesign.factory;

public class MainTest {

    public static void main(String[] args) {

        System.out.println("Start test Factory");

        System.out.println("-------");
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("veggy");
        System.out.println("-------");
        pizzaStore.orderPizza("meat");
        System.out.println("-------");
        pizzaStore.orderPizza("cheese");
        System.out.println("-------");

        System.out.println("End test Factory");
    }
}
