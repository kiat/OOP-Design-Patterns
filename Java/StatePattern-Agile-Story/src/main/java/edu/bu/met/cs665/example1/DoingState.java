package edu.bu.met.cs665.example1;

public class DoingState implements State {
	UserStory userStory;
	
	public DoingState(UserStory userStory) {
		this.userStory = userStory;
	}

	public void startWorkingOn() {
		System.out.println("You cannot start this! Because you already started this!");	
	}

	public void stopWorkingOn() {
		System.out.println("Okay, fine. You can take a break!");
		this.userStory.setState(userStory.getTodoState());
	}

	public void finishWorkingOn() {
		System.out.println("Awesome, you are getting things done!");
		this.userStory.setState(userStory.getDoneState());
	}
	
	public String toString() {
		return "This is the DOING state..";
	}
}
