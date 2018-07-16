package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import edu.bu.met.cs665.example1.Order;
import edu.bu.met.cs665.example1.Product;

public class SimpleTest {


  @Test
  public void test() {
    List<Product> products = new ArrayList<Product>();

    // Generate 10 products.
    for (int i = 0; i < 10; i++) {
      Product product = new Product("Product-" + i, i, i + 1, i);
      products.add(product);

    }

    Order testOrder = new Order();
    testOrder.setProducts(products);
    
    // These two values should be equal. 
    assertEquals(testOrder.calTotalPrice(), 55.0, 0.0001d);


  }

}
