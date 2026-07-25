package com.example.demo.controllers; 
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {

    boolean available = true;

    @GetMapping("/book")
    public String getBook(@RequestParam String book){
        if(available){
            return book + " is available.";
        }

        return book + " is currently borrowed.";
    }

    @PostMapping("/borrow")
    public String borrowBook(@RequestParam String book){

        if(available){
            available = false;
            return "You have borrowed " + book;
        }

        return book + " is currently unavailable.";
    }

    @PutMapping("/return")
    public String returnBook(@RequestParam String book){

        available = true;
        return "Thank you for returning " + book;
    }

    @DeleteMapping("/delete")
    public String deleteBook(@RequestParam String book){

        return book + " has been removed from the library.";
    }
}