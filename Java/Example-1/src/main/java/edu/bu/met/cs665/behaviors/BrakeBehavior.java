package edu.bu.met.cs665.behaviors;

import edu.bu.met.cs665.meansoftransportation.MeansOfTransportation;

/**
 * This interface represents the brake behavior.
 */

public interface BrakeBehavior {

  // A simple brake method for all means of transportation.
  public boolean brake(MeansOfTransportation mot, double reducedSpeed);

}
