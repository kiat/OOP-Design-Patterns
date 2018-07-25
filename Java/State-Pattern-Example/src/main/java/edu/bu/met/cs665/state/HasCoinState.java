package edu.bu.met.cs665.state;

import org.apache.log4j.Logger;
import edu.bu.met.cs665.sodamachine.SodaMachine;

public class HasCoinState implements State {

  private static Logger logger = Logger.getLogger(HasCoinState.class);

  // a reference to the state machine.
  SodaMachine sodaMachine;

  /**
   * Constructs the object and set the reference.
   * 
   * @param sodaMachine
   */
  public HasCoinState(SodaMachine sodaMachine) {
    this.sodaMachine = sodaMachine;
  }


  /**
   * No effect, just logging. 
   */
  @Override
  public void insertCoin() {
    logger.info("You can't insert another coin");
  }

  /**
   * We have a coin we can return it and go back the the NoCoinState. 
   */
  @Override
  public void ejectCoin() {
    logger.info("coin returned");
    sodaMachine.setState(sodaMachine.getNoCoinState());
  }

  
  /**
   *  
   */
  @Override
  public void selectSoda() {
    logger.info("You Selected soda type ...");
    sodaMachine.setState(sodaMachine.getSoldState());
  }

  /**
   * No effect, just logging. 
   */
  @Override
  public void pushButton() {
    
    logger.info("Please select your soda type.");
  }

  /**
   * No effect 
   */
  @Override
  public void refill() {}

  
  @Override
  public String toString() {
    return "waiting for your soda selection";
  }

  @Override
  public void cancelSelection() {
    // TODO Auto-generated method stub

  }
}
