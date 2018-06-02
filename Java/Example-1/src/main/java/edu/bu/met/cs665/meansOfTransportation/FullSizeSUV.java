package edu.bu.met.cs665.meansOfTransportation;

import edu.bu.met.cs665.behaviors.BrakeWithABS;

public class FullSizeSUV extends MeansOfTransportation {
	
	public FullSizeSUV() {
		this.brakeBehavior = new BrakeWithABS();
	}

}