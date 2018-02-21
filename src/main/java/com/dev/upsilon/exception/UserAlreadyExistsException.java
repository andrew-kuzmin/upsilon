package com.dev.upsilon.exception;

/**
 * @author Andriy Kuzmin
 */

public class UserAlreadyExistsException extends RuntimeException {

    public UserAlreadyExistsException(String message) {
        super(message);
    }

    public UserAlreadyExistsException() {
        super("A user with the given username already exists");
    }
}
