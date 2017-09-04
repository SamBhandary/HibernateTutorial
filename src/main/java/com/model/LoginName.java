package com.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class LoginName implements Serializable{

    private int id;
    private String name;
    private String lastname;

    public LoginName(final int id, final String name, final String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }
}
