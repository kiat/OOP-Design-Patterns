package edu.bu.met.cs665.meansoftransportation;

import edu.bu.met.cs665.behaviors.PushToOtherDirection;


public class Ship extends BasicMeansOfTransportation {

  // This class represents a ship.

  /**
   * This is a ship but has some common functionality like a car to move from A to B.
   */
  public Ship() {
    super();
    this.brakeBehavior = new PushToOtherDirection();
    this.setName("Ship");
  }

  /**
   * A setter method with checks.
   */
  @Override
  public boolean setSpeed(double speed) {
    if (speed < 20) {
      this.speed = speed;
      System.out.println("Speed is set to " + this.speed);
      return true;
    } else {
      this.speed = 20d;
      System.out.println("This ship can not move with higher speed than 20 miles per hour. ");
      System.out.println("Speed is set to " + this.speed);
      return false;
    }
  }

}
