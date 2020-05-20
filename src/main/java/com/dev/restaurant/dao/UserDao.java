package com.dev.restaurant.dao;

import com.dev.restaurant.model.User;

import java.util.UUID;

public interface UserDao {
    int insertUser(UUID id, User user);
    default int insertUser(User user) {
        UUID id = UUID.randomUUID();
        return insertUser(id,user);
    }

}
