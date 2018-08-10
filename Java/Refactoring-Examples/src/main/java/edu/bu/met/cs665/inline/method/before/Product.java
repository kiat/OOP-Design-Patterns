package edu.bu.met.cs665.inline.method.before;

public class Product {

	private String name;
	private String productID;
	private Double setUnitPrice;

	// TODO: "Inline Method"
	// 
	// Inline this method because the other method does nothing or a small
	// check only .
	// Returns a discount rate. It can be 1 or 2 percent
	int getDiscountRate() {
		return isHigherThanFive() ? 2 : 1;
	}

	// return true if the unit price is higher than 5.
	boolean isHigherThanFive() {
		return setUnitPrice > 5;
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
