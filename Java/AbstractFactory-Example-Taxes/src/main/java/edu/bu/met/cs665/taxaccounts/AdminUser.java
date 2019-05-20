package edu.bu.met.cs665.taxaccounts;

import org.apache.log4j.Logger;

public class AdminUser extends Taxpayer {

  // We use here a logger instead of printing to system.out
  private static Logger logger = Logger.getLogger(AdminUser.class);

  /**
   * Create an instance of admin User Account.
   */
  public AdminUser() {
    this.taxpayerType = "";
    this.taxDue = 0d;

    // Flag this account as Internal Employee account.
    this.addToInternalEmployeeList("Internal Employee");

    // Internal Audit Logs.
    this.addToInternalAuditLogs("Internal Account is being accessed. ");

    logger.info("Created Admin User account");

  }

}
