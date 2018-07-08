package edu.bu.met.cs665.bankacounts;

import org.apache.log4j.Logger;

public class SavingAccount extends BankAccount {

  // We use here a logger instead of printing to system.out
  private static Logger logger = Logger.getLogger(SavingAccount.class);

  /**
   * Creates an account of saving bank account. 
   */
  public SavingAccount() {
    this.accountName = "SavingAccount";
    this.balance = 0d;

    // Add this account only to internal and central database.
    this.addDatabaseName("InternalDatabase");
    this.addDatabaseName("CentralDatabase");

    // Inform only internal brokers about this account.
    this.addBroker("InternalBrokers");
    this.addBroker("SavingBrokers");

    logger.info("Created a SavingAccount Account");

  }
}
