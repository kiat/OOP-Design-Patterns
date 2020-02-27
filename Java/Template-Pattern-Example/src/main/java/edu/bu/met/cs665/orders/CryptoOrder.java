package edu.bu.met.cs665.orders;

import java.util.List;
import org.apache.log4j.Logger;

public class CryptoOrder extends OrderProcessTemplate {
  // Logging
  private static Logger logger = Logger.getLogger(CryptoOrder.class);

  /**
   * method to handle the payment if it is online
   *
   * @param customerItems the list of items the customer selected
   * @param typeOfPayment the type of payment the user will make to place the order
   * @return a customer order
   */
  @Override
  public CustomerOrder handlePayment(List<String> customerItems, String typeOfPayment) {
    logger.debug("Handling payment for ordering by digital currency.");

    if (typeOfPayment.compareTo("bitcoin") == 0 || typeOfPayment.compareTo("litecoin") == 0) {
      // create a customer order with bitcoin as the payment
      return new CustomerOrder(customerItems, "cryptocurrency");
    }

    logger.debug("CryptoCurrency is the only payment we accpet");
    return null;
  }

  /**
   * method to handle delivery for online order
   * @param toDeliver bool to decide if the customer order will be delivered or not
   * */
  @Override
  public void handleDelivery(boolean toDeliver) {
    if (!toDeliver) {
      logger.debug("a digital item was sent to you, download your items.");
    } else {
      logger.debug("It will take some time to deliver the physical items to your address.");
    }
  }
}
