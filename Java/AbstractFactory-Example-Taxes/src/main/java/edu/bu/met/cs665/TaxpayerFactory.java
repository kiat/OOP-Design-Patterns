package edu.bu.met.cs665;

import edu.bu.met.cs665.taxaccounts.Cpa;
import edu.bu.met.cs665.taxaccounts.CustomerServiceRep;
import edu.bu.met.cs665.taxaccounts.Taxpayer;
import edu.bu.met.cs665.taxaccounts.TaxpayerBundle;
import edu.bu.met.cs665.taxaccounts.Trustee;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;


public class TaxpayerFactory {

  // We use here a logger instead of printing to system.out.
  private static Logger logger = Logger.getLogger(TaxpayerFactory.class);

  /**
   * This is a factory method that validates current user and creates specific sets of objects.
   * <p>
   * Abstract factory hides the complexity of HOW/WHO is eligible to create specific typeofTaxPayer.
   * </p>
   * @param type taxPayer type to create
   * @return a taxpayer account
   */
  public static TaxpayerBundle createTaxpayerInstance(String type, String currentUser) {

    Taxpayer taxpayer = null;
    List<String> taxReturns = null;

    // At the runtime we decide which accounts should be created
    // We hide the complexity of account creation here.
    if (type.equals("Trustee")) {

      logger.debug("Tax Factory: Checking for trustee type. ");

      // PLACE Holder: Core Logic to decide if the currently logged in user has access
      // to create trustee account.

      // Write the code to validate if that user has access to specific SSN etc.

      logger.debug("Account Factory: Created Trustee Account.");
      taxpayer = new Trustee();

      // This is just a place holder for tax returns.
      // Normally you would load the returns as an object with its own classes and
      // interfaces
      taxReturns = new ArrayList<String>();

      logger.info("Trustee Account has been created. ");

    } else if (type.equals("CPA")) {

      logger.debug("Account Factory: Creating CPA Account.");
      logger.debug("Account Factory: Checking User Permission for CPA account.");

      taxpayer = new Cpa();

      // This is just a place holder for tax returns.
      // Normally you would load the returns as an object with its own classes and
      // interfaces
      taxReturns = new ArrayList<String>();
      logger.info("CPA account bundle has been created .");

    } else if (type.equals("CustomerService Rep")) {
      // Logic to deal with Customer Service Rep
      taxpayer = new CustomerServiceRep();
      // Normally you would load the returns as an object with its own classes

      taxReturns = new ArrayList<String>();
      logger.info("Customer Service Rep. bundle has been created .");

    } else if (type.equals("Admin")) {
      // Logic to deal with Employee
    } else {
      logger.error("I do not know about this type of accounts.");
    }

    // after we created the taxpayer account we put them in the bundle
    return new TaxpayerBundle(taxpayer, taxReturns);
  }

  /**
   * This is a factory method that creates the objects.
   * 
   * @param type - Taxpayer type
   * @return a Taxpayer
   */
  public static Taxpayer createAccount(String type) {

    Taxpayer account = null;

    if (type.equals("CPA")) {
      account = new Cpa();
    } else if (type.equals("Trustee")) {
      account = new Trustee();
    }

    return account;
  }

}
