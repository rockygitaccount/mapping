package com.mapping.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
