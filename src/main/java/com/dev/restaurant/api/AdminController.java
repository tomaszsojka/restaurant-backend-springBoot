package com.dev.restaurant.api;

import com.dev.restaurant.model.Dish;
import com.dev.restaurant.model.User;
import com.dev.restaurant.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/admin")
@RestController
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("list_dishes")
    public List<Dish> getAllDishes() {
        return adminService.getAllDishes();
    }


    @GetMapping("list_employees")
    public List<User> getAllUsers() {
        return adminService.getAllEmployees();
    }

    @PostMapping("add_chef")
    public ResponseEntity<?> addChef(@RequestBody User user) {
        User doUserExist = adminService.findUserByEmail(user.getEmail());

        if(doUserExist != null) {
            //TODO error
            System.out.println("exists");
            return ResponseEntity.status(401).build();
        }else {
            adminService.addChef(user);
            return ResponseEntity.ok('1');
        }
    }

    @PostMapping("add_waiter")
    public ResponseEntity<?> addWaiter(@RequestBody User user) {
        User doUserExist = adminService.findUserByEmail(user.getEmail());

        if(doUserExist != null) {
            //TODO error
            System.out.println("exists");
            return ResponseEntity.status(401).build();
        }else {
            adminService.addWaiter(user);
            return ResponseEntity.ok('1');
        }
    }

    @DeleteMapping("delete_employee")
    public ResponseEntity<?> deleteEmployee(@RequestBody Long id) {
        User doUserExist = adminService.findUserById(id);

        if(doUserExist != null) {
            adminService.deleteEmployeeById(id);
            return ResponseEntity.ok('1');
        }else {
            //TODO error
            return ResponseEntity.status(401).build();
        }
    }
    @PostMapping("add_breakfast")
    public ResponseEntity<?> addBreakfast(@RequestBody Dish dish) {
        Dish doDishExist = adminService.findDishByName(dish.getName());
        System.out.println(doDishExist);
        if(doDishExist != null) {
            //TODO error
            System.out.println("exists");
            return ResponseEntity.status(401).build();
        }else {
            adminService.addBreakfast(dish);
            return ResponseEntity.ok('1');
        }
    }

    @PostMapping("add_dinner")
    public ResponseEntity<?> addDinner(@RequestBody Dish dish) {
        Dish doDishExist = adminService.findDishByName(dish.getName());

        if(doDishExist != null) {
            //TODO error
            System.out.println("exists");
            return ResponseEntity.status(401).build();
        }else {
            adminService.addDinner(dish);
            return ResponseEntity.ok('1');
        }
    }

    @PostMapping("add_appetizer")
    public ResponseEntity<?> addAppetizer(@RequestBody Dish dish) {
        Dish doDishExist = adminService.findDishByName(dish.getName());

        if(doDishExist != null) {
            //TODO error
            System.out.println("exists");
            return ResponseEntity.status(401).build();
        }else {
            adminService.addAppetizer(dish);
            return ResponseEntity.ok('1');
        }
    }

    @DeleteMapping("delete_dish")
    public ResponseEntity<?> deleteDish(@RequestBody Long id) {
        System.out.println(id);
        Dish doDishExist = adminService.findDishById(id);

        if(doDishExist != null) {
            adminService.deleteDishById(id);
            return ResponseEntity.ok('1');
        }else {
            //TODO error
            return ResponseEntity.status(401).build();
        }
    }

}