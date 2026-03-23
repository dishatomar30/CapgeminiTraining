package com.example.db;

import java.util.List;
import java.util.ArrayList;

public class DatabaseConnection {
    private List <String> users;
    public void init(){
        users= new ArrayList<String>();
        System.out.println("DB Connected (Simulated)");

    }
    public  List<String> getUsers(){
        return users;
    }
    public  void addUser(String user){
        users.add(user);
    }
    public void cleanup(){
        System.out.println("DB Disconnected (simulated");
    }
}
