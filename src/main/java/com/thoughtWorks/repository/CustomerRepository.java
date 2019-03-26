package com.thoughtWorks.repository;

import com.thoughtWorks.model.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> findAll();
}
