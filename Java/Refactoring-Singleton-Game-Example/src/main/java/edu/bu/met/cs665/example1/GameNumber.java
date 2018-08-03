package edu.bu.met.cs665.example1;

import java.util.Random;
import java.util.Hashtable;
import java.util.Scanner;
import java.io.*;


public class GameNumber {
	private int[] numbers;
	private int length = 4;
	private Random rand = new Random(); // random number generator

	/**
	 * Create a Game object.
	 *
	 */
	public GameNumber() {
		this.numbers = new int[length];
	}



	/**
	 * function to set random numbers for this game.
	 */
	public void setNumbers() {
		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
		for (int i = 0; i < this.length; i++) {
			int number = rand.nextInt(10); // initial one number from 0 to 9
			while (table.containsKey(number)) { // check if this number is already in the array
				number = rand.nextInt(10); // keep getting a new random int
			}
			table.put(number, number); // record this number
			numbers[i] = number;
		}
	}

	/**
	 * function to return the random numbers.
	 *
	 * @return numbers as integer array
	 */
	public int [] getNumbers() {
		return numbers;
	}
}