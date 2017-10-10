package com.dev.upsilon.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;
    private String firstName;
    private String lastName;
    private String userName;
    @JsonIgnore
    private String planeTextPassword;
    @JsonIgnore
    private String hashedPassword;

    public User() {  }

    public User(String firstName, String lastName, String userName, String planeTextPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.planeTextPassword = planeTextPassword;
        this.hashedPassword = String.valueOf(planeTextPassword.hashCode());
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPlaneTextPassword() {
        return planeTextPassword;
    }

    public void setPlaneTextPassword(String planeTextPassword) {
        this.planeTextPassword = planeTextPassword;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }
}
