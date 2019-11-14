package edu.bu.met.cs665.onlineshop;

public class AddVerification implements CustomerObserver{

  @Override
  public void update(Customer customer) {
    verifyAddress(customer);
  }

  private void verifyAddress(Customer customer){
    System.out.println("Verifying address " + customer.getEmail() + " for " + customer.getName());
  }
}
