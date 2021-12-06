package com.xnsdesign.factory;

public class PizzaFactory {

    public static Pizza createPizza(String typePizza) {
        Pizza pizza = null;

        if (typePizza.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (typePizza.equals("meat")) {
            pizza = new MeatPizza();
        } else if (typePizza.equals("veggy")) {
            pizza = new VegPizza();
        }

        return pizza;
    }
}
