package edu.bu.met.cs665.bankacounts;

public class AccountBundle {


  private BankAccount savingAccount;
  private BankAccount checkingAccount;

  /**
   * Constructor for making a bundle.
   * 
   * @param savingAccount the saving account for the bundle
   * @param checkingAccount the checking account for the bundle
   */
  public AccountBundle(BankAccount checkingAccount, BankAccount savingAccount) {
    super();
    this.savingAccount = savingAccount;
    this.checkingAccount = checkingAccount;
  }

  /**
   * Getter for Saving Account.
   * 
   * @return
   */
  public BankAccount getSavingAccount() {
    return savingAccount;
  }

  /**
   * Setter for saving account of the bundle accounts.
   * 
   * @param savingAccount the saving account
   */
  public void setSavingAccount(BankAccount savingAccount) {
    this.savingAccount = savingAccount;
  }

  /**
   * Getter for Checking Account.
   * 
   * @return
   */
  public BankAccount getCheckingAccount() {
    return checkingAccount;
  }

  /**
   * Setter for checking account of the bundle accounts.
   * 
   * @param checkingAccount the checking account
   */
  public void setCheckingAccount(BankAccount checkingAccount) {
    this.checkingAccount = checkingAccount;
  }

}
