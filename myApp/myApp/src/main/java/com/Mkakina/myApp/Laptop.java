package com.Mkakina.myApp;

import org.springframework.stereotype.Component;

@Component // The object is now visible in the spring container.
public class Laptop implements Computer {
    public void compile(){
        System.out.println("Still learning SpringBoot");
    }
}
