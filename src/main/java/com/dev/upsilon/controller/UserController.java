package com.dev.upsilon.controller;

import com.dev.upsilon.dto.UserDTO;
import com.dev.upsilon.entity.User;
import com.dev.upsilon.service.UserService;
import com.dev.upsilon.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

/**
 * @author Andriy Kuzmin
 */

@RestController
@ComponentScan
@RequestMapping(path = "/api")
public class UserController {

    @Autowired
    private final UserService service;

    @Autowired
    public UserController(UserServiceImpl service) {
        this.service = service;
    }

    @GetMapping(path = "/user", produces = "application/json")
    public User getUser(@RequestParam("userName") String userName) {
        return service.getUserByUserName(userName);
    }

    @PostMapping(path = "/user", produces = "application/json", consumes = "application/json")
    @ResponseBody
    public UserDTO addUser(@RequestBody User user) {

        return service.addUser(user);
    }

}
