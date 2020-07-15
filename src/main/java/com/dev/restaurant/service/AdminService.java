package com.dev.restaurant.service;

import com.dev.restaurant.dao.DishDao;
import com.dev.restaurant.dao.OrderDao;
import com.dev.restaurant.dao.UserDao;
import com.dev.restaurant.model.Dish;
import com.dev.restaurant.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {

    private final DishDao dishDao;
    private final UserDao userDao;
    private final OrderDao orderDao;

    @Autowired
    public AdminService( DishDao dishDao, UserDao userDao, @Qualifier("fakeOrderDao")OrderDao orderDao) {
        this.dishDao = dishDao;
        this.userDao = userDao;
        this.orderDao = orderDao;
    }

    public List<Dish> getAllDishes() {

        List<Dish> dishes = new ArrayList<>();
        dishDao.findAll().iterator().forEachRemaining(dishes::add);
        return dishes;
    }

    public List<User> getAllEmployees() {

        List<User> users = new ArrayList<>();
        users.addAll(userDao.findAllByRole("chef"));
        users.addAll(userDao.findAllByRole("waiter"));
        System.out.println(users);

        //userDao.findAll().iterator().forEachRemaining(users::add);

        return users;
    }


    public User findUserByEmail(String email) {
        return userDao.findByEmail(email).orElse(null);
    }

    public int addChef( User user) {
        user.setRole("chef");
        userDao.save(user);
        //TODO add exceptions, return result
        return 1;
    }

    public int addWaiter( User user) {
        user.setRole("waiter");
        userDao.save(user);
        //TODO add exceptions, return result
        return 1;
    }
}

