package edu.bu.met.cs665.meansoftransportation;

import edu.bu.met.cs665.behaviors.Brake;

public class EconomyCar extends BasicMeansOfTransportation {

  // Construct an economy car and set the brake behavior for this type of auto
  public EconomyCar() {
    this.brakeBehavior = new Brake();
    this.setName("Economy Car");
  }


  @Override
  public boolean setSpeed(double speed) {

    if (speed < 100) {
      this.speed = speed;
      System.out.println("Speed is set to " + this.speed);

      return true;
    } else {
      this.speed = 100d;
      System.out
          .println("This Economy Car can not run with a higher speed than 100 miles per hour. ");
      System.out.println("Speed is set to " + this.speed);

      return false;
    }
  }

}
