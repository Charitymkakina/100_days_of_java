package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    boolean available = true;

@GetMapping("/borrow")
public String borrowBook(){
    if (available){
        available = false;
        return "You have sucessfully borroed the book!";
    }
    return "Sorry! The book is currently not available";
}

}
