package com.dev.upsilon.service;

import com.dev.upsilon.db.DatabaseClass;
import com.dev.upsilon.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserService {

    private Map<String, User> usersMap = DatabaseClass.getUsers();

    public List<User> getAllUsers(){
        return new ArrayList<User>(usersMap.values());
    }

    public User getUserById(String id){
        return new User();
    }

    public User addUser(User User) {
        User.setId(String.valueOf(usersMap.size() + 1));
        usersMap.put(User.getId(), User);
        return User;
    }

    public User updateUser(User User) {
        usersMap.put(User.getId(), User);
        return User;
    }

    public User removeUser(String id) {
        return usersMap.remove(id);
    }


}
