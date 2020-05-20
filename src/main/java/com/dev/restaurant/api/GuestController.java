package com.dev.restaurant.api;

import com.dev.restaurant.model.Dish;
import com.dev.restaurant.model.User;
import com.dev.restaurant.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//TODO change to "api/v1/guest", change argument near getmapping to "dish", post to "client"
@RequestMapping("api/v1/dish")
@RestController
public class GuestController {

    private final GuestService guestService;

    @Autowired
    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    /*
    @PostMapping
    public void addDish(@RequestBody Dish dish) {

        guestService.addDish(dish);
    }
     */

    @GetMapping
    public List<Dish> getAllDishes() {
        return guestService.getAllDishes();
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        guestService.addUser(user);
    }
}
