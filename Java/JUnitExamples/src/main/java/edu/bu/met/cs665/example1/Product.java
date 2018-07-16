package edu.bu.met.cs665.example1;

public class Product {

  private String id; 
  private String name;
  private double price;
  private double retailPrice;
  private int size;
  private String container;
  private String comment;


  public Product() {}

  /**
   * @param name
   * @param price
   * @param retailPrice
   * @param size
   */
  public Product(String name, double price, double retailPrice, int size) {
    super();
    this.name = name;
    this.price = price;
    this.retailPrice = retailPrice;
    this.size = size;
  }


  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the price
   */
  public double getPrice() {
    return price;
  }

  /**
   * @param price the price to set
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * @return the retailPrice
   */
  public double getRetailPrice() {
    return retailPrice;
  }

  /**
   * @param retailPrice the retailPrice to set
   */
  public void setRetailPrice(double retailPrice) {
    this.retailPrice = retailPrice;
  }

  /**
   * @return the size
   */
  public int getSize() {
    return size;
  }

  /**
   * @param size the size to set
   */
  public void setSize(int size) {
    this.size = size;
  }

  /**
   * @return the container
   */
  public String getContainer() {
    return container;
  }

  /**
   * @param container the container to set
   */
  public void setContainer(String container) {
    this.container = container;
  }

  /**
   * @return the comment
   */
  public String getComment() {
    return comment;
  }

  /**
   * @param comment the comment to set
   */
  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }



}
