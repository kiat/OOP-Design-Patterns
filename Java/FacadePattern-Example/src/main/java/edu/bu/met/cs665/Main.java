package edu.bu.met.cs665;

import edu.bu.met.cs665.smartHome.Amplifier;
import edu.bu.met.cs665.smartHome.CdPlayer;
import edu.bu.met.cs665.smartHome.DvdPlayer;
import edu.bu.met.cs665.smartHome.Lights;
import edu.bu.met.cs665.smartHome.Screen;
import edu.bu.met.cs665.smartHome.SmartHomeFacade;
import edu.bu.met.cs665.smartHome.Tuner;

public class Main {

  /**
   * A main method to run examples. 
   * @param args not used 
   */
  public static void main(String[] args) {

    Amplifier amp = new Amplifier("Top-O-Line Amplifier");
    Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
    DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
    CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);

    Lights lights = new Lights("Theater Ceiling Lights");
    Screen screen = new Screen("Theater Screen");

    SmartHomeFacade homeTheater = new SmartHomeFacade(amp, tuner, dvd, cd, screen, lights);

    homeTheater.watchMovie("Dances with Wolves");
    homeTheater.endMovie();
  }

}
