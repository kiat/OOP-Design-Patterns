package edu.bu.met.cs665.cars;

public class Truck extends Car {
	
	private double loadCapacity;

	public Truck() {
		super();
	}

	public Truck(int year, int noOfGears, String model, int horsepower, double loadCapacity) {
		super(year, noOfGears, model, horsepower);
		this.loadCapacity = loadCapacity;
	}

	public Truck(int year, int noOfGears, String model, int horsepower) {
		super(year, noOfGears, model, horsepower);
	}

	public double getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

}
