package main;

import factory.ChicagoPizzaStore;
import factory.NyPizzaStore;
import factory.PizzaStore;
import pizza.Pizza;

public class PizzaTestDrive {
    public static void main(String []args){
        PizzaStore nyStore = new NyPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName()+"\n");

        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a "+pizza.getName()+"\n");
    }
}
