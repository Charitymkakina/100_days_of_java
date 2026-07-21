package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class OrderController {
    @GetMapping("/order") //when someone visits /order the method is going to be executed.
    public String order(@RequestParam String item){ // Springboot automatically picks the item and pass it to the URL.
        return "Your Order for " + item + " has been received ";
    }
}
