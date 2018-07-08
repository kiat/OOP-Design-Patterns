package edu.bu.met.cs665;

import edu.bu.met.cs665.bankacounts.BankAccount;
import edu.bu.met.cs665.bankacounts.CheckingAcount;
import edu.bu.met.cs665.bankacounts.SavingAccount;

public class AccountFacory {


  /**
   * This is a factory method that creates the objects. Just let us know which account you like to
   * have and do not care about the details how we create accounts.
   * 
   * @param type type of the bank account to create
   * @return a bank account
   */
  public static BankAccount createAccount(String type) {

    BankAccount account = null;

    if (type.equals("checking")) {
      account = new CheckingAcount();
    } else if (type.equals("saving")) {
      account = new SavingAccount();
    }

    return account;
  }

}
