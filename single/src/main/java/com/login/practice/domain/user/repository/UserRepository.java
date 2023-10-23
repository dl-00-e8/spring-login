package com.login.practice.domain.user.repository;

import com.login.practice.domain.user.entity.User;
import com.login.practice.domain.user.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmailAndRole(String email, UserRole role);
}
