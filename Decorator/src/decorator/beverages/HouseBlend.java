package decorator.beverages;

import decorator.Beverage;

public class HouseBlend extends Beverage{
	public HouseBlend() {
		description = "House Blend Coffe";
	}
	
	public double cost() {
		return .89;
	}
}
