package com.example.userservice.service;

import com.example.userservice.model.User;

public interface UserService{

    public User login(User user);

    public User signup(User user);

    public User updateUser(Long id, User user);
}
