package com.dev.restaurant.dao;

import com.dev.restaurant.model.Dish;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface DishDao extends CrudRepository<Dish, Integer> {

    Optional<Dish> findByName(String name);
}
