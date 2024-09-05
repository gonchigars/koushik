package com.example.chartjsbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.chartjsbackend.model.Orders;

public interface OrdersRepo extends JpaRepository<Orders, Long> {
}
