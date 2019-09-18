package edu.bu.met.cs665.onlineshop;

public class WelcomeLetter implements CustomerObserver{

  @Override
  public void update(Customer customer) {
    generateLetter(customer);
  }

  private void generateLetter(Customer customer){
    System.out.println("Generating letter for " + customer.getName());
  }
}
