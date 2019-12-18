package com.vreserve.bus.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vreserve.bus.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {}