package service;

import model.Customer;

import java.util.List;

/**
 * Created by brandon on 14/05/17.
 */
public interface CustomerService {
    List<Customer> findAll();
}
