package edu.bu.met.cs665;

import edu.bu.met.cs665.bankacounts.BankAccount;

public interface AccountFactory {
	BankAccount createAccount(String type);
}
