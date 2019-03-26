package com.thoughtWorks.service;

import com.thoughtWorks.model.Customer;
import com.thoughtWorks.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    private CustomerRepository customerRepository;



    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
