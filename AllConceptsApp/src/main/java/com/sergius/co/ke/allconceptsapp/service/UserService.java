package com.sergius.co.ke.allconceptsapp.service;

import com.sergius.co.ke.allconceptsapp.entity.User;
public interface UserService {
    User findUserById(Integer userId);
    User findUserByUsername(String username);
}
