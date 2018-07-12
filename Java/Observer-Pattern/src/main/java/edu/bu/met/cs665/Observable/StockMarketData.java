package edu.bu.met.cs665.Observable;

/**
 * This Class Represents a single stock market share data.
 *
 * @author Kia 
 */
public class StockMarketData {

  private String stockName;
  private float lastPrice;
  private float volume;

  /**
   * A default constructor.
   */
  public StockMarketData() {}

  /**
   * Create A stock market data item based on attributes.
   * 
   * @param stockName stock symbol
   * @param lastPrice last handle price
   * @param volume handle volume
   */
  public StockMarketData(String stockName, float lastPrice, float volume) {
    this.stockName = stockName;
    this.lastPrice = lastPrice;
    this.volume = volume;
  }

  /**
   * Getter method for stock name.
   * 
   * @return stock name
   */
  public String getStockName() {
    return stockName;
  }

  /**
   * A setter method for stock name.
   * 
   * @param stockName stock symbol
   */
  public void setStockName(String stockName) {
    this.stockName = stockName;
  }

  /**
   * Getter for the stock price
   * 
   * @return last price
   */
  public float getLastPrice() {
    return lastPrice;
  }

  /**
   * setter method for the last price.
   * 
   * @param lastPrice latest price
   */
  public void setLastPrice(float lastPrice) {
    this.lastPrice = lastPrice;
  }

  /**
   * Getter for handle volume.
   * 
   * @return last volume
   */
  public float getVolume() {
    return volume;
  }

  /**
   * setter method for the handle volume
   * 
   * @param volume last handle volume
   */
  public void setVolume(float volume) {
    this.volume = volume;
  }

}
