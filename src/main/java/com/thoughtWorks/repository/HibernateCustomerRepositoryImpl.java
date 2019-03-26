package com.thoughtWorks.repository;

import com.thoughtWorks.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
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
