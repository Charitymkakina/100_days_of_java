package com.Mkakina.myApp;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // The object is now visible in the spring container.
//@Primary // to avoid the confusion of the 2 beans created in the container

public class Laptop implements Computer {
    public void compile(){
        System.out.println("Still learning SpringBoot");
    }
}
