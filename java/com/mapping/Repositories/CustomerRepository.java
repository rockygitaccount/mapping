package com.mapping.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
