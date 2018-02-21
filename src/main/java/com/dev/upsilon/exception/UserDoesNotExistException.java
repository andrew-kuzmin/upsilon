package com.dev.upsilon.exception;

/**
 * @author Andriy Kuzmin
 */

public class UserDoesNotExistException extends RuntimeException {

    public UserDoesNotExistException(String message) {
        super(message);
    }

    public UserDoesNotExistException() {
        super("A user with the given username does not exist");
    }
}
