package edu.bu.met.cs665.bankacounts;

import org.apache.log4j.Logger;

public class CorporateSavingAccount extends BankAccount {

  // We use here a logger instead of printing to system.out
  private static Logger logger = Logger.getLogger(CorporateSavingAccount.class);

  /**
   * Creates an account of saving bank account.
   */
  public CorporateSavingAccount() {
    this.accountName = "CorporateSavingAccount";
    this.balance = 0d;

    // Add this account only to internal and central database.
    this.addDatabaseName("CorporateInternalDatabase");
    this.addDatabaseName("CorporateCentralDatabase");

    // Inform only internal brokers about this account.
    this.addBroker("CorporateInternalBrokers");
    this.addBroker("CorporateSavingBrokers");

    logger.info("Created a Corporate Saving Account Account");

  }
}
