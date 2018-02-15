package com.dev.upsilon.domain;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String userName;

    public User() {
    }
}
