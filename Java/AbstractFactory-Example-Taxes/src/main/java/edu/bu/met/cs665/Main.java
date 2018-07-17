package edu.bu.met.cs665;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import edu.bu.met.cs665.taxAccounts.taxpayerBundle;


public class Main {

  private static Logger logger = Logger.getLogger(Main.class);

  /**
   * This main method runs an example. 
   * @param args not used 
   */	
  public static void main(String[] args) {
    // It should be passed better by the JVM arguments.
    // Like -Dlog4j.configuration={path to the log4j.properties config file}
    PropertyConfigurator.configure("log4j.properties");


    taxpayerBundle bundleCPA = taxpayerFactory.createTaxpayerInstance("CPA","Joe Smith");
    logger.info(bundleCPA.getTaxpayerDetails().getTaxpayerType()+ " bundle is created");
    logger.info("Tax Returns Count: " + bundleCPA.getTaxReturns().size() );

    taxpayerBundle bundleTrustee = taxpayerFactory.createTaxpayerInstance("Trustee", "Jeff Jones");
    logger.info(bundleTrustee.getTaxpayerDetails().getTaxpayerType() + " bundle is created");
    logger.info("Tax Returns Count: " + bundleTrustee.getTaxReturns().size());

    // This line should generate an ERROR in Log
    taxpayerBundle bundleUnknown = taxpayerFactory.createTaxpayerInstance("Unknown","Smith J");
      if(bundleUnknown==null)
        ;
  
    
  }

}
