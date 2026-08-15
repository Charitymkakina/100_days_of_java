package com.mkakina.Simplewebapp.contoller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping ("/")
    public String greet(){
        return "Welcome to my Web App building journey";
    }
    @RequestMapping ("/About")
    public String About(){
        return "I am building my Web App step by step" ;
    }
}
