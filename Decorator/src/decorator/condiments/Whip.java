package decorator.condiments;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Whip extends CondimentDecorator{
	Beverage beverage;//Referência à bebida que engloba
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription()+", Whip";
	}
	
	public double cost() {
		return beverage.cost()+.20;
	}

}
