package com.dev.upsilon.service;

import com.dev.upsilon.db.DatabaseClass;
import com.dev.upsilon.model.User;

import java.util.List;
import java.util.Map;

public class UserService {

    private Map<String, User> usersMap = DatabaseClass.getUsers();

    public List<User> getAllUsers(){
        return null;
    }

    public User getUserById(String id){
        return new User();
    }
}
