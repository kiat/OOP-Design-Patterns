package edu.bu.met.cs665.smartHome;

public class SmartHomeFacade {

  Amplifier amp;
  Tuner tuner;
  DvdPlayer dvd;
  CdPlayer cd;
  Lights lights;
  Screen screen;

  public SmartHomeFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd,
      Screen screen, Lights lights) {

    this.amp = amp;
    this.tuner = tuner;
    this.dvd = dvd;
    this.cd = cd;
    this.screen = screen;
    this.lights = lights;

  }

  public void watchMovie(String movie) {
    System.out.println("Get ready to watch a movie...");
    lights.dim(10);
    screen.down();
    amp.on();
    amp.setDvd(dvd);
    amp.setSurroundSound();
    amp.setVolume(5);
    dvd.on();
    dvd.play(movie);
  }


  public void endMovie() {
    System.out.println("Shutting movie theater down...");

    lights.on();
    screen.up();

    amp.off();
    dvd.stop();
    dvd.eject();
    dvd.off();
  }

  public void listenToCd(String cdTitle) {
    System.out.println("Get ready for an audiopile experence...");
    lights.on();
    amp.on();
    amp.setVolume(5);
    amp.setCd(cd);
    amp.setStereoSound();
    cd.on();
    cd.play(cdTitle);
  }

  public void endCd() {
    System.out.println("Shutting down CD...");
    amp.off();
    amp.setCd(cd);
    cd.eject();
    cd.off();
  }

  public void listenToRadio(double frequency) {
    System.out.println("Tuning in the airwaves...");
    tuner.on();
    tuner.setFrequency(frequency);
    amp.on();
    amp.setVolume(5);
    amp.setTuner(tuner);
  }

  public void endRadio() {
    System.out.println("Shutting down the tuner...");
    tuner.off();
    amp.off();
  }
}
