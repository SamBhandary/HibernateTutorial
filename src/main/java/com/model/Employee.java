package com.model;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class Employee {

    //Natural and Surrogate Primary Key
    //If there is a business for a primary key then that is natural key eg, a Employee Id in employee table
    //IF there is no any business requirement for a primary key but just to show the uniqueness then it is surrogate key
    //eg, a serial number for the column can be surrogate key if it's sole purpose is just to show the number
    //@GeneratedValue is for surrogate key
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
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
