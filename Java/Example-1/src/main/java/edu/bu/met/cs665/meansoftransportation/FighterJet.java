package edu.bu.met.cs665.meansoftransportation;

import edu.bu.met.cs665.behaviors.BrakeParachute;

public class FighterJet extends Airplane {

  /**
   * Instantiate a default fighter jet.
   */
  public FighterJet() {
    super();

    this.setName("FighterJet");

    // set an additional brake behavior for this fighter jet because it can fly with high speed.
    this.additionalBrakeBehavior = new BrakeParachute();
  }

  /**
   * A setter method with checks. 
   */
  @Override
  public boolean setSpeed(double speed) {
    if (speed < 600) {
      this.speed = speed;
      System.out.println("Speed is set to " + this.speed);
      return true;
    } else {
      this.speed = 600d;
      System.out
          .println("This Fighter Jet can not fly with a higher speed than 250 miles per hour. ");
      System.out.println("Speed is set to " + this.speed);
      return false;
    }
  }

}
