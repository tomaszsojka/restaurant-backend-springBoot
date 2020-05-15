package com.dev.restaurant.dao;

import com.dev.restaurant.model.Dish;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakeDishDataAccessService implements DishDao{

    private static List<Dish> DB = new ArrayList<>();

    //TODO delete it when db is connected
    public FakeDishDataAccessService() {
        //sniadanka
        DB.add(new Dish(UUID.randomUUID(), "Jajecznica", "Z jajek kurzych", 8));
        DB.add(new Dish(UUID.randomUUID(),"Jajko sadzone", "z jajek kurzych", 7));
        DB.add(new Dish(UUID.randomUUID(),"Omlet", "z jajek kurzych", 9));
        DB.add(new Dish(UUID.randomUUID(), "Jajko na twardo", "z jajek kurzych", 10));
    }

    @Override
    public int insertDish(UUID id, Dish dish) {
        DB.add(new Dish(id, dish.getName(), dish.getDescription(), dish.getPrice()));
        return 1; //always ok
    }

    @Override
    public List<Dish> selectAllDishes() {
        return DB;
    }
}
