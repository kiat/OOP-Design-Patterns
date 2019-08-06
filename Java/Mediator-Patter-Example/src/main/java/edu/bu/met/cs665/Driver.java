package edu.bu.met.cs665;

class Driver {

  private String driverName;
  private float lastOffer;
  private float myOffer = 0;



  public Driver(String name) {
    this.driverName = name;
  }

  /**
   * @return the name
   */
  public String getDriverName() {
    return driverName;
  }


  /**
   * @param name the name to set
   */
  public void setDriverName(String name) {
    this.driverName = name;
  }


  void setMyOffer(Shop mediator, float offer) {

    this.myOffer = offer;
    System.out.println("Driver " + driverName + " Last Offer is: " + lastOffer + " My New Offer is: " + myOffer);
    
    // inform all drives about my Offer.
    mediator.notifyObservers(driverName, offer);
  }

  /**
   * @return the lastOffer
   */
  public float getLastOffer() {
    return lastOffer;
  }

  /**
   * @param lastOffer the lastOffer to set
   */
  public void setLastOffer(float lastOffer) {
    this.lastOffer = lastOffer;
  }

}