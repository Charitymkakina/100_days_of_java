package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController{

    @GetMapping("/") // maps a url to a java method
    public String Hello(){
        return "Hello";
    }
}