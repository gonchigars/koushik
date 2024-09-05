package com.example.chartjsbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.chartjsbackend.model.Orders;
import com.example.chartjsbackend.repository.OrdersRepo;

import java.util.List;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepo ordersRepo;

    public List<Orders> getAllMethods() {
        return ordersRepo.findAll();
    }
}
