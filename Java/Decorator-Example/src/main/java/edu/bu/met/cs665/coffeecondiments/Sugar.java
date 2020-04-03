package edu.bu.met.cs665.coffeecondiments;

public class Sugar extends CondimentDecorator {
	Beverage beverage;

	public Sugar(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Sugar";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
