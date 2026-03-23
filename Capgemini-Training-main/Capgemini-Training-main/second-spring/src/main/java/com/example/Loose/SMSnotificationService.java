package com.example.Loose;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary // indicates that this bean will be given preference when multiple beans are encontered
public class SMSnotificationService implements NotificationService {

    public void send(String message) {
        //NotificationService.super.send(message);
        System.out.println("SMS notification:" +message);
    }
}
