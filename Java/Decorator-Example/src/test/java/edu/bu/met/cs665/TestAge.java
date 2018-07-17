package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

import edu.bu.met.cs665.example1.Person;

// Write some Unit tests for your program like the following. 

public class TestAge {

	public TestAge() {
	}

	@Test
	public void testPersonAge() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate xmas = LocalDate.parse("22/12/1994", formatter);

		Person student = new Person("John", "Doe", xmas);

		LocalDate oneYearAfterxmas = LocalDate.parse("22/12/1995", formatter);
		// age one year after is one
		assertEquals(student.calculateAgeUntilPeriod(oneYearAfterxmas).getYears(), 1);

	}

}
