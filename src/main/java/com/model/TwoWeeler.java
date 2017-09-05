package com.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("bike")
public class TwoWeeler extends Vehicle {

    private String stearingHandle;

    public String getStearingHandle() {
        return stearingHandle;
    }

    public void setStearingHandle(final String stearingHandle) {
        this.stearingHandle = stearingHandle;
    }
}
