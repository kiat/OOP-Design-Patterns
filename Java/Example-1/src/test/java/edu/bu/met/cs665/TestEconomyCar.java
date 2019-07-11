package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import edu.bu.met.cs665.meansoftransportation.EconomyCar;
import edu.bu.met.cs665.meansoftransportation.MeansOfTransportation;

import org.junit.Test;

// Write some Unit tests for your program like the following.

public class TestEconomyCar {

  @Test
  public void testEconomyCarSpeed() {

    MeansOfTransportation economyCar = new EconomyCar();
    // An economy Car should not run with speed higher than 100 miles per hour.
    assertEquals(economyCar.setSpeed(105), false);
  }



  @Test
  public void testEconomyCarBrake() {

    MeansOfTransportation economyCar = new EconomyCar();
    // run the car with high speed
    economyCar.setSpeed(105);

    // Then full brake the car
    economyCar.applyFullBrake();


    // An economy Car should not run with speed higher than 100 miles per hour.
    assertTrue(economyCar.getSpeed() == 0d);
  }


}


