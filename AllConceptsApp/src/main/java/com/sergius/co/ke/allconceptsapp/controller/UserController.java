package com.sergius.co.ke.allconceptsapp.controller;

import com.sergius.co.ke.allconceptsapp.entity.User;
import com.sergius.co.ke.allconceptsapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private final UserService userService;
    @GetMapping("/id/{id}")
    public User findUserById(@PathVariable("id") Integer id) {
        return userService.findUserById(id);
    }

    @GetMapping("/username/{username}")
    public User findUserByUsername(@PathVariable("username") String username){
        return userService.findUserByUsername(username);
    }
}

