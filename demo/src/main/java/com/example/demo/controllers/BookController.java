package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    boolean available = true;

    @GetMapping("/borrow")
    public String borrow(@RequestParam String book) {

        if (available) {
            available = false;
            return "You have borrowed " + book + " successfully.";
        }

        return "The book \"" + book + "\" is currently unavailable.";
    }
}