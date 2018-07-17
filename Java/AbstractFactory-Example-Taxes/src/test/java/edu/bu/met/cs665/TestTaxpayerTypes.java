package edu.bu.met.cs665;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.PropertyConfigurator;
import org.apache.tools.ant.types.resources.comparators.Size;
import org.junit.Before;
import org.junit.Test;

import edu.bu.met.cs665.taxAccounts.taxpayerBundle;

// Write some Unit tests for your program like the following.

public class TestTaxpayerTypes {

	public TestTaxpayerTypes() {

	}
	
    // e.g. Creating an similar object and share for all @Test
    @Before
    public void runBeforeTestMethod() {
		// NOTE: Setting the log4j property should not be here.
		// It should be passed better by the JVM arguments.
		// Like -Dlog4j.configuration={path to the log4j.properties config file}
		PropertyConfigurator.configure("log4j.properties");
    }

	/**
	 * A test for personal bank account bundle.
	 */
	@Test
	public void CPABundleTest() {

		// Actual test starts here.
		taxpayerBundle cpaBundle = taxpayerFactory.createTaxpayerInstance("CPA", "Joe Smith");

		// Taxpayer Type Should be correct
		// assume if the names are correct the correct objects are created.
		assertTrue(cpaBundle.getTaxpayerDetails().getTaxpayerType() == "CPA");
		assertTrue(cpaBundle.getTaxReturns().size()== 0);
	}

	/**
	 * A test for Trustee Taxpayer bundle.
	 */
	@Test
	public void TrusteeTaxpayerBundleTest() {
		// Actual test starts here.
		taxpayerBundle trusteeBundle = taxpayerFactory.createTaxpayerInstance("Trustee","Jeff Jones");

		// names should be correct.
		// assume if the names are correct the correct objects are created.
		assertTrue(trusteeBundle.getTaxpayerDetails().getTaxpayerType() == "Trustee");
		assertTrue(trusteeBundle.getTaxReturns().size()== 0);

	}

}