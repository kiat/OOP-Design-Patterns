package edu.bu.met.cs665.extract.variables.before;

public class Product {

	private String name;
	private String productID;
	private Double setUnitPrice;

	// TODO: "Extract Variable"
	// a variable is used in the if here that should be better extracted from
	// here as a constant value.
	// We normally extract all of the constants and put them in a separate class.
	void printBanner() {
		if (System.getProperty("os.name").toLowerCase().contains("mac")) {
			System.out.println("Print special banner for people who have money. ");
		} else {
			System.out.println("Print out a Standard Banner ... ");
		}
	}

	// just a test main method to print out the banner.
	public static void main(String[] args) {
		new Product().printBanner();
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
