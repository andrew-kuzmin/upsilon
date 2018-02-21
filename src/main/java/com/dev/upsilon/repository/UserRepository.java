package com.dev.upsilon.repository;

import com.dev.upsilon.entity.User;
import com.dev.upsilon.exception.UserAlreadyExistsException;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author Andriy Kuzmin
 */

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByUserName(String userName);

    User save(User user) throws UserAlreadyExistsException;

    Boolean existsByUserName(String userName);

}