package edu.bu.met.cs665.example1;

public class GameStatus {
	// Design Pattern: Singleton
	private static GameStatus singletonOfGameStatus = new GameStatus();
	// Game status store
	private String status;

	/**
	 * Create a Game object.
	 *
	 */
	private GameStatus() {
		this.status = new String();
	}

	public static GameStatus getSingletonOfGameStatus() {
		return singletonOfGameStatus;
	}

	/**
	 * function to set current status.
	 */
	public void setStatus(String st) {
		this.status = st;
	}

	/**
	 * function to return status of the game.
	 *
	 * @return status as string
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * function to display the status of the game.
	 */
	public void displayStatus() {
		if (!this.status.equals("4A0B")) {
			System.out.println("Outcome is " + this.status + ". Try again");
		} else {
			System.out.println("Perfect, you got it right");
		}
	}

	/**
	 * function to check if game is ended.
	 */
	public boolean isEnd() {
		if (!this.status.equals("4A0B")) {
			return false;
		} else {
			return true;
		}
	}

}