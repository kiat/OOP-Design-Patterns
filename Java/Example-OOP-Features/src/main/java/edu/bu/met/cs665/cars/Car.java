package edu.bu.met.cs665.cars;

public class Car {

	private int year;
	private int noOfGears;
	private boolean damaged;
	private String model;
	private int horsepower;

	public Car() {
	}

	public Car(int year, int noOfGears, String model, int horsepower) {
		this.year = year;
		this.noOfGears = noOfGears;
		this.model = model;
		this.horsepower = horsepower;

		// this is a new car.
		this.damaged = false;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public void setYear(int year) {
		// we set the input only if it is correct.
		// Year of a car must be between 1885 and 2018.
		// Benz ran his first car in 1885, Daimler in 1886.
		if (year > 1885 || year < 2018)
			this.year = year;
		else
			// If the check failed we log it and send a message.
			System.out.println("Year must be between 1900 and 2018");
	}

	public int getYear() {
		return year;
	}

	public void setNoOfGears(int noOfGears) {
		// Input for the number of gears must be correct.
		if (noOfGears < 14)
			this.noOfGears = noOfGears;
		else
			System.out.println("No of gears of a car can not be larger than 14");
	}

	public int getNoOfGears() {
		return noOfGears;
	}

	public boolean isDamaged() {
		return damaged;
	}

	public void setDamaged(boolean damaged) {
		this.damaged = damaged;
	}

}
