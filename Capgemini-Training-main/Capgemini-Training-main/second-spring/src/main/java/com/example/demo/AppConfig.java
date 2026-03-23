package com.example.demo;

import com.example.Loose.NotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration// class in which configurations is defined
@ComponentScan(basePackages = "com.example")// tells spring that this in package  it needs to scan for all components
public class AppConfig {

    /* we have such classes where we cannot modify ..which we havent made and are from libraries
       there we cannot use component annotation  so we make configuration class and define a method inside it
       ..this method will work as creating a object bean which spring will manage and return the object of that class
       and this is only the difference between component and bean annotation 
     */
    @Bean(initMethod="init", destroyMethod= "cleanup")
    public LifecycleBean lifecycleBean(NotificationService notificationService){
        return new LifecycleBean(notificationService);




}}
