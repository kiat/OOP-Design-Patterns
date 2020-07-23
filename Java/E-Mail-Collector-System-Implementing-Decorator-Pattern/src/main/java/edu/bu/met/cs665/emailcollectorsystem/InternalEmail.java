package edu.bu.met.cs665.emailcollectorsystem;

public class InternalEmail extends Email {

	/**
	 * Concrete email instance
	 * with header and some text.
	 */
	public InternalEmail() {
		header = "New Internal Email";
		text = "Some Text";
	}

	/**
	 * Email abstract method implementation
	 */
	public String sendEmail() {
		return "The " + header + " has been sent";
	}
}

