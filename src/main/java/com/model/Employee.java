package com.model;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class Employee {

    @Id @GeneratedValue
    private int empId;
    private String empName;
    @Embedded
    private Address address;

    //Overriding Attributes of Embedded objects helps create multiple instance of object to be used in same entity.
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="street", column = @Column(name = "OFFICE_STREET")),
            @AttributeOverride(name="city", column = @Column(name = "OFFICE_CITY")),
            @AttributeOverride(name="state", column = @Column(name = "OFFICE_STATE")),
            @AttributeOverride(name="pincode", column = @Column(name = "OFFICE_PIN"))
    })
    private Address officeAddress;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(final Address officeAddress) {
        this.officeAddress = officeAddress;
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
