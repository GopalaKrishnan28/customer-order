package com.ecom.customerorder.services;

import com.ecom.customerorder.exception.ResourceNotFoundException;
import com.ecom.customerorder.models.Customer;
import com.ecom.customerorder.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public Customer addCustomer(Customer customer)
    {
        return repository.save(customer);
    }

    public List<Customer>getAllCustomers()
    {
        return repository.findAll();
    }

    public Customer getCustomerById(Long id)
    {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer Not found"));
    }

    public void deleteCustomer(Long id)
    {
        repository.deleteById(id);
    }


}