package edu.bu.met.cs665;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import edu.bu.met.cs665.Observable.StockMarketCentralSystem;
import edu.bu.met.cs665.Observable.StockMarketData;
import edu.bu.met.cs665.Observer.BasicDisplay;
import edu.bu.met.cs665.Observer.BrokerDevice;
import edu.bu.met.cs665.Observer.CompanyDevice;
import edu.bu.met.cs665.Observer.CustomerDevice;



// Write some Unit tests for your program like the following.

public class TestSpreadOfStockPrices {


  @Test
  public void testEventDelivery() {

    StockMarketCentralSystem centralSystem = new StockMarketCentralSystem();

    BasicDisplay customer_1 = new CustomerDevice();
    BasicDisplay company_1 = new CompanyDevice();
    BasicDisplay broker_1 = new BrokerDevice();


    centralSystem.registerObserver(customer_1);
    centralSystem.registerObserver(company_1);
    centralSystem.registerObserver(broker_1);

    // A new Stock Market Data.
    StockMarketData ibmStock = new StockMarketData("IBM", 102f, 10023f);
    centralSystem.setData(ibmStock);

    // We should get them.
    assertEquals(customer_1.getPrice(), 102f, 0.0000001f);
    assertEquals(customer_1.getVolume(), 10023f, 0.0000001f);

    // A new Stock Market Data.
    StockMarketData appleStock = new StockMarketData("APPL", 145f, 20423f);

    centralSystem.setData(appleStock);

    assertEquals(company_1.getPrice(), 145f, 0.0000001f);
    assertEquals(company_1.getVolume(), 20423f, 0.0000001f);

    // A new Stock Market Data.
    StockMarketData microsoftStock = new StockMarketData("MSF", 60f, 40023f);

    centralSystem.setData(microsoftStock);
    assertEquals(broker_1.getPrice(), 60f, 0.0000001f);
    assertEquals(broker_1.getVolume(), 40023f, 0.0000001f);

  }
}


