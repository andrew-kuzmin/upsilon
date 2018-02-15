package com.dev.upsilon.repository;

import com.dev.upsilon.entity.UserEntity;
import com.dev.upsilon.exception.UserAlreadyExistsException;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    Optional<UserEntity> findByUserName(String userName);

    UserEntity save(UserEntity user) throws UserAlreadyExistsException;
}