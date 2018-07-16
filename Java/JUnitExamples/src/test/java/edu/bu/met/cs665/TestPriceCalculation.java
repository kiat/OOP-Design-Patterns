package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import edu.bu.met.cs665.example1.Order;
import edu.bu.met.cs665.example1.Product;


/**
 * @author Kia Teymourian
 *
 */
public class TestPriceCalculation {

  List<Product> products = new ArrayList<Product>();


  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {

    // Generate 10 products.
    for (int i = 0; i < 10; i++) {
      Product product = new Product("Product-" + i, i, i + 1, i);
      products.add(product);

    }
  }


  /**
   * Tests total retail price of the order
   */
  @Test
  public void testTotalRetailPrice() {

    Order testOrder = new Order();
    testOrder.setProducts(products);
    assertEquals(testOrder.calTotalPrice(), 55.0, 0.0001d);
  }

  /**
   * Tests the total price with tax.
   */
  @Test
  public void testTotalPriceWithTax() {

    Order testOrder = new Order();
    testOrder.setProducts(products);

    // 8 percent tax
    testOrder.setTaxRate(0.08);
    assertEquals(testOrder.calTotalPriceWithTax(), 59.4, 0.0001d);

  }


  /**
   * Tests the total size of the order.
   */
  @Test
  public void testTotalSize() {

    Order testOrder = new Order();
    testOrder.setProducts(products);


    assertEquals(testOrder.calTotalSize(), 45);

  }
  
  
  @After
  public void tearDown() throws Exception {}


}
