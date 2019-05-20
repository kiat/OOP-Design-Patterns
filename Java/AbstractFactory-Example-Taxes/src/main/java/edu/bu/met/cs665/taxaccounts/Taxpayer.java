package edu.bu.met.cs665.taxaccounts;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * Handles Taxpayer Details.
 * 
 * @author Sudakar S
 *
 */
public abstract class Taxpayer {

  protected String taxpayerType;
  protected String taxpayerName;
  protected Double taxDue;



  // Will handle Different Types of Taxes
  protected List<String> taxTypes = new ArrayList<String>();

  // Will handle Different tax returns
  protected List<String> taxReturns = new ArrayList<String>();


  // We use here a logger instead of printing to system.out
  private static Logger logger = Logger.getLogger(Taxpayer.class);


  /**
   * Getter method.
   * 
   * @return
   */
  public String getTaxpayerType() {
    return taxpayerType;
  }

  /**
   * Sets SSN account Number.
   * 
   * @param accountName account Number
   */
  public void setSsn(String accountName) {
    this.taxpayerType = accountName;
  }

  /**
   * Get the account owner name.
   * 
   * @return
   */
  public String getTaxpayerName() {
    return taxpayerName;
  }

  /**
   * Sets the taxpayer name.
   * 
   * @param taxpayerName taxpayer Name
   */
  public void setTaxpayerName(String taxpayerName) {
    this.taxpayerName = taxpayerName;
  }

  /**
   * Placeholder: Core logic to decide whether trustee account can be created will be defined here.
   * 
   * @return
   */
  public boolean isTrustee() {
    // Placeholder: Core logic to decide whether trustee account can be created will be defined here
    return true;
  }

  /**
   * Placeholder: Core logic to decide whether CPA account can be created will be defined here.
   * 
   * @return
   */
  public boolean isCpa() {
    // Placeholder: Core logic to decide whether CPA account can be created will be defined here
    return true;
  }

  /**
   * Placeholder: Core logic to decide whether Employee account can be created will be defined here.
   * 
   * @return
   */
  public boolean isEmployee() {
    //Placeholder: Core logic to decide whether Employee account can be created will be defined here
    return true;
  }

  /**
   * Placeholder: Core logic to decide whether Admin account can be created will be defined here.
   * 
   * @return
   */
  public boolean isAdmin() {
    // Placeholder: Core logic to decide whether Admin account can be created will be defined here
    return true;
  }

  /**
   * Getter method.
   * 
   * @return
   */
  public Double getDuesInUsd() {
    return taxDue;
  }

  /**
   * Set the bank account balance to an amount.
   * 
   * @param amountInUsd current balance of the account for example
   */
  public void setBalancetInUsd(Double amountInUsd) {
    this.taxDue = amountInUsd;
  }

  /**
   * Add a string name to the list of databases.
   * 
   * @param db this is the name of the database.
   */
  public void addToInternalEmployeeList(String db) {
    this.taxTypes.add(db);
  }

  /**
   * This method adds a broker name to the list of brokers. We inform these list of brokers.
   * 
   * @param broker broker's name
   */
  public void addToInternalAuditLogs(String broker) {
    this.taxReturns.add(broker);
  }

  /**
   * An example method that illustrates some methods to prepare a bank account for a new customer.
   */
  public void addAcountToDatabases() {
    for (String databse : taxTypes) {
      logger.info("Add this account is added to " + databse);
    }

  }

  /**
   * An example method that illustrates some methods to prepare a bank account for a new customer.
   */
  public void informBrokers() {
    for (String broker : taxReturns) {
      logger.info("This account is introduced to " + broker);
    }
  }

  /**
   * An example method that illustrates some methods to prepare a bank account for a new customer.
   */
  public void makeAvaliableForCustomer() {
    logger.info("This acount is made available to " + taxpayerName);
  }
}
