package com.Mkakina.myApp;

import org.springframework.stereotype.Component;

@Component // Shows this is the class i want to manage

public class Dev { //Managed bean therfore creates an object for you in the container
    public void build(){
        System.out.println("Working on building my Java skills");
    }
}
