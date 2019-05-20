package edu.bu.met.cs665.taxaccounts;

import org.apache.log4j.Logger;

public class Cpa extends Taxpayer {

  // We use here a logger instead of printing to system.out
  private static Logger logger = Logger.getLogger(Cpa.class);

  /**
   * Create an instance of Checking Account.
   */
  public Cpa() {
    this.taxpayerType = "CPA";
    this.taxDue = 0d;


    // Inform only internal brokers about this checking account.
    this.addToInternalAuditLogs("CPA Account Holder");

    // Logic to check CPA permission
    logger.info("Has permission to create CPA Account");
  }

}
