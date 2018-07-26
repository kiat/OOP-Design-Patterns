package edu.bu.met.cs665;

import java.util.List;

public class CacheProxy implements DataAccess {

  String fileName;
  List<Customer> customers = null;


  public CacheProxy(String fileName) {
    this.fileName = fileName;
  }



  @Override
  public List<Customer> getCustomerData() {

    if (this.customers == null) {
      customers = new RealDataReader(this.fileName).getCustomerData();
    }

    return customers;
  }
}
