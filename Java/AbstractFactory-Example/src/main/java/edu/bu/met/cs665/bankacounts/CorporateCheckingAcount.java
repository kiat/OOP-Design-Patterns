package edu.bu.met.cs665.bankacounts;

import org.apache.log4j.Logger;

public class CorporateCheckingAcount extends BankAccount {

  // We use here a logger instead of printing to system.out
  private static Logger logger = Logger.getLogger(CorporateCheckingAcount.class);

  /**
   * Create an instance of Checking Account.
   */
  public CorporateCheckingAcount() {
    this.accountName = "CorporateChecingAccount";
    this.balance = 0d;

    // Add this account only to Corporate internal database.
    this.addDatabaseName("CorporateInternalDatabase");

    // Inform only internal brokers about this Corporate checking account.
    this.addBroker("CorporateInternalBrokerChecking");

    logger.info("Created a Corporate Checking Account");

  }

}
