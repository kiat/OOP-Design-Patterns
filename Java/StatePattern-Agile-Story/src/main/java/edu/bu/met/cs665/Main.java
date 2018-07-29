package edu.bu.met.cs665;
import edu.bu.met.cs665.example1.*;

public class Main {
	
	// Main entry point to the program
	public static void main(String[] args) {
		System.out.println("Starting the program");
		
		UserStory userStory = new UserStory();
		System.out.println(userStory.getState().toString());
		
		userStory.startWorkingOn();
		System.out.println(userStory.getState().toString());
		
		userStory.stopWorkingOn();
		System.out.println(userStory.getState().toString());
		
		userStory.finishWorkingOn();
		System.out.println(userStory.getState().toString());
		
	}
}
