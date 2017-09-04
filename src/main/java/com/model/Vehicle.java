package com.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "VEHICLE_DETAILS")
public class Vehicle {

    @Id
    @GeneratedValue
    private int vehicleId;
    private String vehicleName;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "vehicle")
    private Collection<Employee> employee  = new ArrayList<Employee>();



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

    public Collection<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(final Collection<Employee> employee) {
        this.employee = employee;
    }
}
