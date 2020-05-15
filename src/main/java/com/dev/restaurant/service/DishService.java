package com.dev.restaurant.service;

import com.dev.restaurant.dao.DishDao;
import com.dev.restaurant.model.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DishService {

    private final DishDao dishDao;

    @Autowired
    public DishService(@Qualifier("fakeDao") DishDao dishDao) {
        this.dishDao = dishDao;
    }

    public int addDish(Dish dish) {

        return dishDao.insertDish(dish);
    }

    public List<Dish> getAllDishes() {
        return dishDao.selectAllDishes();
    }
}
