package com.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;


@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class Employee {

    @Id @GeneratedValue
    private int empId;
    private String empName;
    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();



    public int getEmpId() {
        return empId;
    }

    public void setEmpId(final int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(final String empName) {
        this.empName = empName;
    }

    public Collection<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(final Collection<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }
}
