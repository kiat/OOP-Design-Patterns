package edu.bu.met.cs665.Observer;

public class BrokerDevice extends BasicDisplay{
	
	@Override
	public void display() {
		System.out.println("[Broker Device]  Stock Name:" + name + " , Price: " + price + " , Volume " + volume);
	}


}