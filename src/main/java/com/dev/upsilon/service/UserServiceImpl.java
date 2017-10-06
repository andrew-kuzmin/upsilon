package com.dev.upsilon.service;

import com.dev.upsilon.domain.User;
import com.dev.upsilon.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional getUserById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
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
