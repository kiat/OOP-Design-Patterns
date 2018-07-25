package edu.bu.met.cs665.state;

import org.apache.log4j.Logger;
import edu.bu.met.cs665.sodamachine.SodaMachine;

public class SoldOutState implements State {


  // just for logging
  private static Logger logger = Logger.getLogger(SoldOutState.class);


  // a reference to the soda machine.
  SodaMachine sodaMachine;

  /**
   * Construct the state object and set the reference to the current machine.
   * 
   * @param sodaMachine this soda machine
   */
  public SoldOutState(SodaMachine sodaMachine) {
    this.sodaMachine = sodaMachine;
  }

  /**
   * No effect.
   */
  @Override
  public void insertCoin() {
    logger.info("You can't insert a coin, the machine is sold out");
  }

  /**
   * No effect.
   */
  @Override
  public void ejectCoin() {
    logger.info("ejected the coin ...");
  }

  /**
   * No effect.
   */
  @Override
  public void selectSoda() {
    logger.info("Do not select, the machine is out of soda cans. ");
  }

  /**
   * if sold out return the coin. 
   */
  @Override
  public void pushButton() {
    sodaMachine.ejectCoin();

    logger.info("No soda cans dispensed");
  }

  /**
   * In this state the only action that has a state change is the refill action.
   */
  @Override
  public void refill() {
    sodaMachine.setState(sodaMachine.getNoCoinState());
  }

  /**
   * A to string method for this state.
   */
  @Override
  public String toString() {
    return "sold out";
  }

  /**
   * No effect.
   */
  @Override
  public void cancelSelection() {
    logger.info("Out of soda state - Cancelation has no effect. ");
  }
}
