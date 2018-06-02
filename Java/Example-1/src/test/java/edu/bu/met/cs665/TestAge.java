package edu.bu.met.cs665;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

import edu.bu.met.cs665.example1.Person;

// Write some Unit tests for your program like the following. 


class TestAge {

	@Test
	void test() {
		// 
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate xmas = LocalDate.parse("22/12/1994", formatter);

		Person student = new Person("John", "Doe", xmas);

		
		LocalDate oneYearAfterxmas = LocalDate.parse("22/12/1995", formatter);
		// age one year after is one 
		assertEquals(student.calculateAgeUntilPeriod(oneYearAfterxmas).getYears(), 1);
		


	}

}
