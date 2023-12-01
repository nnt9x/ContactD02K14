package com.example.contactd02k14.model;

public class Contact {
    private int id;
    private String name;
    private String email;
    private String phone;

    private String imageUrl;

    public Contact() {
    }

    public Contact(String name, String email, String phone, String imageUrl) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.imageUrl = imageUrl;
    }

    public Contact(int id, String name, String email, String phone, String imageUrl) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
