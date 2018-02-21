package com.dev.upsilon.exception;

import com.dev.upsilon.web.util.GenericResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Andriy Kuzmin
 */

@ControllerAdvice
public class RestResponseEntityExceptionHandler {

    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<GenericResponse> handleUserAlreadyExist() {
        final GenericResponse bodyOfResponse = new GenericResponse("A user with the given username already exists", HttpStatus.CONFLICT);
        return new ResponseEntity<>(bodyOfResponse, HttpStatus.CONFLICT);
    }

}
