package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import edu.bu.met.cs665.example1.Order;
import edu.bu.met.cs665.example1.Product;


/**
 * @author Kia Teymourian
 *
 */
public class TestPriceCalculationFromData {

  List<Product> products = new ArrayList<Product>();


  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {

    try {

      // we read the data from a CSV file and test the calculation methods with it.
      //
      // total: 4521.37 retail: 5425.644 totalSize: 9295
      URL url = this.getClass().getResource("/" + "ProductTestData.csv");
      File file = new File(url.getFile());


      FileReader fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(fileReader);

      String line;
      while ((line = bufferedReader.readLine()) != null) {

        String[] data = line.split("#");

        Product product = new Product(data[0], Double.parseDouble(data[1]),
            Double.parseDouble(data[2]), Integer.parseInt(data[3]));
        products.add(product);


      }
      fileReader.close();

    } catch (IOException e) {
      e.printStackTrace();
    }


  }



  @Test
  public void testTotalRetailPrice() {

    Order testOrder = new Order();
    testOrder.setProducts(products);

    assertEquals(testOrder.calTotalPrice(), 5425.644, 0.0001d);
  }


  @Test
  public void testTotalPriceWithTax() {

    Order testOrder = new Order();
    testOrder.setProducts(products);

    // 8 percent tax
    testOrder.setTaxRate(0.08);

    assertEquals(testOrder.calTotalPriceWithTax(), 5425.644 * 1.08, 0.0001d);

  }



  @Test
  public void testTotalSize() {

    Order testOrder = new Order();
    testOrder.setProducts(products);

    assertEquals(testOrder.calTotalSize(), 9295);
    
  }


}
