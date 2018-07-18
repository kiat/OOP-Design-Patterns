package edu.bu.met.cs665.command;

public class IncreaseLightCommand implements Command {
	private Light theLight;

	public IncreaseLightCommand(final Light light) {
		this.theLight = light;
	}

	@Override
	public void execute() {
		theLight.turnOn();
	}
}
