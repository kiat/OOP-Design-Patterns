package edu.bu.met.cs665.coffeecondiments;

public class Suger extends CondimentDecorator {
	Beverage beverage;

	public Suger(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Suger";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
