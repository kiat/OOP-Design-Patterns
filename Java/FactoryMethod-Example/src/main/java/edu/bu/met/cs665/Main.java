package edu.bu.met.cs665;

import edu.bu.met.cs665.bankacounts.BankAccount;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Main {

  private static Logger logger = Logger.getLogger(Main.class);

  /**
   * This main method runs an example.
   * 
   * @param args not used
   */
  public static void main(String[] args) {

    PropertyConfigurator.configure("log4j.properties");

    BankAccount myCheckingAccount = AccountFacory.createAccount("checking");


    logger.info(
        "Bank Account " + myCheckingAccount.getAccountName() + " is created");
  }

}
