package com.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class Employee {

    @Id @GeneratedValue
    private int empId;
    private String empName;
    @ElementCollection
    private Set<Address> address = new HashSet<Address>();



    private int empPhone;
    private String dob;



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

    public Set<Address> getAddress() {
        return address;
    }

    public void setAddress(final Set<Address> address) {
        this.address = address;
    }

    public int getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(final int empPhone) {
        this.empPhone = empPhone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(final String dob) {
        this.dob = dob;
    }
}
