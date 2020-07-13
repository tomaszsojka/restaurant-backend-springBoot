package com.dev.restaurant.api;

import com.dev.restaurant.DTO.AuthenticationResponse;
import com.dev.restaurant.model.Dish;
import com.dev.restaurant.model.Order;
import com.dev.restaurant.model.User;
import com.dev.restaurant.service.AdminService;
import com.dev.restaurant.service.GuestService;
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

    @GetMapping("dish")
    public List<Dish> getAllDishes() {
        return adminService.getAllDishes();
    }


    @GetMapping("list_employees")
    public List<User> getAllUsers() {
        return adminService.getAllEmployees();
    }
}