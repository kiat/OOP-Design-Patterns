package edu.bu.met.cs665.emailcollectorsystem;

public class InternalEmail extends Email {

	public InternalEmail() {
		header = "New Internal Email";
		text = "Some Text";
	}
 
	public String sendEmail() {
		return "The " + header + " has been sent";
	}
}

