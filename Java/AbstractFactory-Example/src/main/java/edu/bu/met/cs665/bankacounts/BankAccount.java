package edu.bu.met.cs665.bankacounts;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * This class represents a bank account.
 * 
 * @author Kia
 *
 */
public abstract class BankAccount {

  protected String accountName;
  protected String ownerName;
  protected Double balance;

  // Account will be added to the following databases
  protected List<String> databaseNames = new ArrayList<String>();

  // Account will be introduced to the following brokers
  protected List<String> brokers = new ArrayList<String>();


  // We use here a logger instead of printing to system.out
  private static Logger logger = Logger.getLogger(BankAccount.class);


  /**
   * Getter method.
   * 
   * @return
   */
  public String getAccountName() {
    return accountName;
  }

  /**
   * Sets the account name.
   * 
   * @param accountName name of the account
   */
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  /**
   * Get the account owner name.
   * 
   * @return
   */
  public String getOwnerName() {
    return ownerName;
  }

  /**
   * Sets the owner name.
   * 
   * @param ownerName name of the own of the bank account
   */
  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  /**
   * Getter method.
   * 
   * @return
   */
  public Double getBalanceInUsd() {
    return balance;
  }

  /**
   * Set the bank account balance to an amount.
   * 
   * @param amountInUsd current balance of the account for example
   */
  public void setBalancetInUsd(Double amountInUsd) {
    this.balance = amountInUsd;
  }

  /**
   * Add a string name to the list of databases.
   * 
   * @param db this is the name of the database.
   */
  public void addDatabaseName(String db) {
    this.databaseNames.add(db);
  }

  /**
   * This method adds a broker name to the list of brokers. We inform these list of brokers.
   * 
   * @param broker broker's name
   */
  public void addBroker(String broker) {
    this.brokers.add(broker);
  }

  /**
   * An example method that illustrates some methods to prepare a bank account for a new customer.
   */
  public void addAcountToDatabases() {
    for (String databse : databaseNames) {
      logger.info("This account is added to " + databse);
    }

  }

  /**
   * An example method that illustrates some methods to prepare a bank account for a new customer.
   */
  public void informBrokers() {
    for (String broker : brokers) {
      logger.info("This account is introduced to " + broker);
    }
  }

  /**
   * An example method that illustrates some methods to prepare a bank account for a new customer.
   */
  public void makeAvaliableForCustomer() {
    logger.info("This acount is made available to " + ownerName);
  }
}
