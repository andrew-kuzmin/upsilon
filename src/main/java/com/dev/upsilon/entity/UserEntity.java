package com.dev.upsilon.entity;

import com.dev.upsilon.domain.User;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data()
//@EqualsAndHashCode(callSuper = true)
public class UserEntity extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String userName;
    private String plainTextPassword;

    private String hashedPassword;

    public UserEntity() {
    }

    public UserEntity(UserEntity user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.userName = user.getUserName();
        this.plainTextPassword = user.plainTextPassword;
        this.hashedPassword = String.valueOf(user.plainTextPassword.hashCode());
    }
}


