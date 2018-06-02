package edu.bu.met.cs665.meansOfTransportation;

import edu.bu.met.cs665.behaviors.Brake;

public class EconomyCar extends MeansOfTransportation {

	// Construct an economy car and set the brake behavior for this type of auto
	public EconomyCar() {
		this.brakeBehavior = new Brake();
	}

}