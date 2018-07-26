package edu.bu.met.cs665;

public class Customer {


  private long id;
  private String name;
  private String streetName;
  private int housNumber;
  private int zipCode;



  /**
   * @param id
   * @param name
   * @param streetName
   * @param housNumber
   * @param zipCode
   */
  public Customer(long id, String name, String streetName, int housNumber,
      int zipCode) {
    this.id = id;
    this.name = name;
    this.streetName = streetName;
    this.housNumber = housNumber;
    this.zipCode = zipCode;
  }



  /**
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(long id) {
    this.id = id;
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
   * @return the streetName
   */
  public String getStreetName() {
    return streetName;
  }

  /**
   * @param streetName the streetName to set
   */
  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  /**
   * @return the housNumber
   */
  public int getHousNumber() {
    return housNumber;
  }

  /**
   * @param housNumber the housNumber to set
   */
  public void setHousNumber(int housNumber) {
    this.housNumber = housNumber;
  }

  /**
   * @return the zipCode
   */
  public int getZipCode() {
    return zipCode;
  }

  /**
   * @param zipCode the zipCode to set
   */
  public void setZipCode(int zipCode) {
    this.zipCode = zipCode;
  }


  /**
   * A simple toString method. 
   */
  public String toString() {

    return id + "," + name + "," + streetName + "," + housNumber + ","
        + zipCode;

  }

}
