package com.example.demo;

import com.example.Loose.NotificationService;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;


public class LifecycleBean {
    private NotificationService  notificationService ;


    public LifecycleBean(NotificationService notificationService) {
        System.out.println("Constructor called : Dependency Injected ");
        this.notificationService = notificationService;
    }
    public void init(){
        System.out.println("init called:Bean Initialized");
        notificationService.send("Hello from init()");
    }
    public void performTask(){
        System.out.println("ready for use ");
    }
     public void cleanup(){
         System.out.println("cleanup is being called ");
     }
}
