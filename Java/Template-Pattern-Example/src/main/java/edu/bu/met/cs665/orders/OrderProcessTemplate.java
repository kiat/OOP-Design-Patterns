package edu.bu.met.cs665.orders;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class OrderProcessTemplate {
  /** Order Process template base class */

  // logging
  private static Logger logger = Logger.getLogger(OrderProcessTemplate.class);

  /**
   * method to add items to a list.
   *
   * @param amountOfItems the total amount of items that will be added to the list
   */
  public List<String> selectItems(int amountOfItems) {
    logger.debug("Selecting items online.");

    // list to store the customer items selected
    List<String> customerItems = new ArrayList<>();
    for (int i = 0; i < amountOfItems; i++) {
      customerItems.add(new StringBuilder("Item ").append(i).toString());
    }
    return customerItems;
  }

  /**
   * abstract method to handle the payment from the customer and create a customer order. All
   * subclassing will have their own implementation.
   *
   * @param customerItems the items the customer ordered
   * @param typeOfPayment the type of payment they use to complete the transaction
   */
  public abstract CustomerOrder handlePayment(List<String> customerItems, String typeOfPayment);

  /** abstract method to handle the delivery depending on the type of order it is
   * @param toDeliver boolean to decide to deliver
   * */
  public abstract void handleDelivery(boolean toDeliver);

  /**
   * The template method that will execute the methods in a given sequence.
   *
   * @param amountOfItems the amount of items in their order
   * @param typeOfPayment the type of payment
   */
  public final void processOrder(int amountOfItems, String typeOfPayment) {
    List<String> customerItems = selectItems(amountOfItems);
    CustomerOrder customerOrder = handlePayment(customerItems, typeOfPayment);
    handleDelivery(true);
    logger.debug("Your order of " + customerOrder.getCartSize() + " has been processed");
  }
}
