package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import edu.bu.met.cs665.singleton.stat.Singleton;


// Write some Unit tests for your program like the following.

public class TestSingltion {



  @Test
  public void SingletonTest1() {
    
    Singleton singleton1 = Singleton.getInstance();
    
    Singleton singleton2 = Singleton.getInstance();

    
    assertEquals(singleton1, singleton2);
  }


}
