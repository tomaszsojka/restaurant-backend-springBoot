package com.dev.restaurant.dao;

import com.dev.restaurant.model.Dish;

import java.util.List;
import java.util.UUID;

public interface DishDao {
    int insertDish(UUID id, Dish dish);
    default int insertDish(Dish dish) {
        UUID id = UUID.randomUUID();
        return  insertDish(id, dish);
    }

    List<Dish> selectAllDishes();

}
