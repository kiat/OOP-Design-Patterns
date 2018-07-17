package edu.bu.met.cs665.singleton.coffee;
 
public class CoffeeMachineController {
	public static void main(String args[]) {

	    CoffeMachine coffeeMachine = CoffeMachine.getInstance();
		coffeeMachine.fill();
		coffeeMachine.brew();
		coffeeMachine.drain();

		// will return the same existing instance
		CoffeMachine boiler2 = CoffeMachine.getInstance();
	}
}
