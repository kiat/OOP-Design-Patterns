package edu.bu.met.cs665.emailcollectorsystem;

public class DisclaimerText extends EmailDecorator {

	Email email;

	public DisclaimerText(Email email) {
		this.email = email;
		email.setDisclaimer("\n DISCLAIMER HAS BEEN ADDED");
	}

	public String getEmail() {
		return email.getEmail() + email.getDisclaimer() + "\n";
	}

	public String sendEmail() {
		return email.sendEmail() + ", with a DISCLAIMER";
	}
}
