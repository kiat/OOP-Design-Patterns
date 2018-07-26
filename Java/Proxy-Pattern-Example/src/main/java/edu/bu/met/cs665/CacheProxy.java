package edu.bu.met.cs665;

import java.util.List;

public class CacheProxy implements DataAccess {

	String fileName;

	// this is our cached data.
	List<Customer> customers = null;

	public CacheProxy(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public List<Customer> getCustomerData() {
		// here is the main logic.
		// if we have not loaded the data before then we load it and keep the whole data in cache. 
		// If we have already the data then we return it. 
		if (this.customers == null) {
			customers = new RealDataReader(this.fileName).getCustomerData();
		}

		return customers;
	}
}
