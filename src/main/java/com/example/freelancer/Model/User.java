package com.example.freelancer.Model;

public class User {
    String username,country, description;

    public User(String username, String country, String description) {
        this.username = username;
        this.country = country;
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public User() {
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
