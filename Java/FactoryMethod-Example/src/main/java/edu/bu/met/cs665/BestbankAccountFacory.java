package edu.bu.met.cs665;

import org.apache.log4j.Logger;
import edu.bu.met.cs665.bankacounts.BankAccount;
import edu.bu.met.cs665.bankacounts.CheckingAcount;
import edu.bu.met.cs665.bankacounts.SavingAccount;

public class BestbankAccountFacory  implements AccountFactory {

  private static Logger logger = Logger.getLogger(BestbankAccountFacory.class);

  /**
   * This is a factory method that creates the objects. Just let us know which account you like to have and do not care about the details how we create accounts.
   * 
   * @param type type of the bank account to create
   * @return a bank account
   */
  public BankAccount createAccount(String type) {

    BankAccount account = null;

    if (type.equals("checking")) {

      logger.debug(
          "AccountFacory: OK. checking accouint. I understand the requested bank account.");
      logger.debug("AccountFacory: Start creating a checking account.");

      account = new CheckingAcount();

      logger.info("A checking account.");

    } else if (type.equals("saving")) {

      logger.debug(
          "AccountFacory: OK. saving accouint. I understand the requested bank account.");
      logger.debug("AccountFacory: Start creating a saving account.");

      account = new SavingAccount();

      logger.info("A saving account.");

    } else {

      logger.error("AccountFactor: I do not understand " + type
          + " requested bank account type.");
    }

    return account;
  }

}
