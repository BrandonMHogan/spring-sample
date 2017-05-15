package com.brandonhogan.service;

import com.brandonhogan.model.Customer;
import com.brandonhogan.repository.CustomerRepository;

import java.util.List;

/**
 * Created by brandon on 14/05/17.
 * Service holds the business logic
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
