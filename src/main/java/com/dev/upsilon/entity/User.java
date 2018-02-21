package com.dev.upsilon.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Andriy Kuzmin
 */

@Entity
@Table(name = "user")
@Data()
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    @Column(unique = true, nullable = false)
    private String userName;

    private String password;

}


