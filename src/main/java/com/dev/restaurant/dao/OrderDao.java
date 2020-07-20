package com.dev.restaurant.dao;

import com.dev.restaurant.model.Order;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface OrderDao extends CrudRepository<Order, Long> {
 /*   int insertOrder(UUID id, Order order);
    //insert with random id, but type set in service
    default int insertOrder(Order order) {
        UUID id = UUID.randomUUID();
        return insertOrder(id, order);
    }
    //TODO think what is default user type

     List<Order> selectAllOrders();
*/
}
