package edu.bu.met.cs665;
import java.util.HashMap;
import java.util.Map;

public class Shop implements Mediator{

  Map<String, Driver> driverMap = new HashMap<String, Driver>();


  public void registerDriver(Driver d) {

    // if it is not already registered.
    if (!driverMap.containsKey(d.getDriverName()))
      driverMap.put(d.getDriverName(), d);

  }


  /**
   * Notify all drivers about the new offer except who sets the offer.
   * 
   * @param driverName
   */
  public void notifyObservers(String driverName, float offer) {


    for (Map.Entry<String, Driver> entry : driverMap.entrySet()) {


      // if not this driver.
      if (entry.getKey() == driverName) {
        System.out.println( "*******  NEW OFFER from Driver : "+ entry.getValue().getDriverName());

      }else {
        entry.getValue().setLastOffer(offer);
      } 
        

    }
  }


}
