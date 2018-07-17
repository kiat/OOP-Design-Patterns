package edu.bu.met.cs665.coffeecondiments;

public class CoffeePriceCalMain {

  public static void main(String args[]) {
    
    // our first beverage. 
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $" + beverage.cost());

    
    // A second beverage with 2 mocha and whip
    Beverage beverage2 = new Decaf();
    beverage2 = new Milk(beverage2);
    beverage2 = new Milk(beverage2);
    beverage2 = new Suger(beverage2);
    
    System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    
    // A 3rd beverage with Soy Mocha and whip 
    Beverage beverage3 = new HouseBlend();
    beverage3 = new Soy(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);
    
    System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
  }
}
