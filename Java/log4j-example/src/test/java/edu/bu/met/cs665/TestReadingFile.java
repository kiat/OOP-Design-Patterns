package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.junit.Test;
import edu.bu.met.cs665.example1.FileOperationManager;



public class TestReadingFile {

  private static Logger logger = Logger.getLogger(TestReadingFile.class);



  public TestReadingFile() {}

  @Test
  public void testGetFirstName() {

    FileOperationManager fl = new FileOperationManager();

    fl.writeToFile("Hello World!", "myFile.txt");

    logger.info("File Created, now we test if we can read the content back.");
    assertEquals("Hello World!", fl.readFromFile("myFile.txt"));

  }


  @Test
  public void testToFail() {



    logger.info("We provide a wrong filename and check if it faild or not");

    logger.trace("We throw an exception and check if we do this really.");

    assertThrows(java.lang.NullPointerException.class, () -> {
      FileOperationManager fl = new FileOperationManager();
      fl.readFromFile("SOME-WRONG-FILENAME-myFile123123123.txt");
    });



  }



}
