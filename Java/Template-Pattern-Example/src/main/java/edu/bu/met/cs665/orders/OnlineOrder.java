package edu.bu.met.cs665.orders;

import java.util.List;
import org.apache.log4j.Logger;

public class OnlineOrder extends OrderProcessTemplate {

  private static Logger logger = Logger.getLogger(OnlineOrder.class);

  /**
   * method to handle the payment if it is online
   * @param customerItems the list of items the customer selected
   * @param typeOfPayment the type of payment the user will make to place the order
   * @return a customer order
   * */
  @Override
  public CustomerOrder handlePayment(List<String> customerItems, String typeOfPayment) {
    logger.debug("Handling payment for online order.");

    // handle only debit/credit or credit as a payment not cash
    if (typeOfPayment.compareTo("credit") == 0|| typeOfPayment.compareTo("debit") == 0){
      logger.debug("Your order has been created!");
      // create the customer order
      return new CustomerOrder(customerItems, "online");
    }

    logger.debug("Cannot accept any other payment option. Please use credit or debit.");
    return null;
  }

  /**
   * method to handle delivery for online order
   * @param toDeliver bool to decide if the customer order will be delivered or not
   * */
  @Override
  public void handleDelivery(boolean toDeliver) {
    logger.debug("Handling delivering for online order");
    if (toDeliver) {
      logger.debug("We are shipping your items to your address.");
    } else {
      logger.debug("You have opted to pick up your items in our store location.");
    }
  }

}
