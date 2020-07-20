package com.dev.restaurant.service;

import com.dev.restaurant.dao.DishDao;
import com.dev.restaurant.dao.OrderDao;
import com.dev.restaurant.dao.UserDao;
import com.dev.restaurant.model.Dish;
import com.dev.restaurant.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.SocketOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    private final DishDao dishDao;
    private final UserDao userDao;
    private final OrderDao orderDao;

    @Autowired
    public AdminService( DishDao dishDao, UserDao userDao, OrderDao orderDao) {
        this.dishDao = dishDao;
        this.userDao = userDao;
        this.orderDao = orderDao;
    }

    public List<User> getAllEmployees() {

        List<User> users = new ArrayList<>();
        users.addAll(userDao.findAllByRole("chef"));
        users.addAll(userDao.findAllByRole("waiter"));
        System.out.println(users);

        return users;
    }


    public User findUserByEmail(String email) {
        return userDao.findByEmail(email).orElse(null);
    }

    public User findUserById(Long id) {
        return userDao.findById(id).orElse(null);
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

    public void deleteEmployeeById(Long id) {
        userDao.deleteById(id);
    }

    public Dish findDishByName(String name) {
        return dishDao.findByName(name).orElse(null);
    }

    public Dish findDishById(Long id) {
        return dishDao.findById(id).orElse(null);
    }

    public List<Dish> getAllDishes() {

        List<Dish> dishes = new ArrayList<>();
        dishDao.findAll().iterator().forEachRemaining(dishes::add);
        return dishes;
    }

    public int addBreakfast( Dish dish) {
        dish.setType("breakfast");
        dishDao.save(dish);
        //TODO add exceptions, return result
        return 1;
    }

    public int addDinner( Dish dish) {
        dish.setType("dinner");
        dishDao.save(dish);
        //TODO add exceptions, return result
        return 1;
    }
    public int addAppetizer( Dish dish) {
        dish.setType("appetizer");
        dishDao.save(dish);
        //TODO add exceptions, return result
        return 1;
    }

    public void deleteDishById(Long id) {
        dishDao.deleteById(id);
    }
}

