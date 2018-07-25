package edu.bu.met.cs665.state;

public interface State {
 
	public void insertCoin();
	public void ejectCoin();
	
	public void selectSoda();
	public void cancelSelection();
	
	public void pushButton();
	
	
	public void refill();

}