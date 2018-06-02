package edu.bu.met.cs665.behaviors;

public class HydraulicBrake implements BrakeBehavior{

	@Override
	public void brake() {
		 System.out.println("hydraulic Brake applied!");
	}

}
