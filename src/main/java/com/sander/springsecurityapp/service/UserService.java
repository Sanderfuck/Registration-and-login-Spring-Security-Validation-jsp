package com.sander.springsecurityapp.service;


import com.sander.springsecurityapp.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
