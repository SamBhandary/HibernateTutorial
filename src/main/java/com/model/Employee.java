package com.model;



import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;


@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class Employee {

    @Id @GeneratedValue
    private int empId;
    private String empName;
    @ElementCollection
    @JoinTable(name="EMP_ADDRESS",
            joinColumns = @JoinColumn(name = "EMP_ID")
    )
    @GenericGenerator(name = "hilo-gen", strategy = "hilo")
    @CollectionId(columns ={@Column(name = "ADDRESS_ID")} , type = @Type(type = "long"), generator = "hilo-gen")
    private Collection<Address> address = new ArrayList<Address>();



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

    public Collection<Address> getAddress() {
        return address;
    }

    public void setAddress(final Collection<Address> address) {
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
