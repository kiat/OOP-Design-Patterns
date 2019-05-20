package edu.bu.met.cs665.bankacounts;

import org.apache.log4j.Logger;

public class CheckingAcount extends BankAccount {

  // We use here a logger instead of printing to system.out
  private static Logger logger = Logger.getLogger(CheckingAcount.class);

  /**
   * Create an instance of Checking Account.
   */
  public CheckingAcount() {
    this.accountName = "PersonalCheckingAccount";
    this.balance = 0d;

    // Add this account only to internal database.
    this.addDatabaseName("InternalDatabase");

    // Inform only internal brokers about this checking account.
    this.addBroker("InternalBrokerChecking");

    logger.info("Created a Checking Account");

  }

}
