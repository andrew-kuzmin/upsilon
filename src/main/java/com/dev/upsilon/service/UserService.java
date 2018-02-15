package com.dev.upsilon.service;

import com.dev.upsilon.dto.UserDTO;
import com.dev.upsilon.entity.UserEntity;
import com.dev.upsilon.exception.UserAlreadyExistsException;

public interface UserService {

    UserDTO getUserByUserName(String userName);

    UserDTO addUser(UserEntity User) throws UserAlreadyExistsException;

}
