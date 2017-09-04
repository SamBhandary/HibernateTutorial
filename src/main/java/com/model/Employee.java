package com.model;


import javax.persistence.*;


@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class Employee {

    @Id @GeneratedValue
    private int empId;
    private String empName;
    @OneToOne
    private Vehicle vehicle;



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

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
