package com.dev.upsilon.controller;

import com.dev.upsilon.domain.User;
import com.dev.upsilon.dto.UserDTO;
import com.dev.upsilon.entity.UserEntity;
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

    @PostMapping(path = "/user", produces = "application/json", consumes = "application/json")
    @ResponseBody
    public UserDTO addUser(@RequestBody UserEntity user) {

        return service.addUser(user);
    }

}
