package decorator.condiments;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;//Referência à bebida que engloba
	}
	
	public String getDescription() {
		return beverage.getDescription()+", Mocha";
	}
	
	public double cost() {
		return .20 + beverage.cost();
	}
}
