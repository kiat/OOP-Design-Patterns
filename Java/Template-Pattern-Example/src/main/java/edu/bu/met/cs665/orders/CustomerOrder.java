package edu.bu.met.cs665.orders;

import java.util.List;
import org.apache.log4j.Logger;

public class CustomerOrder {
  /**
   * Customer order class.
   * */

  // Logging
  private static Logger logger = Logger.getLogger(CustomerOrder.class);

  // fields
  private String customerName;
  private List<String> customerItems;
  private int cartSize;
  private String orderType;

  // Constructor
  public CustomerOrder(String customerName, List<String> customerItems, String orderType) {
    this.customerName = customerName;
    this.customerItems = customerItems;
    this.cartSize = customerItems.size();
    this.orderType = orderType;
  }

  public CustomerOrder(List<String> customerItems, String orderType) {
    this.customerItems = customerItems;
    this.cartSize = customerItems.size();
    this.orderType = orderType;
  }

  public CustomerOrder(){}

  /**
   * getter method for customer name on the order.
   * @return string representing customer name
   * */
  public String getCustomerName() {
    return customerName;
  }

  /**
   * setter method for customer name
   * @param customerName the name to set on the customer order
   * */
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  /**
   * getter for customer items
   * @return a list of strings that the customer ordered
   * */
  public List<String> getCustomerItems() {
    return customerItems;
  }

  /**
   * setter for Customer items.
   * @param customerItems a list of strings repsenting the customer items
   * */
  public void setCustomerItems(List<String> customerItems) {
    this.customerItems = customerItems;
  }

  /**
   * getter for cart size
   * @return the total amount of items within the list
   * */
  public int getCartSize() {
    return cartSize;
  }

  /**
   * setter for changing the cart size.
   * */
  public void setCartSize() {
    this.cartSize = this.customerItems.size();
  }

  /**
   * getter for the type of order it is
   * @return orderType
   * */
  public String getOrderType() {
    return orderType;
  }

  /**
   * setter for the order type
   * */
  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }
}
