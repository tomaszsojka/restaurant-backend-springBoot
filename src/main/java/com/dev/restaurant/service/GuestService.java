package com.dev.restaurant.service;

import com.dev.restaurant.dao.DishDao;
import com.dev.restaurant.dao.OrderDao;
import com.dev.restaurant.dao.UserDao;
import com.dev.restaurant.model.Dish;
import com.dev.restaurant.model.Order;
import com.dev.restaurant.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuestService {

    private final DishDao dishDao;
    private final UserDao userDao;
    private final OrderDao orderDao;

    @Autowired
    public GuestService( DishDao dishDao, UserDao userDao, @Qualifier("fakeOrderDao")OrderDao orderDao) {
        this.dishDao = dishDao;
        this.userDao = userDao;
        this.orderDao = orderDao;
    }

    /* //Guest doesn't have access to add dish
    public int addDish(Dish dish) {
        dishDao.save(dish);
        //change
        return 1;
    }*/

    public List<Dish> getAllDishes() {

        List<Dish> dishes = new ArrayList<>();
        dishDao.findAll().iterator().forEachRemaining(dishes::add);
        return dishes;
    }

//    //TODO delete (guest cannot add chef or waiter or manager)
//    public int addUser(String type, User user) {
//        user.setType("type");
//        return userDao.save(user);
//    }

    //TODO delete (guest cannot see all users)
    public List<User> getAllUsers() {

        List<User> users = new ArrayList<>();
        userDao.findAll().iterator().forEachRemaining(users::add);
        return users;
    }

    public User findUserByEmail(String email) {
        return userDao.findByEmail(email).orElse(null);
    }

    //adding user of type "client"
    public int addClient( User user) {
        user.setType("client");
        userDao.save(user);
        //TODO add exceptions, return result
        return 1;
    }

    public int addOrder(Order order) {
        orderDao.save(order);
        //TODO add exceptions, return result
        return 1;
    }

    public List<Order> getAllOrders(){
        List<Order> orders = new ArrayList<>();
        orderDao.findAll().iterator().forEachRemaining(orders::add);
        return orders;
    }
}
