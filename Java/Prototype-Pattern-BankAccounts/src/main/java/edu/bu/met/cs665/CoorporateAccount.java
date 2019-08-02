package edu.bu.met.cs665;

public class CoorporateAccount extends BankAccount {

	public CoorporateAccount() {
		this.accountName = "Coorporate";
	}

	@Override
	void addName() {
		System.out.println("Coorporate Account Added");
	}

}
