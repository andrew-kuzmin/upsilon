package com.dev.upsilon.exception;

public class UserAlreadyExistsException extends RuntimeException {

    public UserAlreadyExistsException() {
        super("A user with the given username already exists");
    }
}
