package edu.bu.met.cs665;

public class Main {

	public static void main(String[] args) {

		Product p=new Product("Milk", 3.0);
		ProductPrintOut print=new ProductPrintOut();
		
		ProductController controller=new ProductController(p, print);
		// now show the name and price. 
		controller.view();
		
		// Price is changed. 
		controller.setProductUnitPrice(4.0);
		// Show the new price. 
		controller.view();

	}

}
