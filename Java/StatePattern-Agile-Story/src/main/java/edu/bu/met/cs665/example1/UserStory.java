package edu.bu.met.cs665.example1;

public class UserStory {
	
	State toDoState;
	State doingState;
	State doneState;
	
	State state;

	public UserStory() {
		this.toDoState = new TodoState(this);
		this.doingState = new DoingState(this);
		this.doneState = new DoneState(this);
		this.state = toDoState;
	}
	
	public void startWorkingOn() {
		state.startWorkingOn();
	}
	
	public void stopWorkingOn() {
		state.stopWorkingOn();
	}
	
	public void finishWorkingOn() {
		state.finishWorkingOn();
	}
	
	public State getDoingState() {
		return this.doingState;
	}
	
	public State getDoneState() {
		return this.doneState;
	}
	
	public State getTodoState() {
		return this.toDoState;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return this.state;
	}
}
