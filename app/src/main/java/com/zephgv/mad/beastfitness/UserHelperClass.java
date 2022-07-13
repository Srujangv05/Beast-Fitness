package com.zephgv.mad.beastfitness;

public class UserHelperClass {

    String name,email,contact,weight,height;

    public UserHelperClass(String name, String email, String contact, String weight, String height) {
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.weight = weight;
        this.height = height;
    }

    public UserHelperClass() {
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
