package com.dev.upsilon.web.util;

import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * @author Andriy Kuzmin
 */

@Data()
public class GenericResponse {

    private String message;
    private HttpStatus status;

    public GenericResponse(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }

}
