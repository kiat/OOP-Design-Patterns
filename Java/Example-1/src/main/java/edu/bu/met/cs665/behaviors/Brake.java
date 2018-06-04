package edu.bu.met.cs665.behaviors;

import edu.bu.met.cs665.meansOfTransportation.MeansOfTransportation;

// This is a very simple brake. 

public class Brake implements BrakeBehavior {

	public boolean brake(MeansOfTransportation mot, double reducedSpeed) {
		// Brake can work when the speed is under 200 MPH
		if (mot.getSpeed() < 200) {
			System.out.println("Simple Brake applied");
			mot.setSpeed(reducedSpeed);
			return true;
		}

		return false;
	}

}