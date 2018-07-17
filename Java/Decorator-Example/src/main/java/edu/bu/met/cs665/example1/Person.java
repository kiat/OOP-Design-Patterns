package edu.bu.met.cs665.example1;

import java.time.LocalDate;
import java.time.Period;

/**
 * This Class represents a Person.
 * 
 * @author Kia
 *
 */
public class Person {

  /**
   * A person with empty attribute members.
   */
  public Person() {}

  /**
   * Create a Person object using first and last name and birthday.
   * 
   * @param firstName firstname of the person as string
   * @param lastName lastname of the person as string
   * @param birthDay birthday of the person as LocalDate object
   */
  public Person(String firstName, String lastName, LocalDate birthDay) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDay = birthDay;
  }

  private String firstName;
  private String lastName;

  private LocalDate birthDay;

  /**
   * This calculates the age of a person by using the local time now.
   * 
   * @return
   */
  public String calculateAge() {
    return calculateAgeUntil(java.time.LocalDate.now());
  }

  /**
   * Calculates the age of a person as a string description.
   * 
   * @param until A localDate Object
   * @return
   */
  public String calculateAgeUntil(LocalDate until) {
    Period p = calculateAgeUntilPeriod(until);

    if ((p != null)) {
      return p.getYears() + " years and " + p.getMonths() + " months and "
          + p.getDays() + " days";
    } else {
      return "Can not Calculate the age - birthDay is null";
    }
  }

  /**
   * Calculates the age of a person as a java Period object Check if the birth day is set.
   * 
   * @param until when you want to calculate the age 
   * @return
   */
  public Period calculateAgeUntilPeriod(LocalDate until) {
    if ((birthDay != null)) {
      return Period.between(birthDay, until);
    } else {
      return null;
    }
  }


  /*
   * Getter method for first name.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Setter method for first name string.
   * 
   * @param firstName first name of a person
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Getter method for last name of the person.
   * 
   * @return
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Setter method for the last name of the person.
   * 
   * @param lastName last name string
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Getter Method for the birthday.
   * 
   * @return
   */
  public LocalDate getBirthDay() {
    return birthDay;
  }

  /**
   * Setter method for birthday of the person.
   * 
   * @param birthDay birthday as LocalDate Object
   */
  public void setBirthDay(LocalDate birthDay) {
    this.birthDay = birthDay;
  }

}
