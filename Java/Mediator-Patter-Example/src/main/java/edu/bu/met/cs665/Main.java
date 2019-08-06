package edu.bu.met.cs665;

public class Main {

  public static void main(String[] args) {
    
    
    Driver taxi = new Driver("Taxi-1");
    Driver van = new Driver("Van-1");
    
    // Create the shop 
    // Shop is here our Concerete Mediator
    Shop flowerShop = new Shop();
    
    // Register the two drivers. 
    flowerShop.registerDriver(taxi);
    flowerShop.registerDriver(van);
    
    // Now, drivers can start sending their offers. 
    taxi.setMyOffer(flowerShop, 45); 
    van.setMyOffer(flowerShop, 40); 
    taxi.setMyOffer(flowerShop, 35); 
    van.setMyOffer(flowerShop, 30); 
    

  }

}
