package edu.bu.met.cs665.emailcollectorsystem;

public class VirusInspection extends EmailDecorator {

	Email email;

	public VirusInspection(Email email) {

		this.email = email;
		email.setVirusInspection("\n THIS EMAIL HAS BEEN SCANNED FOR VIRUSES");
	}

	@Override
	public String getEmail() {
		return email.getEmail() + email.getVirusInspection() + "\n";
	}

	public String sendEmail() {
		return email.sendEmail() + ", with a VIRUS SCAN";
	}
}
