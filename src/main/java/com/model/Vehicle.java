package com.model;

import javax.persistence.*;

@Entity
@Table(name = "VEHICLE_DETAILS")
public class Vehicle {

    @Id
    @GeneratedValue
    private int vehicleId;
    private String vehicleName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;



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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(final Employee employee) {
        this.employee = employee;
    }
}
