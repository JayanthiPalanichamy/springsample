package com.thoughtWorks.service;

import com.thoughtWorks.model.Customer;
import com.thoughtWorks.repository.CustomerRepository;
import com.thoughtWorks.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
