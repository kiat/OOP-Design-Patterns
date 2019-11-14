package edu.bu.met.cs665;

import edu.bu.met.cs665.onlineshop.AddVerification;
import edu.bu.met.cs665.onlineshop.Customer;
import edu.bu.met.cs665.onlineshop.OnlineShop;
import edu.bu.met.cs665.onlineshop.WelcomeLetter;

public class Main {

  public static void main(String[] args){
    OnlineShop customerDirectory = new OnlineShop();
    AddVerification addVerification = new AddVerification();
    WelcomeLetter welcomeLetter = new WelcomeLetter();

    customerDirectory.register(addVerification);
    customerDirectory.register(welcomeLetter);

    Customer customer1 = new Customer("Kevin","klewisnh@bu.edu");
    customerDirectory.addCustomer(customer1);
  }

}
