package edu.bu.met.cs665.webexample.models;

public class Teacher {
  /**
   * Teacher model class
   * */
  private int id;
  private String firstName;
  private String lastName;
  private String course;

  public Teacher(int id, String firstName, String lastName, String course) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.course = course;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

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

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }
}
