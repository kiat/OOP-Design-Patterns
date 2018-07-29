package edu.bu.met.cs665.example1;

public class TodoState implements State {
	
	UserStory userStory;
	
	public TodoState(UserStory userStory) {
		this.userStory = userStory;
	}

	public void startWorkingOn() {
		System.out.println("Great. You are working on something now.");
		this.userStory.setState(userStory.getDoingState());
	}

	public void stopWorkingOn() {
		System.out.println("You cannot stop working on something you haven't even started!");
	}

	public void finishWorkingOn() {
		System.out.println("You cannot finish something you haven't even started!");
	}
	
	public String toString() {
		return "This is the TODO state..";
	}
}
