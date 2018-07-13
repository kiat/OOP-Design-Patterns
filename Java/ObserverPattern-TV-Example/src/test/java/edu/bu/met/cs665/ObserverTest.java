package edu.bu.met.cs665;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.example1.Person;
import edu.bu.met.cs665.example1.TvShow;

public class ObserverTest {
	
	@Test
	public void shouldMessageSubscriberWhenNewDataIsAvailable() {
		
		// Given
		TvShow theOffice = new TvShow("The Office");
		Person fan = new Person("Alice", theOffice);
		
		// When
		theOffice.setLatestEpisode("Episode 17");
		
		// Then
		Assert.assertTrue(fan.getMyLatestEpisode().equals("Episode 17"));
	}
}
