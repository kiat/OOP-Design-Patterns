package edu.bu.met.cs665.taxaccounts;

import org.apache.log4j.Logger;

public class Trustee extends Taxpayer {

  // We use here a logger instead of printing to system.out
  private static Logger logger = Logger.getLogger(Trustee.class);

  /**
   * Creates an account of saving bank account.
   */
  public Trustee() {
    this.taxpayerType = "Trustee";
    this.taxDue = 0d;

    // Check for Trustee permission
    logger.info("Has permission to create " + this.getTaxpayerType());

  }
}
