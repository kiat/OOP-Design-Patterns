package edu.bu.met.cs665;

import edu.bu.met.cs665.behaviors.Brake;
import edu.bu.met.cs665.meansOfTransportation.MeansOfTransportation;
import edu.bu.met.cs665.meansOfTransportation.EconomyCar;
import edu.bu.met.cs665.meansOfTransportation.FullSizeSUV;

public class Main {

	public static void main(String[] args) {

		MeansOfTransportation economyCar = new EconomyCar();
		economyCar.applyBrake(); // This will invoke class "Brake"

		MeansOfTransportation suvCar = new FullSizeSUV();
		suvCar.applyBrake(); // This will invoke class "BrakeWithABS"

		// Here we set the brake behavior dynamically
		suvCar.setBrakeBehavior(new Brake());
		suvCar.applyBrake();

	}

}