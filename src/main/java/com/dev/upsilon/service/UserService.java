package com.dev.upsilon.service;

import com.dev.upsilon.dto.UserDTO;
import com.dev.upsilon.entity.User;
import com.dev.upsilon.exception.UserAlreadyExistsException;
import com.dev.upsilon.exception.UserDoesNotExistException;

/**
 * @author Andriy Kuzmin
 */

public interface UserService {

    UserDTO getUserByUserName(String userName) throws UserDoesNotExistException;

    UserDTO addUser(User User) throws UserAlreadyExistsException;

}
