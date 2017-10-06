package com.dev.upsilon.service;

import com.dev.upsilon.domain.User;

import java.util.Optional;

public interface UserService {

    Iterable getAllUsers();

    Optional getUserById(String id);

    User addUser(User User);

    User updateUser(User User);

    void removeUser(String id);
}
