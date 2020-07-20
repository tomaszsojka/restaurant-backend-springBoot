package com.dev.restaurant.dao;

import com.dev.restaurant.model.Dish;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface DishDao extends CrudRepository<Dish, Long> {

    Optional<Dish> findByName(String name);

    //Optional<Dish> findById(Long id);

}
