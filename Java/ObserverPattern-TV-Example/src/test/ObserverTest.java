package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import observer.Person;
import observer.TvShow;

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
