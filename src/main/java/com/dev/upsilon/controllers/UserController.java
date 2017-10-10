package com.dev.upsilon.controllers;

import com.dev.upsilon.domain.User;
import com.dev.upsilon.exception.UserAlreadyExistsException;
import com.dev.upsilon.exception.UserDoesNotExistException;
import com.dev.upsilon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping(path = "/user", produces = "application/json")
    public User getUser(@RequestParam("userName") String userName) throws UserDoesNotExistException {
        return service.getUserByUserName(userName);
    }

    @PostMapping(path = "/user", produces = "application/json")
    public User addUser(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
                        @RequestParam("userName") String userName, @RequestParam("password") String password) throws UserAlreadyExistsException {
        User newUser = new User(firstName, lastName, userName, password);
        return service.addUser(newUser);
    }

}
