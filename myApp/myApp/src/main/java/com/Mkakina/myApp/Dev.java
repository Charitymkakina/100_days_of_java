package com.Mkakina.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Shows this is the class i want to manage

public class Dev { //Managed bean therfore creates an object for you in the container

   @Autowired // connecting dev and laptop. (Field Injection)
    private Computer comp;

    // public Dev(Laptop laptop){ // Constructor Injection
       // this.laptop = laptop;
    //}    
      //  @Autowired
      //   public void setLaptop(Laptop laptop){ // setter injection
      //      this.laptop = laptop;
      //   }
    public void build(){

        comp.compile();
        System.out.println("Working on building my Java skills");
    }
}
