package edu.bu.met.cs665.emailcollectorsystem;

/**
 * VirusInspection class is a decorator.
 */
public class VirusInspection extends EmailDecorator {

	/**
	 * The object around which other responsibilities (characteristics) are going to be added.
	 */
	Email email;

	/**
	 * Create an instance of VirusInspection.
	 *
	 * VirusInspection and Email have two relations: hasA and isA
	 */
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
