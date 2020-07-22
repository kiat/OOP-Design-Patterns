package edu.bu.met.cs665;

import edu.bu.met.cs665.emailcollectorsystem.*;

public class Main {

  /**
   * A main method to run examples. 
   * @param args not used 
   */
	 public static void main(String args[]) {
		    
	 	// our first email.
		 Email email = new InternalEmail();
		 System.out.println(email.getEmail() + " ******* \n" + email.sendEmail());

		 // A second email with BCC, Disclaimer and VirusScan
		 Email email2 = new ExternalEmail();
		 email2.addEmailToBccList("JK@bu.edu");
		 email2.addEmailToBccList("MM@bu.edu");
		 email2.addEmailToBccList("ZZ@bu.edu");
		 email2 = new Bcc(email2);
		 email2 = new DisclaimerText(email2);
		 email2 = new VirusInspection(email2);

		 System.out.println("\n" + email2.getEmail() + " ******* \n" + email2.sendEmail());

		    
		 // A 3rd email with BCC and Disclaimer
		 Email email3 = new InternalEmail();
		 email3 = new VirusInspection(email3);
		 email3 = new DisclaimerText(email3);
		 email3.addEmailToBccList("JK@bu.edu");
		 email3.addEmailToBccList("MM@bu.edu");
		 email3.addEmailToBccList("ZZ@bu.edu");
		 email3.removeEmailFromBccList("MM@bu.edu");
		 email3 = new Bcc(email3);


		 System.out.println("\n" + email3.getEmail() + " ******* \n" + email3.sendEmail());
	 }

}
