package edu.bu.met.cs665.onlineshop;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop implements CustomerSubject {

  private List<Customer> customers = new ArrayList<>();
  private List<CustomerObserver> customerObservers = new ArrayList<>();

  @Override
  public void update(Customer newCustomer) {
    for(CustomerObserver observer: customerObservers){
      observer.update(newCustomer);
    }
  }

  @Override
  public void register(CustomerObserver observer) {
    customerObservers.add(observer);
  }

  @Override
  public void remove(CustomerObserver observer) {
    customerObservers.remove(observer);
  }

  public void addCustomer(Customer customer) {
    customers.add(customer);
    update(customer);

  }

  public void removeCustomer(Customer customer) {
    customers.remove(customer);
  }
}
