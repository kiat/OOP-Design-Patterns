package edu.bu.met.cs665.Observer;

public class BasicDisplay implements StockMarketObserver, DisplayThing {

  protected String name;
  protected float price;
  protected float volume;

  @Override
  public void display() {
    System.out.println("[Basic Display Device] Stock Name:" + name
        + " , Price: " + price + " , Volume " + volume);
  }


  @Override
  public void update(String name, float price, float volume) {

    this.name = name;
    this.price = price;
    this.volume = volume;

    // when we get new data we display it.
    this.display();

  }

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public float getPrice() {
    return price;
  }


  public void setPrice(float price) {
    this.price = price;
  }


  public float getVolume() {
    return volume;
  }


  public void setVolume(float volume) {
    this.volume = volume;
  }



}
