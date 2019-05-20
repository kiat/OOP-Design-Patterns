package edu.bu.met.cs665;

import edu.bu.met.cs665.bankacounts.AccountBundle;
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


    AccountBundle bundlePersonal = AccountFacory.createAccountBundle("personal");
    logger.info(
        "Bank Account " + bundlePersonal.getCheckingAccount().getAccountName() + " is created");
    logger
        .info("Bank Account " + bundlePersonal.getSavingAccount().getAccountName() + " is created");

    AccountBundle bundleCorporate = AccountFacory.createAccountBundle("corporate");

    logger.info(
        "Bank Account " + bundleCorporate.getCheckingAccount().getAccountName() + " is created");
    logger.info(
        "Bank Account " + bundleCorporate.getSavingAccount().getAccountName() + " is created");

    // This line should generate an ERROR in Log
    AccountBundle bundleUnknown = AccountFacory.createAccountBundle("Unknown");
    if (bundleUnknown == null) {
      logger.error("Bundle account is not known!");
    }

  }

}
