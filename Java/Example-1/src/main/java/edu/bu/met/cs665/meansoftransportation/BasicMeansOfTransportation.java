package edu.bu.met.cs665.meansoftransportation;

import edu.bu.met.cs665.behaviors.BrakeBehavior;

public class BasicMeansOfTransportation implements MeansOfTransportation {

  protected BrakeBehavior brakeBehavior;
  protected BrakeBehavior additionalBrakeBehavior;

  // initial name a simple car.
  protected String name = "A Simple Car";

  // initial speed is zero.
  protected double speed = 0d;

  /**
   * Reduces the speed to the given speed.
   */
  public void applyBrake(double speed) {

    brakeBehavior.brake(this, speed);


    // If this has additional brake behavior and runs with higher speed then use this additional
    // brake.
    if (this.speed > 300 && additionalBrakeBehavior != null) {
      additionalBrakeBehavior.brake(this, speed);
    }

    System.out.println("[Brake Applied] Speed is " + this.speed);
  }

  /**
   * A full brake is a brake to speed zero.
   */

  public void applyFullBrake() {
    System.out.println("[Full Brake Applied]");
    applyBrake(0d);

  }

  /**
   * setter method to set the brake behavior.
   */
  public void setBrakeBehavior(BrakeBehavior brakeType) {
    this.brakeBehavior = brakeType;
  }

  @Override
  public void run(double speed) {
    setSpeed(speed);
    System.out.println("Runs with the spead of " + this.speed);
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public double getSpeed() {
    return this.speed;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean setSpeed(double speed) {
    if (speed < 200) {
      this.speed = speed;
      System.out.println("Speed is set to " + this.speed);
      return true;
    } else {
      this.speed = 200d;
      System.out.println("This plane can not fly with a speed higher than 200 miles per hour. ");
      System.out.println("Speed is set to " + this.speed);

      return false;
    }
  }

}
