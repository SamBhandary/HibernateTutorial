package com.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("car")
public class FourWeeler extends Vehicle {

    private String stearingWheel;

    public String getStearingWheel() {
        return stearingWheel;
    }

    public void setStearingWheel(final String stearingWheel) {
        this.stearingWheel = stearingWheel;
    }
}
