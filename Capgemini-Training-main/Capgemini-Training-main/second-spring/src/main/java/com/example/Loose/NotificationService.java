//SPRING PROMOTES LOOSE COUPLING

// for implementing loose coupling interface will be used
//assign object of particular class using the common reference of interface for all classes
// Strategy design pattern : dont need to  change much in design
package com.example.Loose;

public interface NotificationService {
    void send(String message);
}




