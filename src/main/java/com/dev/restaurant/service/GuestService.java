package com.dev.restaurant.service;

import com.dev.restaurant.dao.DishDao;
import com.dev.restaurant.dao.UserDao;
import com.dev.restaurant.model.Dish;
import com.dev.restaurant.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    private final DishDao dishDao;
    private final UserDao userDao;

    @Autowired
    public GuestService(@Qualifier("fakeDishDao") DishDao dishDao,@Qualifier("fakeUserDao") UserDao userDao) {
        this.dishDao = dishDao;
        this.userDao = userDao;
    }

    /* //Guest doesn't have access to add dish
    public int addDish(Dish dish) {

        return dishDao.insertDish(dish);
    }*/

    public List<Dish> getAllDishes() {
        return dishDao.selectAllDishes();
    }

    //TODO change to addClient (guest cannot add chef or waiter or manager)
    public int addUser(User user) {
        return userDao.insertUser(user);
    }
}
