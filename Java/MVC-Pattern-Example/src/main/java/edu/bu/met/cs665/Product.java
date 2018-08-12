package edu.bu.met.cs665;

public class Product {

	private String name;
	private String productID;
	private Double unitPrice;

	/**
	 * @param name
	 * @param unitPrice
	 */
	public Product(String name, Double unitPrice) {
		this.name = name;
		this.unitPrice = unitPrice;
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
	public Double getProductUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param setUnitPrice
	 *            the setUnitPrice to set
	 */
	public void setUnitPrice(Double setUnitPrice) {
		this.unitPrice = setUnitPrice;
	}

}
