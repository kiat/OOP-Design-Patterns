package edu.bu.met.cs665.Observable;

import edu.bu.met.cs665.Observer.StockMarketObserver;

/**
 * This interface specifies a simple Observable or Subject in Observer Pattern.
 */
public interface StockMarketSubject {

  /**
   * Register an observer to our list of observers.
   * 
   * @param o the observer object
   */
  public void registerObserver(StockMarketObserver o);

  /**
   * remove an observer from our observer list.
   * 
   * @param o
   */
  public void removeObserver(StockMarketObserver o);

  /**
   * Notify all observers.
   */
  public void notifyObservers();

}
