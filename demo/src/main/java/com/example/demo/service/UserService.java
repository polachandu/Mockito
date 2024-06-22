package com.example.demo.service;

import com.example.demo.entity.CustomerProfile;

public interface UserService {
    void addUser(CustomerProfile customerProfile);
    void deleteUser(CustomerProfile customerProfile);
    CustomerProfile getUser(int cusomerAccountId);
}
