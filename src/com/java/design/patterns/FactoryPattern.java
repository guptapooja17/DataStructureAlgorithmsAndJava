package com.java.design.patterns;

import java.util.Arrays;
import java.util.List;

public class FactoryPattern {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("Paneer Tikka");
        pizza.prepare();
    }
}

abstract class Pizza {
    String name;
    String base;
    String sauce;
    List<String> toppings;

    public void prepare() {
        System.out.println("Preparing your " + name);
        System.out.println("Tossing dough..." + base);
        System.out.println("Adding sauce..." + sauce);
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
        baking();
        cutting();
        boxing();
        delivering();
    }

    public void baking() {
        System.out.println("Baking pizza...");
    }

    public void cutting() {
        System.out.println("Cutting pizza...");
    }

    public void boxing() {
        System.out.println("Boxing your pizza...");
    }

    public void delivering() {
        System.out.println("Hurrey!!! Your Pizza On The Way...");
    }
}

class CheeseBrustPizza extends Pizza {
    public CheeseBrustPizza() {
        name = "Cheese Brust";
        base = "Wheat Bread";
        sauce = "Mayonnaise";
        toppings = Arrays.asList("Corn","Tomatoes");
    }
}

class PastaPizza extends Pizza {
    public PastaPizza() {
        name = "Paste Pizza";
        base = "Wheat Bread";
        sauce = "Mayonnaise";
        toppings = Arrays.asList("Pasta","Jalapeno","Red Papper");
    }
}

class PaneeTikkaPizza extends Pizza {
    public PaneeTikkaPizza() {
        name = "Paneer Tikka";
        base = "Wheat Bread";
        sauce = "Mayonnaise";
        toppings = Arrays.asList("Paneer","Capsicum","Onion");
    }
}

class PizzaFactory {
    private Pizza pizza;
    public Pizza createPizza(String type) {
        switch (type) {
            case "Cheese Brust" :
                return pizza = new CheeseBrustPizza();
            case "Paste Pizza" :
                return pizza = new PastaPizza();
            case "Paneer Tikka" :
                return pizza = new PaneeTikkaPizza();
            default:
                System.out.println("Please select your choice of pizza ");
        }
        return pizza;
    }
}

class PizzaStore {
    private PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }
    public Pizza orderPizza(String type) {
        return factory.createPizza(type);
    }
}