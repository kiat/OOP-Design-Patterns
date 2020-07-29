package edu.bu.met.cs665.emailcollectorsystem;

/**
 * Bcc class is a decorator.
 */
public class Bcc extends EmailDecorator {

	/**
	 * The object around which other responsibilities (characteristics) are going to be added.
	 */
	Email email;

	/**
	 * Create an instance of Bcc.
	 *
	 * Bcc and Email have two relations: hasA and isA
	 */
	public Bcc(Email email) {
		this.email = email;
	}

	/**
	 *
	 * @return
	 */
	public String sendEmail() {
		if (email.getBccList().isEmpty()) {
			return email.sendEmail();
		}
		return email.sendEmail() + ", with a BCC";
	}

	@Override
	public String getEmail() {
		if (!email.getBccList().isEmpty()) {
			String theBccList = "\n BCC: ";
			for (String email: email.getBccList()){
				theBccList += email + ", ";
			}
			return email.getEmail() + theBccList+ "\n";
		}
		return email.getEmail() + " NO BCC ADDED\n";
	}
}
