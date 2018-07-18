package edu.bu.met.cs665;

import edu.bu.met.cs665.command.Command;
import edu.bu.met.cs665.command.DecreaseLightCommand;
import edu.bu.met.cs665.command.IncreaseLightCommand;
import edu.bu.met.cs665.command.Light;
import edu.bu.met.cs665.command.Switch;

public class Main {

	/**
	 * A main method to run examples.
	 * 
	 * @param args not used
	 */
	public static void main(final String[] arguments) {

		final Light lamp = new Light();

		final Command switchUp = new IncreaseLightCommand(lamp);
		final Command switchDown = new DecreaseLightCommand(lamp);

		final Switch mySwitch = new Switch();

		mySwitch.storeAndExecute(switchUp);
		mySwitch.storeAndExecute(switchDown);

	}

}
