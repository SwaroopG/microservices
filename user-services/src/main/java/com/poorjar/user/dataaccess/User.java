package com.poorjar.user.dataaccess;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable {
    private static final long serialVersionUID = -5215603105951570953L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstname;
    private String lastname;
    private String email;

    protected User() {}

    public User(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    /**
     * @return the id
     */
    public final long getId() {
        return id;
    }

    /**
     * @return the firstname
     */
    public final String getFirstname() {
        return firstname;
    }

    /**
     * @return the lastname
     */
    public final String getLastname() {
        return lastname;
    }

    /**
     * @return the email
     */
    public final String getEmail() {
        return email;
    }

    @SuppressWarnings("boxing")
    @Override
    public String toString() {
        return String.format("User[id=%d, firstName='%s', lastname='%s', email='%s']", id, firstname, lastname, email);
    }
}