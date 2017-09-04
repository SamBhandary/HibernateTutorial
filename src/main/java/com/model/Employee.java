package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

    @Id @GeneratedValue
    private int empId;
    private String empName;
    private int empPhone;

    public Employee(){}

    public Employee(String name, int phoneNum) {
        this.empName = name;
        this.empPhone = phoneNum;
    }

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

    public int getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(final int empPhone) {
        this.empPhone = empPhone;
    }
}
