package com.app.service.orderdetailservice;

import com.app.entity.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class OrderDetailService implements IOrderDetailService{
    @Autowired
    IOrderDetailService orderDetailService;
    @Override
    public Iterable<OrderDetail> findAll() {
        return orderDetailService.findAll();
    }

    @Override
    public Optional<OrderDetail> findById(Long id) {
        return orderDetailService.findById(id);
    }

    @Override
    public void save(OrderDetail orderDetail) {
        orderDetailService.save(orderDetail);
    }

    @Override
    public void remove(Long id) {
        orderDetailService.remove(id);
    }
}
