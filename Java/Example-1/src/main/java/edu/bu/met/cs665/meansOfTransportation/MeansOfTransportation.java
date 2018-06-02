package edu.bu.met.cs665.meansOfTransportation;

import edu.bu.met.cs665.behaviors.BrakeBehavior;

public abstract class MeansOfTransportation {

	protected BrakeBehavior brakeBehavior;

    public void applyBrake() {
        brakeBehavior.brake();
    }

    public void setBrakeBehavior(final BrakeBehavior brakeType) {
        this.brakeBehavior = brakeType;
    }

}
