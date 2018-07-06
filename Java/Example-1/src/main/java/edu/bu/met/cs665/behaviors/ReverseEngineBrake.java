package edu.bu.met.cs665.behaviors;

import edu.bu.met.cs665.meansoftransportation.MeansOfTransportation;

// This is a jet engine brake.

public class ReverseEngineBrake implements BrakeBehavior {

  /**
   * An example implementation of brake implementation.
   */
  @Override
  public boolean brake(MeansOfTransportation mot, double reducedSpeed) {

    // Brake can work when the speed is under 200 MPH
    if (mot.getSpeed() < 200) {
      System.out.println("Jet engines are reveresed to apply brake functionality!");
      mot.setSpeed(reducedSpeed);
      return true;
    }

    return false;
  }

}
