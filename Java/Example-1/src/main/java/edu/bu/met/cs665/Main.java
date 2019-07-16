package edu.bu.met.cs665;

import edu.bu.met.cs665.behaviors.HydraulicBrake;
import edu.bu.met.cs665.meansoftransportation.EconomyCar;
import edu.bu.met.cs665.meansoftransportation.FighterJet;
import edu.bu.met.cs665.meansoftransportation.FullSizeSuv;
import edu.bu.met.cs665.meansoftransportation.MeansOfTransportation;
import edu.bu.met.cs665.meansoftransportation.SpeedBoat;

public class Main {

  /**
   * Here we execute some examples and illustrate the strategy pattern.
   * 
   * @param args not used.
   */
  public static void main(String[] args) {

    System.out.println("Economy Car \n");
    MeansOfTransportation economyCar = new EconomyCar();
    economyCar.setSpeed(50d); // start running with speed 50 MPH
    economyCar.applyBrake(20d); // apply the brakes and reduce the speed to 20 MPH
    economyCar.setSpeed(200); // lets go 200 MPH with an economy car.
    economyCar.applyFullBrake(); // apply the full brake

    System.out.println("\n\n ############## \n\n");

    // Create a SUV Vehicle
    System.out.println("SUV \n");
    MeansOfTransportation suvCar = new FullSizeSuv();
    suvCar.setSpeed(120d); // run with 120 MPH
    suvCar.applyBrake(10d); // This will invoke class "BrakeWithABS" and reduces the speed to 10 MPH

    // Here we set the brake behavior dynamically and reduces the speed to 10 MPH
    suvCar.setBrakeBehavior(new HydraulicBrake());
    suvCar.applyBrake(10d);
    suvCar.applyFullBrake(); // apply the full brake

    System.out.println("\n\n ############## \n\n");
    System.out.println("FighterJet \n");

    MeansOfTransportation speedBoat = new SpeedBoat();
    speedBoat.setSpeed(60d);
    // braking
    speedBoat.applyFullBrake();

    System.out.println("\n\n ############## \n\n");
    System.out.println("SpeedBoat \n");

    MeansOfTransportation fighterJet = new FighterJet();
    // fly ...
    fighterJet.setSpeed(600d);

    // landing ...
    fighterJet.applyBrake(50d);
    fighterJet.applyFullBrake();

  }

}
