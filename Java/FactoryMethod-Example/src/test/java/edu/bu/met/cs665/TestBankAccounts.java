package edu.bu.met.cs665;

import static org.junit.Assert.assertTrue;
import org.apache.log4j.PropertyConfigurator;

import org.junit.Test;
import edu.bu.met.cs665.bankacounts.BankAccount;

// Write some Unit tests for your program like the following.

public class TestBankAccounts {

  public TestBankAccounts() {}

  @Test
  public void checkingAcountAccountTest() {

    // NOTE: Setting the log4j property should not be here.
    // It should be passed better by the JVM arguments.
    // Like -Dlog4j.configuration={path to the log4j.properties config file}
    PropertyConfigurator.configure("log4j.properties");

    // Actual test starts here.
    BankAccount account = AccountFacory.createAccount("checking");

    // names should be correct.
    // assume if the names are correct the correct objects are created.
    assertTrue(account.getAccountName() == "CheckingAcount");
  }
  

  
  @Test
  public void savingAcountAccountTest() {

    // NOTE: Setting the log4j property should not be here.
    // It should be passed better by the JVM arguments.
    // Like -Dlog4j.configuration={path to the log4j.properties config file}
    PropertyConfigurator.configure("log4j.properties");

    // Actual test starts here.
    BankAccount account = AccountFacory.createAccount("saving");

    // names should be correct.
    // assume if the names are correct the correct objects are created.
    assertTrue(account.getAccountName() == "SavingAccount");
  }

  
  

}
