package com.dev.upsilon.repositories;

import com.dev.upsilon.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {

    Optional<User> findByUserName(String userName);
}