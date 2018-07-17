package edu.bu.met.cs665.singleton.threadsafe;

public class Singleton {

  private static Singleton uniqueInstance;

  // this class can have more instance variables ...

  private Singleton() {}

  public static synchronized Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }

  /**
   * Just print out method to test.
   * 
   * @return
   */
  public String getDescription() {
    return "I'm a thread safe Singleton!";
  }

}
