package com.example.repository;

import com.example.db.DatabaseConnection;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // works as component annotaion but is a specialized annotation
public class UserRepository {
    private DatabaseConnection db;
    public UserRepository(DatabaseConnection db) {
        this.db = db;
    }

    public List<String> findAll(){
        return db.getUsers();
    }
    public void save(String user){
        db.addUser(user);

    }
}
