package edu.bu.met.cs665.state;

import org.apache.log4j.Logger;
import edu.bu.met.cs665.sodamachine.SodaMachine;

public class SodaSelected implements State {

  // just for logging
  private static Logger logger = Logger.getLogger(SodaSelected.class);

  // this holds the current state of the machine
  SodaMachine sodaMachine;

  /**
   * Construct the object and set the state.
   */
  public SodaSelected(SodaMachine sodaMachine) {
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
    
    logger.info("Please wait, we're already giving you a soda");
    sodaMachine.setState(sodaMachine.getSoldState());

    // no state transition for this action.
  }

  /**
   * select a soda type. 
   */
  @Override
  public void selectSoda() {
    sodaMachine.setState(sodaMachine.getSelectedState());
    logger.info("You have selected the soda");
    // no state transition for this action.
  }

  /**
   * dispense a soda can.
   */
  @Override
  public void pushButton() {
    logger.info("Please wait, we're already giving you a soda");
    // no state transition for this action.
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


