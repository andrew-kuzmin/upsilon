package com.dev.upsilon.repository;

import com.dev.upsilon.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Andriy Kuzmin
 */

public interface RoleRepository extends JpaRepository<Role, Long> {
}
