package edu.bu.met.cs665.example1;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	public Person() {
	}

	public Person(String firstName, String lastName, LocalDate birthDay) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
	}

	private String firstName;
	private String lastName;

	private LocalDate birthDay;

	// 
	public String calculateAge() {
		return calculateAgeUntil(java.time.LocalDate.now());
	}

	// Calculates the age of a person as a string description. 
	public String calculateAgeUntil(LocalDate until) {
		Period p = calculateAgeUntilPeriod(until);

		if ((p != null)) {
			return p.getYears() + " years and " + p.getMonths() + " months and " + p.getDays() + " days";
		} else {
			return "Can not Calculate the age - birthDay is null";
		}
	}

	// Calculates the age of a person as a java Period object
	// Check if the birth day is set 
	public Period calculateAgeUntilPeriod(LocalDate until) {
		if ((birthDay != null)) {
			return Period.between(birthDay, until);
		} else {
			return null;
		}
	}

	
	// Getter and Setter Methods 
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

}
