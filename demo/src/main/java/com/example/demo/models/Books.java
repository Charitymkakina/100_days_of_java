package com.example.demo.models;

public class Books {
    private int id;
    private String title;
    private Author author;

    // Empty constructor
    public Books() {
    }

    // Constructor
    public Books(int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for author
    public Author getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(Author author) {
        this.author = author;
    }
}
