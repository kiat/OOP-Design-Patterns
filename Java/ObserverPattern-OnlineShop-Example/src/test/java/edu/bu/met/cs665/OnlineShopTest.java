package edu.bu.met.cs665;

import edu.bu.met.cs665.onlineshop.AddVerification;
import edu.bu.met.cs665.onlineshop.Customer;
import edu.bu.met.cs665.onlineshop.OnlineShop;
import edu.bu.met.cs665.onlineshop.WelcomeLetter;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class OnlineShopTest {
	
	@Test
	public void shouldMessageSubscriberWhenNewDataIsAvailable() {
		OnlineShop customerDirectory = new OnlineShop();
		AddVerification addVerification = new AddVerification();
		WelcomeLetter welcomeLetter = new WelcomeLetter();

		customerDirectory.register(addVerification);
		customerDirectory.register(welcomeLetter);

		Customer customer1 = new Customer("Kevin","klewisnh@bu.edu");

	}
}
