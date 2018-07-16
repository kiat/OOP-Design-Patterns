package edu.bu.met.cs665;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({SimpleTest.class, TestPriceCalculation.class,
    TestPriceCalculationFromData.class})
public class AllTests {

}
