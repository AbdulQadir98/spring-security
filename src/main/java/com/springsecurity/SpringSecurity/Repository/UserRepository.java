package com.springsecurity.SpringSecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.SpringSecurity.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
