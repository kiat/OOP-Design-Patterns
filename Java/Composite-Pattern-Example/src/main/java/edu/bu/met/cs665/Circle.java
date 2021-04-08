package edu.bu.met.cs665;

public class Circle implements Figure {

  /**
   * Print a Circle.
   */

  public void print() {
    int n = 4;
    System.out.println();

    for (int i = -n; i <= n; i++) {
      for (int j = -n; j <= n; j++) {
        if (i * i + j * j <= n * n)
          System.out.print("* ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }

  }

}
