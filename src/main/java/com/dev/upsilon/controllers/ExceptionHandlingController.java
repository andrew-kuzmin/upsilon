package com.dev.upsilon.controllers;

import com.dev.upsilon.exception.UserAlreadyExistsException;
import com.dev.upsilon.exception.UserDoesNotExistException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlingController {

    @ResponseStatus(value = HttpStatus.CONFLICT, reason = "A user with the given username already exists")
    @ExceptionHandler(UserAlreadyExistsException.class)
    public void conflict() { }

    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "A user with the given username doesn't exist")
    @ExceptionHandler(UserDoesNotExistException.class)
    public void userNotFound() { }
}
