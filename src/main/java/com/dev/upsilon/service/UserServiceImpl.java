package com.dev.upsilon.service;

import com.dev.upsilon.dto.UserDTO;
import com.dev.upsilon.entity.User;
import com.dev.upsilon.exception.UserAlreadyExistsException;
import com.dev.upsilon.exception.UserDoesNotExistException;
import com.dev.upsilon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Optional;

/**
 * @author Andriy Kuzmin
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO getUserByUserName(@NotNull String userName) throws UserDoesNotExistException {
        Optional<User> userOptional = userRepository.findByUserName(userName);

        if (userOptional.isPresent()) {
            return new UserDTO(userOptional.get());
        } else {
            throw new UserDoesNotExistException();
        }
    }

    @Override
    public UserDTO addUser(User accountUser) throws UserAlreadyExistsException {

        if (userRepository.existsByUserName(accountUser.getUserName())) {
            throw new UserAlreadyExistsException();
        }

        User user = new User();
        user.setFirstName(accountUser.getFirstName());
        user.setLastName(accountUser.getLastName());
        user.setUserName(accountUser.getUserName());
        user.setPassword(passwordEncoder.encode(accountUser.getPassword()));

        User savedUser = userRepository.save(user);

        return new UserDTO(savedUser);
    }

}
