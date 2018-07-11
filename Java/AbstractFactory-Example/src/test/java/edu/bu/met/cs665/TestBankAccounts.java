package edu.bu.met.cs665;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

import edu.bu.met.cs665.bankacounts.AccountBundle;

// Write some Unit tests for your program like the following.

public class TestBankAccounts {

	public TestBankAccounts() {

	}

	/**
	 * A test for personal bank account bundle.
	 */
	@Test
	public void personalBankAccountBundleTest() {

		// NOTE: Setting the log4j property should not be here.
		// It should be passed better by the JVM arguments.
		// Like -Dlog4j.configuration={path to the log4j.properties config file}
		PropertyConfigurator.configure("log4j.properties");

		// Actual test starts here.
		AccountBundle bundle = AccountFacory.createAccountBundle("personal");

		// names should be correct.
		// assume if the names are correct the correct objects are created.
		assertTrue(bundle.getCheckingAccount().getAccountName() == "PersonalCheckingAccount");
		assertTrue(bundle.getSavingAccount().getAccountName() == "PersonalSavingAccount");

	}

	/**
	 * A test for corporate bank account bundle.
	 */
	@Test
	public void corporateBankAccountBundleTest() {

		// NOTE: Setting the log4j property should not be here.
		// It should be passed better by the JVM arguments.
		// Like -Dlog4j.configuration={path to the log4j.properties config file}
		PropertyConfigurator.configure("log4j.properties");

		// Actual test starts here.
		AccountBundle bundle = AccountFacory.createAccountBundle("corporate");

		// names should be correct.
		// assume if the names are correct the correct objects are created.
		assertTrue(bundle.getCheckingAccount().getAccountName() == "CorporateChecingAccount");
		assertTrue(bundle.getSavingAccount().getAccountName() == "CorporateSavingAccount");

	}

}