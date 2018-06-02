package edu.bu.met.cs665.behaviors;

public class ReverseEngineBrake implements BrakeBehavior{

	@Override
	public void brake() {
		 System.out.println("Jet engines are reveresed to apply brake functionality!");
	}
}

