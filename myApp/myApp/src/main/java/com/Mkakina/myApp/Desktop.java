package com.Mkakina.myApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    public void compile(){
        System.out.println("Here is your Desktop, Welcome");
    }
}
