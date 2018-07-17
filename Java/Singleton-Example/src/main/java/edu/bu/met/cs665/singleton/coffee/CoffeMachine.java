package edu.bu.met.cs665.singleton.coffee;

public class CoffeMachine {
  private boolean empty;
  private boolean boiled;
  private static CoffeMachine uniqueInstance;

  private CoffeMachine() {
    empty = true;
    boiled = false;
  }

  public static CoffeMachine getInstance() {
    if (uniqueInstance == null) {
      System.out.println("Creating unique instance of Coffee Machine");
      uniqueInstance = new CoffeMachine();
    }
    System.out.println("Returning instance of Coffee Machine");
    return uniqueInstance;
  }

  /**
   * 
   */
  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
    }
  }

  public void drain() {
    if (!isEmpty() && isBrewing()) {
      empty = true;
    }
  }

  public void brew() {
    if (!isEmpty() && !isBrewing()) {
      boiled = true;
    }
  }

  public boolean isEmpty() {
    return empty;
  }

  public boolean isBrewing() {
    return boiled;
  }
}
