package main;

import store.PizzaStore;
import store.SimplePizzaFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);

        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("veggie");
        pizzaStore.orderPizza("pepperoni");
    }
}
