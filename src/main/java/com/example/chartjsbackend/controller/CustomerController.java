package com.example.chartjsbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chartjsbackend.model.Customers;
import com.example.chartjsbackend.model.Orders;
import com.example.chartjsbackend.service.CustomersService;
import com.example.chartjsbackend.service.OrdersService;

import java.util.List;

@RestController
@RequestMapping("/fun")
public class CustomerController {

    private final OrdersService ordersService;
    private final CustomersService customersService;

    @Autowired
    public CustomerController(OrdersService ordersService, CustomersService customersService) {
        this.ordersService = ordersService;
        this.customersService = customersService;
    }

    @GetMapping("/customers")
    public List<Customers> getAllCustomers() {
        return customersService.getAllCustomers();
    }

    @GetMapping("/orders")
    public List<Orders> getAllOrders() {
        return ordersService.getAllMethods();
    }
}
