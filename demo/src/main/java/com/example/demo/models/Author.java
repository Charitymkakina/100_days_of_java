package com.example.demo.models;

public class Author {
     private int id;
    private String name;

    // Empty constructor
    public Author() {
    }

    // Constructor with parameters
    public Author(int id, String name) {
        this.id = id;
        this.name = name;
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
}
