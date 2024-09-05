package com.example.chartjsbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.chartjsbackend.model.Products;

public interface ProductsRepo extends JpaRepository<Products, Long> {
}
