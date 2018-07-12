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

    // TODO
    // NOTE: Setting the log4j property should not be here.
    // It should be passed better by the JVM arguments.
    // Like -Dlog4j.configuration={path to the log4j.properties config file}
    PropertyConfigurator.configure("log4j.properties");

    
    // Now we use the factory to generate a checking account. 
    AccountFactory accountCreator=new BestbankAccountFacory();
    BankAccount myCheckingAccount = accountCreator.createAccount("checking");


    logger.info("Bank Account " + myCheckingAccount.getAccountName() + " is created");
    
    // Now we use the factory to generate a checking account. 
    BankAccount mySavingAccount = accountCreator.createAccount("saving");

    logger.info("Bank Account " + mySavingAccount.getAccountName() + " is created");
  }
}
