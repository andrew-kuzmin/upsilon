package com.dev.upsilon.service;

import com.dev.upsilon.domain.User;
import com.dev.upsilon.exception.UserAlreadyExistsException;
import com.dev.upsilon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserByUserName(@NotNull String userName) {
        Optional<User> userOptional = userRepository.findByUserName(userName);
        return userOptional.orElse(null);
    }

    @Override
    public User addUser(@NotNull User user) throws UserAlreadyExistsException {
        return null;
    }

    public String hashPassword(String password) {
        return null;
    }
}
