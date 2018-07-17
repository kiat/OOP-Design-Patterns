package edu.bu.met.cs665.singleton.stat;

public class Singleton {

  // Static instantiation of the single instance.
  private static Singleton uniqueInstance = new Singleton();

  private Singleton() {}


  /**
   * 
   * @return
   */
  public static Singleton getInstance() {
    return uniqueInstance;
  }

  public String getDescription() {
    return "I'm a statically initialized Singleton!";
  }
}
