package edu.bu.met.cs665.behaviors;

public class BrakeWithABS implements BrakeBehavior{

	@Override
	public void brake() {
		 System.out.println("Brake with ABS applied!");
	}

}
