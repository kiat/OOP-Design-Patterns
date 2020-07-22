package edu.bu.met.cs665.emailcollectorsystem;

public class Bcc extends EmailDecorator {
	Email email;

	public Bcc(Email email) {
		this.email = email;
	}

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
