package edu.bu.met.cs665.emailcollectorsystem;

/**
 * EmailDecorator abstract class.
 *
 * EmailDecorator is an Email and Email has EmailDecorators.
 */
public abstract class EmailDecorator extends Email {

	/**
	 * Method that has to be implemented by each decorator
	 */
	public abstract String getEmail();

}
