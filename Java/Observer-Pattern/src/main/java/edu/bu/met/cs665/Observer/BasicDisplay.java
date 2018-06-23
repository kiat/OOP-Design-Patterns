package edu.bu.met.cs665.Observer;

public class BasicDisplay implements StockMarketObserver, DisplayThing {

	String name;
	float price;
	float volume;

	@Override
	public void display() {
		System.out.println("[Basic Display Device] Stock Name:" + name + " , Price: " + price + " , Volume " + volume);
	}

	
	@Override
	public void update(String name, float price, float volume) {

		this.name=name;
		this.price=price;
		this.volume=volume;
		
		// when we get new data we display it.
		this.display();

	}

}
