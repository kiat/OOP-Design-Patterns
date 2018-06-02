package edu.bu.met.cs665.behaviors;

public class brakeParachute implements BrakeBehavior{

	@Override
	public void brake() {
		 System.out.println("A drogue parachute Brake is applied!. A parachute attached to the rear of a plane and opened to assist braking");
	}
}