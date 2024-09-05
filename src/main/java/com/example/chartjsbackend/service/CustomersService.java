package com.example.chartjsbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.chartjsbackend.model.Customers;
import com.example.chartjsbackend.repository.CustomersRepo;

import java.util.List;

@Service
public class CustomersService {

    @Autowired
    private CustomersRepo customersRepo;

    // Method to retrieve all customers
    public List<Customers> getAllCustomers() {
        return customersRepo.findAll();
    }
}
