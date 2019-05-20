package edu.bu.met.cs665.taxAccounts;

import org.apache.log4j.Logger;

public class CPA extends Taxpayer {

  // We use here a logger instead of printing to system.out
  private static Logger logger = Logger.getLogger(CPA.class);

  /**
   * Create an instance of Checking Account.
   */
  public CPA() {
    this.taxpayerType = "CPA";
    this.taxDue = 0d;


    // Inform only internal brokers about this checking account.
    this.addToInternalAuditLogs("CPA Account Holder");

    // Logic to check CPA permission
    logger.info("Has permission to create CPA Account");
  }

}
