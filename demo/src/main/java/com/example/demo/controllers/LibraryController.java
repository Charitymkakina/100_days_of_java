package com.example.demo.controllers;

import com.example.demo.services.LibraryService;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.models.Author;
import com.example.demo.models.Books;
@RestController
@RequestMapping("/library")
public class LibraryController {
    private final com.example.demo.services.LibraryService libraryService;
    private List<Books> books = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;

        Author author1 = new Author(1, "George Orwell");
        Author author2 = new Author(2, "J.K. Rowling");

        authors.add(author1);
        authors.add(author2);

        books.add(new Books(101, "1984", author1));
        books.add(new Books(102, "Harry Potter", author2));

    }

    @GetMapping("/books")
    public List<Books> getBooks() {
        return books;
    }
     @GetMapping("/authors")
    public List<Author> getAuthors() {
        return authors;
    }

    @PostMapping("/borrow")
public String borrowBook(@RequestParam String title){

    return libraryService.borrowBook(title);

}

    @PutMapping("/return")
    public String returnBook(@RequestParam String title) {

        return "You have returned \"" + title + "\"";
    }

    @DeleteMapping("/remove")
    public String removeBook(@RequestParam String title) {

        return "\"" + title + "\" has been removed from the library.";
    }

}