package edu.bu.met.cs665.Observable;

import java.util.ArrayList;
import java.util.List;
import edu.bu.met.cs665.Observer.StockMarketObserver;

public class StockMarketCentralSystem implements StockMarketSubject {

  private StockMarketData stockData;

  private List<StockMarketObserver> observerList =
      new ArrayList<StockMarketObserver>();

  /**
   * Register an observer to receive messages from the market price changes
   */
  @Override
  public void registerObserver(StockMarketObserver o) {
    observerList.add(o);
  }

  /**
   * Removes an observer from the stock market. The observer will be unsubscribed
   */
  @Override
  public void removeObserver(StockMarketObserver o) {
    observerList.remove(o);
  }

  /**
   * Notifies all of the observers that are registered and added to the list. 
   * We notify the observers one by one sequential but this can be implemented in
   * parallel design using multiple threads.
   */
  @Override
  public void notifyObservers() {

    // loop over the list and notify them one by one
    for (StockMarketObserver stockMarketObserver : observerList) {
      stockMarketObserver.update(stockData.getStockName(),
          stockData.getLastPrice(), stockData.getVolume());
    }

    // A nice parallel implementation in Java 8 can be
    // observerList.parallelStream()
    // .forEach(a -> a.update(stockData.getStockName(), stockData.getLastPrice(), stockData.getVolume()));

  }

  /**
   * A setter method for stockMarketData
   */
  public void setData(StockMarketData data) {

    this.stockData = data;

    // when we get new data we inform all observers about it.
    notifyObservers();
  }

  /**
   * Just a getter Method
   */
  public StockMarketData getData() {
    return this.stockData;
  }

}
