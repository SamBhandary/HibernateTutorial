package com.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable // used for value type Object.
public class Address {

    //A value type object is an object inside an entity which provides meaning to the entity.
    // An entity is an object which has meaning to the business alone.
    //value object don't have any meaning alone until they are associated with Entity

    private String street;
    @Column(name = "CITY_NAME")
    private String city;
    private String state;
    private String pincode;

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(final String pincode) {
        this.pincode = pincode;
    }
}
