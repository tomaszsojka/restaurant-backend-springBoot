package com.dev.restaurant.api;

import com.dev.restaurant.DTO.AuthenticationResponse;
import com.dev.restaurant.model.Dish;
import com.dev.restaurant.model.Order;
import com.dev.restaurant.model.User;
import com.dev.restaurant.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/guest")
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

    @GetMapping("dish")
    public List<Dish> getAllDishes() {
        return guestService.getAllDishes();
    }

    /*
    @PostMapping
    public void addUser(@RequestBody User user) {
        guestService.addUser(user);
    }
     */
    //TODO delete
    @GetMapping("user")
    public List<User> getAllUsers() {
        return guestService.getAllUsers();
    }

    @PostMapping("register")
    public ResponseEntity<?> addClient(@RequestBody User user) {
        User doUserExist = guestService.findUserByEmail(user.getEmail());

        if(doUserExist != null) {
            //TODO error
            System.out.println("exists");
            return ResponseEntity.status(401).build();
        }else {
            guestService.addClient(user);
            return ResponseEntity.ok('1');
        }
    }

    @PostMapping("login")
    public ResponseEntity<?> login(@RequestBody User user) {
        User doUserExists = guestService.findUserByEmail(user.getEmail());

        char role;

        if (doUserExists.getRole().equals("client"))
            role = 'C';
        else if (doUserExists.getRole().equals("chef"))
            role = 'H';
        else if (doUserExists.getRole().equals("waiter"))
            role = 'W';
        else if (doUserExists.getRole().equals("admin"))
            role = 'A';
        else {
            role = 'n';
            ResponseEntity.status(401).build();
        }

        //TODO change to response (token, role)
        return ResponseEntity.ok(new AuthenticationResponse(doUserExists.getEmail(), doUserExists.getPhoneNumber(), role));
    }

    @PostMapping("order")
    public void addOrder(@RequestBody Order order) {guestService.addOrder(order);}

    @GetMapping("order")
    public List<Order> getAllOrders() { return guestService.getAllOrders();}


}
