package edu.bu.met.cs665.Observer;

public class CompanyDevice extends BasicDisplay {

	@Override
	public void display() {
		System.out.println("[Company Display] Stock Name:" + name + " , Price: " + price + " , Volume " + volume);
	}

}
