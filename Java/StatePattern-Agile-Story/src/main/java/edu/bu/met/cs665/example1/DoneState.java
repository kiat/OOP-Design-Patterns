package edu.bu.met.cs665.example1;

public class DoneState implements State {
	UserStory userStory;
	
	public DoneState(UserStory userStory) {
		this.userStory = userStory;
	}

	public void startWorkingOn() {
		System.out.println("You cannot start working on something that is already done..");
	}

	public void stopWorkingOn() {
		System.out.println("You cannot stop working on something that is already done..");
	}

	public void finishWorkingOn() {
		System.out.println("You cannot finish something that is already done..");
	}
	
	public String toString() {
		return "This is the DONE state..";
	}
}
