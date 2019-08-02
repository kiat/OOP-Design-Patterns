package edu.bu.met.cs665;

public class PersonalAccount extends BankAccount {

	public PersonalAccount() {
		this.accountName = "Personal";
	}

	@Override
	void addName() {
		System.out.println("Personal Account Added");
	}

}
