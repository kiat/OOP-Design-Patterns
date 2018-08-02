package edu.bu.met.cs665;

public class Main {

  /**
   * This main method runs an example.
   * 
   * @param args not used
   */
  
  public static void main(String[] args) {
    //Initialize a Rectangle
    Figure rectangle = new Rectangle();
    Figure triangle = new Triangle();
    Figure circle = new Circle();
   

    //Initialize three composite graphics
    MyFigure m_Figure = new MyFigure();

    //Composes the figures to MyFigure
    m_Figure.add(rectangle);
    m_Figure.add(triangle);
    m_Figure.add(circle);

    
    // Here we can see that the print complexity of each different child figures 
    // are hidden from the client side. 
    //Prints it. 
    m_Figure.print();
    
}

}
