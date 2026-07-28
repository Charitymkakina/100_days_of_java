package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Author;
import com.example.demo.models.Books;

@Service
public class LibraryService {

    private List<Books> books = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();

    // Constructor
    public LibraryService() {

        Author author1 = new Author(1, "George Orwell");
        Author author2 = new Author(2, "J.K. Rowling");

        authors.add(author1);
        authors.add(author2);

        books.add(new Books(101, "1984", author1));
        books.add(new Books(102, "Harry Potter", author2));
    }

    public String borrowBook(String title) {
        return "You have borrowed \"" + title + "\" successfully.";
    }
}