package edu.bu.met.cs665;

import edu.bu.met.cs665.bankacounts.AccountBundle;

import edu.bu.met.cs665.bankacounts.BankAccount;
import edu.bu.met.cs665.bankacounts.CheckingAcount;
import edu.bu.met.cs665.bankacounts.CorporateCheckingAcount;
import edu.bu.met.cs665.bankacounts.CorporateSavingAccount;
import edu.bu.met.cs665.bankacounts.SavingAccount;

import org.apache.log4j.Logger;

public class AccountFacory {

  // We use here a logger instead of printing to system.out
  private static Logger logger = Logger.getLogger(AccountFacory.class);

  /**
   * This is a factory method that creates bundles of objects. Just let us know which account bundle
   * type you like to have and do not care about the details how we create accounts.
   * <p>
   * Note: In abstract factory pattern clients may not know that they are creating bundles.
   * </p>
   * @param type type of the bank account bundles to create
   * @return a bank account
   */
  public static AccountBundle createAccountBundle(String type) {

    BankAccount checking = null;
    BankAccount saving = null;

    AccountBundle bundle = null;

    // At the runtime we decide which accounts should be created
    // We hide the complexity of account creation here.
    if (type.equals("personal")) {

      logger.debug("Account Factory: Ok, I undersand the type of account. Personal Account.");
      logger.debug("Account Factory: I started to create the accounts.");

      checking = new CheckingAcount();
      saving = new SavingAccount();

      logger.info("Bank account bundles created for personal use. ");

    } else if (type.equals("corporate")) {

      logger.debug("Account Factory: Ok, I undersand the type of account. Corporate Accounts.");
      logger.debug("Account Factory: I started to create the accounts.");

      checking = new CorporateCheckingAcount();
      saving = new CorporateSavingAccount();

      logger.info("Bank account bundles created for personal use. ");

    } else {
      logger.error("I do not know about this type of accounts.");
    }

    // after we created the accounts we put them in the bundle
    bundle = new AccountBundle(checking, saving);
    return bundle;
  }

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
