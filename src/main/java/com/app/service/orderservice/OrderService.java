package com.app.service.orderservice;

import com.app.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class OrderService implements IOrderService {
    @Autowired
    IOrderService orderService;
    @Override
    public Iterable<Order> findAll() {
        return orderService.findAll();
    }

    @Override
    public Optional<Order> findById(Long id) {
        return orderService.findById(id);
    }

    @Override
    public void save(Order order) {
        orderService.save(order);
    }

    @Override
    public void remove(Long id) {
        orderService.remove(id);
    }
}
