package edu.bu.met.cs665.meansoftransportation;

public class SpeedBoat extends Ship {

  // This class represents a high speed boat that can go with a higher speed of 35 miles per hour
  // equal to 30 Knots.
  public SpeedBoat() {
    super();
    this.name = "Speed Boat";
  }

  @Override
  public boolean setSpeed(double speed) {
    if (speed < 35) {
      this.speed = speed;
      System.out.println("Speed is set to " + this.speed);
      return true;
    } else {
      this.speed = 35d;
      System.out.println("This ship can not move with higher speed than 35 miles per hour. ");
      System.out.println("Speed is set to " + this.speed);
      return false;
    }
  }

}
