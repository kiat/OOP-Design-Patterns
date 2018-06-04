package edu.bu.met.cs665;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.bu.met.cs665.meansOfTransportation.EconomyCar;
import edu.bu.met.cs665.meansOfTransportation.MeansOfTransportation;

// Write some Unit tests for your program like the following. 

// For this simple example we can not write useful functionality unit tests. 

class TestAge {

	@Test
	void testEconomyCarSpeed() {
		
		MeansOfTransportation economyCar=new EconomyCar();
		// An economy Car should not run with speed higher than 100 miles per hour. 
		assertEquals(economyCar.setSpeed(105), false);
	}
	
	
	@Test
	void testEconomyCarBrake() {
		
		MeansOfTransportation economyCar=new EconomyCar();
		// An economy Car should not run with speed higher than 100 miles per hour. 
		assertEquals(economyCar.setSpeed(105), false);
	}

	
}
