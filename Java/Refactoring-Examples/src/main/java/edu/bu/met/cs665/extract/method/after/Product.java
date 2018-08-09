package edu.bu.met.cs665.extract.method.after;

public class Product {

	private String name;
	private String productID;
	private Double setUnitPrice;

	// This print method includes two parts, first printing the banner 
	// and then some details.
	void print() {
		// First print the banner. 
		printBanner();
		// Then print the details. 
		printDetails();
	}

	// this method prints the details. 
	// it can be a private or public method based on the needs. 
	private void printDetails() {
		// print details
		System.out.println("Produce name: " + name);
		System.out.println("Unit Price is: " + getSetUnitPrice());
	}

	void printBanner() {
		System.out.println("Print out a Banner ... ");
	}

	// Here are the Getter and Setter Methods
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the productID
	 */
	public String getProductID() {
		return productID;
	}

	/**
	 * @param productID
	 *            the productID to set
	 */
	public void setProductID(String productID) {
		this.productID = productID;
	}

	/**
	 * @return the setUnitPrice
	 */
	public Double getSetUnitPrice() {
		return setUnitPrice;
	}

	/**
	 * @param setUnitPrice
	 *            the setUnitPrice to set
	 */
	public void setSetUnitPrice(Double setUnitPrice) {
		this.setUnitPrice = setUnitPrice;
	}
}
