package edu.bu.met.cs665.emailcollectorsystem;

public class ExternalEmail extends Email {

	public ExternalEmail() {
		header = "New External Email";
		text = "Some Text";
	}
 
	public String sendEmail() {
		return "The " + header + " has been sent";
	}
}

