package com.brandonhogan.service;

import com.brandonhogan.model.Customer;
import com.brandonhogan.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by brandon on 14/05/17.
 * Service holds the business logic
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    //@Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Setter injection");
        this.customerRepository = customerRepository;
    }

    //@Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("Constructor injection");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
