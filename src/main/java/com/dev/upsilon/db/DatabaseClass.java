package com.dev.upsilon.db;

import com.dev.upsilon.model.User;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {

    private static Map<String, User> users = new HashMap<>();

    public static Map<String, User> getUsers() {
        return users;
    }

}
