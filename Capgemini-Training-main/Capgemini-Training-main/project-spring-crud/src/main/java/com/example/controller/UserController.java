package com.example.controller;

import org.springframework.stereotype.Controller;
import com.example.service.UserService;

import java.util.List;


// works as entry point
@Controller
public class UserController {//interacts with service layer,
    // and then servicelayer  talks  with repositorylayer to connect with data base
    // anyone can come and crate user

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void CreateUser(String name){
        userService.addUser(name);
        System.out.println("User added"+name);

    }
    public  void ListUsers(){
        List<String> users = userService.getAllUsers();
        System.out.println("all users"+users);
    }
}
