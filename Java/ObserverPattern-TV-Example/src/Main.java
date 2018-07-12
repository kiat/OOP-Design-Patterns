import observer.*;

public class Main {
	
	// Main entry point to the program
	public static void main(String[] args) {
		System.out.println("Starting the program");
		
		
		// Create a new show
		TvShow theOffice = new TvShow("The Office");
		
		// Create fans of the show
		for (int i=0; i<50; i++) {
			new Person("Fan #" + i, theOffice);
		}
		
		// A new episode was released!
		theOffice.setLatestEpisode("Episode 2");
		
		
	}
	
}
