package com.springsecurity.SpringSecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.SpringSecurity.Model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String name);
}
