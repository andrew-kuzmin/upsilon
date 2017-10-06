package com.dev.upsilon.controllers;

import com.dev.upsilon.domain.User;
import com.dev.upsilon.service.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    private UserServiceImpl service = new UserServiceImpl();

    @GetMapping(path = "/hello")
    public String index() {
        return "HELLO BRATAN";
    }

    @GetMapping(path = "/test", produces = "application/json")
    @ResponseBody()
    public User testUser(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
                         @RequestParam("userName") String userName){
        User newUser = new User(firstName, lastName, userName);
        return service.addUser(newUser);
    }

}
