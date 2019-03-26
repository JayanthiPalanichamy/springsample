package com.thoughtWorks.repository;

import com.thoughtWorks.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
     public List<Customer> findAll() {
         List<Customer> customers = new ArrayList<>();
         Customer customer = new Customer();
         customer.setFirstName("Jayanthi");
         customer.setLastName("Palanichamy");
         customers.add(customer);
         return customers;
     }
}
