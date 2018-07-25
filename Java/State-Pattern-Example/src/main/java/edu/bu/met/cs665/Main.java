package edu.bu.met.cs665;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import edu.bu.met.cs665.sodamachine.SodaMachine;

public class Main {

  private static Logger logger = Logger.getLogger(Main.class);

  public static void main(String[] args) {
    // TODO
    // NOTE: Setting the log4j property should not be here.
    // It should be passed better by the JVM arguments.
    // Like -Dlog4j.configuration={path to the log4j.properties config file}
    PropertyConfigurator.configure("log4j.properties");


    // Test run of the Soda Machine.
    // Initialize the soda machine with 2 soda cans.
    SodaMachine sodaMachine = new SodaMachine(2);
    logger.info(sodaMachine);

    // insert coin + select + push = soda
    sodaMachine.insertCoint();
    sodaMachine.selectSoda();
    sodaMachine.pushButton();
    logger.info(sodaMachine);

    // insert coin + select + push = soda
    sodaMachine.insertCoint();
    sodaMachine.selectSoda();
    sodaMachine.pushButton();
    logger.info(sodaMachine);

    // now sold out state
    // insert coin + select + push = no soda
    sodaMachine.insertCoint();
    sodaMachine.selectSoda();
    sodaMachine.pushButton();
    logger.info(sodaMachine);

    // refill the machine with 5 soda cans
    sodaMachine.refill(5);

    // insert coin + select + push = soda
    sodaMachine.insertCoint();
    sodaMachine.selectSoda();
    sodaMachine.pushButton();
    logger.info(sodaMachine);

    // insert + push = no soda.
    sodaMachine.insertCoint();
    sodaMachine.pushButton();
    logger.info(sodaMachine);

    // coin is already in, select, push = soda
    sodaMachine.selectSoda();
    sodaMachine.pushButton();

  }
}
