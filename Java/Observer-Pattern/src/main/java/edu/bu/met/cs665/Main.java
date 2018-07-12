package edu.bu.met.cs665;

import edu.bu.met.cs665.Observable.StockMarketCentralSystem;
import edu.bu.met.cs665.Observable.StockMarketData;
import edu.bu.met.cs665.Observer.BrokerDevice;
import edu.bu.met.cs665.Observer.CompanyDevice;
import edu.bu.met.cs665.Observer.CustomerDevice;
import edu.bu.met.cs665.Observer.StockMarketObserver;

public class Main {

	public static void main(String[] args) {

		StockMarketCentralSystem centralSystem = new StockMarketCentralSystem();
		
		StockMarketObserver  customer_1 = new CustomerDevice();
		StockMarketObserver  company_1 = new CompanyDevice();
		StockMarketObserver  broker_1 = new BrokerDevice();

		
		centralSystem.registerObserver(customer_1);
		centralSystem.registerObserver(company_1);
		centralSystem.registerObserver(broker_1);

		StockMarketData ibmStock= new StockMarketData("IBM", 102, 10023);
		StockMarketData appleStock= new StockMarketData("APPL", 145, 20423);
		StockMarketData microsoftStock= new StockMarketData("MSF", 60, 40023);

		
		centralSystem.setData(ibmStock);
		
		System.out.println("##-------------------------------------------------##\n");
		centralSystem.setData(appleStock);
		
		System.out.println("##-------------------------------------------------##\n");
		centralSystem.setData(microsoftStock);

		
	}

}