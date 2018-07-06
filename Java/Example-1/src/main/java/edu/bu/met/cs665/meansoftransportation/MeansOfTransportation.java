package edu.bu.met.cs665.meansoftransportation;

import edu.bu.met.cs665.behaviors.BrakeBehavior;

public interface MeansOfTransportation {
  // this interface represents all means of transportation.

  // methods for apply and set brake behavior of different transportations.
  public void applyBrake(double speed);

  public void applyFullBrake();

  public void setBrakeBehavior(BrakeBehavior brakeType);

  public void run(double speed);

  // getter and setter methods for name.
  public String getName();

  public void setName(String name);

  // getter and setter for speed
  public double getSpeed();

  public boolean setSpeed(double speed);

}
