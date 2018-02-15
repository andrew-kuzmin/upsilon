package com.dev.upsilon.service;

import com.dev.upsilon.dto.UserDTO;
import com.dev.upsilon.entity.UserEntity;
import com.dev.upsilon.exception.UserAlreadyExistsException;
import com.dev.upsilon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO getUserByUserName(@NotNull String userName) {
        Optional<UserEntity> userOptional = userRepository.findByUserName(userName);
        return userOptional.map(UserDTO::new).orElse(null);
    }

    @Override
    public UserDTO addUser(UserEntity user) throws UserAlreadyExistsException {
        UserEntity userEntity = userRepository.save(new UserEntity(user));
        return new UserDTO(userEntity);
    }

    public String hashPassword(String password) {
        return null;
    }
}
