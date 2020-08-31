package com.example.userservice.service;

import com.example.userservice.model.User;
import com.example.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService{

    @Autowired
    UserRepository userRepository;

    public User login(String email, String password){
        return userRepository.login(email, password);
    }

    public User signup(User user){
        userRepository.save(user);
        return userRepository.findByEmail(user.getEmail());
    }



}
