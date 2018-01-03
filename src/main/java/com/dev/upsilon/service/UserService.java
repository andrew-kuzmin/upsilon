package com.dev.upsilon.service;

import com.dev.upsilon.domain.User;
import com.dev.upsilon.exception.UserAlreadyExistsException;
import com.dev.upsilon.exception.UserDoesNotExistException;

public interface UserService {

    User getUserByUserName(String userName);

    User addUser(User User) throws UserAlreadyExistsException;

}
