package edu.bu.met.cs665.meansoftransportation;

import edu.bu.met.cs665.behaviors.ReverseEngineBrake;

public class Airplane extends BasicMeansOfTransportation {

  public Airplane() {
    this.brakeBehavior = new ReverseEngineBrake();
    this.setName("Plane");
  }


  @Override
  public boolean setSpeed(double speed) {
    if (speed < 200) {
      this.speed = speed;
      System.out.println("Speed is set to " + this.speed);
      return true;
    } else {
      this.speed = 200d;
      System.out.println("This  plane can not fly with a higher speed than 250 miles per hour. ");
      System.out.println("Speed is set to " + this.speed);
      return false;
    }
  }

}
