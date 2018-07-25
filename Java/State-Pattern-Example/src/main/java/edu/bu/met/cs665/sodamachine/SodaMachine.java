package edu.bu.met.cs665.sodamachine;

import org.apache.log4j.Logger;
import edu.bu.met.cs665.state.HasCoinState;
import edu.bu.met.cs665.state.NoCoinState;
import edu.bu.met.cs665.state.SodaSelected;
import edu.bu.met.cs665.state.SoldOutState;
import edu.bu.met.cs665.state.SoldState;
import edu.bu.met.cs665.state.State;

public class SodaMachine {


  private static Logger logger = Logger.getLogger(SodaMachine.class);


  // Here we list the possible states of the Machine
  State soldOutState;
  State soldState;
  State noCoinState;
  State hasCointState;
  State sodaSelectedState;


  // This attribute member will keep the current state of the machine
  State state;


  int count = 0;

  /*
   * Constructor sets the state machine in initial state.
   */
  public SodaMachine(int numberOfSodaCans) {
    soldOutState = new SoldOutState(this);
    noCoinState = new NoCoinState(this);
    hasCointState = new HasCoinState(this);
    soldState = new SoldState(this);
    sodaSelectedState = new SodaSelected(this);

    this.count = numberOfSodaCans;
    if (numberOfSodaCans > 0) {
      state = noCoinState;
    } else {
      state = soldOutState;
    }
  }

  public void insertCoint() {
    state.insertCoin();
  }

  public void ejectCoin() {
    state.ejectCoin();
  }

  public void pushButton() {
    state.pushButton();
  }

  public void selectSoda() {
    state.selectSoda();
  }

  /**
   * 
   */
  public void releaseSodaCan() {
    logger.info("A Soda Can comes rolling out the machine ...");

    if (count != 0) {
      count = count - 1;
    }
  }

  public int getCount() {
    return count;
  }

  /**
   * Refill the soda machine.
   * 
   * @param count
   */
  public void refill(int count) {
    this.count += count;

    logger
        .info("This Soda Machine is refilled; It is new count of soda cans is: "
            + this.count);
    state.refill();
  }

  public void setState(State state) {
    this.state = state;
  }

  public State getState() {
    return state;
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public State getNoCoinState() {
    return noCoinState;
  }

  public State getHasCoinState() {
    return hasCointState;
  }

  public State getSoldState() {
    return soldState;
  }

  public State getSelectedState() {
    return sodaSelectedState;
  }

  
  public String toString() {

    StringBuffer result = new StringBuffer();

    result.append("\nSoda Vending Machine");
    result.append("\nInventory: " + count + " Soda Can/s\n");
    result.append("This Soda Machine is " + state + "\n");

    return result.toString();
  }
}
