package com.springsecurity.SpringSecurity.Service;

import java.util.List;

import com.springsecurity.SpringSecurity.Model.Role;
import com.springsecurity.SpringSecurity.Model.User;

public interface UserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUserss();
}
