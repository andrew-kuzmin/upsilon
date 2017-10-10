package com.dev.upsilon.service;

import com.dev.upsilon.domain.User;
import com.dev.upsilon.exception.UserAlreadyExistsException;
import com.dev.upsilon.exception.UserDoesNotExistException;

public interface UserService {

    Iterable getAllUsers();

    User getUserByUserName(String userName) throws UserDoesNotExistException;

    User addUser(User User) throws UserAlreadyExistsException;

    User updateUser(User User);

    void removeUser(String id);
}
