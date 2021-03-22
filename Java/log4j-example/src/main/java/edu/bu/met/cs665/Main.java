package edu.bu.met.cs665;

import org.apache.log4j.Logger;
// import org.apache.log4j.PropertyConfigurator;

public class Main {

  private static Logger logger = Logger.getLogger(Main.class);


  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    // This configuration is for setting up the log4j properties file.
    // It is better to set this using java program arguments.
    // PropertyConfigurator.configure("log4j.properties");

    logger.trace(
        "This is a Trace Message for illustration purpose only! This is the highest level which prints all trace, debug, info, warn, error and fatal logs.");
    logger.debug(
        "This is a Debug Message for illustration purpose only! This log level prints debug, info, warn, error and fatal logs.");
    logger.info(
        "This is a Info Message for illustration purpose only! This log level prints info, warn, error and fatal logs.");
    logger.warn(
        "This is a Warn Message for illustration purpose only! This log level prints warn, error and fatal logs.");
    logger.error(
        "This is a Error Message for illustration purpose only! This log level prints error and fatal logs.");

    logger.fatal(
        "This is a Fatal Message for illustration purpose only! This log level is the loweest level, and prints only fatal logs.");



  }
}
