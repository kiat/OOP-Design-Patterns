package edu.bu.met.cs665.Observer;


public interface StockMarketObserver {
	
	public void update(String name, float price , float volume);

}