package com.example.userservice.service;

import com.example.userservice.model.User;
import com.example.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User login(User user) {
        return userRepository.login(user.getEmail(), user.getPassword());
    }

    @Override
    public User signup(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user){
        User targetUser = userRepository.findById(id).get();
        targetUser.setEmail(user.getEmail());
        targetUser.setPassword(user.getPassword());
        targetUser.setUsername(user.getUsername());
        targetUser.setBalance(user.getBalance());
        return userRepository.save(targetUser);
    }
}
