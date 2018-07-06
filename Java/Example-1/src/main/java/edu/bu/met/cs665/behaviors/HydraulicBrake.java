package edu.bu.met.cs665.behaviors;

import edu.bu.met.cs665.meansoftransportation.MeansOfTransportation;

// This is a hydraulic brake.

public class HydraulicBrake implements BrakeBehavior {

  /**
   * An example implementation of brake implementation.
   */
  @Override
  public boolean brake(MeansOfTransportation mot, double reducedSpeed) {

    // Brake can work when the speed is under 400 MPH
    if (mot.getSpeed() < 400) {
      System.out.println("Hydraulic Brake applied!");
      mot.setSpeed(reducedSpeed);
      return true;
    }

    return false;

  }

}
