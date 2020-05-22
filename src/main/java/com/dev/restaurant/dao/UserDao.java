package com.dev.restaurant.dao;

import com.dev.restaurant.model.User;

import java.util.List;
import java.util.UUID;

public interface UserDao {
    int insertUser(UUID id, String type, User user);
    //insert with random id, but type set in service
    default int insertUser(String type, User user) {
        UUID id = UUID.randomUUID();
        return insertUser(id, type, user);
    }
    //TODO think what is default user type
    default int insertUser(User user) {
        UUID id = UUID.randomUUID();
        String type = "client";
        return insertUser(id, type,user);
    }

    List<User> selectAllUsers();

}
