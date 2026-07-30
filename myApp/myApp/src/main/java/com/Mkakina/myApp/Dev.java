package com.Mkakina.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Shows this is the class i want to manage

public class Dev { //Managed bean therfore creates an object for you in the container

    @Autowired // connecting dev and laptop.
    private Laptop laptop;

    public void build(){

        laptop.compile();
        System.out.println("Working on building my Java skills");
    }
}
