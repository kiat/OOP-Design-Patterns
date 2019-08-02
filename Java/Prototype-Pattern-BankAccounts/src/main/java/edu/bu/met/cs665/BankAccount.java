package edu.bu.met.cs665;

public abstract class BankAccount implements Cloneable {

	protected String accountName;

	abstract void addName();

	/*
	 * A method to clone such objects. (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

}
