package com.inactcode.jwtdemo.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {
    @Override
    Optional<User> findById(String email);
}
