package com.brandonhogan.repository;

import com.brandonhogan.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brandon on 14/05/17.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    private String dbUsername;

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    @Override
    public List<Customer> findAll() {

        System.out.println(dbUsername);

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Brandon");
        customer.setLastName("Hogan");

        customers.add(customer);

        return customers;
    }

}
