package edu.bu.met.cs665.example1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.log4j.Logger;

public class FileOperationManager {

  private static Logger logger = Logger.getLogger(FileOperationManager.class);



  public void writeToFile(String str, String fileName) {

    logger.trace("The process is inside the readFromFile method");


    BufferedWriter writer = null;

    // We try to open a file from this current disk.
    try {
      writer = new BufferedWriter(new FileWriter(fileName));
    } catch (IOException e) {

      logger.error("Can not open a file from this disk.", e);
    }


    // Now let us try to write into this file

    try {
      writer.write(str);
    } catch (IOException e) {
      logger.error("Can not write to the file", e);

    }

    // Now, let us try to close this file.

    try {
      writer.close();
    } catch (IOException e) {
      logger.warn("Can not close the opened output file", e);
    }

  }


  /**
   * This method reads a text file into a single string output.
   * @param fileName the name of the file to read from. 
   * @return the text content of the file. 
   */
  public String readFromFile(String fileName) {

    String outputString = null;
    BufferedReader reader = null;

    logger.trace("The process is inside the readFromFile method");

    try {
      reader = new BufferedReader(new FileReader(fileName));
    } catch (FileNotFoundException e) {
      logger.error("We can not open and buffer this file with name and path of " + fileName, e);
    }


    // Now we read the lines of this file into a single string
    logger.debug("We read all of the lines into a single file");

    try {
      outputString = reader.readLine();
    } catch (IOException e) {
      logger.error("Can not read the lines from the File name " + fileName, e);
    }

    try {
      reader.close();
    } catch (IOException e) {
      logger.warn("Can not close the file with name " + fileName, e);
    }


    return outputString;
  }


}
