package com.model;

import javax.persistence.*;

@Entity
@Table(name = "VEHICLE_DETAILS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "VEHICLE_TYPE",
discriminatorType = DiscriminatorType.STRING)
public class Vehicle {

    @Id
    @GeneratedValue
    private int vehicleId;
    private String vehicleName;



    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(final int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(final String vehicleName) {
        this.vehicleName = vehicleName;
    }

}
