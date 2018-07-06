package edu.bu.met.cs665.behaviors;

import edu.bu.met.cs665.meansoftransportation.MeansOfTransportation;

// Ships and boats brake by pushing to the other direction.

public class PushToOtherDirection implements BrakeBehavior {

  /**
   * An example implementation of brake implementation.
   */
  public boolean brake(MeansOfTransportation mot, double reducedSpeed) {

    // Brake can work when the speed is under 20 MPH
    if (mot.getSpeed() < 20) {
      System.out.println("Brake for a ship is to push to other direction!");
      mot.setSpeed(reducedSpeed);
      return true;
    } else if (mot.getSpeed() > 20) {
      System.out.println(
          "Brake for a fast boat is to turn off the engines and reduce the speed to 20 MPH.");
      mot.setSpeed(20);
      return brake(mot, reducedSpeed);
    }

    return false;

  }

}
