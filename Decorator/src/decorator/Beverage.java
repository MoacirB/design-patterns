package decorator;
/*Uma bebida abstrata, nesse exemplo será usada para implementar os tipos de cafés e condimentos*/
public abstract class Beverage {
	protected String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	public abstract double cost();
}
