package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

  /**
   * A main method to run examples. 
   * @param args not used 
   */
  public static void main(String[] args) {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    LocalDate xmas = LocalDate.parse("22/12/1994", formatter);
    Person student = new Person("John", "Doe", xmas);

    System.out.println(student.calculateAge());
  }

}
