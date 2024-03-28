package com.dilhaque.beststore.services;

import com.dilhaque.beststore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}