package edu.bu.met.cs665;

public interface Mediator {
  
  public void registerDriver(Driver d);
  
  public void notifyObservers(String driverName, float offer); 
  
}
