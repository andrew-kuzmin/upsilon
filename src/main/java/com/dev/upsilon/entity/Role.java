package com.dev.upsilon.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Andriy Kuzmin
 */

@Entity
@Table(name = "role")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

}
