package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;

public class MyFigure implements Figure {

  private List<Figure> childFigures = new ArrayList<Figure>();



  public void print() {
    for (Figure figure : childFigures) {
      // We delegate the printing task to each child Figure.
      figure.print();
    }
  }

  /**
   * Add to the child list. 
   * @param graphic
   */
  public void add(Figure graphic) {
    childFigures.add(graphic);
  }

  
  /**
   * Remove from the child list.  
   * @param graphic
   */
  public void remove(Figure graphic) {
    childFigures.remove(graphic);
  }


}
