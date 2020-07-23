package edu.bu.met.cs665.emailcollectorsystem;

public class ExternalEmail extends Email {

	/**
	 * Concrete email instance
	 * with header and some text.
	 */
	public ExternalEmail() {
		header = "New External Email";
		text = "Some Text";
	}

	/**
	 * Email abstract method implementation
	 */
	public String sendEmail() {
		return "The " + header + " has been sent";
	}
}

