package edu.bu.met.cs665.state;

import org.apache.log4j.Logger;
import edu.bu.met.cs665.sodamachine.SodaMachine;

public class NoCoinState implements State {

  private static Logger logger = Logger.getLogger(NoCoinState.class);


  // A reference to the soda machine. 
  SodaMachine sodaMachine;

  /**
   * Construct the object and set the reference to the soda machine.
   * @param sodaMachine this soda machine 
   */
  public NoCoinState(SodaMachine sodaMachine) {
    this.sodaMachine = sodaMachine;
  }

  /**
   * insert a coin has an effect to change the state of the machine from NoCoinState to HasCoinState
   */
  @Override
  public void insertCoin() {
    logger.info("You inserted a coin");
    sodaMachine.setState(sodaMachine.getHasCoinState());
  }

  /**
   * No effects, just logging. 
   */
  @Override
  public void ejectCoin() {
    logger.info("You haven't inserted a coin");
  }

  /**
   * No effects, just logging. 
   */
  @Override
  public void selectSoda() {
    logger.info("You turned, but there's no coin");
  }

  /**
   * No effects, just logging. 
   */
  @Override
  public void pushButton() {
    logger.info("You need to pay first");
  }
  
  /**
   * No effects, just logging. 
   */
  @Override
  public void refill() {
    // No designed for this state. 
    logger.info("No effects. ");
  }

  /**
   * To String method. 
   */
  @Override
  public String toString() {
    return "waiting for coin";
  }

  /**
   *  
   */
  @Override
  public void cancelSelection() {


  }
  
  
}
