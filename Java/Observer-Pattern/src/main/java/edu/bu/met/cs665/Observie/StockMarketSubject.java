package edu.bu.met.cs665.Observie;

import edu.bu.met.cs665.Observer.StockMarketObserver;

public interface StockMarketSubject {
	
	public void registerObserver(StockMarketObserver o);

	public void removeObserver(StockMarketObserver o);

	public void notifyObservers();
	
}