package edu.bu.met.cs665.example1;

// The state pattern allows an object to alter its behavior when its internal state changes. 
// The object will appear to change its class.

public interface State {
	public void startWorkingOn();
	public void stopWorkingOn();
	public void finishWorkingOn();
}
