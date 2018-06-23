package edu.bu.met.cs665.Observer;

public class CustomerDevice extends BasicDisplay {

	
	@Override
	public void display() {
		System.out.println("[Customer Device] Stock Name:" + name + " , Price: " + price + " , Volume " + volume);
	}

}