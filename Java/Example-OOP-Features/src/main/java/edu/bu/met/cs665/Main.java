package edu.bu.met.cs665;

import edu.bu.met.cs665.cars.Car;
import edu.bu.met.cs665.cars.Sedan;
import edu.bu.met.cs665.carshop.CarShop;

public class Main {

	public static void main(String[] args) {

		Car myCar = new Sedan();
		CarShop myFavoriteCarshop = new CarShop();

		// I have damaged my Car, bad!
		myCar.setDamaged(true);
		System.out.println("Is my Car damaged?: " + myCar.isDamaged());

		double myMoney = 1200;

		// if my car is damaged, I ask the shop to repair it
		// without knowing how they repair my car.
		if (myCar.isDamaged()) {
			myCar.setDamaged(!myFavoriteCarshop.repair(myCar, myMoney));
		}
		
		System.out.println("Is my Car damaged?: " + myCar.isDamaged());

	}
}
