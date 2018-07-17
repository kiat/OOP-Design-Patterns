package edu.bu.met.cs665.taxAccounts;


import java.util.ArrayList;
import java.util.List;

public class taxpayerBundle {

	private Taxpayer taxpayerDetails;
	private List<String> taxReturns = new ArrayList<String>();

	

	/**
	 * Constructor for making a bundle.
	 * 
	 * @param taxpayer instance
	 *             
	 * @param taxReturns for that taxpayer
	 *            
	 */
	public taxpayerBundle(Taxpayer taxpayer, List<String> taxReturns) {
		super();
		this.taxpayerDetails = taxpayer;
		this.taxReturns = taxReturns;
	}

	/**
	 * Getter for Taxpayer Details
	 * 
	 * @return
	 */
	public Taxpayer getTaxpayerDetails() {
		return taxpayerDetails;
	}

	/**
	 * Setter for saving account of the bundle accounts.
	 * 
	 * @param taxpayer
	 *            taxpayer account
	 */
	public void setTaxpayerDetails(Taxpayer taxpayer) {
		this.taxpayerDetails = taxpayer;
	}

	/**
	 * Getter for taxpayer Type.
	 * 
	 * @return
	 */
	public List<String> getTaxReturns() {
		return taxReturns;
	}

	/**
	 * Setter for taxReturns .
	 * 
	 * @param taxReturns
	 *            taxReturns for currentUser
	 */
	public void setTaxReturns(List<String> taxReturns) {
		this.taxReturns= taxReturns;
	}

}
