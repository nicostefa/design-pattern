package com.xnsdesign.factory;

public class PizzaStore {

    public Pizza orderPizza(String typePizza) {
        Pizza pizza = PizzaFactory.createPizza(typePizza);

        pizza.prepare();
        pizza.bake();
        pizza.cut();

        return pizza;
    }
}
