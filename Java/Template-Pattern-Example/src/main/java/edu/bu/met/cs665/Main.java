package edu.bu.met.cs665;

import java.util.Collections;
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


    CacheProxy reader = new CacheProxy("CUSTOMER_DATA.csv");

    List<Customer> customers1 = reader.getCustomerData();
    
    for (int i=0; i<customers1.size(); i++) {
      logger.debug(customers1.get(i));
    }

    
    System.out.println("*********************************************");
    System.out.println("********** Now Sorted based on zip code *****");
    System.out.println("*********************************************");

    
    // now apply sort.
    Collections.sort(customers1);
   

    // print out customers with 
    for (int i=0; i<customers1.size(); i++) {
      logger.debug(customers1.get(i));
    }

  }

}
