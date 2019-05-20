package edu.bu.met.cs665.taxaccounts;

import org.apache.log4j.Logger;

public class CustomerServiceRep extends Taxpayer {

  // We use here a logger instead of printing to system.out.
  private static Logger logger = Logger.getLogger(CustomerServiceRep.class);

  /**
   * Creates an Customer Rep Account.
   */
  public CustomerServiceRep() {
    this.taxpayerType = "CustomerServiceRep";
    this.taxDue = 0d;

    // Add this account only to internal and central database.
    this.addToInternalEmployeeList("CustomerService Rep");

    // Inform only internal brokers about this account.
    this.addToInternalAuditLogs(this.taxpayerName + " is logging in as Employee");

    logger.info("Customer Service Rep account");

  }
}
