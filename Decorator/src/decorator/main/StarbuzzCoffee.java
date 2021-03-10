package decorator.main;

import decorator.Beverage;
import decorator.beverages.*;
import decorator.condiments.*;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Expresso();
		System.out.println(beverage.getDescription()+" $"+beverage.cost());
		//Expresso $1.99
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);//House Blend com Mocha
		beverage2 = new Mocha(beverage2);//House Blend com duplo mocha
		beverage2 = new Whip(beverage2);//House blend com duplo mocha e whip
		System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
		//House Blend Coffe, Mocha, Mocha, Whip $1.49
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription()+" $"+beverage3.cost());
		//House Blend Coffe, Soy, Mocha, Whip $1.5899999999999999
	}

}
