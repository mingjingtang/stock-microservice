package com.example.userservice.controller;

import com.example.userservice.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private List<User> userList = Arrays.asList(
            new User(1L, "mingjing", "123"),
            new User(2L, "mochi", "abc")
    );

    @GetMapping("/list")
    public List<User> listUsers(){
        return userList;
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable Long userId) {
        return userList.stream().filter(b -> b.getId().equals(userId)).findFirst().orElse(null);
    }

}
