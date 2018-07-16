package edu.bu.met.cs665.example1;

import java.util.List;

public class Order {

  private String orderID;
  private List<Product> products;

  private double taxRate;


  /**
   * This method calculates the total price with tax.
   * 
   * @return the totalPrice
   */
  public double calTotalPriceWithTax() {
    double totalPriceWithTax = 0d;

    // get total price without tax first.
    totalPriceWithTax = this.calTotalPrice();


    // now add the tax to it.
    totalPriceWithTax += totalPriceWithTax * taxRate;

    return totalPriceWithTax;
  }


  /**
   * This method calculates the total price without tax.
   * 
   * @return the totalPrice
   */
  public double calTotalPrice() {
    double totalPriceWithTax = 0d;

    // sum all of the retail prices of products in this order.
    for (Product product : this.products) {
      totalPriceWithTax += product.getRetailPrice();
    }

    return totalPriceWithTax;
  }

  /**
   * 
   * @return total size of the order
   */
  public long calTotalSize() {
    long totalSize = 0;

    // sum all of the sizes.
    for (Product product : this.products) {
      totalSize += product.getSize();
    }

    return totalSize;
  }

  public double calculateBenefit() {
    double benefit = 0;
    double sum=0d; 
    
    for (Product product : this.products) {
      sum += product.getPrice();
    }
    
    benefit=this.calTotalPrice()-sum;
    
    return benefit;

  }


  /**
   * @return the orderID
   */
  public String getOrderID() {
    return orderID;
  }

  /**
   * @param orderID the orderID to set
   */
  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }

  /**
   * @return the products
   */
  public List<Product> getProducts() {
    return products;
  }

  /**
   * @param products the products to set
   */
  public void setProducts(List<Product> products) {
    this.products = products;
  }



  /**
   * @return the taxRate
   */
  public double getTaxRate() {
    return taxRate;
  }

  /**
   * @param taxRate the taxRate to set
   */
  public void setTaxRate(double taxRate) {
    this.taxRate = taxRate;
  }


}
