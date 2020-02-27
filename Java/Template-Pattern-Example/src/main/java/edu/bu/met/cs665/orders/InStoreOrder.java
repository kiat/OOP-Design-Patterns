package edu.bu.met.cs665.orders;

import java.util.List;
import org.apache.log4j.Logger;

public class InStoreOrder extends OrderProcessTemplate {
  /** InStore order class */
  // Logging
  private static Logger logger = Logger.getLogger(InStoreOrder.class);

  /**
   * method to handle the payment if it is online
   *
   * @param customerItems the list of items the customer selected
   * @param typeOfPayment the type of payment the user will make to place the order
   * @return a customer order
   */
  @Override
  public CustomerOrder handlePayment(List<String> customerItems, String typeOfPayment) {
    logger.debug("Handling payment for in store.");
    // inside the store can accept debit, credit, or cash
    if (typeOfPayment.compareTo("cash") == 0
        || typeOfPayment.compareTo("debit") == 0
        || typeOfPayment.compareTo("credit") == 0) {
      // create the customer order
      return new CustomerOrder(customerItems, "in store");
    }
    logger.debug("The store does not accept any other payment option");
    return null;
  }

  /**
   * method to handle delivery for online order
   * @param toDeliver bool to decide if the customer order will be delivered or not
   * */
  @Override
  public void handleDelivery(boolean toDeliver) {
    logger.debug("Handling delivery for customer");
    if (toDeliver) {
      logger.debug("Please fill out this form with your address");
    } else {
      logger.debug("Order is physically taken out the store.");
    }
  }
}
