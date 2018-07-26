package edu.bu.met.cs665;

import java.util.List;
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


    CacheProxy reader = new CacheProxy("CUSTOMER_DATA2.csv");

    
    long startTime = System.nanoTime();

        
    List<Customer> customers1 = reader.getCustomerData();

    for (int i=0; i<customers1.size(); i++) {
      logger.debug(customers1.get(i).getName());
    }

    // End of time calculation
    long endTime = System.nanoTime();
    double elapsedTotalTime = (endTime - startTime) / 1000000000.0;
    
    
    long startTime2 = System.nanoTime();

    List<Customer> customers2 = reader.getCustomerData();

    for (int i=0; i<customers2.size(); i++) {
      logger.debug(customers2.get(i).getName());
    }
    
    
    // End of time calculation
    long endTime2 = System.nanoTime();
    double elapsedTotalTime2 = (endTime2 - startTime2) / 1000000000.0;
    
    logger.info("Without Proxy - Elapsed Time in second to get the data :" + String.format("%.9f", elapsedTotalTime)); 
    logger.info("With Proxy -  Elapsed Time in second to get the data :" + String.format("%.9f", elapsedTotalTime2)); 

  }

}
