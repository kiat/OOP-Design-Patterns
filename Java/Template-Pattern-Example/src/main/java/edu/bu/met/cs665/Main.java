package edu.bu.met.cs665;

import edu.bu.met.cs665.orders.CryptoOrder;
import edu.bu.met.cs665.orders.InStoreOrder;
import edu.bu.met.cs665.orders.OnlineOrder;
import edu.bu.met.cs665.orders.OrderProcessTemplate;
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

    // creating a different type of order but declaring them from their abstract type
    OrderProcessTemplate onlineOrder = new OnlineOrder();
    OrderProcessTemplate inStoreOrder = new InStoreOrder();
    OrderProcessTemplate cryptoOrder = new CryptoOrder();

    // executing the template method for each order object with their unique implementations.
    onlineOrder.processOrder(19, "debit");
    inStoreOrder.processOrder(7, "cash");
    cryptoOrder.processOrder(2,"bitcoin");

    }
}
