package com.ecom.customerorder.repository;

import com.ecom.customerorder.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> { }