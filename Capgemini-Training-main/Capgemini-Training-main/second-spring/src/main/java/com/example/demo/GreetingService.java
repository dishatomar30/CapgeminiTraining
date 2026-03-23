package com.example.demo;

import org.springframework.stereotype.Component;

@Component ("myBean")//annotation  by which a class can be declared as to tell spring  to manage bean from which class
public class GreetingService {
    public void sayHello(){
        System.out.println("Hello from Spring");
    }
}
