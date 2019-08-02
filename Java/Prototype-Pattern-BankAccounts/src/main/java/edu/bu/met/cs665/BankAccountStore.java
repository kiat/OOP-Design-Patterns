package edu.bu.met.cs665;

import java.util.HashMap;
import java.util.Map;

public class BankAccountStore {

// This is a map of our prototype objects that we can access at run time. 
	private static Map<String, BankAccount> accountMap = new HashMap<String, BankAccount>();

	
	// Create Object and fill up the map memory with object prototypes.  
	static {
		accountMap.put("Personal", new PersonalAccount());
		accountMap.put("Coorporate", new CoorporateAccount());
	}

	public static BankAccount getAccount(String accountName) {

		BankAccount account = null;

		account = (BankAccount) accountMap.get(accountName).clone();

		
		return account;
	}

}
