package com.thoughtWorks.service;

import com.thoughtWorks.model.Customer;
import com.thoughtWorks.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository customerRepository;

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
