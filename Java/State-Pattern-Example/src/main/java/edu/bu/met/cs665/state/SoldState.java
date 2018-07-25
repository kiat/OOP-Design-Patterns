package edu.bu.met.cs665.state;

import org.apache.log4j.Logger;
import edu.bu.met.cs665.sodamachine.SodaMachine;

public class SoldState implements State {

  // just for logging
  private static Logger logger = Logger.getLogger(SoldState.class);

  // this holds the current state of the machine
  SodaMachine sodaMachine;

  /**
   * Construct the object and set the state.
   */
  public SoldState(SodaMachine sodaMachine) {
    this.sodaMachine = sodaMachine;
  }

  /**
   * If the machine is in soldSate then someone insert the coin then.
   */
  @Override
  public void insertCoin() {
    logger.info("Please wait, we're already giving you a soda.");
    // no state transition for this action.
  }


  /**
   * If the machine is in soldSate then someone insert the coin then.
   */
  @Override
  public void ejectCoin() {
    logger.info("Sorry, you already pushed the button");
    // no state transition for this action.
  }
  
  
  /**
   * canceling the selection has no effect.  
   */
  @Override
  public void cancelSelection() {
    logger.info("Sorry, you already pushed the button");
    // no state transition for this action.
  }

  /**
   * select a soda type. 
   */
  @Override
  public void selectSoda() {
    logger.info("Please wait, we're already giving you a soda");
    // no state transition for this action.
  }

  /**
   * dispense a soda can.
   */
  @Override
  public void pushButton() {

    // first change the state.
    sodaMachine.releaseSodaCan();

    // then do the main transition logic of the machine.
    // and set the next state.

    if (sodaMachine.getCount() > 0) {
      // if the machine dispense a soda can then the machine goes the NoCoinState.
      sodaMachine.setState(sodaMachine.getNoCoinState());
    } else {
      // If out of the soda then
      logger.info("Oops, out of Soda Cans!");
      sodaMachine.setState(sodaMachine.getSoldOutState());
    }
  }

  /**
   * Do nothing for the refill action. 
   */
  public void refill() {

  }

  public String toString() {
    return "dispensing a soda can";
  }


}


