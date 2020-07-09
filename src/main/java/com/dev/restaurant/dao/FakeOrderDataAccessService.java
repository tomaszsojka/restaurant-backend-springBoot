package com.dev.restaurant.dao;


import com.dev.restaurant.model.Order;
import com.dev.restaurant.model.User;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeOrderDao")
public class FakeOrderDataAccessService /*implements OrderDao*/ {

    /*
    private static List<Order> DB = new ArrayList<>();

    @Override
    public int insertOrder(UUID id, Order order) {
        DB.add(new Order(id,order.getName(), order.getPrice(),order.getQuantity(),order.getDate(),order.getPrepared(),order.getPaid(),order.getMealID(),order.getUserID()));
        return 1;
    }

    @Override
    public List<Order> selectAllOrders() {
        return DB;
    }

     */

}
