package com.dev.upsilon.repository;

import com.dev.upsilon.domain.User;
import com.dev.upsilon.exception.UserAlreadyExistsException;
import org.springframework.lang.Nullable;

import java.util.Optional;

public interface UserRepository{

    @Nullable Optional<User> findByUserName(String userName);

    User createUser(User user) throws UserAlreadyExistsException;
}