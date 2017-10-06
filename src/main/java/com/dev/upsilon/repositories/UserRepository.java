package com.dev.upsilon.repositories;

import com.dev.upsilon.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
