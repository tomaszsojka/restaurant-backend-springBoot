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

import java.util.List;

@Service
public class GuestService {

    private final DishDao dishDao;
    private final UserDao userDao;
    private final OrderDao orderDao;

    @Autowired
    public GuestService(@Qualifier("fakeDishDao") DishDao dishDao, @Qualifier("fakeUserDao") UserDao userDao, @Qualifier("fakeOrderDao")OrderDao orderDao) {
        this.dishDao = dishDao;
        this.userDao = userDao;
        this.orderDao = orderDao;
    }

    /* //Guest doesn't have access to add dish
    public int addDish(Dish dish) {

        return dishDao.insertDish(dish);
    }*/

    public List<Dish> getAllDishes() {
        return dishDao.selectAllDishes();
    }

    //TODO delete (guest cannot add chef or waiter or manager)
    public int addUser(User user) {
        return userDao.insertUser(user);
    }

    //TODO delete (guest cannot see all users)
    public List<User> getAllUsers() {
        return userDao.selectAllUsers();
    }

    //adding user of type "client", with random id
    public int addClient( User user) {
        return userDao.insertUser("client", user);
    }

    public int addOrder(Order order) {return orderDao.insertOrder(order);}

    public List<Order> getAllOrders(){
        return orderDao.selectAllOrders();
    }
}
