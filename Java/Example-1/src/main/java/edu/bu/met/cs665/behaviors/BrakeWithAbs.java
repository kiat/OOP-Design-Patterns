package edu.bu.met.cs665.behaviors;

import edu.bu.met.cs665.meansoftransportation.MeansOfTransportation;

// This class represents brake with Anti Block System (ABS)
public class BrakeWithAbs implements BrakeBehavior {

  /**
   * An example implementation of brake implementation.
   */
  @Override
  public boolean brake(MeansOfTransportation mot, double reducedSpeed) {

    // Brake can work when the speed is under 200 MPH
    if (mot.getSpeed() < 200) {
      System.out.println("Brake with ABS applied!");
      mot.setSpeed(reducedSpeed);
      return true;
    }

    return false;
  }

}
