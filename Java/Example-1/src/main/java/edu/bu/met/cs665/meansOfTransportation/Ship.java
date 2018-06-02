package edu.bu.met.cs665.meansOfTransportation;

import edu.bu.met.cs665.behaviors.PushToOtherDirection;

public class Ship extends MeansOfTransportation {

	// 
	public Ship() {
		this.brakeBehavior = new PushToOtherDirection();
	}

}
