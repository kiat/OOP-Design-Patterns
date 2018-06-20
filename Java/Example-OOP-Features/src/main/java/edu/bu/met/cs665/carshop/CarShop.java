package edu.bu.met.cs665.carshop;

import edu.bu.met.cs665.cars.Car;

public class CarShop {
	// This method repairs your car if pay enough.
	public boolean repair(Car yourCar, double money) {

		// if you pay more than
		if (money > 1000d) {
			System.out.println("Car shop accepted your payment and repairs your car.");
			
			// Start the repair
			// this is a very complex repair that we do not know about 
			// .... 
			return true;
		}else {
			System.out.println("Your payment is not enough to repair your car. You need to pay at least 100 dollar");
			return false;
		}
	}
}