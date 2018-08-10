package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Game;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	/**
	 * A main method to run program. 
	 * @param args not used 
	 */
	public static void main(String[] args) {  

		// Initiating number guessing game with max times to guess
		Game game = Game.getSingletonOfGame();

		// Initial 4 hidden numbers
		game.setNumbers();

		// Initiating 4 cars
		game.start();
	}

}
