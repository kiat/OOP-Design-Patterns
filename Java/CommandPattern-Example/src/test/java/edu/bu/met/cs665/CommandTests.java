package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.command.Command;
import edu.bu.met.cs665.command.DecreaseLightCommand;
import edu.bu.met.cs665.command.IncreaseLightCommand;
import edu.bu.met.cs665.command.Light;
import edu.bu.met.cs665.command.Switch;

// Write some Unit tests for your program like the following. 

/*
 * 
 */
public class CommandTests {

	public CommandTests() {
	}

	@Test
	public void Command1Tests() {

		final Light lamp = new Light();

		final Command switchUp = new IncreaseLightCommand(lamp);
		final Command switchDown = new DecreaseLightCommand(lamp);

		final Switch mySwitch = new Switch();

		mySwitch.storeAndExecute(switchUp);

		assertEquals(lamp.getLightLevel(), "ON");

		mySwitch.storeAndExecute(switchDown);

		assertEquals(lamp.getLightLevel(), "OFF");

	}

}
