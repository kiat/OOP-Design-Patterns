package edu.bu.met.cs665.emailcollectorsystem;

/**
 * DisclaimerText class is a decorator.
 */
public class DisclaimerText extends EmailDecorator {

	/**
	 * The object around which other responsibilities (characteristics) are going to be added.
	 */
	Email email;

	/**
	 * Create an instance of DisclaimerText.
	 *
	 * DisclaimerText and Email have two relations: hasA and isA
	 */
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
