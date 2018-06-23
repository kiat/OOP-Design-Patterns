package edu.bu.met.cs665.Observie;

/**
 * This Class Represents a single stock market share data. 
 * 
 * @author kiat
 *
 */
public class StockMarketData {
	
	private String stockName;
	private float lastPrice;
	private float volume;

	public StockMarketData() {
	}
	
	public StockMarketData(String stockName, float lastPrice, float volume) {
		this.stockName = stockName;
		this.lastPrice = lastPrice;
		this.volume = volume;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public float getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(float lastPrice) {
		this.lastPrice = lastPrice;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

}
