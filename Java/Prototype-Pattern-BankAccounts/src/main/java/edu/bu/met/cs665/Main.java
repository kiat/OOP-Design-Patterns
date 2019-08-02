package edu.bu.met.cs665;

//import org.apache.log4j.Logger;
// import org.apache.log4j.PropertyConfigurator;

public class Main {

	// private static Logger logger = Logger.getLogger(Main.class);

	/**
	 * A main method to run examples.
	 *
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {

		// This configuration is for setting up the log4j properties file.
		// It is better to set this using java program arguments.
		// PropertyConfigurator.configure("log4j.properties");

		BankAccountStore.getAccount("Personal").addName();

		BankAccountStore.getAccount("Coorporate").addName();


	}

}
