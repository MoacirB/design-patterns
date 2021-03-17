package factory;

import pizza.Pizza;

public abstract class PizzaStore {
    //Haverá diferentes pizzaStores que farão pizzas de maneiras diferentes
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);//Factory pizza que será implementado pelas subclasses
}
