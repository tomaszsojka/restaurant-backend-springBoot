package com.dev.restaurant.dao;

import com.dev.restaurant.model.User;
import com.sun.deploy.security.ValidationState;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {


    Optional<User> findByEmail(String email);
    List<User> findAllByType(String type);
    //Iterable<User> findAllByType(String type);
/*        int insertUser(UUID id, String type, User user);
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
 */

}
