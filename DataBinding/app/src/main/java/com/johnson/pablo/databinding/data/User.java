package com.johnson.pablo.databinding.data;

/**
 * Created by Pablo on 18/10/15.
 */
public class User {
    private final String firstName;
    private final String lastName;
    private final boolean isSubscribed;
    private final String country;

    public User(String firstName, String lastName, boolean isSubscribed, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isSubscribed = isSubscribed;
        this.country = country;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    public String getCountry() {
        return country;
    }
}