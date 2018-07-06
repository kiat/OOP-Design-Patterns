package edu.bu.met.cs665.meansoftransportation;

import edu.bu.met.cs665.behaviors.BrakeWithABS;

public class FullSizeSUV extends BasicMeansOfTransportation {

  public FullSizeSUV() {
    this.brakeBehavior = new BrakeWithABS();
    this.setName("Full Size SUV");
  }


  @Override
  public boolean setSpeed(double speed) {
    if (speed < 250) {
      this.speed = speed;
      System.out.println("Speed is set to " + this.speed);
      return true;
    } else {
      this.speed = 250d;
      System.out
          .println("This Full Size SUV can not run with higher speed than 250 miles per hour. ");
      System.out.println("Speed is set to " + this.speed);
      return false;
    }
  }
}
