package edu.bu.met.cs665.command;

public class Light {
	
	private String lightLevel; 
	
	public Light() {
		lightLevel="OFF";
	}

	public void turnOn() {
		System.out.println("The light is on");
		lightLevel="ON";
	}

	public void turnOff() {
		System.out.println("The light is off");
		lightLevel="OFF";
	}

	
	public String getLightLevel() {
		return lightLevel;
	}

	public void setLightLevel(String lightLevel) {
		this.lightLevel = lightLevel;
	}
	
	
}