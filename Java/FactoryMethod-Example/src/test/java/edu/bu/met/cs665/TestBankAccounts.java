package edu.bu.met.cs665;


import org.apache.log4j.PropertyConfigurator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.bankacounts.BankAccount;

// Write some Unit tests for your program like the following.

public class TestBankAccounts {

  public TestBankAccounts() {}

  @Test
  public void checkingAcountAccountTest() {

    // NOTE: Setting the log4j property should not be here.
    // It should be passed better by the JVM arguments.
    // Like -Dlog4j.configuration={path to the log4j.properties config file}
  //   PropertyConfigurator.configure("log4j.properties");

    // Actual test starts here.
    AccountFactory accountCreator=new BestbankAccountFacory();

    BankAccount account = accountCreator.createAccount("checking");

    // names should be correct.
    // assume if the names are correct the correct objects are created.
  //   assertEquals(account.getAccountName(),  "CheckingAcount");
  }
  

  
  @Test
  public void savingAcountAccountTest() {

    // NOTE: Setting the log4j property should not be here.
    // It should be passed better by the JVM arguments.
    // Like -Dlog4j.configuration={path to the log4j.properties config file}
   // PropertyConfigurator.configure("log4j.properties");

    // Actual test starts here.
    AccountFactory accountCreator=new BestbankAccountFacory();
    BankAccount account = accountCreator.createAccount("saving");

    // names should be correct.
    // assume if the names are correct the correct objects are created.
   //  assertEquals(account.getAccountName() , "SavingAccount");
  }

  
  

}
