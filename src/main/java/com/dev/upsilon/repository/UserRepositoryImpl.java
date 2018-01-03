package com.dev.upsilon.repository;

import com.dev.upsilon.domain.User;
import com.dev.upsilon.exception.UserAlreadyExistsException;
import org.springframework.context.annotation.Bean;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserRepositoryImpl implements UserRepository {

    public UserRepositoryImpl() {
    }

    @Nullable
    @Override
    public Optional<User> findByUserName(String userName) {
        return null;
    }

    @Override
    public User createUser(User user) throws UserAlreadyExistsException {
        return null;
    }
}
