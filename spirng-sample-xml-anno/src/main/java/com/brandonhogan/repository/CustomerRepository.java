package com.brandonhogan.repository;

import com.brandonhogan.model.Customer;

import java.util.List;

/**
 * Created by brandon on 14/05/17.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}
