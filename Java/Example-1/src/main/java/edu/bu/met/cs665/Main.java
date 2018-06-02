package edu.bu.met.cs665;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import edu.bu.met.cs665.example1.Person;

public class Main {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate xmas = LocalDate.parse("22/12/1994", formatter);
		Person student = new Person("John", "Doe", xmas);

		System.out.println(student.calculateAge());
	}

}