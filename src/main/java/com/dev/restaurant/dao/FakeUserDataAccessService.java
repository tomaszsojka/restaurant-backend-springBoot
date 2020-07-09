package com.dev.restaurant.dao;

import com.dev.restaurant.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeUserDao")
public class FakeUserDataAccessService /*implements UserDao*/ {
/*
    private static List<User> DB = new ArrayList<>();

    @Override
    public int insertUser(UUID id, String type, User user) {
        DB.add(new User(id,user.getPhoneNumber(),user.getEmail(),user.getPassword(),type));
        return 1;
    }

    @Override
    public List<User> selectAllUsers() {
        return DB;
    }
 */
}
