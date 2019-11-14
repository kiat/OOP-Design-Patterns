package edu.bu.met.cs665.onlineshop;

import edu.bu.met.cs665.onlineshop.Customer;

public interface CustomerSubject {

  void update(Customer customer);
  void register(CustomerObserver observer);
  void remove(CustomerObserver observer);

}
