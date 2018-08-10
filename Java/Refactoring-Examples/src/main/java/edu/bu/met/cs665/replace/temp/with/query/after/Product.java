package edu.bu.met.cs665.replace.temp.with.query.after;

public class Product {

	private String name;
	private String productID;
	private Double setUnitPrice;
	private int quantity;

	// Returns the total price for an order of this product.
	public double getTotalPrice() {

		if (baseProductPrice() > 1000) {
			return baseProductPrice() * 0.95;
		} else {
			return baseProductPrice() * 0.98;
		}
	}

	/**
	 * Returns the base price for an order of this product.
	 * 
	 * @return
	 */
	public double baseProductPrice() {
		double baseProductPrice = setUnitPrice * quantity;
		return baseProductPrice;
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

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
