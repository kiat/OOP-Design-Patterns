package edu.bu.met.cs665.example1;

import java.util.Random;
import java.util.Hashtable;
import java.util.Scanner;
import java.io.*;

public class Game {
	// Design Pattern: Singleton
	private static Game singletonOfGame = new Game(10);
	
	/**
	 * Create a Game object.
	 * 
	 * @param times maximum times to guess the hidden numbers.
	 */
	private Game(int times) {
		this.times = times;
	}
	
	public static Game getSingletonOfGame() {
		return singletonOfGame;
	}

	private int times;
	private int count = 1;
	private int[] numbers = new int[4];
	Random rand = new Random(); // random number generator

	/**
	 * function to set 4 hidden numbers.
	 */

	public void setNumbers() {
		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			int number = rand.nextInt(10); // initial one number from 0 to 9
			while (table.containsKey(number)) { // check if this number is already in the array
				number = rand.nextInt(10); // keep getting a new random int
			}
			table.put(number, number); // record this number
			numbers[i] = number;
		}
	}

	/**
	 * main number guessing game function.
	 * 
	 */

	public void start() {
		for (int i = 0; i < times; i++) {
			// get a number from users
			int[] digits = getNumbers();
			String result = check(digits);
			if (!result.equals("4A0B")) {
				System.out.println("Outcome is " + result + ". Try again");
			} else {
				System.out.println("Perfect, you got it right");
				break;
			}
			count++; // count for the number of tries
		}
		if (count == 11) { // user does not get it right within the max number of tries
			System.out.println("Sorry, you run out of tries. Better luck next time");
		}
	}

	/**
	 * Check user's number with the system hidden number return the outcome with
	 * xAyB. x is the correct guess with the same digit in the exact position. y is
	 * the correct guess with the same digit but different position.
	 * 
	 * @return outcome as string
	 */

	public String check(int[] digits) {
		int numberOfA = 0;
		int numberOfB = 0;
		// table to record any checked digit
		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
		for (int i = 0; i < digits.length; i++) {
			if (!table.contains(digits[i])) {
				boolean foundA = false;
				boolean foundB = false;
				for (int j = 0; j < numbers.length; j++) {
					if (digits[i] == numbers[j]) { // found this digit in the hidden number
						if (i == j) { // same position
							foundA = true;
						} else { // different position
							foundB = true;
						}
					}
				}
				if (foundA) { // same position
					numberOfA++;
					table.put(digits[i], digits[i]); // record this digit to avoid checking the same digit
				} else {
					if (foundB) { // different position
						numberOfB++;
						table.put(digits[i], digits[i]); // record this digit to avoid checking the same digit
					}
				}
			}
		}
		return numberOfA + "A" + numberOfB + "B";
	}

	/**
	 * I/O function to get 4 digits from 0 to 9.
	 * 
	 * @return array of 4 integers
	 */

	public int[] getNumbers() {
		boolean done = false;
		// Using while loop to make sure the number of digits is exactly 4
		String[] chars = new String[4];
		while (!done) {
			System.out.println("Try number " + count + " (Enter 4 digits from 0 to 9 separated by space):");
			Scanner in = new Scanner(System.in);
			String guess = in.nextLine();
			chars = guess.split(" ");
			if (chars.length != 4) {
				System.out.println("Please enter exactly 4 digits. Reenter your numbers");
			} else {
				done = true;
			}
		}
		// Convert string to integer
		int[] digits = new int[4];
		for (int i = 0; i < digits.length; i++) {
			try {
				digits[i] = Integer.parseInt(chars[i]);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return digits;
	}
}
