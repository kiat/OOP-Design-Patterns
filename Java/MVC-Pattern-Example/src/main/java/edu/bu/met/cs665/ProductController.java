package edu.bu.met.cs665;

public class ProductController {

	private Product product;
	private ProductPrintOut productPrintOut;

	/**
	 * @param myProduct
	 * @param myPrintOut
	 */
	public ProductController(Product myProduct, ProductPrintOut myPrintOut) {
		this.product = myProduct;
		this.productPrintOut = myPrintOut;
	}

	/**
	 * sets the product name if it needs an update.
	 * 
	 * @param name
	 *            name of the product
	 */
	public void setProductName(String name) {
		this.product.setName(name);
	}

	/**
	 * Getter method for getting product name.
	 * 
	 * @return
	 */
	public String getProductName() {
		return this.product.getName();
	}

	/**
	 * Set the product price if the price needs an update.
	 * 
	 * @param price
	 */
	public void setProductUnitPrice(double price) {
		this.product.setUnitPrice(price);
	}

	/*
	 * @return
	 */
	public Double getProductUnitPrice() {
		return this.product.getProductUnitPrice();
	}

	/**
	 * Updates the current print out.
	 */
	public void view() {

		this.productPrintOut.print(this.product.getName(),
				this.product.getProductUnitPrice());
	}

}
