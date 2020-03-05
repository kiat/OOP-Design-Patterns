package edu.bu.met.cs665;

import edu.bu.met.cs665.visitable.Clothing;
import edu.bu.met.cs665.visitable.Fruit;
import edu.bu.met.cs665.visitable.Tool;
import edu.bu.met.cs665.visitor.Cart;

public class Main {

	/**
	 * A main method to run examples.
	 *
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		// Tool objects
		Tool hammer = new Tool(12.09, 2.1, false);
		Tool screwDriverSet = new Tool(34.98, 14.1, true);
		// Fruit objects
		Fruit orange = new Fruit(3, 21, "orange");
		Fruit apple = new Fruit(2, 1, "apple");
		// clothing objects
		Clothing sweater = new Clothing('l', 33.99);
		Clothing jacket = new Clothing('l', 239.99);

    // store them in a list of element object
//    List<Element> elements = new ArrayList<>(Arrays.asList(
//    		hammer, screwDriverSet, orange, apple, sweater, jacket
//		));

		// create the shopping cart which will visit each object
		Cart cart = new Cart();

		// visit the items
		double sweaterPrice = cart.visit(sweater);
		double orangePrice = cart.visit(orange);
		double toolPrice = cart.visit(hammer);

    System.out.println("Sweater price = $" + sweaterPrice);
    System.out.println("Orange price = $" + orangePrice);
    System.out.println("Hammer price = $" + toolPrice);
	}

}
