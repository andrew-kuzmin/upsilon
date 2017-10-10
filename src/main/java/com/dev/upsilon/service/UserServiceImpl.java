package com.dev.upsilon.service;

import com.dev.upsilon.domain.User;
import com.dev.upsilon.exception.UserAlreadyExistsException;
import com.dev.upsilon.exception.UserDoesNotExistException;
import com.dev.upsilon.repositories.UserRepository;
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
    public Iterable getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByUserName(@NotNull String userName) throws UserDoesNotExistException {
        Optional<User> userOptional = userRepository.findByUserName(userName);
        if (userOptional.isPresent()) {
            return userOptional.get();
        }
        throw new UserDoesNotExistException();
    }

    @Override
    public User addUser(@NotNull User user) throws UserAlreadyExistsException {
        if (!userRepository.findByUserName(user.getUserName()).isPresent()) {
            return userRepository.save(user);
        }
        throw new UserAlreadyExistsException();
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void removeUser(String id) {
        userRepository.deleteById(id);
    }
}
