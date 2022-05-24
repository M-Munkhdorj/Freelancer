package com.example.freelancer.Model;

public class Freelancer {
    String profession, social, diploma, name, email;

    public Freelancer(String profession, String social, String diploma, String name, String email) {
        this.profession = profession;
        this.social = social;
        this.diploma = diploma;
        this.name = name;
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
